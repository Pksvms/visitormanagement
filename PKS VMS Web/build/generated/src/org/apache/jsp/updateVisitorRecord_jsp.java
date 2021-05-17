package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class updateVisitorRecord_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/base.css\">  \n");
      out.write("   <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/vendor.css\">   \n");
      out.write("        \n");
      out.write("        <title>Edit Visitor Information</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <script src=\"js/modernizr.js\"></script>\n");
      out.write("    <header id=\"headerupdate\">\n");
      out.write("        <center><h1>Update Visitor Information</h1></center>\n");
      out.write("    </header>  \n");
      out.write("        <section id=\"introbg\">\n");
      out.write("\n");
      out.write("   \t<div class=\"shadow-overlaybg\">\n");
      out.write("\n");
      out.write("   \t<div class=\"introbg-content\">\n");
      out.write("   \t\t   \t\t \t\t\n");
      out.write("        <form method=\"post\" action=\"updateVisitorRecordProcess.jsp\">\n");
      out.write("                \n");
      out.write("    ");

 try {
     
    String visitorid=request.getParameter("visitorid");
    int no=Integer.parseInt(visitorid);
    int sumcount=0;

    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pks_visitormanager?zeroDateTimeBehavior=convertToNull&autoReconnect=true&characterEncoding=UTF-8&characterSetResults=UTF-8","project","fypteam");
      
    Statement st = conn.createStatement();
    String sql = "SELECT * FROM VISITOR where Visitor_ID= '"+no+"'";
    
    ResultSet rs = st.executeQuery(sql);
    while(rs.next()) {
    
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("            <center>\n");
      out.write("                    <br><br>Visitor ID\n");
      out.write("                    <input type=\"text\" name=\"visitorid\" size=\"40\" value=\"");
      out.print(rs.getString("Visitor_ID"));
      out.write("\" required>\n");
      out.write("                    \n");
      out.write("                    <br><br>Full name\n");
      out.write("                    <input type=\"text\" name=\"fullname\" size=\"40\" value=\"");
      out.print(rs.getString("Visitor_Name"));
      out.write("\" required>\n");
      out.write("                        \n");
      out.write("                    <br><br>IC Number\n");
      out.write("                    <input type=\"text\" name=\"icnum\" size=\"40\" value=\"");
      out.print(rs.getString("IC_num"));
      out.write("\" required>\n");
      out.write("                        \n");
      out.write("                    <br><br>Contact Number\n");
      out.write("                    <input type=\"text\" name=\"contactno\" size=\"40\" value=\"");
      out.print(rs.getString("Phone_Number"));
      out.write("\" required>\n");
      out.write("         \n");
      out.write("                    <br><br>Temperature\n");
      out.write("                    <input type=\"text\" name=\"temperature\" size=\"40\" value=\"");
      out.print(rs.getString("Temperature"));
      out.write("\" required>\n");
      out.write("                        \n");
      out.write("                    <br><br>Vehicle Number\n");
      out.write("                    <input type=\"text\" name=\"vehiclenumber\" size=\"40\" value=\"");
      out.print(rs.getString("Vehicle_Number"));
      out.write("\" required>\n");
      out.write("                    \n");
      out.write("                    <br><br>\n");
      out.write("                    <input type=\"submit\" value=\"Submit\">\n");
      out.write("                    <input type=\"reset\" value=\"Reset\">\n");
      out.write("                    <br><br><br><br>\n");
      out.write("                              \n");
      out.write("            </center>\n");

}
conn.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("   </section> <!-- /intro -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
}
