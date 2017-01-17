package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Admin;
import java.util.ArrayList;
import model.Pq;
import dao.PqDAO;
import dao.AdminDAO;

public final class manager_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
 
    Admin adminid = (Admin) session.getAttribute("admin");
    String pqAdmin = "";
    if (adminid == null) {
        response.sendRedirect("../Admin/login.jsp");
    }else{        
        if(Integer.parseInt(session.getAttribute("pqAdmin").toString()) != 1){
            pqAdmin = "disabled";
        }
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Quản lý tài khoảng Admin</title>\r\n");
      out.write("        <link rel=\"icon\" href=\"./images/favicon.png\" type=\"image/x-icon\" />\r\n");
      out.write("        \r\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/layout/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<!--        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/layout/plugins/datatables/dataTables.bootstrap.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/layout/dist/css/AdminLTE.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/layout/dist/css/skins/_all-skins.min.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"hold-transition skin-blue sidebar-mini\">\r\n");
      out.write("        ");

            AdminDAO adminDAO = new AdminDAO();
            PqDAO pqDAO = new PqDAO();
            ArrayList<Admin> listAdmin = adminDAO.getListAdmin();            
        
      out.write("\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./layout/header.jsp", out, false);
      out.write("\r\n");
      out.write("            <div class=\"content-wrapper\">\r\n");
      out.write("                <section class=\"content-header\">\r\n");
      out.write("                    ");
if(pqAdmin!="disabled"){
      out.write("\r\n");
      out.write("                    <a class=\"btn btn-primary mini_btn center-block\" href=\"../Admin/insert_admin.jsp\">THÊM MỚI</a>\r\n");
      out.write("                    ");
 }
      out.write("\r\n");
      out.write("                    <br>\r\n");
      out.write("                    \r\n");
      out.write("                  </section>\r\n");
      out.write("                  \r\n");
      out.write("<!--                MAIN------------------------------------------------------------------->\r\n");
      out.write("                        <section class=\"content\">\r\n");
      out.write("                             <div class=\"row\">\r\n");
      out.write("                               <div class=\"col-xs-12\">\r\n");
      out.write("                                 <!-- /.box -->\r\n");
      out.write("\r\n");
      out.write("                                 <div class=\"box\">\r\n");
      out.write("                                   <div class=\"box-header\">\r\n");
      out.write("                                     <h3 class=\"box-title\">Bảng danh mục sản phẩm</h3>                                    \r\n");
      out.write("                                     ");
if(session.getAttribute("adid")=="noti"){
      out.write("\r\n");
      out.write("                                        <div class=\"alert alert-success alert-dismissible fade in\" id=\"myAlert\">\r\n");
      out.write("                                            <a href=\"#\" class=\"close\">&times;</a>\r\n");
      out.write("                                            <strong>");
      out.print(session.getAttribute("adnoti"));
      out.write("</strong>\r\n");
      out.write("                                        </div>    \r\n");
      out.write("                                      ");
 }
      out.write("\r\n");
      out.write("                                   </div>                                   \r\n");
      out.write("                                   <!-- /.box-header -->\r\n");
      out.write("                                   <div class=\"box-body\">\r\n");
      out.write("                                     <table id=\"example1\" class=\"table table-bordered table-striped display\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("                                       <thead>\r\n");
      out.write("                                       <tr>\r\n");
      out.write("                                            <th>Mã Admin</th>\r\n");
      out.write("                                            <th>Tên Admin</th>\r\n");
      out.write("                                            <th>Avatar</th>\r\n");
      out.write("                                            <th>Email</th>\r\n");
      out.write("                                            <th>Phân quyền</th>\r\n");
      out.write("                                            <th width=\"75px\">Tùy chọn</th>\r\n");
      out.write("                                       </tr>\r\n");
      out.write("                                       </thead>\r\n");
      out.write("                                       <tbody>\r\n");
      out.write("                                        ");

                                            for(Admin admin : listAdmin){
                                        
      out.write("\r\n");
      out.write("                                        <tr>                                        \r\n");
      out.write("                                          <td>");
      out.print(admin.getAdminID());
      out.write("</td>\r\n");
      out.write("                                          <td>");
      out.print(admin.getAdminfullName());
      out.write("</td>\r\n");
      out.write("                                          <td>\r\n");
      out.write("                                              <div class=\"col-sm-5 col-md-5 no-padding-l\">\r\n");
      out.write("                                                <div class=\"product-img-parent\">\r\n");
      out.write("                                                    <a href=\"#\" class=\"product-img\"><img src=\"../images/admin/");
      out.print(admin.getAdminAvatar());
      out.write("\" width=\"50\" height=\"50\" alt=\"");
      out.print(admin.getAdminfullName());
      out.write("\"></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                              </div>\r\n");
      out.write("                                          </td>\r\n");
      out.write("                                          <td>");
      out.print(admin.getAdminEmail());
      out.write("</td>\r\n");
      out.write("                                          <td>");
      out.print(pqDAO.getPqName(Long.toString(admin.getPqID())).getPqName());
      out.write("</td>\r\n");
      out.write("                                          <td width=\"75px\"> \r\n");
      out.write("                                              <center> \r\n");
      out.write("                                             <button ");
      out.print(pqAdmin);
      out.write(" class=\"btn btn-primary btn-xs\" onclick=\"location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("../Admin/update_admin.jsp?command=update&admin_id=");
      out.print(admin.getAdminID());
      out.write("'\"><i class=\"glyphicon glyphicon-pencil\"></i> Sửa</button>\r\n");
      out.write("                                             <button ");
      out.print(pqAdmin);
      out.write(" class=\"btn btn-danger btn-xs\" data-toggle=\"modal\" data-target=\"#myModal");
      out.print(admin.getAdminID());
      out.write("\"><i class=\"glyphicon glyphicon-remove\"></i> Xóa</button>\r\n");
      out.write("                                                </center> \r\n");
      out.write("                                           </td>                                         \r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <div class=\"modal fade\" id=\"myModal");
      out.print(admin.getAdminID());
      out.write("\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("                                        <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                                          <div class=\"modal-content\">\r\n");
      out.write("                                            <div class=\"modal-header\">\r\n");
      out.write("                                              <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                                              <h4 class=\"modal-title\" id=\"myModalLabel\">Bạn muốn xóa loại cpu <strong>");
      out.print(admin.getAdminfullName());
      out.write("</strong></h4>\r\n");
      out.write("                                            </div>         \r\n");
      out.write("                                            <div class=\"modal-footer\">\r\n");
      out.write("                                              <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Hủy</button>\r\n");
      out.write("                                              <button type=\"button\" class=\"btn btn-danger\" onclick=\"location.href='../AdminServlet?admin_id=");
      out.print(admin.getAdminID());
      out.write("'\">Xóa</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                          </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                      </div>\r\n");
      out.write("                                       ");
 }
      out.write("\r\n");
      out.write("                                       </tbody>\r\n");
      out.write("                                       <tfoot>\r\n");
      out.write("                                       <tr>\r\n");
      out.write("                                            <th>Mã Admin</th>\r\n");
      out.write("                                            <th>Tên Admin</th>\r\n");
      out.write("                                            <th>Avatar</th>\r\n");
      out.write("                                            <th>Email</th>\r\n");
      out.write("                                            <th>Phân quyền</th>\r\n");
      out.write("                                            <th width=\"75px\">Tùy chọn</th>\r\n");
      out.write("                                       </tr>\r\n");
      out.write("                                       </tfoot>\r\n");
      out.write("                                     </table>\r\n");
      out.write("                                   </div>\r\n");
      out.write("                                   <!-- /.box-body -->\r\n");
      out.write("                                 </div>\r\n");
      out.write("                                 <!-- /.box -->\r\n");
      out.write("                               </div>\r\n");
      out.write("                               <!-- /.col -->\r\n");
      out.write("                             </div>\r\n");
      out.write("                             <!-- /.row -->\r\n");
      out.write("                           </section>\r\n");
      out.write("\r\n");
      out.write("<!--                /MAIN------------------------------------------------------------------->\r\n");
      out.write("            </div>            \r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./layout/footer.jsp", out, false);
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./layout/control-sidebar.jsp", out, false);
      out.write("\r\n");
      out.write("            <div class=\"control-sidebar-bg\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("            <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/layout/plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("            <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/layout/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!--            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>-->\r\n");
      out.write("            <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/layout/plugins/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("            <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/layout/plugins/datatables/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("            <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/layout/plugins/slimScroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("            <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/layout/plugins/fastclick/fastclick.js\"></script>\r\n");
      out.write("            <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/layout/dist/js/app.min.js\"></script>\r\n");
      out.write("            <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/layout/dist/js/demo.js\"></script>\r\n");
      out.write("            <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $('#example1').DataTable({\r\n");
      out.write("                    responsive: true,\r\n");
      out.write("                    \"language\": {\r\n");
      out.write("                        \"sProcessing\":   \"Đang xử lý...\",\r\n");
      out.write("                        \"sLengthMenu\":   \"Xem _MENU_ mục\",\r\n");
      out.write("                        \"sZeroRecords\":  \"Không tìm thấy dòng nào phù hợp\",\r\n");
      out.write("                        \"sInfo\":         \"Đang xem _START_ đến _END_ trong tổng số _TOTAL_ mục\",\r\n");
      out.write("                        \"sInfoEmpty\":    \"Đang xem 0 đến 0 trong tổng số 0 mục\",\r\n");
      out.write("                        \"sInfoFiltered\": \"(được lọc từ _MAX_ mục)\",\r\n");
      out.write("                        \"sInfoPostFix\":  \"\",\r\n");
      out.write("                        \"sSearch\":       \"Tìm:\",\r\n");
      out.write("                        \"sUrl\":          \"\",\r\n");
      out.write("                        \"oPaginate\": {\r\n");
      out.write("                            \"sFirst\":    \"Đầu\",\r\n");
      out.write("                            \"sPrevious\": \"Trước\",\r\n");
      out.write("                            \"sNext\":     \"Tiếp\",\r\n");
      out.write("                            \"sLast\":     \"Cuối\"\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("            </script>\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$('.sidebar-menu a').filter(function(){return this.href===location.href;}).parent().addClass('active').siblings().removeClass('active');\r\n");
      out.write("\t\t$('.sidebar-menu a').click(function(){\r\n");
      out.write("\t\t\t$(this).parent().addClass('active').siblings().removeClass('active');\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function(){\r\n");
      out.write("                $(\".close\").click(function(){\r\n");
      out.write("                   $(\"#myAlert\").alert(\"close\");\r\n");
      out.write("                   ");

                        session.setAttribute("adid", "");
                        session.setAttribute("aderror", "");
                        session.setAttribute("adnoti", "");
                   
      out.write("\r\n");
      out.write("                });\r\n");
      out.write("            setTimeout(function(){\r\n");
      out.write("                $(\"#myAlert\").alert(\"close\");\r\n");
      out.write("                ");

                    session.setAttribute("adid", "");
                    session.setAttribute("aderror", "");
                    session.setAttribute("adnoti", "");
                
      out.write("\r\n");
      out.write("            }, 6000);            \r\n");
      out.write("        });\r\n");
      out.write("        </script>\r\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("root");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
