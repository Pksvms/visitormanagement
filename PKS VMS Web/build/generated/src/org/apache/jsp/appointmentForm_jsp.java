package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class appointmentForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Visitor Appointment</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("             header{\n");
      out.write("                   padding:30px;\n");
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
      out.write("                  text-align: center;\n");
      out.write("                  margin:24px 0px 12px 0px;\n");
      out.write("                         }\n");
      out.write("            .avatar{\n");
      out.write("                     width: 25%;\n");
      out.write("                     border-radius:50%;\n");
      out.write("                    } \n");
      out.write("                    \n");
      out.write("            .container{\n");
      out.write("                     padding:16px;\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("            input[type=text], input[type=date] {\n");
      out.write("                     width: 55%;\n");
      out.write("                     padding: 12px 20px;\n");
      out.write("                     margin: 8px 0;\n");
      out.write("                     display: inline-block;\n");
      out.write("                     border: 1px solid #ccc;\n");
      out.write("                     box-sizing: border-box;\n");
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
      out.write("                     opacity: 0.8;\n");
      out.write("                            } \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("<script>\n");
      out.write("function yesnoCheck() {\n");
      out.write("    if (document.getElementById('yesCheck').checked) {\n");
      out.write("        document.getElementById('ifYes').style.visibility = 'visible';\n");
      out.write("        document.getElementById('ifNo').style.visibility = 'visible';\n");
      out.write("    }\n");
      out.write("    else document.getElementById('ifYes').style.visibility = 'hidden';\n");
      out.write("    }  \n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("    \n");
      out.write("    <body style=\"background-color:gainsboro;\">\n");
      out.write("        <header>\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <img src=\"pks logo.png\" width=\"300\" height=\"120\">\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </header> <br>\n");
      out.write("    \n");
      out.write("    <center>\n");
      out.write("        <div class=\"form\">\n");
      out.write("        <h1>Visitor Appointment</h1>\n");
      out.write("        <form  method=\"post\" action=\"appointmentProcess.jsp\">\n");
      out.write("\n");
      out.write("            <br><br>Full Name<br>\n");
      out.write("            <input type=\"text\" name=\"fullname\" required>\n");
      out.write("               \n");
      out.write("            <br><br>IC Number<br>\n");
      out.write("            <input type=\"text\" name=\"icnum\" pattern=\"[0-9]\" required>\n");
      out.write("            \n");
      out.write("            <br><br>Contact Number<br>\n");
      out.write("            <input type=\"text\" name=\"contactno\"  pattern=\"[0-9]\" required>\n");
      out.write("                \n");
      out.write("            <br><br>Email Address<br>\n");
      out.write("            <input type=\"text\" name=\"email\" required>\n");
      out.write("\n");
      out.write("            <br><br>Select an appointment date<br>\n");
      out.write("            <input type=\"date\" name=\"appointmentdate\" required>\n");
      out.write("            \n");
      out.write("            <br><br>Car Plate Number<br>\n");
      out.write("            <input type=\"text\" name=\"carplate\" required>\n");
      out.write("            \n");
      out.write("            <br><br>Purpose<br>\n");
      out.write("            <select name=\"purpose\">\n");
      out.write("                <option value=\"To fetch staff or student\">To fetch staff or student</option>\n");
      out.write("                <option value=\"Business purpose\">Business purpose</option>\n");
      out.write("                <option value=\"Delivery item\">Delivery item</option>\n");
      out.write("                <option value=\"Meeting\">Meeting</option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <br>Do you have one or more of the following symptoms? Please mark \"/\" in the corresponding box.<br>\n");
      out.write("            <input type=\"checkbox\" name=\"symptoms\" value=\"Fever\">\n");
      out.write("            Fever<br>\n");
      out.write("            <input type=\"checkbox\" name=\"symptoms\" value=\"Chill\">\n");
      out.write("            Chill<br>\n");
      out.write("            <input type=\"checkbox\" name=\"symptoms\" value=\"Cough\">\n");
      out.write("            Cough<br>\n");
      out.write("            <input type=\"checkbox\" name=\"symptoms\" value=\"Sore throat\">\n");
      out.write("            Sore throat<br>\n");
      out.write("            <input type=\"checkbox\" name=\"symptoms\" value=\"Runny nose\">\n");
      out.write("            Runny Nose<br>\n");
      out.write("            <input type=\"checkbox\" name=\"symptoms\" value=\"Difficulty in breathing\">\n");
      out.write("            Difficulty in breathing<br>\n");
      out.write("            <input type=\"checkbox\" name=\"symptoms\" value=\"None\">\n");
      out.write("            NONE of the above<br>\n");
      out.write("            \n");
      out.write("            <br><br>Have you been to other countries over the past 30 days? <br>\n");
      out.write("            <input type=\"radio\" name=\"travel\" value=\"Yes\" onclick=\"javascript:yesnoCheck();\" id=\"yesCheck\">\n");
      out.write("            Yes<br>\n");
      out.write("            <input type=\"radio\" name=\"travel\" value=\"No\" onclick=\"javascript:yesnoCheck();\" id=\"noCheck\">\n");
      out.write("            No<br><br>\n");
      out.write("              \n");
      out.write("            <div id=\"ifYes\" style=\"visibility:hidden\"><br><br>If yes, which country that have you visited ?<br>\n");
      out.write("            <select name=\"countries\" id='yes'>\n");
      out.write("                <option value=\"No\">\n");
      out.write("                <option value=\"Afghanistan\">Afghanistan</option>\n");
      out.write("                <option value=\"Aland Islands\">Aland Islands</option>\n");
      out.write("                <option value=\"Albania\">Albania</option>\n");
      out.write("                <option value=\"American Samoa\">American Samoa</option>\n");
      out.write("                <option value=\"Andorra\">Andorra</option>\n");
      out.write("                <option value=\"Angola\">Angola</option>\n");
      out.write("                <option value=\"Anguilla\">Anguilla</option>\n");
      out.write("                <option value=\"Antarctica\">Antarctica</option>\n");
      out.write("                <option value=\"Antigua and Barbuda\">Antigua and Barbuda</option>\n");
      out.write("                <option value=\"Argentina\">Argentina</option>\n");
      out.write("                <option value=\"Armenia\">Armenia</option>\n");
      out.write("                <option value=\"Aruba\">Aruba</option>\n");
      out.write("                <option value=\"Australia\">Australia</option>\n");
      out.write("                <option value=\"Austria\">Austria</option>\n");
      out.write("                <option value=\"Azerbaijin\">Azerbaijin</option>\n");
      out.write("                <option value=\"Baden\">Baden</option>\n");
      out.write("                <option value=\"Bahamas\">Bahamas</option>\n");
      out.write("                <option value=\"Bahrain\">Bahrain</option>\n");
      out.write("                <option value=\"Bangladesh\">Bangladesh</option>\n");
      out.write("                <option value=\"Barbados\">Barbados</option>\n");
      out.write("                <option value=\"Bavaria\">Bavaria</option>\n");
      out.write("                <option value=\"Belarus\">Belarus</option>\n");
      out.write("                <option value=\"Belgium\">Belgium</option>\n");
      out.write("                <option value=\"Belize\">Belize</option>\n");
      out.write("                <option value=\"Benin\">Benin</option>\n");
      out.write("                <option value=\"Bolivia\">Bolivia</option>\n");
      out.write("                <option value=\"Bosnia and Herzegovina\">Bosnia and Herzegovina</option>\n");
      out.write("                <option value=\"Botswana\">Botswana</option>\n");
      out.write("                <option value=\"Brazil\">Brazil</option>\n");
      out.write("                <option value=\"Brunei\">Brunei</option>\n");
      out.write("                <option value=\"Brunswick and L??neburg\">Brunswick and L??nerburg</option>\n");
      out.write("                <option value=\"Bulgaria\">Bulgaria</option>\n");
      out.write("                <option value=\"Burkina Faso\">Burkina Faso</option>\n");
      out.write("                <option value=\"Burma\">Burma</option>\n");
      out.write("                <option value=\"Burundi\">Burundi</option>\n");
      out.write("                <option value=\"Cabo Verde\">Cabo Verde</option>\n");
      out.write("                <option value=\"Cambodia\">Cambodia</option>\n");
      out.write("                <option value=\"Cameroon\">Cameroon</option>\n");
      out.write("                <option value=\"Canada\">Canada</option>\n");
      out.write("                <option value=\"Cayman Islands\">Cayman Islands</option>\n");
      out.write("                <option value=\"Central African Republic\">Central African Republic</option>\n");
      out.write("                <option value=\"Central American Federation\">Central American Federation</option>\n");
      out.write("                <option value=\"Chad\">Chad</option>\n");
      out.write("                <option value=\"Chile\">Chile</option>\n");
      out.write("                <option value=\"China\">China</option>\n");
      out.write("                <option value=\"Colombia\">Colombia</option>\n");
      out.write("                <option value=\"Comoros\">Comoros</option>\n");
      out.write("                <option value=\"Congo Free State\">Congo Free State</option>\n");
      out.write("                <option value=\"Costa Rica\">Consta Rica</option>\n");
      out.write("                <option value=\"Cote d???Ivoire\">Cote d'Ivoire</option>\n");
      out.write("                <option value=\"Croatia\">Croatia</option>\n");
      out.write("                <option value=\"Cuba\">Cuba</option>\n");
      out.write("                <option value=\"Cyprus\">Cyprus</option>\n");
      out.write("                <option value=\"Czechia\">Czechia</option>\n");
      out.write("                <option value=\"Czechoslovakia\">Czechoslovakia</option>\n");
      out.write("                <option value=\"Democratic Republic\">Democratic Republic</option>\n");
      out.write("                <option value=\"Denmark\">Denmark</option>\n");
      out.write("                <option value=\"Djibouti\">Djibouti</option>\n");
      out.write("                <option value=\"Dominica\">Dominica</option>\n");
      out.write("                <option value=\"Dominican Republic\">Dominican Republic</option>\n");
      out.write("                <option value=\"Duchy of Parma\">Duchy of Parma</option>\n");
      out.write("                <option value=\"East Germany\">East Germany</option>\n");
      out.write("                <option value=\"Ecuador\">Ecuador</option>\n");
      out.write("                <option value=\"Egypt\">Egypt</option>\n");
      out.write("                <option value=\"El Salvador\">El Salvador</option>\n");
      out.write("                <option value=\"Equatorial Guinea\">Equatorial Guinea</option>\n");
      out.write("                <option value=\"Eritrea\">Eritrea</option>\n");
      out.write("                <option value=\"Estonia\">Estonia</option>\n");
      out.write("                <option value=\"Eswatini\">Eswatini</option>\n");
      out.write("                <option value=\"Ethiopia\">Ethiopia</option>\n");
      out.write("                <option value=\"Falkland Islands\">Falkland Islands</option>\n");
      out.write("                <option value=\"Faroe Islands\">Faroe Islands</option>\n");
      out.write("                <option value=\"Fiji\">Fiji</option>\n");
      out.write("                <option value=\"Finland\">Finland</option>\n");
      out.write("                <option value=\"France\">Frances</option>\n");
      out.write("                <option value=\"French Guiana\">French Guiana</option>\n");
      out.write("                <option value=\"French Polynesia\">French Polynesia</option>\n");
      out.write("                <option value=\"French Southern Territories\">French Southern Territories</option>\n");
      out.write("                <option value=\"Gabon\">Gabon</option>\n");
      out.write("                <option value=\"The Gambia\">The Gambia</option>\n");
      out.write("                <option value=\"Georgia\">Georgia</option>\n");
      out.write("                <option value=\"Germany\">Germany</option>\n");
      out.write("                <option value=\"Ghana\">Ghana</option>\n");
      out.write("                <option value=\"Gibraltar\">Gibraltar</option>\n");
      out.write("                <option value=\"Greece\">Greece</option>\n");
      out.write("                <option value=\"Greenland\">Greenland</option>\n");
      out.write("                <option value=\"Grenada\">Grenada</option>\n");
      out.write("                <option value=\"Guadeloupe\">Guadeloupe</option>\n");
      out.write("                <option value=\"Guam\">Guam</option>\n");
      out.write("                <option value=\"Guatemala\">Guatemala</option>\n");
      out.write("                <option value=\"Guinea\">Guinea</option>\n");
      out.write("                <option value=\"Guinea Bissau\">Guinea Bissau</option>\n");
      out.write("                <option value=\"Guyana\">Guyana</option>\n");
      out.write("                <option value=\"Haiti\">Haiti</option>\n");
      out.write("                <option value=\"Holy See\">Holy See</option>\n");
      out.write("                <option value=\"Honduras\">Honduras</option>\n");
      out.write("                <option value=\"Hong Kong\">Hong Kong</option>\n");
      out.write("                <option value=\"Hungary\">Hungary</option>\n");
      out.write("                <option value=\"Iceland\">Iceland</option>\n");
      out.write("                <option value=\"India\">India</option>\n");
      out.write("                <option value=\"Indonesia\">Indonesia</option>\n");
      out.write("                <option value=\"Iran\">Iran</option>\n");
      out.write("                <option value=\"Iraq\">Iraq</option>\n");
      out.write("                <option value=\"Ireland\">Ireland</option>\n");
      out.write("                <option value=\"Israel\">Israel</option>\n");
      out.write("                <option value=\"Italy\">Italy</option>\n");
      out.write("                <option value=\"Ivory Coast\">Ivory Coast</option>\n");
      out.write("                <option value=\"Jamaica\">Jamaica</option>\n");
      out.write("                <option value=\"Japan\">Japan</option>\n");
      out.write("                <option value=\"Jordan\">Jordan</option>\n");
      out.write("                <option value=\"Kazakhstan\">Kazakhstan</option>\n");
      out.write("                <option value=\"Kenya\">Kenya</option>\n");
      out.write("                <option value=\"Kiribati\">Kiribati</option>\n");
      out.write("                <option value=\"North Korea\">North Korea</option>\n");
      out.write("                <option value=\"South Korea\">South Korea</option>\n");
      out.write("                <option value=\"Kosovo\">Kosovo</option>\n");
      out.write("                <option value=\"Kuwait\">Kuwait</option>\n");
      out.write("                <option value=\"Kyrgyzstan\">Kyrgyzstan</option>\n");
      out.write("                <option value=\"Lao\">Lao</option>\n");
      out.write("                <option value=\"Latvia\">Latvia</option>\n");
      out.write("                <option value=\"Lebanon\">Lebanon</option>\n");
      out.write("                <option value=\"Lesotho\">Lesotho/option>\n");
      out.write("                <option value=\"Liberia\">Liberia</option>\n");
      out.write("                <option value=\"Libya\">Libya</option>\n");
      out.write("                <option value=\"Liechtenstein\">Liechtenstein</option>\n");
      out.write("                <option value=\"Lithuania\">Lithuania</option>\n");
      out.write("                <option value=\"Luxembourg\">Luxembourg</option>\n");
      out.write("                <option value=\"Macau\">Macau</option>\n");
      out.write("                <option value=\"Madagascar\">Madagascar</option>\n");
      out.write("                <option value=\"Malawi\">Malawi</option>\n");
      out.write("                <option value=\"Maldives\">Maldives</option>\n");
      out.write("                <option value=\"Mali\">Mali</option>\n");
      out.write("                <option value=\"Malta\">Malta</option>\n");
      out.write("                <option value=\"Marshall Islands\">Faroe Islands</option>\n");
      out.write("                <option value=\"Martinique\">Martinique</option>\n");
      out.write("                <option value=\"Mauritania\">Mauritania</option>\n");
      out.write("                <option value=\"Mauritius\">Mauritius</option>\n");
      out.write("                <option value=\"Mayotte\">Mayotte</option>\n");
      out.write("                <option value=\"Mexico\">Mexico</option>\n");
      out.write("                <option value=\"Micronesia\">Micronesia</option>\n");
      out.write("                <option value=\"Moldova\">Moldova</option>\n");
      out.write("                <option value=\"Monaco\">Monaco</option>\n");
      out.write("                <option value=\"Mongolia\">Mongolia</option>\n");
      out.write("                <option value=\"Montenegro\">Montenegro</option>\n");
      out.write("                <option value=\"Montserrat\">Montserrat</option>\n");
      out.write("                <option value=\"Morocco\">Morocco</option>\n");
      out.write("                <option value=\"Mozambique\">Mozambique</option>\n");
      out.write("                <option value=\"Myanmar\">Myanmar</option>\n");
      out.write("                <option value=\"Namibia\">Namibia</option>\n");
      out.write("                <option value=\"Nauru\">Nauru</option>\n");
      out.write("                <option value=\"Nepal\">Nepal</option>\n");
      out.write("                <option value=\"Netherlands\">Netherlands</option>\n");
      out.write("                <option value=\"Netherlands Antilles\">Netherlands Antilles</option>\n");
      out.write("                <option value=\"New Caledonia\">New Caledonia</option>\n");
      out.write("                <option value=\"New Zealand\">New Zealand</option>\n");
      out.write("                <option value=\"Nicaragua\">Nicaragua</option>\n");
      out.write("                <option value=\"Niger\">Niger</option>\n");
      out.write("                <option value=\"Nigeria\">Nigeria</option>\n");
      out.write("                <option value=\"Niue\">Niue</option>\n");
      out.write("                <option value=\"North Macedonia\">North Macedonia</option>\n");
      out.write("                <option value=\"Northern Mariana Islands\">Northern Mariana Islands</option>\n");
      out.write("                <option value=\"Norway\">Norway</option>\n");
      out.write("                <option value=\"Oman\">Oman</option>\n");
      out.write("                <option value=\"Pakistan\">Pakistan</option>\n");
      out.write("                <option value=\"Palau\">Palau</option>\n");
      out.write("                <option value=\"Palestinian territories\">Palestinian territories</option>\n");
      out.write("                <option value=\"Panama\">Panama</option>\n");
      out.write("                <option value=\"Papua New Guinea\">Papua New Guinea</option>\n");
      out.write("                <option value=\"Paraguays\">Paraguay</option>\n");
      out.write("                <option value=\"Peru\">Peru</option>\n");
      out.write("                <option value=\"Philippines\">Philippines</option>\n");
      out.write("                <option value=\"Pitcairn Island\">Pitcairn Island</option>\n");
      out.write("                <option value=\"Poland\">Poland</option>\n");
      out.write("                <option value=\"Portugal\">Portugal</option>\n");
      out.write("                <option value=\"Puerto Rico\">Puerto Rico</option>\n");
      out.write("                <option value=\"Qatar\">Qatar</option>\n");
      out.write("                <option value=\"Reunion Island\">\tReunion Island</option>\n");
      out.write("                <option value=\"Romania\">Romania</option>\n");
      out.write("                <option value=\"Russian Federation\">Russian Federation</option>\n");
      out.write("                <option value=\"Rwanda\">Rwanda</option>\n");
      out.write("                <option value=\"Saint Kitts and Nevis\">Saint Kitts and Nevis</option>\n");
      out.write("                <option value=\"Saint Lucia\">Saint Lucia</option>\n");
      out.write("                <option value=\"Saint Vincent and the Grenadines\">Saint Vincent and the Grenadines</option>\n");
      out.write("                <option value=\"Samoa\">Samoa</option>\n");
      out.write("                <option value=\"San Marino\">San Marino</option>\n");
      out.write("                <option value=\"Sao Tome and Principe\">Sao Tome and Principe</option>\n");
      out.write("                <option value=\"Saudi Arabia\">Saudi Arabia</option>\n");
      out.write("                <option value=\"Senegal\">Senegal</option>\n");
      out.write("                <option value=\"Serbia\">Serbia</option>\n");
      out.write("                <option value=\"Seychelles\">Seychelles</option>\n");
      out.write("                <option value=\"Sierra Leone\">Sierra Leone</option>\n");
      out.write("                <option value=\"Singapore\">Singapore</option>\n");
      out.write("                <option value=\"Slovakia\">Slovakia</option>\n");
      out.write("                <option value=\"Slovenia\">Slovenia</option>\n");
      out.write("                <option value=\"Solomon Islandss\">Solomon Islands</option>\n");
      out.write("                <option value=\"Somalia\">Somalia</option>\n");
      out.write("                <option value=\"South Africa\">South Africa</option>\n");
      out.write("                <option value=\"South Korea\">South Korea</option>\n");
      out.write("                <option value=\"Spain\">Spain</option>\n");
      out.write("                <option value=\"Sri Lanka\">Sri Lanka</option>\n");
      out.write("                <option value=\"Sudan\">Sudan</option>\n");
      out.write("                <option value=\"Suriname\">Suriname</option>\n");
      out.write("                <option value=\"Swaziland\">Swaziland</option>\n");
      out.write("                <option value=\"Sweden\">Sweden</option>\n");
      out.write("                <option value=\"Switzerland\">Switzerland</option>\n");
      out.write("                <option value=\"Syria\">Syria</option>\n");
      out.write("                <option value=\"Taiwan\">Taiwan</option>\n");
      out.write("                <option value=\"Tajikistans\">Tajikistan</option>\n");
      out.write("                <option value=\"Tanzania\">Tanzania</option>\n");
      out.write("                <option value=\"Thailand\">Thailand</option>\n");
      out.write("                <option value=\"Tibet\">Tibet</option>\n");
      out.write("                <option value=\"Timor Leste\">Timor Leste</option>\n");
      out.write("                <option value=\"Togo\">Togo</option>\n");
      out.write("                <option value=\"Tokelau\">Tokelau</option>\n");
      out.write("                <option value=\"Tonga\">Tonga</option>\n");
      out.write("                <option value=\"Trinidad and Tobago\">Trinidad and Tobago</option>\n");
      out.write("                <option value=\"Tunisia\">Tunisia</option>\n");
      out.write("                <option value=\"Turkey\">Turkey</option>\n");
      out.write("                <option value=\"Turkmenistan\">Turkmenistan</option>\n");
      out.write("                <option value=\"Turks and Caicos Islands\">Turks and Caicos Islands</option>\n");
      out.write("                <option value=\"Tuvalu\">Tuvalu</option>\n");
      out.write("                <option value=\"Uganda\">Uganda</option>\n");
      out.write("                <option value=\"Ukraine\">Faroe Islands</option>\n");
      out.write("                <option value=\"United Arab Emirates\">United Arab Emirates</option>\n");
      out.write("                <option value=\"United Kingdom\">United Kingdom</option>\n");
      out.write("                <option value=\"United States\">United States</option>\n");
      out.write("                <option value=\"Uruguay\">Uruguay</option>\n");
      out.write("                <option value=\"Uzbekistan\">Uzbekistan</option>\n");
      out.write("                <option value=\"Vanuatu\">Vanuatu</option>\n");
      out.write("                <option value=\"Vatican City State\">Vatican City State</option>\n");
      out.write("                <option value=\"Venezuela\">Venezuela</option>\n");
      out.write("                <option value=\"Vietnam\">Vietnam</option>\n");
      out.write("                <option value=\"Virgin Islands\">Virgin Islands</option>\n");
      out.write("                <option value=\"Wallis and Futuna Islands\">Wallis and Futuna Islands</option>\n");
      out.write("                <option value=\"Western Sahara\">Western Sahara</option>\n");
      out.write("                <option value=\"Yemen\">Yemen</option>\n");
      out.write("                <option value=\"Zambia\">Zambia</option>\n");
      out.write("                <option value=\"Zimbabwe\">Zimbabwe</option>    \n");
      out.write("            </select><br>\n");
      out.write("            \n");
      out.write("            <br><br>Date of Departure from the last visited country or states above<br>\n");
      out.write("            <input type=\"date\" name=\"traveldate\" required>\n");
      out.write("                        \n");
      out.write("            <div id=\"ifYes\" style=\"visibility:hidden\">\n");
      out.write("            <input type=\"submit\" value=\"Submit\" class=\"button\">\n");
      out.write("            <input type=\"reset\" value=\"Reset\" class=\"button\">\n");
      out.write("            \n");
      out.write("            <div id=\"ifNo\" style=\"visibility:visible\">\n");
      out.write("            <Input type=\"submit\" value=\"Submit\" class=\"button\">\n");
      out.write("            <input type=\"reset\" value=\"Reset\" class=\"button\">\n");
      out.write("            <br><br><br><br>\n");
      out.write("           \n");
      out.write("        </form>\n");
      out.write("    </center>\n");
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
}
