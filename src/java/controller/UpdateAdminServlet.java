package controller;

import dao.AdminDAO;
import helpers.encrypt;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Admin;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UpdateAdminServlet extends HttpServlet {
    AdminDAO dao = new AdminDAO();
    encrypt encrypt = new encrypt();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateAdminServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateAdminServlet at " + request.getContextPath() + "</h1>");
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
        
        HttpSession session = request.getSession();
        session.setAttribute("adid", "");
        session.setAttribute("aderror", "");
        session.setAttribute("adnoti", "");
        Admin admin = new Admin();
        FileItemFactory file_factory = new DiskFileItemFactory(); 
        ServletFileUpload sfu = new ServletFileUpload(file_factory); 
        ArrayList<String> campos = new ArrayList<>();
        ArrayList<String> imgs = new ArrayList<>();
        String path = getServletConfig().getServletContext().getRealPath("Admin/images/admin/");
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
            admin.setAdminID(Integer.parseInt(campos.get(0)));
            admin.setAdminfullName(campos.get(1));
            admin.setAdminAvatar(imgs.get(0));
            admin.setAdminEmail(campos.get(2));
            admin.setAdminPass(encrypt.hashmd5(campos.get(2), campos.get(3)));
            admin.setPqID(Integer.parseInt(campos.get(4)));
            dao.updateAdmin(admin);     
        } catch (Exception e) {
        }
        session.setAttribute("adid", "noti");
        session.setAttribute("adnoti", "Cập nhật thành công!.");
        getServletContext().getRequestDispatcher("/Admin/manager_admin.jsp").forward(
                request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
