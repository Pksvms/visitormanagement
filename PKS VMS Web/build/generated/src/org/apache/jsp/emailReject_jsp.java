package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.sql.*;

public final class emailReject_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


         public static class SMTPAuthenticator extends Authenticator {
            
            public PasswordAuthentication getPasswordAuthentication () {
                return new PasswordAuthentication("pksvms2021","Pks12345");
            }
         }
            
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>PKS Visitor Management System</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css2/main2.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css2/fontfamily.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css2/fontawesome.css\">\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("html,body,h1,h2,h3,h4,h5 {font-family: \"Raleway\", sans-serif}\n");
      out.write("</style>\n");
      out.write("<body class=\"w3-light-grey\" onLoad=\"displayResult()\">\n");
      out.write("\n");
      out.write("<!-- Top container -->\n");
      out.write("<div class=\"w3-bar w3-top w3-light-blue w3-large\" style=\"z-index:4\">\n");
      out.write("  <button class=\"w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey\" onclick=\"w3_open();\">Menu</button>\n");
      out.write("  <span class=\"w3-bar-item w3-right\">PKS Visitor Management System &nbsp; &nbsp;<img src=\"images/pks-logo.png\" style=\"width:100px;\"></span>\n");
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
      out.write("    <a href=\"appointmentList.jsp\" class=\"w3-bar-item w3-button w3-padding\">Appointment List</a>\n");
      out.write("    <a href=\"visitorList.jsp\" class=\"w3-bar-item w3-button w3-padding\">Visitor Records</a>\n");
      out.write("    <a href=\"InOutHistory.jsp\" class=\"w3-bar-item w3-button w3-padding\">In Out History</a>\n");
      out.write("    <a href=\"adminLogout.jsp\" class=\"w3-bar-item w3-button w3-padding\">Logout</a><br><br>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Overlay effect when opening sidebar on small screens -->\n");
      out.write("<div class=\"w3-overlay w3-hide-large w3-animate-opacity\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n");
      out.write("\n");
      out.write("<!-- !PAGE CONTENT! -->\n");
      out.write("<div class=\"w3-main\" style=\"margin-left:360px; margin-top:43px;\">\n");
      out.write("\n");
      out.write("  <!-- Header -->\n");
      out.write("  <header class=\"w3-container\" style=\"padding-top:30px\">\n");
      out.write("      <center><h2><b></b></h2></center>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("  <section>\n");
      out.write("      <div class=\"w3-row-padding w3-margin-bottom\">\n");
      out.write("        <div class=\"w3-left\">\n");
      out.write("        <div class=\"w3-right\">\n");
      out.write("\n");
      out.write("    <center><h1>Sending Reject E-mail</h1></center>\n");
      out.write("        ");
      out.write("\n");
      out.write("            ");

            int result = 0;
            
            if(request.getParameter("send") != null) {
                String d_uname = "pksvms2021";
                String d_password = "Pks12345";
                String d_host = "smtp.gmail.com";
                int d_port = 465;
                
                String m_to = new String();
                String m_from = "pksvms2021@gmail.com";
                String m_subject = new String();
                String m_text = new String();
                
                if(request.getParameter("to") != null) {
                    m_to = request.getParameter("to");
                }
                
                if(request.getParameter("subject") != null) {
                    m_subject = request.getParameter("subject");
                }
                
                if(request.getParameter("message") != null) {
                    m_text = "<h1>Your appointment to visit Politeknik Kuching Sarawak had been reject!</h1><br>";
                    m_text = m_text.concat(request.getParameter("message"));
                    m_text = m_text.concat("<br><h4>Sincerely</h4>");
                    m_text = m_text.concat("<h4>Politeknik Kuching Sarawak</h4>");
                    m_text = m_text.concat("<h4>***Important: Please do not reply this email. This mailbox is not set up to receive email.</h4>");
                }
                
                //Create properties object
                Properties props = new Properties();
                
                //Create an SMTPAuthenticator object
                SMTPAuthenticator auth = new SMTPAuthenticator();
                
                //Create a mail session object
                Session ses = Session.getInstance(props, auth);
                
                //Create a MIME style email message object
                MimeMessage msg = new MimeMessage(ses);
                msg.setContent(m_text,"text/html");
                msg.setSubject(m_subject);
                msg.setFrom(new InternetAddress(m_from));
                msg.addRecipient(Message.RecipientType.TO, new InternetAddress(m_to));
                
                try {
                    Transport transport = ses.getTransport("smtps");
                    
                    transport.connect(d_host, d_port, d_uname, d_password);
                    
                    transport.sendMessage(msg, msg.getAllRecipients());
                    
                    transport.close();
                    
                    result = 1;
                      
                } catch (Exception e) {
                    out.println(e);
                }
                
            }
                
      out.write("\n");
      out.write("        <form name=\"myForm\" action=\"emailReject.jsp\" method=\"POST\">\n");
      out.write("            <center>\n");
      out.write("            <table border=\"0\">\n");
      out.write("                \n");

        try{   
             String sttt="Denied";
             String appointmentid=request.getParameter("appointmentid");
             int no=Integer.parseInt(appointmentid);
             int sumcount=0;
                
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pks_visitormanager","project","fypteam");
                
             String querytoGateEntry = "UPDATE APPOINTMENT set Status= '"+sttt+"' WHERE Appointment_ID='"+no+"'";
             Statement state = conn.createStatement();
             state.executeUpdate(querytoGateEntry);
             } catch (Exception e) {
                // out.println(e);
             }             

             
      out.write("\n");
      out.write("             \n");

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
             
      out.write(" \n");
      out.write("             \n");
      out.write("                <tr>\n");
      out.write("                     <td><b>To: </td>\n");
      out.write("                    <td><b><b><input value=\"");
      out.print(rs.getString("Email"));
      out.write("\"  type=\"text\" name=\"to\" value=\"\" size=\"32\" required/><br/></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");

}
conn.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("     \n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Subject: <br><br></td>\n");
      out.write("                    <td><input type=\"text\" name=\"subject\" value=\"Appointment had been rejected\" size=\"38\" required/><br><br></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Message : <br><br></td>\n");
      out.write("                    <td><textarea rows=\"15\" cols=\"70\" name=\"message\" required/>Dear sir / madam, we are sorry that your appointment was rejected on dd/mm/yyyy based on your current condition. For further details, you can contact 082-845 596.</textarea><br></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("                <input type=\"hidden\" name=\"hidden\" value=\"");
      out.print( result );
      out.write("\">\n");
      out.write("                <input type=\"submit\" name=\"send\" style=\"height:35px;width:100px;\" value=\"Send\">\n");
      out.write("                <input type=\"reset\" name=\"reset\" style=\"height:35px;width:100px;\" value=\"Reset\">\n");
      out.write("            </center>       \n");
      out.write("        </form>\n");
      out.write("                <script language=\"JavaScript\">\n");
      out.write("                    function displayResult() {\n");
      out.write("                        if(document.myForm.hidden.value === \"1\"){\n");
      out.write("                            window.alert(\"Email was successfully sent!\");\n");
      out.write("                        }\n");
      out.write("                            \n");
      out.write("                    }\n");
      out.write("                </script>              \n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("     </tbody>  \n");
      out.write("</section>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("    \n");
      out.write("    ");
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
