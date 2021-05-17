<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/base.css">  
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/vendor.css">   
        
        <title>Edit Visitor Information</title>
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

input[type="text"] {
	display: block;
	height: 3rem;
	padding: 12px 20px;
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

input[type="text"]:focus {
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
            <center><h1>Edit Visitor Record</h1></center>
   		   		 		
        <form method="post" action="updateVisitorRecordProcess.jsp">
      
<%
 try {
     
    String visitorid=request.getParameter("visitorid");
    int no=Integer.parseInt(visitorid);
    int sumcount=0;

    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pks_visitormanager","project","fypteam");
      
    Statement st = conn.createStatement();
    String sql = "SELECT * FROM VISITOR where Visitor_ID= '"+no+"'";
    
    ResultSet rs = st.executeQuery(sql);
    while(rs.next()) {
    %> 


                <table border="0" style="width:50%" class="center">
                   
                    <tr>
                        <th><br>Visitor ID</th>
                        <th><input type="text" name="visitorid" size="30" value="<%=rs.getString("Visitor_ID")%>" required></th>
                    </tr>
                    
                    <tr>
                        <th>Full name</th>
                        <th><input type="text" name="fullname" size="30" value="<%=rs.getString("Visitor_Name")%>" required></th>
                    </tr>
                    
                    <tr>
                        <th>IC Number</th>
                        <th><input type="text" name="icnum" size="30" value="<%=rs.getString("IC_num")%>" required></th>
                    </tr>
                    
                    <tr>
                        <th>Contact Number</th>
                        <th><input type="text" name="contactno" size="30" value="<%=rs.getString("Phone_Number")%>" required></th>
                    </tr>
                    
                    <tr>
                        <th>Temperature</th>
                        <th><input type="text" name="temperature" size="30" value="<%=rs.getString("Temperature")%>" required></th>
                    </tr>
                    
                    <tr>
                        <th>Vehicle Number</th>
                        <th><input type="text" name="vehiclenumber" size="30" value="<%=rs.getString("Vehicle_Number")%>" required></th>
                    </tr>

                    <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Submit" style="height:50px;width:173px;font-size:16px;">
                        &nbsp;&nbsp;
                        <input type="reset" value="Reset" style="height:50px;width:173px;font-size:16px;">
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


