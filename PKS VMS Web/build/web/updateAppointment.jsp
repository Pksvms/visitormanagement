<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/base.css">  
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/vendor.css">   
        
        <title>Edit Visitor Appointment Information</title>
    </head>
    
<style>
h1{
    text-align: center;
    color: white;
    position: relative;
    }
table, th, td {
    border:0px solid transparent;
    text-align: center;
    color: white;
    font-size:20px;
    font-weight: bold;
}

table.center {
    margin-left: auto; 
    margin-right: auto;
}

input[type="text"],
input[type="date"] {
    display: block;
    height: 3rem;
    padding: 5px 20px;
    margin: 3px 0;
    border: 0;
    outline: none;
    vertical-align: middle;
    color: #737373;
    font-family: "merriweather-regular", sans-serif;
    font-size: 1.5rem;
    line-height: 3rem;
    border-radius: 3px;
    background: #FFFFFF;
    max-width: 100%;
    border: 1px solid #d5d5d5;
    -moz-transition: all 0.3s ease-in-out;
    -o-transition: all 0.3s ease-in-out;
    -webkit-transition: all 0.3s ease-in-out;
    -ms-transition: all 0.3s ease-in-out;
    transition: all 0.3s ease-in-out;
}

input[type="text"]:focus, 
input[type="date"]:focus {
    color: #000000;
    background: #f4fffe;
    border: 1px solid #d2fef9;
}

</style>

<body>

    <script src="js/modernizr.js"></script>
    
        <section id="introbg">

   	<div class="shadow-overlaybg">

   	
            <br><br><br><br><br><br>
            <center><h1>Update Visitor Appointment Information</h1></center>
            
            <form method="post" action="updateAppointmentProcess.jsp">  
         
<%
 try {
     
    String appointmentid=request.getParameter("appointmentid");
    int no=Integer.parseInt(appointmentid);
    int sumcount=0;

    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pks_visitormanager","project","fypteam");
      
    Statement st = conn.createStatement();
    String sql = "SELECT * FROM APPOINTMENT where Appointment_ID= '"+no+"'";
    
    ResultSet rs = st.executeQuery(sql);
    while(rs.next()) {
    %>
 
          <table border="0" style="width:50%" class="center"> 
                
                    <tr>
                        <th>ID</th>
                        <th><input type="text" name="appointmentid" size="35" value="<%=rs.getString("Appointment_ID")%>" required></th>
                    </tr>
                     
                    <tr>
                        <th>Full name</th>
                        <th><input type="text" name="fullname" size="35" value="<%=rs.getString("Visitor_Name")%>" required></th>
                    </tr>
                    
                    <tr>
                        <th>IC Number</th>
                        <th><input type="text" name="icnum"  size="35" value="<%=rs.getString("IC_num")%>" required></th>
                    </tr>
                    
                    <tr>
                        <th>Contact Number</th>
                        <th><input type="text" name="contactno" size="35" value="<%=rs.getString("Phone_Number")%>" required></th>
                    </tr>
                    
                    <tr>
                       <th>Email address</th>
                       <th><input type="text" name="email" size="35" value="<%=rs.getString("Email")%>" required></th>
                    </tr> 
                    
                    <tr>
                        <th>Apply date</th>
                        <th><input type="date" name="appointmentdate" value="<%=rs.getString("Appointment_date")%>" required></th>
                    </tr>
					
                    <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Submit" style="height:55px;width:178px;font-size:16px;">
                        &nbsp;&nbsp;
                        <input type="reset" value="Reset" style="height:55px;width:178px;font-size:16px;">
                        &nbsp;&nbsp;
                    </tr>
                    
<%
}
conn.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
                </table>
        </form>
        </div>
    </section> <!-- /introbg -->
    </body>
</html>
