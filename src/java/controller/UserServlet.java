package controller;

import dao.UsersDAO;
import helpers.encrypt;
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
import model.Users;

public class UserServlet extends HttpServlet {
    UsersDAO usersDAO = new UsersDAO();
    encrypt encrypt = new encrypt();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UserServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UserServlet at " + request.getContextPath() + "</h1>");
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
        String command = request.getParameter("command");        
        String url = "";
        Users users = new Users();
        HttpSession session = request.getSession();
        session.setAttribute("idu", "");
        session.setAttribute("error", "");
        session.setAttribute("noti", "");
        switch (command) {
            case "insert":
                users.setUserID(new java.util.Date().getTime());
                users.setUserFullName(request.getParameter("fullname"));
                users.setUserAddress(request.getParameter("address"));
                users.setUserPhone(Long.parseLong(request.getParameter("phone")));
                users.setUserEmail(request.getParameter("email").toLowerCase());
                users.setUserPass(encrypt.hashmd5(request.getParameter("email").toLowerCase(), request.getParameter("password")));
                usersDAO.insertUser(users);
                url = "/login.jsp";
                session.setAttribute("idu", "noti");
                session.setAttribute("noti", "Đăng ký hoàn tất!.");
                break;
            case "change":
                users.setUserPass(encrypt.hashmd5(session.getAttribute("email").toString().toLowerCase(), request.getParameter("repassword")));
                {
                    try {
                        usersDAO.updatePass(users,session.getAttribute("id").toString());
                        session.setAttribute("user", null);
                        session.setAttribute("idu", "noti");
                        session.setAttribute("noti", "Đổi mật khẩu hoàn tất!.");
                    } catch (SQLException ex) {
                        Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                url = "/login.jsp";
                break;
            case "update":
                users.setUserFullName(request.getParameter("fullname"));
                users.setUserAddress(request.getParameter("address"));
                users.setUserPhone(Long.parseLong(request.getParameter("phone")));
                {
                    try {
                        usersDAO.updateUser( users,session.getAttribute("id").toString());
                        session.setAttribute("name", users.getUserFullName());
                        session.setAttribute("address", users.getUserAddress());
                        session.setAttribute("phone", users.getUserPhone());
                    } catch (SQLException ex) {
                        Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }                
                url = "/account.jsp";
                break;
            case "login":
                users = usersDAO.login(request.getParameter("email").toLowerCase(), encrypt.hashmd5(request.getParameter("email").toLowerCase(), request.getParameter("password")));
                {
                    try { 
                        for (Users ds : usersDAO.getUserByEmail(request.getParameter("email").toLowerCase()))
                        {
                            session.setAttribute("id", ds.getUserID());
                            session.setAttribute("name", ds.getUserFullName());
                            session.setAttribute("address", ds.getUserAddress());
                            session.setAttribute("phone", ds.getUserPhone());
                            session.setAttribute("email", ds.getUserEmail());
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (users != null) {
                    session.setAttribute("user", users);
                    url = "/index.jsp";
                    break;
                }else{
                    session.setAttribute("idu", "error");
                    session.setAttribute("error", "Email hoặc mật khẩu không đúng.!");
                    url = "/login.jsp";
                }
                break;
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
