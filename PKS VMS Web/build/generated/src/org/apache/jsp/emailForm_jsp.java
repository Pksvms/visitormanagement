package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public final class emailForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Sending An Email</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body onLoad=\"displayResult()\">\n");
      out.write("        <h1>Sending An email</h1>\n");
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
                    m_text = "<h1>Your appointment to visit Politeknik Kuching Sarawak had been approved!</h1><br>";
                    m_text = m_text.concat(request.getParameter("message"));
                    m_text = m_text.concat("<br><h2>Sincerely</h2>");
                    m_text = m_text.concat("<br><h2>Politeknik Kuching Sarawak</h2>");
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
      out.write("        <form name=\"myForm\" action=\"emailForm.jsp\" method=\"POST\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>To: </td>\n");
      out.write("                    <td><b><b><input type=\"text\" name=\"to\" value=\"\" size=\"50\" required/><br/></td>\n");
      out.write("                </tr>\n");
      out.write("                <br>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Subject: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"subject\" value=\"\" size=\"50\" required/><br/></td>\n");
      out.write("                </tr>\n");
      out.write("                <br>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Message : </td>\n");
      out.write("                    <td><textarea rows=\"20\" cols=\"80\" name=\"message\" required/></textarea><br/></td>\n");
      out.write("                </tr>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("                <input type=\"hidden\" name=\"hidden\" value=\"");
      out.print( result );
      out.write("\">\n");
      out.write("                <br><input type=\"submit\" name=\"send\" value=\"Send\">\n");
      out.write("                <br><input type=\"reset\" name=\"reset\" value=\"Reset\">\n");
      out.write("                \n");
      out.write("        </form>\n");
      out.write("                <script language=\"JavaScript\">\n");
      out.write("                    function displayResult() {\n");
      out.write("                        if(document.myForm.hidden.value === \"1\"){\n");
      out.write("                            window.alert(\"Email was successfully sent!\");\n");
      out.write("                        }\n");
      out.write("                            \n");
      out.write("                    }\n");
      out.write("                </script>\n");
      out.write("                \n");
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
