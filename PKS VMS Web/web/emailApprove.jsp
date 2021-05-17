<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="javax.mail.*"%>
<%@ page import="javax.mail.internet.*" %>
<%@page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<title>PKS Visitor Management System</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css2/main2.css">
<link rel="stylesheet" href="css2/fontfamily.css">
<link rel="stylesheet" href="css2/fontawesome.css">

<style>
html,body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}
</style>
<body class="w3-light-grey" onLoad="displayResult()">

<!-- Top container -->
<div class="w3-bar w3-top w3-light-blue w3-large" style="z-index:4">
  <button class="w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey" onclick="w3_open();">Menu</button>
  <span class="w3-bar-item w3-right">PKS Visitor Management System &nbsp; &nbsp;<img src="images/pks-logo.png" style="width:100px;"></span>
</div>

<!-- Sidebar/menu -->
<nav class="w3-sidebar w3-collapse w3-white w3-animate-left" style="z-index:3;width:200px;" id="mySidebar"><br>
  <div class="w3-container w3-row">
    <div class="w3-col s4" style="margin-left:35px">
        <center><img src="images/avatar.png" class="w3-circle w3-margin-left" style="width:60px"></center>
    </div><br><br><br>
    <div class="w3-col s8 w3-bar"  style="margin-left:50px">
        <span>Welcome, <strong>Admin</strong></span><br>
    </div>
  </div>
  <hr>

  <div class="w3-bar-block">
    <a href="#" class="w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black" onclick="w3_close()" title="close menu">Close Menu</a>
    <a href="appointmentList.jsp" class="w3-bar-item w3-button w3-padding">Appointment List</a>
    <a href="visitorList.jsp" class="w3-bar-item w3-button w3-padding">Visitor Records</a>
    <a href="InOutHistory.jsp" class="w3-bar-item w3-button w3-padding">In Out History</a>
    <a href="adminLogout.jsp" class="w3-bar-item w3-button w3-padding">Logout</a><br><br>
  </div>
</nav>


<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:360px; margin-top:43px;">

  <!-- Header -->
  <header class="w3-container" style="padding-top:30px">
      <center><h2><b></b></h2></center>
  </header>

  <section>
      <div class="w3-row-padding w3-margin-bottom">
        <div class="w3-left">
        <div class="w3-right">

    <center><h1>Sending Approve E-mail</h1></center>
        <%!
         public static class SMTPAuthenticator extends Authenticator {
            
            public PasswordAuthentication getPasswordAuthentication () {
                return new PasswordAuthentication("pksvms2021","Pks12345");
            }
         }
            %>
            <%
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
                %>
        <form name="myForm" action="emailApprove.jsp" method="POST">
            <center>
            <table border="0">
                
<%
        try{   
             String sttt="Approved";
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

             %>
                    
<%
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

%> 

                <tr>
                    <td><b>To: <br></td>
                    <td><b><b><input  value="<%=rs.getString("Email")%>" type="text" name="to" size="32" required/><br></td>
                </tr>
                
<%
}
conn.close();
} catch (Exception e) {
e.printStackTrace();
}
%> 
                <tr>
                    <td><b>Subject: <br><br></td>
                    <td><input type="text" name="subject" value="Appointment had been approved" size="38" required/><br><br></td>
                </tr>
                
                
                <tr>
                    <td><b>Message : <br><br></td>
                    <td><textarea rows="15" cols="70" name="message" required/>Dear sir / madam, your appointment to visit Politeknik Kuching Sarawak has been scheduled on dd/mm/yyyy.</textarea><br><br></td>
                </tr>
                
                </table>
                               
                <input type="hidden" name="hidden" value="<%= result %>">
                <input type="submit" name="send" style="height:35px;width:100px;" value="Send" clsss="button">&nbsp; &nbsp; &nbsp;
                <input type="reset" name="reset" style="height:35px;width:100px;" value="Reset" class="button">&nbsp; &nbsp; &nbsp;
                <input type="button" name="back" style="height:35px;width:100px;" value="Back" onClick="window.location='appointmentList.jsp'" class="button">

            </center>
        </form>
    
                <script language="JavaScript">
                    function displayResult() {
                        if(document.myForm.hidden.value === "1"){
                            window.alert("Email was successfully sent!");
                        }
                            
                    }
                </script>
                
</div>
        </div>
      </div>
</section>
        </div>
    </body>
</html>



