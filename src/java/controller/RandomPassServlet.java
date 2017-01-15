package controller;

import dao.UsersDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Users;
import static helpers.RandomPass.randomString;
import helpers.Sendmail;
import static helpers.encrypt.hashmd5;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class RandomPassServlet extends HttpServlet {
    UsersDAO usersDAO = new UsersDAO();
    Sendmail sendMail = new Sendmail();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RandomPassServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RandomPassServlet at " + request.getContextPath() + "</h1>");
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
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String url = "";
        HttpSession session = request.getSession();
        session.setAttribute("error", "");
         Boolean checkEmail = usersDAO.checkEmail(request.getParameter("email").toLowerCase());
        
        if(checkEmail == true)
        {
            try {
                session.setAttribute("error", "Vui lòng kiểm tra Email: "+request.getParameter("email")+" !..");
                String pass = hashmd5((request.getParameter("email").toString()).toLowerCase(), randomString(6));
                usersDAO.updatePassbyEmail(pass ,(request.getParameter("email").toString()).toLowerCase());
                session.setAttribute("user", null);
                Sendmail.sendMail(request.getParameter("email"), "KTLaptop", "New Password: " + randomString(6));
                url = "/login.jsp";
            } catch (SQLException ex) {
                Logger.getLogger(RandomPassServlet.class.getName()).log(Level.SEVERE, null, ex);
                session.setAttribute("error", "Lỗi, vui lòng thực hiện lại!");
                url = "/login.jsp";
            }            
            
        }else{
            session.setAttribute("error", "Email không tồn tại!");
            url = "/login.jsp";
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
