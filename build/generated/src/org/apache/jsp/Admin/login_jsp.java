package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Đăng nhập Admin</title>\r\n");
      out.write("        \r\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/bootstrap/css/normalize.css\" rel=\"stylesheet\">       \r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/js/prefixfree.min.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("        .btn {\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            *display: inline;\r\n");
      out.write("            *zoom: 1;\r\n");
      out.write("            padding: 4px 10px 4px;\r\n");
      out.write("            margin-bottom: 0;\r\n");
      out.write("            font-size: 13px;\r\n");
      out.write("            line-height: 18px;\r\n");
      out.write("            color: #333333;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            text-shadow: 0 1px 1px rgba(255, 255, 255, 0.75);\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            background-color: #f5f5f5;\r\n");
      out.write("            background-image: -moz-linear-gradient(top, #ffffff, #e6e6e6);\r\n");
      out.write("            background-image: -ms-linear-gradient(top, #ffffff, #e6e6e6);\r\n");
      out.write("            background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#ffffff), to(#e6e6e6));\r\n");
      out.write("            background-image: -webkit-linear-gradient(top, #ffffff, #e6e6e6);\r\n");
      out.write("            background-image: -o-linear-gradient(top, #ffffff, #e6e6e6);\r\n");
      out.write("            background-image: linear-gradient(top, #ffffff, #e6e6e6);\r\n");
      out.write("            background-repeat: repeat-x;\r\n");
      out.write("            filter: progid:dximagetransform.microsoft.gradient(startColorstr=#ffffff, endColorstr=#e6e6e6, GradientType=0);\r\n");
      out.write("            border-color: #e6e6e6 #e6e6e6 #e6e6e6;\r\n");
      out.write("            border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25);\r\n");
      out.write("            border: 1px solid #e6e6e6;\r\n");
      out.write("            -webkit-border-radius: 4px;\r\n");
      out.write("            -moz-border-radius: 4px;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            -webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px rgba(0, 0, 0, 0.05);\r\n");
      out.write("            -moz-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px rgba(0, 0, 0, 0.05);\r\n");
      out.write("            box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px rgba(0, 0, 0, 0.05);\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            *margin-left: .3em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("            .btn:hover, .btn:active, .btn.active, .btn.disabled, .btn[disabled] {\r\n");
      out.write("                background-color: #e6e6e6;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        .btn-large {\r\n");
      out.write("            padding: 9px 14px;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("            line-height: normal;\r\n");
      out.write("            -webkit-border-radius: 5px;\r\n");
      out.write("            -moz-border-radius: 5px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn:hover {\r\n");
      out.write("            color: #333333;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            background-color: #e6e6e6;\r\n");
      out.write("            background-position: 0 -15px;\r\n");
      out.write("            -webkit-transition: background-position 0.1s linear;\r\n");
      out.write("            -moz-transition: background-position 0.1s linear;\r\n");
      out.write("            -ms-transition: background-position 0.1s linear;\r\n");
      out.write("            -o-transition: background-position 0.1s linear;\r\n");
      out.write("            transition: background-position 0.1s linear;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-primary, .btn-primary:hover {\r\n");
      out.write("            text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25);\r\n");
      out.write("            color: #ffffff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("            .btn-primary.active {\r\n");
      out.write("                color: rgba(255, 255, 255, 0.75);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        .btn-primary {\r\n");
      out.write("            background-color: #4a77d4;\r\n");
      out.write("            background-image: -moz-linear-gradient(top, #6eb6de, #4a77d4);\r\n");
      out.write("            background-image: -ms-linear-gradient(top, #6eb6de, #4a77d4);\r\n");
      out.write("            background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#6eb6de), to(#4a77d4));\r\n");
      out.write("            background-image: -webkit-linear-gradient(top, #6eb6de, #4a77d4);\r\n");
      out.write("            background-image: -o-linear-gradient(top, #6eb6de, #4a77d4);\r\n");
      out.write("            background-image: linear-gradient(top, #6eb6de, #4a77d4);\r\n");
      out.write("            background-repeat: repeat-x;\r\n");
      out.write("            filter: progid:dximagetransform.microsoft.gradient(startColorstr=#6eb6de, endColorstr=#4a77d4, GradientType=0);\r\n");
      out.write("            border: 1px solid #3762bc;\r\n");
      out.write("            text-shadow: 1px 1px 1px rgba(0,0,0,0.4);\r\n");
      out.write("            box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px rgba(0, 0, 0, 0.5);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("            .btn-primary:hover, .btn-primary:active, .btn-primary.active, .btn-primary.disabled, .btn-primary[disabled] {\r\n");
      out.write("                filter: none;\r\n");
      out.write("                background-color: #4a77d4;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        .btn-block {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            display: block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        * {\r\n");
      out.write("            -webkit-box-sizing: border-box;\r\n");
      out.write("            -moz-box-sizing: border-box;\r\n");
      out.write("            -ms-box-sizing: border-box;\r\n");
      out.write("            -o-box-sizing: border-box;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        html {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            font-family: 'Open Sans', sans-serif;\r\n");
      out.write("            background: #092756;\r\n");
      out.write("            background: -moz-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%),-moz-linear-gradient(top, rgba(57,173,219,.25) 0%, rgba(42,60,87,.4) 100%), -moz-linear-gradient(-45deg, #670d10 0%, #092756 100%);\r\n");
      out.write("            background: -webkit-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), -webkit-linear-gradient(top, rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), -webkit-linear-gradient(-45deg, #670d10 0%,#092756 100%);\r\n");
      out.write("            background: -o-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), -o-linear-gradient(top, rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), -o-linear-gradient(-45deg, #670d10 0%,#092756 100%);\r\n");
      out.write("            background: -ms-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), -ms-linear-gradient(top, rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), -ms-linear-gradient(-45deg, #670d10 0%,#092756 100%);\r\n");
      out.write("            background: -webkit-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), linear-gradient(to bottom, rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), linear-gradient(135deg, #670d10 0%,#092756 100%);\r\n");
      out.write("            filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#3E1D6D', endColorstr='#092756',GradientType=1 );\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: 50%;\r\n");
      out.write("            left: 50%;\r\n");
      out.write("            margin: -150px 0 0 -150px;\r\n");
      out.write("            width: 300px;\r\n");
      out.write("            height: 300px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("            .login h1 {\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                text-shadow: 0 0 10px rgba(0,0,0,0.3);\r\n");
      out.write("                letter-spacing: 1px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        input {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            background: rgba(0,0,0,0.3);\r\n");
      out.write("            border: none;\r\n");
      out.write("            outline: none;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            font-size: 13px;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            text-shadow: 1px 1px 1px rgba(0,0,0,0.3);\r\n");
      out.write("            border: 1px solid rgba(0,0,0,0.3);\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            box-shadow: inset 0 -5px 45px rgba(100,100,100,0.2), 0 1px 1px rgba(255,255,255,0.2);\r\n");
      out.write("            -webkit-transition: box-shadow .5s ease;\r\n");
      out.write("            -moz-transition: box-shadow .5s ease;\r\n");
      out.write("            -o-transition: box-shadow .5s ease;\r\n");
      out.write("            -ms-transition: box-shadow .5s ease;\r\n");
      out.write("            transition: box-shadow .5s ease;\r\n");
      out.write("        }\r\n");
      out.write("            input:focus {\r\n");
      out.write("                box-shadow: inset 0 -5px 45px rgba(100,100,100,0.4), 0 1px 1px rgba(255,255,255,0.2);\r\n");
      out.write("            }\r\n");
      out.write("    </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"login-bg\">\r\n");
      out.write("        <div class=\"login\">\r\n");
      out.write("        ");
if(session.getAttribute("error")!=null){
      out.write("\r\n");
      out.write("            <h4 style=\"color:red; text-align:center\">");
      out.print(session.getAttribute("error"));
      out.write("</h4>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("        <h1>Login</h1>\r\n");
      out.write("        <form accept-charset='UTF-8' action=\"../AdminServlet\" method=\"POST\">\r\n");
      out.write("            <input type=\"hidden\" value=\"login\" name=\"command\" id=\"command\"/>\r\n");
      out.write("            <div>\r\n");
      out.write("                <input type=\"text\" maxlength=\"50\" name=\"email\" placeholder=\"Email\" required=\"required\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div>\r\n");
      out.write("                <input type=\"password\" maxlength=\"50\" name=\"password\" placeholder=\"Password\" required=\"required\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary btn-block btn-large\">Let me in.</button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
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
