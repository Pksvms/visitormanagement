package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class updateAppointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/vendor.css\">   \n");
      out.write("        \n");
      out.write("        <title>Edit Visitor Appointment Information</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("<style>\n");
      out.write("h1{\n");
      out.write("    text-align: center;\n");
      out.write("    color: white;\n");
      out.write("    }\n");
      out.write("table, th, td {\n");
      out.write("    border:0px solid transparent;\n");
      out.write("    text-align: center;\n");
      out.write("    color: white;\n");
      out.write("    font-size:20px;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table.center {\n");
      out.write("    margin-left: auto; \n");
      out.write("    margin-right: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"text\"],\n");
      out.write("input[type=\"date\"] {\n");
      out.write("    display: block;\n");
      out.write("    height: 3rem;\n");
      out.write("    padding: 5px 20px;\n");
      out.write("    margin: 3px 0;\n");
      out.write("    border: 0;\n");
      out.write("    outline: none;\n");
      out.write("    vertical-align: middle;\n");
      out.write("    color: #737373;\n");
      out.write("    font-family: \"merriweather-regular\", sans-serif;\n");
      out.write("    font-size: 1.5rem;\n");
      out.write("    line-height: 3rem;\n");
      out.write("    border-radius: 3px;\n");
      out.write("    background: #FFFFFF;\n");
      out.write("    max-width: 100%;\n");
      out.write("    border: 1px solid #d5d5d5;\n");
      out.write("    -moz-transition: all 0.3s ease-in-out;\n");
      out.write("    -o-transition: all 0.3s ease-in-out;\n");
      out.write("    -webkit-transition: all 0.3s ease-in-out;\n");
      out.write("    -ms-transition: all 0.3s ease-in-out;\n");
      out.write("    transition: all 0.3s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"text\"]:focus, \n");
      out.write("input[type=\"date\"]:focus {\n");
      out.write("    color: #000000;\n");
      out.write("    background: #f4fffe;\n");
      out.write("    border: 1px solid #d2fef9;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <script src=\"js/modernizr.js\"></script>\n");
      out.write("    \n");
      out.write("        <section id=\"introbg\">\n");
      out.write("\n");
      out.write("   \t<div class=\"shadow-overlaybg\">\n");
      out.write("\n");
      out.write("   \t\n");
      out.write("            <br><br><br><br><br><br>\n");
      out.write("            <center><h1>Update Visitor Appointment Information</h1></center>\n");
      out.write("            \n");
      out.write("        <table border=\"0\" style=\"width:50%\" class=\"center\"> \n");
      out.write("        <form method=\"post\" action=\"updateAppointmentProcess.jsp>\n");
      out.write("         \n");

 try {
     
    String appointmentid=request.getParameter("appointmentid");
    int no=Integer.parseInt(appointmentid);
    int sumcount=0;

    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pks_visitormanager?zeroDateTimeBehavior=convertToNull&autoReconnect=true&characterEncoding=UTF-8&characterSetResults=UTF-8","project","fypteam");
      
    Statement st = conn.createStatement();
    String sql = "SELECT * FROM APPOINTMENT where Appointment_ID= '"+no+"'";
    
    ResultSet rs = st.executeQuery(sql);
    while(rs.next()) {
    
      out.write("\n");
      out.write("  \n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th><input type=\"text\" name=\"appointmentid\" size=\"35\" value=\"");
      out.print(rs.getString("Appointment_ID"));
      out.write("\" required></th>\n");
      out.write("                    </tr>\n");
      out.write("                     \n");
      out.write("                    <tr>\n");
      out.write("                        <th>Full name</th>\n");
      out.write("                        <th><input type=\"text\" name=\"fullname\" size=\"35\" value=\"");
      out.print(rs.getString("Visitor_Name"));
      out.write("\" required></th>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <th>IC Number</th>\n");
      out.write("                        <th><input type=\"text\" name=\"icnum\"  size=\"35\" value=\"");
      out.print(rs.getString("IC_num"));
      out.write("\" required></th>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <th>Contact Number</th>\n");
      out.write("                        <th><input type=\"text\" name=\"contactno\" size=\"35\" value=\"");
      out.print(rs.getString("Phone_Number"));
      out.write("\" required></th>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                       <th>Email address</th>\n");
      out.write("                       <th><input type=\"text\" name=\"email\" size=\"35\" value=\"");
      out.print(rs.getString("Email"));
      out.write("\" required></th>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <th>Apply date</th>\n");
      out.write("                        <th><input type=\"date\" name=\"appointmentdate\" value=\"");
      out.print(rs.getString("Appointment_date"));
      out.write("\" required></th>\n");
      out.write("                    </tr>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                    <tr>\n");
      out.write("                    <td colspan=\"2\" align=\"center\">\n");
      out.write("                        <input type=\"submit\" value=\"Submit\" style=\"height:55px;width:178px;font-size:16px;\">\n");
      out.write("                        &nbsp;&nbsp;\n");
      out.write("                        <input type=\"reset\" value=\"Reset\" style=\"height:55px;width:178px;font-size:16px;\">\n");
      out.write("                        &nbsp;&nbsp;\n");
      out.write("                    </tr>\n");
      out.write("                    \n");

}
conn.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("                </table>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("    </section> <!-- /introbg -->\n");
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
