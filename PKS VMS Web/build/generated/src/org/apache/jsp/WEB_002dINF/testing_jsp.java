package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class testing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("<style>\n");
      out.write("            body {\n");
      out.write("                margin:5px;\n");
      out.write("                font-size:15px;\n");
      out.write("            }   \n");
      out.write("            \n");
      out.write("            table {\n");
      out.write("                padding: 5px;\n");
      out.write("                border: 3px solid #f1f1f1;\n");
      out.write("                width:50px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            th, td {\n");
      out.write("                padding: 15px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            button {\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 25%;\n");
      out.write("            }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th colspan=\"12\"><br><h1>Visitor Appointment Information</h1>\n");
      out.write("            </tr>\n");
      out.write("              <tr>\n");
      out.write("                 <th>Appointment ID</th>\n");
      out.write("                 <th>Full Name</th>\n");
      out.write("                 <th>IC Number</th>\n");
      out.write("                 <th>Contact Number</th>\n");
      out.write("                 <th>Email Address</th>\n");
      out.write("                 <th>Appointment Date</th>\n");
      out.write("                 <th>Car Plate Number</th>\n");
      out.write("                 <th>Purpose</th>\n");
      out.write("                 <th>Symptoms</th>\n");
      out.write("                 <th>Travel</th>\n");
      out.write("                 <th>Countries</th>\n");
      out.write("                 <th>Actions</th>   \n");
      out.write("              </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
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
