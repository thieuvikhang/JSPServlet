package controller;
import dao.ProducerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class DelProducerServlet extends HttpServlet {
    ProducerDAO dao=new ProducerDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DelImageServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DelImageServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String url = null;
        HttpSession session = request.getSession();
        session.setAttribute("adid", "");
        session.setAttribute("aderror", "");
        session.setAttribute("adnoti", "");
        try {
            dao.delete(Long.parseLong(id));
            url="/Admin/manager_producer.jsp";
        } catch (SQLException ex) {
            Logger.getLogger(DelImageServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        session.setAttribute("adid", "noti");
        session.setAttribute("adnoti", "Xóa nhà sản xuất thành công!.");
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);               
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
