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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Login</title>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            header{\n");
      out.write("                   padding:10px;\n");
      out.write("                  }\n");
      out.write("            body{\n");
      out.write("                    margin:0;  \n");
      out.write("                }\n");
      out.write("\n");
      out.write("            form {border: 3px solid #f1f1f1;\n");
      out.write("                  background-color: white;\n");
      out.write("                  width:35%  }\n");
      out.write("            \n");
      out.write("            .imgcontainer{\n");
      out.write("                            text-align: center;\n");
      out.write("                            margin:24px 0px 12px 0px;\n");
      out.write("                         }\n");
      out.write("            .avatar{\n");
      out.write("                     width: 25%;\n");
      out.write("                     border-radius:50%;\n");
      out.write("                    } \n");
      out.write("                    \n");
      out.write("            .container{\n");
      out.write("                        padding:25px;\n");
      out.write("                    }\n");
      out.write("            input[type=text], input[type=password] {\n");
      out.write("                                                      width: 55%;\n");
      out.write("                                                      padding: 12px 20px;\n");
      out.write("                                                      margin: 8px 0;\n");
      out.write("                                                      display: inline-block;\n");
      out.write("                                                      border: 1px solid #ccc;\n");
      out.write("                                                      box-sizing: border-box;\n");
      out.write("                                                    }  \n");
      out.write("            .button {\n");
      out.write("                     background-color: #4CAF50;\n");
      out.write("                     color: white;\n");
      out.write("                     padding: 14px 20px;\n");
      out.write("                     margin: 8px 0;\n");
      out.write("                     border: none;\n");
      out.write("                     cursor: pointer;\n");
      out.write("                     width: 40%;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("            .button:hover {\n");
      out.write("                            opacity: 0.8;\n");
      out.write("                            }            \n");
      out.write("\n");
      out.write("\n");
      out.write("   /* The message box is shown when the user clicks on the password field */\n");
      out.write("        #message {\n");
      out.write("          display:none;\n");
      out.write("          background: #f1f1f1;\n");
      out.write("          color: #000;\n");
      out.write("          position: relative;\n");
      out.write("          padding: 20px;\n");
      out.write("          margin-top: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #message p {\n");
      out.write("          padding: 10px 35px;\n");
      out.write("          font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Add a green text color and a checkmark when the requirements are right */\n");
      out.write("        .valid {\n");
      out.write("          color: green;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .valid:before {\n");
      out.write("          position: relative;\n");
      out.write("          left: -35px;\n");
      out.write("          content: \"✔\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Add a red text color and an \"x\" when the requirements are wrong */\n");
      out.write("        .invalid {\n");
      out.write("          color: red;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .invalid:before {\n");
      out.write("          position: relative;\n");
      out.write("          left: -35px;\n");
      out.write("          content: \"✖\";\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:#E6E6FA;\">\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            <center><img src=\"images/pks-logo.png\" alt=\"\" width=\"200\" height=\"100\"></center>\n");
      out.write("        </header> \n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h2>Admin Login</h2>\n");
      out.write("      \n");
      out.write("        <form  method=\"post\" action=\"\" id=\"newForm\" name=\"myForm\" onsubmit=\"return validateForm()\">\n");
      out.write("            <div class=\"imgcontainer\">\n");
      out.write("            <img class=\"avatar\" src=\"images/avatar.png\" >\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class =\"container\">\n");
      out.write("            Username<br> \n");
      out.write("            <input type=\"text\" name=\"username\" required/><br><br>\n");
      out.write("            Password<br> \n");
      out.write("            <input type=\"password\" name=\"password\"  id=\"psw\" pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\" title=\"Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters\"required/><br><br>\n");
      out.write("            <input type=\"submit\" value=\"Login\" class=\"button\"  /> \n");
      out.write("            <input type=\"reset\" value =\"Reset\" class=\"button\"/>  \n");
      out.write("           </form>\n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("          <!-- Display after user click input area of password -->\n");
      out.write("        <div id=\"message\">\n");
      out.write("            <h3>Password must contain the following:</h3>\n");
      out.write("            <p id=\"letter\" class=\"invalid\">A <b>lowercase</b> letter</p>\n");
      out.write("            <p id=\"capital\" class=\"invalid\">A <b>capital (uppercase)</b> letter</p>\n");
      out.write("            <p id=\"number\" class=\"invalid\">A <b>number</b></p>\n");
      out.write("            <p id=\"length\" class=\"invalid\">Minimum <b>8 characters</b></p>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("    ");

    try {
        String name = request.getParameter("username");
        String pass = request.getParameter("password");
    
      out.write("\n");
      out.write("    ");

  if(!(name == null || (name.equals(""))))
        if(name.equals("PKSVMSadmin") && pass.equals("PksVms05"))
         {
           response.sendRedirect("appointmentList.jsp");
   
           }
        else
        {
          out.println("<center>Login failed: Invalid username or password.</center>");
          out.println("<center>Please try again.</center>"); 
        }
    }

    catch (Exception e) {
          out.println("Something went wrong !! Please try again.");
          }
    

    
      out.write("\n");
      out.write("    </body>\n");
      out.write("     <script>\n");
      out.write("        //Display a alert window if user did not fill username directly press sent\n");
      out.write("        function validateForm() {\n");
      out.write("          var x = document.forms[\"myForm\"][\"username\"].value;\n");
      out.write("          if (x == \"\") {\n");
      out.write("            alert(\"Name must be filled out\");\n");
      out.write("            return false;\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("       \n");
      out.write("        var myInput = document.getElementById(\"psw\");\n");
      out.write("        var letter = document.getElementById(\"letter\");\n");
      out.write("        var capital = document.getElementById(\"capital\");\n");
      out.write("        var number = document.getElementById(\"number\");\n");
      out.write("        var length = document.getElementById(\"length\");\n");
      out.write("\n");
      out.write("        // When the user clicks on the password field, show the message box\n");
      out.write("        myInput.onfocus = function() {\n");
      out.write("          document.getElementById(\"message\").style.display = \"block\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // When the user clicks outside of the password field, hide the message box\n");
      out.write("        myInput.onblur = function() {\n");
      out.write("          document.getElementById(\"message\").style.display = \"none\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // When the user starts to type something inside the password field\n");
      out.write("        myInput.onkeyup = function() {\n");
      out.write("          // Validate lowercase letters\n");
      out.write("          var lowerCaseLetters = /[a-z]/g;\n");
      out.write("          if(myInput.value.match(lowerCaseLetters)) {  \n");
      out.write("            letter.classList.remove(\"invalid\");\n");
      out.write("            letter.classList.add(\"valid\");\n");
      out.write("          } else {\n");
      out.write("            letter.classList.remove(\"valid\");\n");
      out.write("            letter.classList.add(\"invalid\");\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          // Validate capital letters\n");
      out.write("          var upperCaseLetters = /[A-Z]/g;\n");
      out.write("          if(myInput.value.match(upperCaseLetters)) {  \n");
      out.write("            capital.classList.remove(\"invalid\");\n");
      out.write("            capital.classList.add(\"valid\");\n");
      out.write("          } else {\n");
      out.write("            capital.classList.remove(\"valid\");\n");
      out.write("            capital.classList.add(\"invalid\");\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          // Validate numbers\n");
      out.write("          var numbers = /[0-9]/g;\n");
      out.write("          if(myInput.value.match(numbers)) {  \n");
      out.write("            number.classList.remove(\"invalid\");\n");
      out.write("            number.classList.add(\"valid\");\n");
      out.write("          } else {\n");
      out.write("            number.classList.remove(\"valid\");\n");
      out.write("            number.classList.add(\"invalid\");\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          // Validate length\n");
      out.write("          if(myInput.value.length >= 8) {\n");
      out.write("            length.classList.remove(\"invalid\");\n");
      out.write("            length.classList.add(\"valid\");\n");
      out.write("          } else {\n");
      out.write("            length.classList.remove(\"valid\");\n");
      out.write("            length.classList.add(\"invalid\");\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("       \n");
      out.write("    </script>\n");
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
