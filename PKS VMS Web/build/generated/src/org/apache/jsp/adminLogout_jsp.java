package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminLogout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Logout</title>\n");
      out.write("\n");
      out.write("        \n");
      out.write("<style>       \n");
      out.write("body {\n");
      out.write("\tmargin: 0;\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 100vh;\n");
      out.write("\tfont-family: 'Lato', sans-serif;\n");
      out.write("\tcolor: #000000;\n");
      out.write("\tbackground: linear-gradient(125deg,#E4FFCD,#6DD5FA,#2980B9,#E4FFCD);\n");
      out.write("\tbackground-size: 400% 400%;\n");
      out.write("\tanimation: gradientBG 15s ease infinite;\n");
      out.write("}\n");
      out.write("@keyframes gradientBG {\n");
      out.write("\t0% {\n");
      out.write("\t\tbackground-position: 0% 50%;\n");
      out.write("\t}\n");
      out.write("\t50% {\n");
      out.write("\t\tbackground-position: 100% 50%;\n");
      out.write("\t}\n");
      out.write("\t100% {\n");
      out.write("\t\tbackground-position: 0% 50%;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write(".container {\n");
      out.write("\twidth: 100%;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 2%;\n");
      out.write("\ttext-align: center;\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("header{\n");
      out.write("        padding:5px;\n");
      out.write("}               \n");
      out.write("form {\n");
      out.write("        border: 3px solid #f1f1f1;\n");
      out.write("        background-color: white;\n");
      out.write("        width:35%;\n");
      out.write("        margin-left:33%;\n");
      out.write("}            \n");
      out.write(".imgcontainer{\n");
      out.write("        text-align: center;\n");
      out.write("        margin:45px 0px 35px 0px;\n");
      out.write("}            \n");
      out.write(".avatar{\n");
      out.write("        width: 35%;\n");
      out.write("        border-radius:50%;\n");
      out.write("}                     \n");
      out.write(".container1{\n");
      out.write("        padding: 25px;\n");
      out.write("}                   \n");
      out.write(".button {\n");
      out.write("        background-color: #4CAF50;\n");
      out.write("        color: white;\n");
      out.write("        padding: 14px 20px;\n");
      out.write("        margin: 8px 0;\n");
      out.write("        border: none;\n");
      out.write("        cursor: pointer;\n");
      out.write("        width: 40%;\n");
      out.write("        border-radius: 12px;\n");
      out.write("}\n");
      out.write(".button:hover {\n");
      out.write("        opacity: 0.8;\n");
      out.write("}                                \n");
      out.write("</style>\n");
      out.write("                    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            <center><img src=\"images/pks-logo.png\" alt=\"\" width=\"250\" height=\"120\"></center>\n");
      out.write("        </header> <br><br>\n");
      out.write("        \n");
      out.write("        <form>\n");
      out.write("        <center>\n");
      out.write("        <div class=\"imgcontainer\">\n");
      out.write("            <img class=\"avatar\" src=\"images/logout.png\">\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("        <div class =\"container1\">\n");
      out.write("        <h2>You are successfully logged out!</h2><br><br><br>      \n");
      out.write("        <input type=\"button\" class=\"button\" value=\"Back to login page\" onClick=\"window.location='adminLogin.jsp'\">\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        </center>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
