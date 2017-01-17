package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Product;
import dao.ProductDAO;
import model.Cart;
import helpers.MoneyFormat;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"vn\">\r\n");
      out.write("    <head>        \r\n");
      out.write("        <title>Trang chủ  </title>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/head.jsp", out, false);
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

        ProductDAO productDAO = new ProductDAO();
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }
        MoneyFormat formatter = new MoneyFormat();
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"page-wrapper\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/header.jsp", out, false);
      out.write("\r\n");
      out.write("        <!-- SITE CONTENT\r\n");
      out.write("        =========================================================================== -->\r\n");
      out.write("        <div id=\"site-content\">\r\n");
      out.write("            <div id=\"main\">\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/slider.jsp", out, false);
      out.write(" \r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/contact.jsp", out, false);
      out.write("\r\n");
      out.write("<!--                <section class=\"news_jobs\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row \">\r\n");
      out.write("                            <div class=\"col-sm-6 col-md-12 div-new-news-content\">\r\n");
      out.write("                                <div class=\"row \">\r\n");
      out.write("                                    <div class=\"col-xs-12 section-slide-header\">\r\n");
      out.write("                                        <h2>Tin tức mới nhất</h2>\r\n");
      out.write("                                        <div class=\"page-owl-buttons\">\r\n");
      out.write("                                            <div class=\"page-owl-prev\"><a id=\"new-news-pre\" href=\"#owl-demo-new-news\"><i class=\"fa fa-caret-left\"></i></a></div>\r\n");
      out.write("                                            <div class=\"page-owl-next\"><a id=\"new-news-next\" href=\"#owl-demo-new-news\"><i class=\"fa fa-caret-right\"></i></a></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"owl-demo-new-news\" class=\"owl-carousel owl-theme\">\r\n");
      out.write("                                        <div class=\"item\">\r\n");
      out.write("                                            <div class=\"new-item\">\r\n");
      out.write("                                                <div class=\"col-md-12\">\r\n");
      out.write("                                                    <div class=\"new-img\">\r\n");
      out.write("                                                        <a href=\"#\" title=\"Những mẫu ghế nghỉ đa năng đáng mơ ước\"><img src=\"./images/product/lenovo-ideapad-100.png\" alt=\"Những mẫu ghế nghỉ đa năng đáng mơ ước\"></a>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <h3 class=\"new-name\"><a href=\"\" title=\"Những mẫu ghế nghỉ đa năng đáng mơ ước\">Những mẫu ghế nghỉ đa năng đáng mơ ước</a></h3>\r\n");
      out.write("                                                    <p class=\"new-info\">1/25/2016 4:36:00 PM</p>\r\n");
      out.write("                                                    <p class=\"new-description\">\r\n");
      out.write("                                                        Những thiết kế ghế nghỉ đa năng này sẽ giúp dân văn phòng có nơi thư giãn, nạp năng lượng mà không ảnh hưởng đến mỹ quan công sở\".... <a href=\"/nhung-mau-ghe-nghi-da-nang-dang-mo-uoc-cho-dan-van-phong\">[Đọc tiếp]</a>\r\n");
      out.write("                                                    </p>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"item\">\r\n");
      out.write("                                            <div class=\"new-item\">\r\n");
      out.write("                                                <div class=\"col-md-12\">\r\n");
      out.write("                                                    <div class=\"new-img\">\r\n");
      out.write("                                                        <a href=\"/4-thiet-ke-phong-ngu-hien-dai-dang-de-mo-uoc\" title=\"4 thiết kế phòng ngủ hiện đại đáng để mơ ước\"><img src=\"./images/product/lenovo-ideapad-100.png\" alt=\"4 thiết kế phòng ngủ hiện đại đáng để mơ ước\"></a>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <h3 class=\"new-name\"><a href=\"\" title=\"4 thiết kế phòng ngủ hiện đại đáng để mơ ước\">4 thiết kế phòng ngủ hiện đại đáng để mơ ước</a></h3>\r\n");
      out.write("                                                    <p class=\"new-info\">1/25/2016 4:28:00 PM</p>\r\n");
      out.write("                                                    <p class=\"new-description\">\r\n");
      out.write("                                                        Những thiết kế phòng ngủ năng động, hiện đại nhưng cũng không kém phần ấn tượng dưới đây có thể sẽ khiến bạn mê mẩn và ao ước có... <a href=\"/4-thiet-ke-phong-ngu-hien-dai-dang-de-mo-uoc\">[Đọc tiếp]</a>\r\n");
      out.write("                                                    </p>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"item\">\r\n");
      out.write("                                            <div class=\"new-item\">\r\n");
      out.write("                                                <div class=\"col-md-12\">\r\n");
      out.write("                                                    <div class=\"new-img\">\r\n");
      out.write("                                                        <a href=\"/\" title=\"Những món đồ nội thất đẹp đến không tưởng\"><img src=\"./images/product/lenovo-ideapad-100.png\" alt=\"Những món đồ nội thất đẹp đến không tưởng\"></a>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <h3 class=\"new-name\"><a href=\"\" title=\"Những món đồ nội thất đẹp đến không tưởng\">Những món đồ nội thất đẹp đến không tưởng</a></h3>\r\n");
      out.write("                                                    <p class=\"new-info\">1/25/2016 4:22:00 PM</p>\r\n");
      out.write("                                                    <p class=\"new-description\">\r\n");
      out.write("                                                        Chất liệu tre, trúc vốn được mặc định với sự giản dị, đơn sơ, truyền thống. Song, những thiết kế đồ nội thất từ tre trúc dưới đây sẽ... <a href=\"/nhung-mon-do-noi-that-dep-den-khong-tuong\">[Đọc tiếp]</a>\r\n");
      out.write("                                                    </p>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"item\">\r\n");
      out.write("                                            <div class=\"new-item\">\r\n");
      out.write("                                                <div class=\"col-md-12\">\r\n");
      out.write("                                                    <div class=\"new-img\">\r\n");
      out.write("                                                        <a href=\"#\" title=\"Những mẫu ghế nghỉ đa năng đáng mơ ước\"><img src=\"./images/product/lenovo-ideapad-100.png\" alt=\"Những mẫu ghế nghỉ đa năng đáng mơ ước\"></a>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <h3 class=\"new-name\"><a href=\"\" title=\"Những mẫu ghế nghỉ đa năng đáng mơ ước\">Những mẫu ghế nghỉ đa năng đáng mơ ước</a></h3>\r\n");
      out.write("                                                    <p class=\"new-info\">1/25/2016 4:36:00 PM</p>\r\n");
      out.write("                                                    <p class=\"new-description\">\r\n");
      out.write("                                                        Những thiết kế ghế nghỉ đa năng này sẽ giúp dân văn phòng có nơi thư giãn, nạp năng lượng mà không ảnh hưởng đến mỹ quan công sở\".... <a href=\"/nhung-mau-ghe-nghi-da-nang-dang-mo-uoc-cho-dan-van-phong\">[Đọc tiếp]</a>\r\n");
      out.write("                                                    </p>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>-->\r\n");
      out.write("                <section class=\"featured_projects\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row \">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <h2 class=\"activities_title text-center\">Sản phẩm bán chạy</h2>\r\n");
      out.write("                                <p class=\"activities_description text-center\">Bạn có thể thấy dưới đây là hơn 100 sản phẩm bán chạy nhất tại Shop của chúng tôi.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <div class=\"tablist_parent col-md-12\">\r\n");
      out.write("                                    <!-- Nav tabs -->\r\n");
      out.write("                                    <ul class=\"nav nav-tabs\" role=\"tablist\">\r\n");
      out.write("                                        <li role=\"presentation\" class=\"active\"><a href=\"#home\" aria-controls=\"home\" role=\"tab\" data-toggle=\"tab\">Sản phẩm mới</a></li>\r\n");
      out.write("                                        <li role=\"presentation\"><a href=\"#profile\" aria-controls=\"profile\" role=\"tab\" data-toggle=\"tab\">GIÁ TỐT</a></li>\r\n");
      out.write("                                        <li role=\"presentation\"><a href=\"#messages\" aria-controls=\"messages\" role=\"tab\" data-toggle=\"tab\">Gaming</a></li>\r\n");
      out.write("                                        <li role=\"presentation\"><a href=\"#settings\" aria-controls=\"settings\" role=\"tab\" data-toggle=\"tab\">Notebook</a></li>\r\n");
      out.write("                                        <li role=\"presentation\"><a href=\"#settings2\" aria-controls=\"settings2\" role=\"tab\" data-toggle=\"tab\">Ultrabook</a></li>\r\n");
      out.write("                                        <li role=\"presentation\"><a href=\"#settings3\" aria-controls=\"settings3\" role=\"tab\" data-toggle=\"tab\">2 in 1</a></li>\r\n");
      out.write("                                        <li role=\"presentation\" class=\"dropdown\">\r\n");
      out.write("                                            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                                Dự án <i class=\"fa fa-angle-down pull-right\"></i>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                                <li role=\"presentation\" class=\"active\"><a href=\"#home\" aria-controls=\"home\" role=\"tab\" data-toggle=\"tab\">Sản phẩm mới</a></li>\r\n");
      out.write("                                                <li role=\"presentation\"><a href=\"#profile\" id=\"profile_tab\" aria-controls=\"profile\" role=\"tab\" data-toggle=\"tab\">GIÁ TỐT</a></li>\r\n");
      out.write("                                                <li role=\"presentation\"><a href=\"#messages\" id=\"messages_tab\" aria-controls=\"messages\" role=\"tab\" data-toggle=\"tab\">Gaming</a></li>\r\n");
      out.write("                                                <li role=\"presentation\"><a href=\"#settings\" id=\"settings_tab\" aria-controls=\"settings\" role=\"tab\" data-toggle=\"tab\">Notebook</a></li>\r\n");
      out.write("                                                <li role=\"presentation\"><a href=\"#settings2\" id=\"settings2_tab\" aria-controls=\"settings2\" role=\"tab\" data-toggle=\"tab\">Ultrabook</a></li>\r\n");
      out.write("                                                <li role=\"presentation\"><a href=\"#settings3\" id=\"settings3_tab\" aria-controls=\"settings3\" role=\"tab\" data-toggle=\"tab\">2 in 1</a></li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Tab panes -->\r\n");
      out.write("                                <div class=\"tab-content\">\r\n");
      out.write("<!--                                    Sản phẩm mới-->\r\n");
      out.write("                                    <div role=\"tabpanel\" class=\"tab-pane active\" id=\"home\">\r\n");
      out.write("                                        <div class=\"featured_projects_hidden_xs\">\r\n");
      out.write("                                            ");

                                                for(Product pnew : productDAO.getListProductNew())
                                                {
                                            
      out.write("\r\n");
      out.write("                                            <div class=\"col-sm-6 col-md-4 projects-item-content\">\r\n");
      out.write("                                                <div class=\"projects-item\">\r\n");
      out.write("                                                    <a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write("\"><img src=\"./images/product/");
      out.print(pnew.getProductImage());
      out.write("\" alt=\"");
      out.print(pnew.getProductName());
      out.write("\"></a>\r\n");
      out.write("                                                    <div class=\"projects-item-info\">\r\n");
      out.write("                                                        <h3 class=\"projects-item-title\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(pnew.getProductName());
      out.write("</a></h3>\r\n");
      out.write("                                                        <p class=\"projects-item-description\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(formatter.format(pnew.getProductPriceReal()));
      out.write("</a></p>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            ");
 }
      out.write("\r\n");
      out.write("                                        </div><!-- End. Item hidden-xs-->\r\n");
      out.write("                                        <div class=\"featured_projects_show_xs\">\r\n");
      out.write("                                            <div id=\"owl-demo-featured_projects\" class=\"owl-carousel owl-theme\">\r\n");
      out.write("                                                ");

                                                for(Product pnew : productDAO.getListProductNew())
                                                {
                                                
      out.write("\r\n");
      out.write("                                                <div class=\"item\">\r\n");
      out.write("                                                    <div class=\"col-xs-12 projects-item-content\">\r\n");
      out.write("                                                        <div class=\"projects-item\">\r\n");
      out.write("                                                            <a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write("\"><img src=\"./images/product/");
      out.print(pnew.getProductImage());
      out.write("\" alt=\"");
      out.print(pnew.getProductName());
      out.write("\"></a>\r\n");
      out.write("                                                            <div class=\"projects-item-info\">\r\n");
      out.write("                                                                <h3 class=\"projects-item-title\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(pnew.getProductName());
      out.write("</a></h3>\r\n");
      out.write("                                                                <p class=\"projects-item-description\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(formatter.format(pnew.getProductPriceReal()));
      out.write("</a></p>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-12 text-center projects-item-content\">\r\n");
      out.write("                                            <a href=\"/all.jsp\" class=\"projects-item-content-more btn btn-default\">Xem thêm</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                                \r\n");
      out.write("<!--                                    Sản phẩm giá tốt-->\r\n");
      out.write("                                    <div role=\"tabpanel\" class=\"tab-pane\" id=\"profile\">\r\n");
      out.write("                                        <div class=\"featured_projects_hidden_xs\">\r\n");
      out.write("                                            ");

                                                for(Product pnew : productDAO.getListProductPrice())
                                                {
                                            
      out.write("\r\n");
      out.write("                                            <div class=\"col-sm-6 col-md-4 projects-item-content\">\r\n");
      out.write("                                                <div class=\"projects-item\">\r\n");
      out.write("                                                    <a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write("\"><img src=\"./images/product/");
      out.print(pnew.getProductImage());
      out.write("\" alt=\"");
      out.print(pnew.getProductName());
      out.write("\"></a>\r\n");
      out.write("                                                    <div class=\"projects-item-info\">\r\n");
      out.write("                                                        <h3 class=\"projects-item-title\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(pnew.getProductName());
      out.write("</a></h3>\r\n");
      out.write("                                                        <p class=\"projects-item-description\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(formatter.format(pnew.getProductPriceReal()));
      out.write("</a></p>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            ");
 }
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"featured_projects_show_xs\">\r\n");
      out.write("                                            <div id=\"owl-demo-featured_projects_profile\" class=\"owl-carousel owl-theme\">\r\n");
      out.write("\r\n");
      out.write("                                                ");

                                                for(Product pnew : productDAO.getListProductPrice())
                                                {
                                                
      out.write("\r\n");
      out.write("                                                <div class=\"item\">\r\n");
      out.write("                                                    <div class=\"col-xs-12 projects-item-content\">\r\n");
      out.write("                                                        <div class=\"projects-item\">\r\n");
      out.write("                                                            <a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write("\"><img src=\"./images/product/");
      out.print(pnew.getProductImage());
      out.write("\" alt=\"");
      out.print(pnew.getProductName());
      out.write("\"></a>\r\n");
      out.write("                                                            <div class=\"projects-item-info\">\r\n");
      out.write("                                                                <h3 class=\"projects-item-title\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(pnew.getProductName());
      out.write("</a></h3>\r\n");
      out.write("                                                                <p class=\"projects-item-description\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(formatter.format(pnew.getProductPriceReal()));
      out.write("</a></p>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-12 text-center projects-item-content\">\r\n");
      out.write("                                            <a href=\"/all.jsp\" class=\"projects-item-content-more btn btn-default\">Xem thêm</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("<!--                                     GAMING-->\r\n");
      out.write("                                    <div role=\"tabpanel\" class=\"tab-pane\" id=\"messages\">\r\n");
      out.write("                                        <div class=\"featured_projects_hidden_xs\">\r\n");
      out.write("                                            ");

                                                for(Product pnew : productDAO.getListProductBuysByCategory(1))
                                                {
                                            
      out.write("\r\n");
      out.write("                                            <div class=\"col-sm-6 col-md-4 projects-item-content\">\r\n");
      out.write("                                                <div class=\"projects-item\">\r\n");
      out.write("                                                    <a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write("\"><img src=\"./images/product/");
      out.print(pnew.getProductImage());
      out.write("\" alt=\"");
      out.print(pnew.getProductName());
      out.write("\"></a>\r\n");
      out.write("                                                    <div class=\"projects-item-info\">\r\n");
      out.write("                                                        <h3 class=\"projects-item-title\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(pnew.getProductName());
      out.write("</a></h3>\r\n");
      out.write("                                                        <p class=\"projects-item-description\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(formatter.format(pnew.getProductPriceReal()));
      out.write("</a></p>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            ");
 }
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"featured_projects_show_xs\">\r\n");
      out.write("                                            <div id=\"owl-demo-featured_projects_profile\" class=\"owl-carousel owl-theme\">\r\n");
      out.write("\r\n");
      out.write("                                                ");

                                                for(Product pnew : productDAO.getListProductBuysByCategory(1))
                                                {
                                                
      out.write("\r\n");
      out.write("                                                <div class=\"item\">\r\n");
      out.write("                                                    <div class=\"col-xs-12 projects-item-content\">\r\n");
      out.write("                                                        <div class=\"projects-item\">\r\n");
      out.write("                                                            <a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write("\"><img src=\"./images/product/");
      out.print(pnew.getProductImage());
      out.write("\" alt=\"");
      out.print(pnew.getProductName());
      out.write("\"></a>\r\n");
      out.write("                                                            <div class=\"projects-item-info\">\r\n");
      out.write("                                                                <h3 class=\"projects-item-title\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(pnew.getProductName());
      out.write("</a></h3>\r\n");
      out.write("                                                                <p class=\"projects-item-description\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(formatter.format(pnew.getProductPriceReal()));
      out.write("</a></p>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-12 text-center projects-item-content\">\r\n");
      out.write("                                            <a href=\"/product.jsp?category=1\" class=\"projects-item-content-more btn btn-default\">Xem thêm</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                                \r\n");
      out.write("<!--                                     NOTEBOOK-->\r\n");
      out.write("                                    <div role=\"tabpanel\" class=\"tab-pane\" id=\"settings\">\r\n");
      out.write("                                        <div class=\"featured_projects_hidden_xs\">\r\n");
      out.write("                                            ");

                                                for(Product pnew : productDAO.getListProductBuysByCategory(2))
                                                {
                                            
      out.write("\r\n");
      out.write("                                            <div class=\"col-sm-6 col-md-4 projects-item-content\">\r\n");
      out.write("                                                <div class=\"projects-item\">\r\n");
      out.write("                                                    <a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write("\"><img src=\"./images/product/");
      out.print(pnew.getProductImage());
      out.write("\" alt=\"");
      out.print(pnew.getProductName());
      out.write("\"></a>\r\n");
      out.write("                                                    <div class=\"projects-item-info\">\r\n");
      out.write("                                                        <h3 class=\"projects-item-title\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(pnew.getProductName());
      out.write("</a></h3>\r\n");
      out.write("                                                        <p class=\"projects-item-description\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(formatter.format(pnew.getProductPriceReal()));
      out.write("</a></p>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            ");
 }
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"featured_projects_show_xs\">\r\n");
      out.write("                                            <div id=\"owl-demo-featured_projects_profile\" class=\"owl-carousel owl-theme\">\r\n");
      out.write("\r\n");
      out.write("                                                ");

                                                for(Product pnew : productDAO.getListProductBuysByCategory(2))
                                                {
                                                
      out.write("\r\n");
      out.write("                                                <div class=\"item\">\r\n");
      out.write("                                                    <div class=\"col-xs-12 projects-item-content\">\r\n");
      out.write("                                                        <div class=\"projects-item\">\r\n");
      out.write("                                                            <a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write("\"><img src=\"./images/product/");
      out.print(pnew.getProductImage());
      out.write("\" alt=\"");
      out.print(pnew.getProductName());
      out.write("\"></a>\r\n");
      out.write("                                                            <div class=\"projects-item-info\">\r\n");
      out.write("                                                                <h3 class=\"projects-item-title\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(pnew.getProductName());
      out.write("</a></h3>\r\n");
      out.write("                                                                <p class=\"projects-item-description\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(formatter.format(pnew.getProductPriceReal()));
      out.write("</a></p>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-12 text-center projects-item-content\">\r\n");
      out.write("                                            <a href=\"/product.jsp?category=2\" class=\"projects-item-content-more btn btn-default\">Xem thêm</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                                \r\n");
      out.write("<!--                                     ULTRABOOK-->\r\n");
      out.write("                                    <div role=\"tabpanel\" class=\"tab-pane\" id=\"settings1\">\r\n");
      out.write("                                        <div class=\"featured_projects_hidden_xs\">\r\n");
      out.write("                                            ");

                                                for(Product pnew : productDAO.getListProductBuysByCategory(3))
                                                {
                                            
      out.write("\r\n");
      out.write("                                            <div class=\"col-sm-6 col-md-4 projects-item-content\">\r\n");
      out.write("                                                <div class=\"projects-item\">\r\n");
      out.write("                                                    <a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write("\"><img src=\"./images/product/");
      out.print(pnew.getProductImage());
      out.write("\" alt=\"");
      out.print(pnew.getProductName());
      out.write("\"></a>\r\n");
      out.write("                                                    <div class=\"projects-item-info\">\r\n");
      out.write("                                                        <h3 class=\"projects-item-title\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(pnew.getProductName());
      out.write("</a></h3>\r\n");
      out.write("                                                        <p class=\"projects-item-description\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(formatter.format(pnew.getProductPriceReal()));
      out.write("</a></p>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            ");
 }
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"featured_projects_show_xs\">\r\n");
      out.write("                                            <div id=\"owl-demo-featured_projects_profile\" class=\"owl-carousel owl-theme\">\r\n");
      out.write("\r\n");
      out.write("                                                ");

                                                for(Product pnew : productDAO.getListProductBuysByCategory(3))
                                                {
                                                
      out.write("\r\n");
      out.write("                                                <div class=\"item\">\r\n");
      out.write("                                                    <div class=\"col-xs-12 projects-item-content\">\r\n");
      out.write("                                                        <div class=\"projects-item\">\r\n");
      out.write("                                                            <a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write("\"><img src=\"./images/product/");
      out.print(pnew.getProductImage());
      out.write("\" alt=\"");
      out.print(pnew.getProductName());
      out.write("\"></a>\r\n");
      out.write("                                                            <div class=\"projects-item-info\">\r\n");
      out.write("                                                                <h3 class=\"projects-item-title\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(pnew.getProductName());
      out.write("</a></h3>\r\n");
      out.write("                                                                <p class=\"projects-item-description\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(formatter.format(pnew.getProductPriceReal()));
      out.write("</a></p>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-12 text-center projects-item-content\">\r\n");
      out.write("                                            <a href=\"/product.jsp?category=3\" class=\"projects-item-content-more btn btn-default\">Xem thêm</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                                \r\n");
      out.write("<!--                                     2 IN 1-->\r\n");
      out.write("                                    <div role=\"tabpanel\" class=\"tab-pane\" id=\"settings2\">\r\n");
      out.write("                                        <div class=\"featured_projects_hidden_xs\">\r\n");
      out.write("                                            ");

                                                for(Product pnew : productDAO.getListProductBuysByCategory(4))
                                                {
                                            
      out.write("\r\n");
      out.write("                                            <div class=\"col-sm-6 col-md-4 projects-item-content\">\r\n");
      out.write("                                                <div class=\"projects-item\">\r\n");
      out.write("                                                    <a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write("\"><img src=\"./images/product/");
      out.print(pnew.getProductImage());
      out.write("\" alt=\"");
      out.print(pnew.getProductName());
      out.write("\"></a>\r\n");
      out.write("                                                    <div class=\"projects-item-info\">\r\n");
      out.write("                                                        <h3 class=\"projects-item-title\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(pnew.getProductName());
      out.write("</a></h3>\r\n");
      out.write("                                                        <p class=\"projects-item-description\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(formatter.format(pnew.getProductPriceReal()));
      out.write("</a></p>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            ");
 }
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"featured_projects_show_xs\">\r\n");
      out.write("                                            <div id=\"owl-demo-featured_projects_profile\" class=\"owl-carousel owl-theme\">\r\n");
      out.write("\r\n");
      out.write("                                                ");

                                                for(Product pnew : productDAO.getListProductBuysByCategory(4))
                                                {
                                                
      out.write("\r\n");
      out.write("                                                <div class=\"item\">\r\n");
      out.write("                                                    <div class=\"col-xs-12 projects-item-content\">\r\n");
      out.write("                                                        <div class=\"projects-item\">\r\n");
      out.write("                                                            <a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write("\"><img src=\"./images/product/");
      out.print(pnew.getProductImage());
      out.write("\" alt=\"");
      out.print(pnew.getProductName());
      out.write("\"></a>\r\n");
      out.write("                                                            <div class=\"projects-item-info\">\r\n");
      out.write("                                                                <h3 class=\"projects-item-title\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(pnew.getProductName());
      out.write("</a></h3>\r\n");
      out.write("                                                                <p class=\"projects-item-description\"><a href=\"detail.jsp?product=");
      out.print(pnew.getProductID());
      out.write('"');
      out.write('>');
      out.print(formatter.format(pnew.getProductPriceReal()));
      out.write("</a></p>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-12 text-center projects-item-content\">\r\n");
      out.write("                                            <a href=\"/product.jsp?category=4\" class=\"projects-item-content-more btn btn-default\">Xem thêm</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section class=\"activities\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row \">\r\n");
      out.write("                            <style>\r\n");
      out.write("                                .featured-products {\r\n");
      out.write("                                    background: url(\"\");\r\n");
      out.write("                                    background-repeat: no-repeat;\r\n");
      out.write("                                    background-position: top center;\r\n");
      out.write("                                    background-size: cover;\r\n");
      out.write("                                    position: relative;\r\n");
      out.write("                                }\r\n");
      out.write("                            </style>\r\n");
      out.write("                            <h2 class=\"activities_title text-center padding-lr-15\">Sản phẩm nổi bật</h2>\r\n");
      out.write("                            <p class=\"activities_description text-center padding-lr-15 hidden-xs\">Chúng tôi mang đến những sản phẩm với chất lượng cao nhất và dịch vụ hoàn hảo nhất cho mọi khách hàng</p>\r\n");
      out.write("                            <div id=\"owl-demo-featured-products\" class=\"owl-carousel owl-theme\">\r\n");
      out.write("                            ");

                                for(Product p : productDAO.getListProductNoibat())
                                {
                            
      out.write("\r\n");
      out.write("                                <div class=\"item\">\r\n");
      out.write("                                    <div class=\"col-md-12\">\r\n");
      out.write("                                        <div class=\"product_item\">\r\n");
      out.write("                                            <form action=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\" class=\"product_item_form\" method=\"post\">\r\n");
      out.write("                                                <div class=\"product-gird\">\r\n");
      out.write("                                                    <div class=\"product-img-parent\">\r\n");
      out.write("                                                        ");
 if(p.getProductSale() > 0 ){ 
      out.write("\r\n");
      out.write("                                                        <div class=\"sale_tag\">- ");
      out.print(p.getProductSale());
      out.write("%</div>\r\n");
      out.write("                                                        ");
 }
      out.write("\r\n");
      out.write("                                                        <a class=\"product-img\" href=\"detail.jsp?product=");
      out.print(p.getProductID());
      out.write("\" title=\"");
      out.print(p.getProductName());
      out.write("\">\r\n");
      out.write("                                                            <img class=\"product-img-first\" src=\"./images/product/");
      out.print(p.getProductImage());
      out.write("\" alt=\"");
      out.print(p.getProductName());
      out.write("\">\r\n");
      out.write("                                                        </a>\r\n");
      out.write("                                                        <div class=\"product-action-btn\">\r\n");
      out.write("                                                            <div class=\"btn-group\" role=\"group\" aria-label=\"Basic example\">\r\n");
      out.write("                                                                <a class=\"btn btn-default btn-lg addtocart\" href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\">CHỌN SẢN PHẨM</a>\r\n");
      out.write("                                                                <a href=\"detail.jsp?product=");
      out.print(p.getProductID());
      out.write("\" class=\"btn btn-default btn-black btn-lg\">CHI TIẾT</a>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <span class=\"product-price text-center\">\r\n");
      out.write("                                                        <b class=\"productminprice\">");
      out.print(formatter.format(p.getProductPriceReal()));
      out.write("</b>\r\n");
      out.write("                                                        ");
 if(p.getProductSale() > 0 ){ 
      out.write("\r\n");
      out.write("                                                        <del>");
      out.print(formatter.format(p.getProductPrice()));
      out.write("</del>\r\n");
      out.write("                                                        ");
 }
      out.write("\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                    <h3 class=\"product-name\"><a href=\"detail.jsp?product=");
      out.print(p.getProductID());
      out.write("\" title=\"");
      out.print(p.getProductName());
      out.write('"');
      out.write('>');
      out.print(p.getProductName());
      out.write("</a></h3>\r\n");
      out.write("<!--                                                    <div style=\"display:none\">\r\n");
      out.write("                                                        <select id=\"product-selectors\" name=\"variantId\" style=\"display:none\">\r\n");
      out.write("                                                            <option lỗi liquid unknown operator roduct value=\"2023875\">Đỏ - ");
      out.print(formatter.format(p.getProductPriceReal()));
      out.write("</option>\r\n");
      out.write("                                                            <option lỗi liquid unknown operator roduct value=\"2023876\">Trắng - ");
      out.print(formatter.format(p.getProductPriceReal()));
      out.write("</option>\r\n");
      out.write("                                                        </select>\r\n");
      out.write("                                                    </div>-->\r\n");
      out.write("                                                    <!--số lượng-->\r\n");
      out.write("                                                    <div style=\"display:none\">\r\n");
      out.write("                                                        <div class=\"input-group quantity\">\r\n");
      out.write("                                                            <input type=\"text\" class=\"form-control\" name=\"quantity\" id=\"quantity_wanted\" size=\"2\" value=\"1\" />\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <!-- End .product-gird -->\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                ");
 } 
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /SITE CONTENT -->\r\n");
      out.write("        \r\n");
      out.write("        <!-- SITE FOOTER\r\n");
      out.write("        =========================================================================== -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/brand.jsp", out, false);
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/footer.jsp", out, false);
      out.write("\r\n");
      out.write("        <!-- /SITE FOOTER -->\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/script.jsp", out, false);
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
