package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class appointmentList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <title>PKS Visitor Management System</title>\n");
      out.write("\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write(" function loadDoc() {\n");
      out.write("  \n");
      out.write("  setInterval(function(){\n");
      out.write("\n");
      out.write("   var xhttp = new XMLHttpRequest();\n");
      out.write("   xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState == 4 && this.status == 200) {\n");
      out.write("     document.getElementById(\"noti_number\").innerHTML = this.responseText;\n");
      out.write("    }\n");
      out.write("   };\n");
      out.write("   xhttp.open(\"GET\", \"notification.jsp\", true);\n");
      out.write("   xhttp.send();\n");
      out.write("\n");
      out.write("  },1000);\n");
      out.write("\n");
      out.write("\n");
      out.write(" }\n");
      out.write(" loadDoc();\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css2/main2.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css2/fontfamily.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css2/fontawesome.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("html,body,h1,h2,h3,h4,h5 {\n");
      out.write("    font-family: \"Raleway\", sans-serif;\n");
      out.write("}\n");
      out.write("table, th, td {\n");
      out.write("  border: 1px solid black;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body class=\"w3-light-grey\">\n");
      out.write("\n");
      out.write("<!-- Top container -->\n");
      out.write("<div class=\"w3-bar w3-top w3-light-blue w3-large\" style=\"z-index:4\">\n");
      out.write("  <button class=\"w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey\" onclick=\"w3_open();\">Menu</button>\n");
      out.write("   <span class=\"w3-bar-item w3-right\">PKS Visitor Management System &nbsp; &nbsp;<i class=\"fa fa-bell\" aria-hidden=\"true\"  id=\"noti_number\"></i>&nbsp; &nbsp; &nbsp; <img src=\"images/pks-logo.png\" style=\"width:100px;\"></span>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Sidebar/menu -->\n");
      out.write("<nav class=\"w3-sidebar w3-collapse w3-white w3-animate-left\" style=\"z-index:3;width:200px;\" id=\"mySidebar\"><br>\n");
      out.write("  <div class=\"w3-container w3-row\">\n");
      out.write("    <div class=\"w3-col s4\" style=\"margin-left:35px\">\n");
      out.write("        <center><img src=\"images/avatar.png\" class=\"w3-circle w3-margin-left\" style=\"width:60px\"></center>\n");
      out.write("    </div><br><br><br>\n");
      out.write("    <div class=\"w3-col s8 w3-bar\"  style=\"margin-left:50px\">\n");
      out.write("        <span>Welcome, <strong>Admin</strong></span><br>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <hr>\n");
      out.write("\n");
      out.write("  <div class=\"w3-bar-block\">\n");
      out.write("    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black\" onclick=\"w3_close()\" title=\"close menu\">Close Menu</a>\n");
      out.write("    <a href=\"#appointment\" class=\"w3-bar-item w3-button w3-padding\">Appointment List</a>\n");
      out.write("    <a href=\"visitorList.jsp\" class=\"w3-bar-item w3-button w3-padding\">Visitor Records</a>\n");
      out.write("    <a href=\"InOutHistory.jsp\" class=\"w3-bar-item w3-button w3-padding\">In Out History</a>\n");
      out.write("    <a href=\"adminLogout.jsp\" class=\"w3-bar-item w3-button w3-padding\">Logout</a><br><br>\n");
      out.write("      </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Overlay effect when opening sidebar on small screens -->\n");
      out.write("<div class=\"w3-overlay w3-hide-large w3-animate-opacity\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n");
      out.write("\n");
      out.write("<!-- !PAGE CONTENT! -->\n");
      out.write("<div class=\"w3-main\" style=\"margin-left:200px; margin-top:43px;\">\n");
      out.write("\n");
      out.write("  <!-- Header -->\n");
      out.write("  <header class=\"w3-container\" style=\"padding-top:30px\">\n");
      out.write("      <center><h2><b>Appointment List</b></h2></center>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("  <section id=\"appointment\">\n");
      out.write("      <div class=\"w3-row-padding w3-margin-bottom\">\n");
      out.write("        <div class=\"w3-left\">\n");
      out.write("        <div class=\"w3-right\">\n");
      out.write("        \n");
      out.write("            <table border=\"1px solid black\" style=\"width:100%\">\n");
      out.write("                   \n");
      out.write("                 <tr>\n");
      out.write("                 <th>ID</th>\n");
      out.write("                 <th style=\"width:10%\">Full Name</th>\n");
      out.write("                 <th>Phone Number</th>\n");
      out.write("                 <th>Email</th>\n");
      out.write("                 <th>Vehicle Number</th>\n");
      out.write("                 <th>Appointment Date</th>\n");
      out.write("                 <th>Purpose</th>\n");
      out.write("                 <th>Meet</th>\n");
      out.write("                 <th>Place</th>\n");
      out.write("                 <th>Symptoms</th>\n");
      out.write("                 <th>Travel</th>\n");
      out.write("                 <th>Countries</th>\n");
      out.write("                 <th>Status</th>\n");
      out.write("                  <th>Action</th>\n");
      out.write("                 \n");
      out.write("              </tr>\n");
      out.write("           \n");
      out.write("            \n");

 try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pks_visitormanager?zeroDateTimeBehavior=convertToNull&autoReconnect=true&characterEncoding=UTF-8&characterSetResults=UTF-8","project","fypteam");
      
      Statement st = conn.createStatement();
      String sql = "SELECT * FROM APPOINTMENT";
    
      ResultSet rs = st.executeQuery(sql);
      while(rs.next()) {
      
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("    <td>");
      out.print(rs.getString("Appointment_ID"));
      out.write("</td> \n");
      out.write("    <td>");
      out.print(rs.getString("Visitor_Name"));
      out.write("</td> \n");
      out.write("    <td>");
      out.print(rs.getString("Phone_Number"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Email"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Vehicle_Number"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Appointment_Date"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Purpose"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("People_meet"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Place"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Symptoms"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Travel"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Countries"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Status"));
      out.write("</td>\n");
      out.write("    <td><input type=\"button\" name=\"approved\" value=\"Approve\"  style=\"height:30px;width:70px;\" onClick=\"window.location='emailApprove.jsp?appointmentid=");
      out.print(rs.getString("Appointment_ID") );
      out.write(" '\" class=\"button\"><br>\n");
      out.write("        <input type=\"button\" name=\"rejected\" value=\"Reject\"  style=\"height:30px;width:70px;\" onClick=\"window.location='emailReject.jsp?appointmentid=");
      out.print(rs.getString("Appointment_ID") );
      out.write(" '\" class=\"button\"><br>\n");
      out.write("        <input type=\"button\" name=\"edit\" value=\"Edit\"  style=\"height:30px;width:70px;\" onClick=\"window.location='updateAppointment.jsp?appointmentid=");
      out.print(rs.getString("Appointment_ID") );
      out.write("'\" class=\"button\"><br>\n");
      out.write("   </td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    \n");

}
conn.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write(" \n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("  <!-- End page content -->\n");
      out.write("  \n");
      out.write("<script>\n");
      out.write("// Get the Sidebar\n");
      out.write("var mySidebar = document.getElementById(\"mySidebar\");\n");
      out.write("\n");
      out.write("// Get the DIV with overlay effect\n");
      out.write("var overlayBg = document.getElementById(\"myOverlay\");\n");
      out.write("\n");
      out.write("// Toggle between showing and hiding the sidebar, and add overlay effect\n");
      out.write("function w3_open() {\n");
      out.write("  if (mySidebar.style.display === 'block') {\n");
      out.write("    mySidebar.style.display = 'none';\n");
      out.write("    overlayBg.style.display = \"none\";\n");
      out.write("  } else {\n");
      out.write("    mySidebar.style.display = 'block';\n");
      out.write("    overlayBg.style.display = \"block\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Close the sidebar with the close button\n");
      out.write("function w3_close() {\n");
      out.write("  mySidebar.style.display = \"none\";\n");
      out.write("  overlayBg.style.display = \"none\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
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
}
