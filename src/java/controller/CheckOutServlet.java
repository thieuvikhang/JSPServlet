package controller;
import dao.BillDAO;
import dao.BillDetailDAO;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Bill;
import model.BillDetail;
import model.Cart;
import model.Item;
import model.Users;
import dao.ProductDAO;
import java.io.PrintWriter;
import helpers.Sendmail;
import baokim.BaoKimPayment;
public class CheckOutServlet extends HttpServlet {
    private final BillDAO billDAO = new BillDAO();
    private final ProductDAO productDAO = new ProductDAO();
    private final BillDetailDAO billDetailDAO = new BillDetailDAO();
    Bill bill = new Bill();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CheckOutServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CheckOutServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BaoKimPayment baokim = new BaoKimPayment();
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String payment = request.getParameter("payment");        
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        Users users = (Users) session.getAttribute("user");
        long billID = new Date().getTime();
        Bill bill = new Bill();
        bill.setBillID(billID);
        bill.setBillName(name);
        bill.setBillPhone(Integer.parseInt(phone));
        bill.setBillAddress(address);
        bill.setBillDate(new Timestamp(new Date().getTime()));            
        bill.setBillPayment(payment);
        bill.setBillPaid(0);
        bill.setBillFinish(0);
        bill.setBillTotal(cart.total());
        bill.setUserID(Long.parseLong(id));  
        session.setAttribute("bill", bill);
        String urlbaokim = baokim.createRequestUrl(Long.toString(billID) , "mail.toan95@gmail.com", Long.toString(cart.total()), "0", "0", "Đơn hàng số: #"+billID, "https://ktlaptop.jelastic.skali.net/SuccessServlet", "https://ktlaptop.jelastic.skali.net/tai-khoang", "https://ktlaptop.jelastic.skali.net/orders.jsp?bill="+billID);
        if("Bank transfer".equals(payment))
        {
            try {  
                billDAO.insertBill(bill);
                for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {
                    long billDetailID = new Date().getTime();
                    billDetailDAO.insertBillDetail(new BillDetail(billDetailID,
                            list.getValue().getProduct().getProductID(),
                            list.getValue().getQuantity(),
                            list.getValue().getProduct().getProductPriceReal(), billID
                            ));
                    productDAO.updatetangluotmua(String.valueOf(list.getValue().getProduct().getProductID()), String.valueOf(list.getValue().getQuantity()));
                    productDAO.updategiamtonkho(String.valueOf(list.getValue().getProduct().getProductID()), String.valueOf(list.getValue().getQuantity()));
                }
                Sendmail.sendMail(users.getUserEmail(), "ShopLaptop", "Hello, "+users.getUserEmail()+"\nTotal: "+cart.total());
                cart = new Cart();
                session.setAttribute("cart", cart);
            } catch (Exception e) {}
            response.sendRedirect(urlbaokim);
        }else{
            try {  
            billDAO.insertBill(bill);
            for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {
                long billDetailID = new Date().getTime();
                billDetailDAO.insertBillDetail(new BillDetail(billDetailID,
                        list.getValue().getProduct().getProductID(),
                        list.getValue().getQuantity(),
                        list.getValue().getProduct().getProductPriceReal(), billID
                        ));
                productDAO.updatetangluotmua(String.valueOf(list.getValue().getProduct().getProductID()), String.valueOf(list.getValue().getQuantity()));
                productDAO.updategiamtonkho(String.valueOf(list.getValue().getProduct().getProductID()), String.valueOf(list.getValue().getQuantity()));
            }
            Sendmail.sendMail(users.getUserEmail(), "ShopLaptop", "Hello, "+users.getUserEmail()+"\nTotal: "+cart.total());
            cart = new Cart();
            session.setAttribute("cart", cart);
            bill = new Bill();
            session.setAttribute("bill", bill);
        } catch (Exception e) {}
        response.sendRedirect("/tai-khoang");
        }
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}