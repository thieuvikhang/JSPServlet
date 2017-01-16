package controller;
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
public class ManagerCategoryServlet extends HttpServlet {
    CategoryDAO categoryDAO = new CategoryDAO();
    
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
        String category_id = request.getParameter("category_id");
        String url = "";
        HttpSession session = request.getSession();
        session.setAttribute("adid", "");
        session.setAttribute("aderror", "");
        session.setAttribute("adnoti", "");
        try {
            switch (command) {
                case "delete":
                    categoryDAO.delete(Long.parseLong(category_id));
                    url = "/Admin/manager_category.jsp";
                    session.setAttribute("adid", "noti");
                    session.setAttribute("adnoti", "Xóa danh mục thành công!.");
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
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String command = request.getParameter("command");
        String tenDanhMuc = request.getParameter("tenDanhMuc");
        String mt = request.getParameter("mt");
        String mk = request.getParameter("mk");
        String md = request.getParameter("md");
        String url = "", error = "";
        HttpSession session = request.getSession();
        session.setAttribute("adid", "");
        session.setAttribute("aderror", "");
        session.setAttribute("adnoti", "");
        if (tenDanhMuc.equals("")) {
            error = "Vui lòng nhập tên danh mục!";
            request.setAttribute("error", error);
        }
        try {
            if (error.length() == 0) {
                switch (command) {
                    case "insert":
                        categoryDAO.insert(new Category(new Date().getTime()%1000, tenDanhMuc, mt, mk, md));
                        url = "/Admin/manager_category.jsp";
                        session.setAttribute("adid", "noti");
                        session.setAttribute("adnoti", "Thêm danh mục thành công!.");
                        break;
                    case "update":
                        categoryDAO.update(new Category(Long.parseLong(request.getParameter("category_id")),tenDanhMuc, mt, mk, md));
                        url = "/Admin/manager_category.jsp";
                        session.setAttribute("adid", "noti");
                        session.setAttribute("adnoti", "Sửa danh mục thành công!.");
                        break;
                }
            } else {
                url = "/Admin/insert_category.jsp";
            }
        } catch (Exception e) {
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }
}
