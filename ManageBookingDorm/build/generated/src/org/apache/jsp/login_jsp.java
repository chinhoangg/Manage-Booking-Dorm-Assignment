package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login for Manage booking Dorm</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Official Signup Form Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!-- fonts -->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Raleway:100,200,300,400,500,600,700,800,900\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Monoton\" rel=\"stylesheet\">\n");
      out.write("        <!-- /fonts -->\n");
      out.write("        <!-- css -->\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' media=\"all\" />\n");
      out.write("        <!-- /css -->\n");
      out.write("        <style>\n");
      out.write("            .error{\n");
      out.write("                margin-left: 150px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                color: red\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 class=\"w3ls\">Manage Booking Dorm</h1>\n");
      out.write("        <div class=\"content-w3ls\">\n");
      out.write("            <div class=\"content-agile1\">\n");
      out.write("                <h2 class=\"agileits1\">DormBOO</h2>\n");
      out.write("                <p class=\"agileits2\">Here you can book the right dorm for you.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content-agile2\">\n");
      out.write("                <form action=\"login\" method=\"POST\">\n");
      out.write("                    <div class=\"form-control w3layouts\"> \n");
      out.write("                        <input type=\"text\" id=\"firstname\" name=\"username\" placeholder=\"User Name\" title=\"Please enter your User Name\" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-control agileinfo\">\t\n");
      out.write("                        <input type=\"password\" class=\"lock\" name=\"password\" placeholder=\"Password\" id=\"password1\" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div style=\"margin-left: 190px\">\t\n");
      out.write("                        <input type=\"checkbox\" name=\"remember\">\n");
      out.write("                        <label style=\"color: white\">Remember me</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <h3 class=\"error\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" class=\"register\" value=\"Login\">\n");
      out.write("                </form>\n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("                    window.onload = function () {\n");
      out.write("                        document.getElementById(\"password1\").onchange = validatePassword;\n");
      out.write("                        document.getElementById(\"password2\").onchange = validatePassword;\n");
      out.write("                    }\n");
      out.write("                    function validatePassword() {\n");
      out.write("                        var pass2 = document.getElementById(\"password2\").value;\n");
      out.write("                        var pass1 = document.getElementById(\"password1\").value;\n");
      out.write("                        if (pass1 != pass2)\n");
      out.write("                            document.getElementById(\"password2\").setCustomValidity(\"Passwords Don't Match\");\n");
      out.write("                        else\n");
      out.write("                            document.getElementById(\"password2\").setCustomValidity('');\n");
      out.write("                        //empty string means no validation error\n");
      out.write("                    }\n");
      out.write("                </script>\n");
      out.write("                <p class=\"wthree w3l\">Quick Login and Come To DormBOO</p>\n");
      out.write("                <ul class=\"social-agileinfo wthree2\">\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-youtube\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <p class=\"copyright w3l\" style=\"color: white\">© 2022 Signup Dorm. Everything you need is here | Create by <a href=\"https://www.facebook.com/chinhoangg01.dp.ITfpt/\" target=\"_blank\">ChinhHoang</a></p>\n");
      out.write("    </body>\n");
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
