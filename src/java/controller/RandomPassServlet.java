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
import helpers.encrypt;
import helpers.RandomPass;
import helpers.Sendmail;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class RandomPassServlet extends HttpServlet {
    UsersDAO usersDAO = new UsersDAO();
    encrypt encrypt = new encrypt();
    RandomPass randomPass = new RandomPass();
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
        Users users = new Users();
        Boolean email = false;
        HttpSession session = request.getSession();
        session.setAttribute("error", "");
        email = usersDAO.checkEmail(request.getParameter("email"));
        if(email == true)
        {
            session.setAttribute("error", "Vui lòng kiểm tra Email: "+request.getParameter("email")+" !..");
            String newPass = randomPass.randomString(6);
            users.setUserPass(encrypt.hashmd5(session.getAttribute("email").toString().toLowerCase(), newPass));
            {
                try {
                    usersDAO.updatePassbyEmail(users,session.getAttribute("email").toString().toLowerCase());
                    session.setAttribute("user", null);
                } catch (SQLException ex) {
                    Logger.getLogger(RandomPassServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            Sendmail.sendMail(request.getParameter("email"), "KTLaptop", "New Password: " + newPass);
            url = "/login.jsp";
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
