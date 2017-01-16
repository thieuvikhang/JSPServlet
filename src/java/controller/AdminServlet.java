package controller;

import dao.AdminDAO;
import dao.PqDAO;
import helpers.encrypt;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Admin;
import model.Image;
import model.Pq;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
public class AdminServlet extends HttpServlet {
    AdminDAO adminDAO = new AdminDAO();
    PqDAO pqDAO = new PqDAO();
    Pq pq = new Pq();
    encrypt encrypt = new encrypt();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdminServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdminServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String admin_id = request.getParameter("admin_id");
        HttpSession session = request.getSession();
        session.setAttribute("adid", "");
        session.setAttribute("aderror", "");
        session.setAttribute("adnoti", "");
        String url = "";
        try {
            adminDAO.delete(Long.parseLong(admin_id));
        } catch (SQLException ex) {
            Logger.getLogger(AdminServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        session.setAttribute("adid", "noti");
        session.setAttribute("adnoti", "Xóa Admin thành công!.");
        url = "/Admin/manager_admin.jsp";
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String command = request.getParameter("command");        
        String url = "";
        Admin admin = new Admin();
        Long id = new java.util.Date().getTime();
        HttpSession session = request.getSession();
        FileItemFactory file_factory = new DiskFileItemFactory(); 
        ServletFileUpload sfu = new ServletFileUpload(file_factory); 
        ArrayList<String> campos = new ArrayList<>();
        ArrayList<String> imgs = new ArrayList<>();
        String path = getServletConfig().getServletContext().getRealPath("images/admin/");
        session.setAttribute("adid", "");
        session.setAttribute("aderror", "");
        session.setAttribute("adnoti", "");
        switch (command) {
            case "insert":
//                admin.setAdminID(id);
//                admin.setAdminfullName(request.getParameter("fullname"));
//                admin.setAdminAvatar(request.getParameter("avatar"));
//                admin.setAdminEmail(request.getParameter("email"));
//                admin.setAdminPass(encrypt.hashmd5(request.getParameter("email"), request.getParameter("password")));
//                admin.setPqID(Integer.parseInt(request.getParameter("pq")));
//                adminDAO.insertAdmin(admin);
                try {
                    List items  = sfu.parseRequest(request);
                    for (int i = 0; i < items.size(); i++) { 
                        FileItem item = (FileItem) items.get(i);
                        if(!item.isFormField())
                        {
                            File archivo = new File(path + item.getName());
                            item.write(archivo);
                            imgs.add("" + item.getName());
                        } else {
                            campos.add(item.getString("UTF-8"));
                        }
                    }
                admin.setAdminID(id);
                admin.setAdminfullName(request.getParameter("fullname"));
                admin.setAdminAvatar(imgs.get(0));
                admin.setAdminEmail(request.getParameter("email"));
                admin.setAdminPass(encrypt.hashmd5(request.getParameter("email"), request.getParameter("password")));
                admin.setPqID(Integer.parseInt(request.getParameter("pq")));
                adminDAO.insertAdmin(admin);     
                } catch (Exception e) {
                }
                session.setAttribute("adid", "noti");
                session.setAttribute("adnoti", "Thêm Admin thành công!.");
                url = "/Admin/manager_admin.jsp";
                break;
            case "update":
                admin.setAdminID(Long.parseLong(request.getParameter("admin_id")));
                admin.setAdminfullName(request.getParameter("fullname"));
                admin.setAdminAvatar(request.getParameter("avatar"));
                admin.setAdminEmail(request.getParameter("email"));
                admin.setAdminPass(encrypt.hashmd5(request.getParameter("email"), request.getParameter("password")));
                admin.setPqID(Integer.parseInt(request.getParameter("pq")));
                {
                    try {
                        adminDAO.updateAdmin(admin);
                        session.setAttribute("adid", "noti");
                        session.setAttribute("adnoti", "Sửa Admin thành công!.");
                    } catch (SQLException ex) {
                        Logger.getLogger(AdminServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                url = "/Admin/manager_admin.jsp";
                break;
            case "login":
                admin = adminDAO.login(request.getParameter("email"), encrypt.hashmd5(request.getParameter("email"), request.getParameter("password")));
                {
                    try { 
                        for (Admin ds : adminDAO.getAdminByEmail(request.getParameter("email")))
                        {
                            session.setAttribute("idAdmin", ds.getAdminID());
                            session.setAttribute("nameAdmin", ds.getAdminfullName());
                            session.setAttribute("emailAdmin", ds.getAdminEmail());
                            session.setAttribute("avatar", ds.getAdminAvatar());                            
                            session.setAttribute("pqAdmin", pqDAO.getPqType(String.valueOf(ds.getPqID())).getPqType());
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(AdminServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (admin != null) {
                    session.setAttribute("admin", admin);
                    url = "/Admin/index.jsp";
                    break;
                }else{
                    session.setAttribute("adid", "error");
                    session.setAttribute("aderror", "Email hoặc mật khẩu không đúng.!");
                    url = "/Admin/login.jsp";
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
    }

}
