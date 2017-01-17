package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class support_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"vn\">\r\n");
      out.write("    <head>        \r\n");
      out.write("        <title>Liên hệ</title>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/head.jsp", out, false);
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"page-wrapper\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/header.jsp", out, false);
      out.write("\r\n");
      out.write("        <div id=\"site-content\">\r\n");
      out.write("        <!--MAIN\r\n");
      out.write("        =========================================================================== -->\r\n");
      out.write("        <div id=\"main\">\r\n");
      out.write("                <section class=\"page_title\">\r\n");
      out.write("                    <h1 class=\"text-center\">Liên hệ</h1>\r\n");
      out.write("                </section>\r\n");
      out.write("                <div class=\"header-breadcrumb\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row \">\r\n");
      out.write("                            <div class=\"col-xs-12\">\r\n");
      out.write("                                <ol class=\"breadcrumb\">\r\n");
      out.write("                                    <li><a href=\"/\" title=\"Trang chủ\">Trang chủ </a> </li>\r\n");
      out.write("                                    <li class=\"active breadcrumb-title\">Liên hệ</li>\r\n");
      out.write("                                </ol>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <style>\r\n");
      out.write("                    .header-breadcrumb {\r\n");
      out.write("                        margin-bottom: 0px !important;\r\n");
      out.write("                    }\r\n");
      out.write("                </style>\r\n");
      out.write("\r\n");
      out.write("                <section class=\"mtb25 section-page\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <style>\r\n");
      out.write("                            #map {\r\n");
      out.write("                                width: 100%;\r\n");
      out.write("                                height: 500px;\r\n");
      out.write("                            }\r\n");
      out.write("                        </style>\r\n");
      out.write("                        <button class=\"btn btn-default mini_btn center-block\" onclick=\"timDuongDi()\">Tìm đường đi</button>\r\n");
      out.write("                        <div id=\"map\"></div>\r\n");
      out.write("                        <script>\r\n");
      out.write("                            function initMap() {\r\n");
      out.write("                                var latlng = new google.maps.LatLng(10.802149,106.714976); //Vị trí của trung tâm\r\n");
      out.write("                                var map = new google.maps.Map(document.getElementById('map'),\r\n");
      out.write("                                    {\r\n");
      out.write("                                    center: latlng,\r\n");
      out.write("                                    zoom: 16\r\n");
      out.write("                                });\r\n");
      out.write("                                var marker = new google.maps.Marker({\r\n");
      out.write("                                    position: latlng,\r\n");
      out.write("                                    map: map,\r\n");
      out.write("                                    title: \"AK\"\r\n");
      out.write("                                });\r\n");
      out.write("                            }\r\n");
      out.write("                            function timDuongDi() {\r\n");
      out.write("                                var latlng = new google.maps.LatLng(10.802149, 106.714976); //Vị trí của trung tâm\r\n");
      out.write("                                var map = new google.maps.Map(document.getElementById('map'), {\r\n");
      out.write("                                    center: latlng,\r\n");
      out.write("                                    zoom: 16\r\n");
      out.write("                                });\r\n");
      out.write("                                var infoWindow = new google.maps.InfoWindow({ map: map });\r\n");
      out.write("                                // Try HTML5 geolocation.\r\n");
      out.write("                                if (navigator.geolocation) {\r\n");
      out.write("                                    navigator.geolocation.getCurrentPosition(function (position) {\r\n");
      out.write("                                        var pos = {\r\n");
      out.write("                                            lat: position.coords.latitude,\r\n");
      out.write("                                            lng: position.coords.longitude\r\n");
      out.write("                                        };\r\n");
      out.write("\r\n");
      out.write("                                        infoWindow.setPosition(pos);\r\n");
      out.write("                                        infoWindow.setContent('Vị trí của bạn');\r\n");
      out.write("                                        map.setCenter(pos);\r\n");
      out.write("                                        var directionsDisplay = new google.maps.DirectionsRenderer({\r\n");
      out.write("                                            map: map\r\n");
      out.write("                                        });\r\n");
      out.write("                                        var request = {\r\n");
      out.write("                                            destination: latlng,\r\n");
      out.write("                                            origin: pos,\r\n");
      out.write("                                            travelMode: google.maps.TravelMode.DRIVING\r\n");
      out.write("                                        };\r\n");
      out.write("                                        var directionsService = new google.maps.DirectionsService();\r\n");
      out.write("                                        directionsService.route(request, function (response, status) {\r\n");
      out.write("                                            if (status == google.maps.DirectionsStatus.OK) {\r\n");
      out.write("                                                // Display the route on the map.\r\n");
      out.write("                                                directionsDisplay.setDirections(response);\r\n");
      out.write("                                            }\r\n");
      out.write("                                        });\r\n");
      out.write("                                    }, function () {\r\n");
      out.write("                                        handleLocationError(true, infoWindow, map.getCenter());\r\n");
      out.write("                                    });\r\n");
      out.write("                                } else {\r\n");
      out.write("                                    // Browser doesn't support Geolocation\r\n");
      out.write("                                    handleLocationError(false, infoWindow, map.getCenter());\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("                            function handleLocationError(browserHasGeolocation, infoWindow, pos) {\r\n");
      out.write("                                infoWindow.setPosition(pos);\r\n");
      out.write("                                infoWindow.setContent(browserHasGeolocation ?\r\n");
      out.write("                                                      'Error: The Geolocation service failed.' :\r\n");
      out.write("                                                      'Error: Your browser doesn\\'t support geolocation.');//\r\n");
      out.write("                                //AIzaSyBCCsKuhU3kBqm6QUeaeQ7yzm297VXUNII key 2\r\n");
      out.write("                            }\r\n");
      out.write("                        </script>\r\n");
      out.write("                        <script async defer\r\n");
      out.write("                                src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCUDgrQ_rLrMHJUy1MQEczXGjjg1k5somw&callback=initMap\">\r\n");
      out.write("                        </script> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <section class=\"section-contact\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-5 col-md-push-7\">\r\n");
      out.write("                                <div class=\"widget-item\">\r\n");
      out.write("                                    <a href=\"#\" class=\"contact-logo\"><img src=\"./images/shop/logo2.png\" alt=\"\"></a>\r\n");
      out.write("                                    <ul class=\"widget-menu\">\r\n");
      out.write("                                        <li class=\"widget-address\"><span>KTLaptop mang lại cho bạn những sản phẩm Laptop tốt nhất mới với các dòng sản phẩm chất lượng cao, chủng loại phong phú và đa dạng.</span></li>\r\n");
      out.write("                                        <li class=\"widget-address\"><i class=\"fa fa-map-marker\"></i> <span>475A Điện Biên Phủ, P.25, Q.Bình Thạnh, TP.HCM</span></li>\r\n");
      out.write("                                        <li><i class=\"fa fa-phone\"></i> <span>098 7654 321</span></li>\r\n");
      out.write("                                        <li><i class=\"fa fa-envelope\"></i> <span>KTLaptop@gmail.com</span></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                    <!-- End .widget-menu -->\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- End .widget-item -->\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-7 col-md-pull-5\">\r\n");
      out.write("                                <div class=\"section-article contactpage\">\r\n");
      out.write("                                    <form accept-charset='UTF-8' action='FeedbackServlet' id='contact' method='post'>\r\n");
      out.write("                                        <input name='FormType' type='hidden' value='contact' />\r\n");
      out.write("                                        <input name='utf8' type='hidden' value='true' />\r\n");
      out.write("                                        <!--form-errors-custom-->\r\n");
      out.write("                                        <div class=\"notification_contact\"><p>Gửi liên hệ thành công!</p></div>\r\n");
      out.write("                                        <!--End. form-errors-custom-->\r\n");
      out.write("                                        <div class=\"form-inline form-comment\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label for=\"name\">Họ tên <span class=\"text-danger\">*</span></label>\r\n");
      out.write("                                                <input id=\"name\" name=\"name\" type=\"text\" value=\"\" class=\"form-control\" required>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label for=\"email\">Email <span class=\"text-danger\">*</span></label>\r\n");
      out.write("                                                <input id=\"email\" name=\"email\" class=\"form-control\" type=\"email\" value=\"\" required>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label for=\"message\">Lời nhắn <span class=\"text-danger\">*</span></label>\r\n");
      out.write("                                                <textarea id=\"message\" name=\"message\" class=\"form-control custom-control\" rows=\"3\" required></textarea>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <button type=\"submit\" id=\"submitlienhe\" class=\"btn btn-default\">Gửi phản hồi</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("            </div>\r\n");
      out.write("        <!--/MAIN-->\r\n");
      out.write("        </div>        \r\n");
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
      out.write("</html>");
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
