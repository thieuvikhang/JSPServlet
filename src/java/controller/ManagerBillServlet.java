package controller;
import dao.BillDAO;
import dao.CategoryDAO;
import java.io.IOException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Category;
public class ManagerBillServlet extends HttpServlet {
    BillDAO dao = new BillDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String command = request.getParameter("command");
        String bill_id = request.getParameter("bill_id");
        HttpSession session = request.getSession();
        session.setAttribute("adid", "");
        session.setAttribute("aderror", "");
        session.setAttribute("adnoti", "");
        String url = "";
        try {
            switch (command) {
                case "delete":
                    dao.delete(Long.parseLong(bill_id));
                    url = "/Admin/index.jsp";
                    session.setAttribute("adid", "noti");
                    session.setAttribute("adnoti", "Xóa hóa đơn thành công!.");
                    break;
                case "update":
                    dao.update(Long.parseLong(bill_id));
                    url = "/Admin/index.jsp";
                    session.setAttribute("adid", "noti");
                    session.setAttribute("adnoti", "Hóa đơn: #"+bill_id+" Đã xác nhận thanh toán");
                    break;
                case "finish":
                    dao.finish(Long.parseLong(bill_id));
                    url = "/Admin/index.jsp";
                    session.setAttribute("adid", "noti");
                    session.setAttribute("adnoti", "Hóa đơn: #"+bill_id+" Đã xác nhận hoàn tất!.");
                    break;    
            }
        } catch (Exception e) {
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);   
    }
}
