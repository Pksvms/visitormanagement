package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html class=\"no-js oldie ie8\" lang=\"en\"> \n");
      out.write("<head>\n");
      out.write("\n");
      out.write("   <!--- basic page needs\n");
      out.write("   ================================================== -->\n");
      out.write("   <meta charset=\"utf-8\">\n");
      out.write("\t<title>PKS Visitor Management System</title>\n");
      out.write("\t<meta name=\"description\" content=\"\">  \n");
      out.write("\t<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("   <!-- mobile specific metas\n");
      out.write("   ================================================== -->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("\n");
      out.write(" \t<!-- CSS\n");
      out.write("   ================================================== -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/base.css\">  \n");
      out.write("   <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/vendor.css\">     \n");
      out.write("\n");
      out.write("   <!-- script\n");
      out.write("   ================================================== -->\n");
      out.write("\t<script src=\"js/modernizr.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"top\">\n");
      out.write("    \n");
      out.write("    <!-- header \n");
      out.write("   ================================================== -->\n");
      out.write("   <header>\n");
      out.write("\n");
      out.write("   \t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t   \t<nav id=\"main-nav-wrap\">\n");
      out.write("\t\t\t\t<ul class=\"main-navigation\">\n");
      out.write("\t\t\t\t\t<li class=\"current\"><a class=\"smoothscroll\"  onClick=\"window.location='index.jsp'\">HOME</a></li>\n");
      out.write("\t\t\t\t\t<li><a class=\"smoothscroll\"  href=\"#features\">ABOUT US</a></li>\n");
      out.write("\t\t\t\t\t<li><a class=\"smoothscroll\"  href=\"#pricing\">CONTACT US</a></li>\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t\t<a class=\"menu-toggle\" href=\"#\"><span>Menu</span></a>\n");
      out.write("   \t\t\n");
      out.write("   \t</div>   \t\n");
      out.write("   \t\n");
      out.write("   </header> <!-- /header -->\n");
      out.write("\n");
      out.write("\t<!-- intro section\n");
      out.write("   ================================================== -->\n");
      out.write("   <section id=\"intro\">\n");
      out.write("\n");
      out.write("   \t<div class=\"shadow-overlay\"></div>\n");
      out.write("\n");
      out.write("   \t<div class=\"intro-content\">\n");
      out.write("   \t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("   \t\t\t<div class=\"col-twelve\">\n");
      out.write("\t   \t\t\t\t<img src=\"images/pks logo.png\" alt=\"\">\n");
      out.write("\t   \t\t\t</div>\n");
      out.write("\n");
      out.write("\t   \t\t\t<h5>Welcome to PKS Visitor Management System.</h5>\n");
      out.write("\n");
      out.write("                                <input type=\"button\" name=\"visitor\" value=\"Visitor\" onClick=\"window.location='visitorAppointment.jsp'\" style=\"height:65px;width:160px;font-size:20px;\" class=\"button.large\"><br>\n");
      out.write("                                <input type=\"button\" name=\"admin\" value=\"Admin\" onClick=\"window.location='adminLogin.jsp'\" style=\"height:65px;width:160px;font-size:20px;\" class=\"button.large\"><br>\n");
      out.write("                                \n");
      out.write("\t   \t\t</div>  \n");
      out.write("   \t\t\t\n");
      out.write("   \t\t</div>   \t\t \t\t\n");
      out.write("\n");
      out.write("   </section> <!-- /intro -->\n");
      out.write("\n");
      out.write("\n");
      out.write("   <!-- features Section\n");
      out.write("   ================================================== -->\n");
      out.write("\t<section id=\"features\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"row section-intro\">\n");
      out.write("   \t\t<div class=\"col-twelve with-bottom-line\">\n");
      out.write("\n");
      out.write("   \t\t\t<h1>About</h1>\n");
      out.write("\n");
      out.write("                        <p class=\"lead\">The PKS Visitor Management System help security comitee in Politeknik Kuching Sarawak (PKS) to manage visitor incoming and outgoing activities.</p>\n");
      out.write("                        <p class=\"lead\">This system act as a brand new contactless solution for streamlining administration processes for the visitor to make an appointment before they come to PKS.</p>\n");
      out.write("   \t\t</div>   \t\t\n");
      out.write("   \t</div>\n");
      out.write("\t\t\n");
      out.write("\t</section> <!-- /features -->\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t <section id=\"pricing\">\n");
      out.write("\n");
      out.write("   \t<div class=\"row section-intro\">\n");
      out.write("   \t\t<div class=\"col-twelve with-bottom-line\">\n");
      out.write("\n");
      out.write("   \t\t\t<h1>Contact Us</h1>\n");
      out.write("\n");
      out.write("                        <p class=\"lead\"><img src=\"images/pks-logo.png\" alt=\"\" width=\"170\"></p>\n");
      out.write("                        \n");
      out.write("                        <p>\n");
      out.write("\t\t        \tPoliteknik Kuching Sarawak\n");
      out.write("                                  KM 22, Jalan Matang,\n");
      out.write("                                 93050, Kuching, Sarawak<br>\n");
      out.write("                                 \n");
      out.write("                                info@www.poliku.edu.my </p>\n");
      out.write("                           <p>  082-845 596  </p>\n");
      out.write("\n");
      out.write("   \t\t</div>   \t\t\n");
      out.write("   \t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("   </section> <!-- /pricing --> \n");
      out.write("\n");
      out.write("   <div id=\"preloader\"> \n");
      out.write("    \t<div id=\"loader\"></div>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("   <!-- Java Script\n");
      out.write("   ================================================== --> \n");
      out.write("   <script src=\"js/jquery-1.11.3.min.js\"></script>\n");
      out.write("   <script src=\"js/jquery-migrate-1.2.1.min.js\"></script>\n");
      out.write("   <script src=\"js/plugins.js\"></script>\n");
      out.write("   <script src=\"js/main.js\"></script>\n");
      out.write("   \n");
      out.write("   </body>\n");
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
