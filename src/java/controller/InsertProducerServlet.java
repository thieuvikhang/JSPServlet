
package controller;
import dao.ProducerDAO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Producer;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class InsertProducerServlet extends HttpServlet {
    ProducerDAO dao = new ProducerDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
        FileItemFactory file_factory = new DiskFileItemFactory(); 
        ServletFileUpload sfu = new ServletFileUpload(file_factory); 
        ArrayList<String> campos = new ArrayList<>();
        ArrayList<String> imgs = new ArrayList<>();
        String path = getServletConfig().getServletContext().getRealPath("images/banner/");
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
            dao.insert(new Producer(campos.get(0), imgs.get(0), campos.get(1)));     
        } catch (Exception e) {
        }
        session.setAttribute("adid", "noti");
        session.setAttribute("adnoti", "Thêm nhà sản xuất thành công!.");
        getServletContext().getRequestDispatcher("/Admin/manager_producer.jsp").forward(
                request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
