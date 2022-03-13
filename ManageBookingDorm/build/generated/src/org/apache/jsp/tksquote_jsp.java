package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tksquote_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/components/navBarComponent.jsp");
    _jspx_dependants.add("/components/footerComponent.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Shop Homepage - Start Bootstrap Template</title>\n");
      out.write("        <!-- Favicon-->\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\n");
      out.write("        <!-- Bootstrap icons-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" rel=\"stylesheet\"/>\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Topbar Start -->\n");
      out.write("<div class=\"container-fluid bg-light p-0\">\n");
      out.write("    <div class=\"row gx-0 d-none d-lg-flex\">\n");
      out.write("        <div class=\"col-lg-7 px-5 text-start\">\n");
      out.write("            <div class=\"h-100 d-inline-flex align-items-center py-3 me-4\">\n");
      out.write("                <small class=\"fa fa-map-marker-alt text-primary me-2\"></small>\n");
      out.write("                <small>30M Street, Hoa Lac, FPT</small>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"h-100 d-inline-flex align-items-center py-3\">\n");
      out.write("                <small class=\"far fa-clock text-primary me-2\"></small>\n");
      out.write("                <small>Mon - Sun : 07.30 AM - 10.00 PM</small>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-5 px-5 text-end\">\n");
      out.write("            <div class=\"h-100 d-inline-flex align-items-center py-3 me-4\">\n");
      out.write("                <small class=\"fa fa-phone-alt text-primary me-2\"></small>\n");
      out.write("                <small>+84 89 826 8621</small>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"h-100 d-inline-flex align-items-center\">\n");
      out.write("                <a class=\"btn btn-sm-square bg-white text-primary me-1\" href=\"https://www.facebook.com/chinhoangg01.dp.ITfpt/\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                <a class=\"btn btn-sm-square bg-white text-primary me-1\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                <a class=\"btn btn-sm-square bg-white text-primary me-1\" href=\"\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                <a class=\"btn btn-sm-square bg-white text-primary me-0\" href=\"https://www.instagram.com/chinhoangg_/\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- Topbar End -->\n");
      out.write("\n");
      out.write("<!-- Navbar Start -->\n");
      out.write("<nav class=\"navbar navbar-expand-lg bg-white navbar-light sticky-top p-0\">\n");
      out.write("    <a href=\"home\" class=\"navbar-brand d-flex align-items-center px-4 px-lg-5\">\n");
      out.write("        <h2 class=\"m-0 text-primary\">DormBOO</h2>\n");
      out.write("    </a>\n");
      out.write("    <button type=\"button\" class=\"navbar-toggler me-4\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("        <form action=\"search\" class=\"d-flex mx-auto\">\n");
      out.write("            <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\" name=\"keyword\"/>\n");
      out.write("            <button class=\"btn btn-outline-dark text-primary\" type=\"submit\">Search</button>\n");
      out.write("        </form>\n");
      out.write("        <div class=\"d-flex my-2\">\n");
      out.write("            <a class=\"btn btn-outline-dark\" style=\"margin-right: 10px\" href=\"carts\">\n");
      out.write("                <i class=\"bi-star-fill me-2 text-primary\"></i>Room\n");
      out.write("                <span class=\"badge bg-dark text-white ms-1 rounded-pill\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("<!-- Navbar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"min-height: 1000px\">\n");
      out.write("            <div class=\"alert alert-danger text-center mt-5\" role=\"alert\" >\n");
      out.write("                <h2>Booking Dorm Successfully!</h2>\n");
      out.write("                You are such a hard-working and good student :>>\n");
      out.write("                </br>We extend our sincerest Thanks to you hehe\n");
      out.write("                <div class=\"text-center mt-2\">\n");
      out.write("                    <a class=\"btn btn-outline-primary\" href=\"home\">Continue to experience DormBOO</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <img class=\"img-fluid\" src=\"images/pay-5.gif\" alt=\"\" style=\"width: 1775px\" style=\"heigh: 1240px\">\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Footer Start -->\n");
      out.write("<div class=\"container-fluid bg-dark text-light footer mt-5 pt-5 wow fadeIn\" data-wow-delay=\"0.1s\">\n");
      out.write("    <div class=\"container py-5\">\n");
      out.write("        <div class=\"row g-5\">\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                <h4 class=\"text-light mb-4\">Contact</h4>\n");
      out.write("                <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt me-3\"></i>30M Street, Hoa Lac, FPT</p>\n");
      out.write("                <p class=\"mb-2\"><i class=\"fa fa-phone-alt me-3\"></i>+84 89 826 8621</p>\n");
      out.write("                <p class=\"mb-2\"><i class=\"fa fa-envelope me-3\"></i>chinhhoangto@gmail.com</p>\n");
      out.write("                <div class=\"d-flex pt-2\">\n");
      out.write("                    <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                    <a class=\"btn btn-outline-light btn-social\" href=\"https://www.facebook.com/chinhoangg01.dp.ITfpt/\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                    <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                    <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                <h4 class=\"text-light mb-4\">Services</h4>\n");
      out.write("                <a class=\"btn btn-link\" href=\"\">Dorm</a>\n");
      out.write("                <a class=\"btn btn-link\" href=\"\">Water</a>\n");
      out.write("                <a class=\"btn btn-link\" href=\"\">Food</a>\n");
      out.write("                <a class=\"btn btn-link\" href=\"\">Market</a>\n");
      out.write("                <a class=\"btn btn-link\" href=\"\">Personal Amenities</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <h4 class=\"text-light mb-4\">Quick Links</h4>\n");
      out.write("                        <a class=\"btn btn-link\" href=\"about\">About Us</a>\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">Contact Us</a>\n");
      out.write("                        <a class=\"btn btn-link\" href=\"service\">Our Services</a>\n");
      out.write("                        <a class=\"btn btn-link\" href=\"quote\">Free Quote</a>\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">Support</a>\n");
      out.write("                    </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                <h4 class=\"text-light mb-4\">News letter</h4>\n");
      out.write("                <div class=\"position-relative mx-auto\" style=\"max-width: 400px;\">\n");
      out.write("                    <input class=\"form-control border-0 w-100 py-3 ps-4 pe-5\" type=\"text\" placeholder=\"Your name\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary py-2 position-absolute top-0 end-0 mt-2 me-2\">SignUp</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"copyright\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6 text-center text-md-start mb-3 mb-md-0\">\n");
      out.write("                    &copy; <a class=\"border-bottom\" href=\"#\">DormBOO</a>, Welcome.\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 text-center text-md-end\">\n");
      out.write("                    <!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. ***/-->\n");
      out.write("                    Designed By <a class=\"border-bottom\" href=\"https://www.facebook.com/chinhoangg01.dp.ITfpt/\">Chinhoang</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- Footer End -->\n");
      out.write("\n");
      out.write("<!-- Bootstrap core JS-->\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("<!-- Core theme JS-->\n");
      out.write("<script src=\"js/scripts.js\"></script>\n");
      out.write("<!-- Favicon -->\n");
      out.write("<link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("<!-- Google Web Fonts -->\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;500&family=Roboto:wght@500;700;900&display=swap\" rel=\"stylesheet\"> \n");
      out.write("\n");
      out.write("<!-- Icon Font Stylesheet -->\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Libraries Stylesheet -->\n");
      out.write("<link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"lib/lightbox/css/lightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Customized Bootstrap Stylesheet -->\n");
      out.write("<link href=\"css1/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Template Stylesheet -->\n");
      out.write("<link href=\"css1/style.css\" rel=\"stylesheet\">");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <button class=\"btn btn-primary py-2 px-lg-3 d-none d-lg-block\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.displayName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</button>\n");
        out.write("            <a href=\"logout\" class=\"btn py-4 px-lg-3 d-none d-lg-block text-primary\">SIGN OUT</a>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <a href=\"login\" class=\"btn btn-primary py-4 px-lg-5 d-none d-lg-block\">SIGN UP<i class=\"fa fa-arrow-right ms-3\"></i></a>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
