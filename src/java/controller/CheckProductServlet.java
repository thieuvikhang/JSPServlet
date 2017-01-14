package controller;

import dao.ProductDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckProductServlet extends HttpServlet {
    ProductDAO productDAO = new ProductDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (productDAO.checkProduct(request.getParameter("tenDanhMuc"))) {
            response.getWriter().write("<img src=\"images/shop/not-available.png\" />");
        } else {
            response.getWriter().write("<img src=\"images/shop/available.png\" />");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
