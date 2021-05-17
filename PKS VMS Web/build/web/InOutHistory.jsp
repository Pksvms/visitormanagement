<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
      <title>PKS Visitor Management System</title>
      
 <script type="text/javascript">
 function printpage() {
     var printbutton = document.getElementById("printbtn");
     var noti = document.getElementById("noti_number");
     
     printbutton.style.visibility = 'hidden';
     noti.style.visibility = 'hidden';
     
     window.print();
     
     printbutton.style.visibility = 'visible';
     noti.style.visibility = 'visible';    
 }
 
 function loadDoc() {
  

  setInterval(function(){

   var xhttp = new XMLHttpRequest();
   xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
     document.getElementById("noti_number").innerHTML = this.responseText;
    }
   };
   xhttp.open("GET", "notification.jsp", true);
   xhttp.send();

  },1000);


 }
 loadDoc();
</script>
    </head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css2/main2.css">
<link rel="stylesheet" href="css2/fontfamily.css">
<link rel="stylesheet" href="css2/fontawesome.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
html,body,h1,h2,h3,h4,h5 {
    font-family: "Raleway", sans-serif;
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
<body class="w3-light-grey">

<!-- Top container -->
<div class="w3-bar w3-top w3-light-blue w3-large" style="z-index:4">
  <span class="w3-bar-item w3-right">PKS Visitor Management System &nbsp; &nbsp; <i class="fa fa-bell" aria-hidden="true" id="noti_number"></i>&nbsp; &nbsp; &nbsp; <img src="images/pks-logo.png" style="width:100px;"></span>
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
    <a href="#inout" class="w3-bar-item w3-button w3-padding">In Out History</a>
    <a href="adminLogout.jsp" class="w3-bar-item w3-button w3-padding">Logout</a><br><br>
  </div>
</nav>


<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:200px; margin-top:43px;">

  <!-- Header -->
  <header class="w3-container" style="padding-top:30px">
      <center><h2><b>Visitor Entrance & Exist History</b></h2></center>
  </header>

  <section id="inout">
      <div class="w3-row-padding w3-margin-bottom">
        <div class="w3-left">
        <div class="w3-right">
        
            <table border="1px solid black" style="width:100%;">
                       
                 <tr>
                 <th style="width:5%;">No</th>
                 <th style="width:15%;">Name</th>
                 <th>Contact Number</th>
                 <th>Vehicle Number</th>
                 <th>Purpose</th>
                 <th>Meet</th>
                 <th>Place</th>
                 <th style="width:7%;">Check In Date</th>
                 <th  style="width:7%;">Check In Time</th>
                 <th  style="width:7%;">Check Out Date</th>
                 <th  style="width:7%;">Check Out Time</th>
                 </tr>
           
            
            
<%
 try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pks_visitormanager","project","fypteam");
      
      Statement st = conn.createStatement();
      String sql = "SELECT VISITOR.Visitor_ID, VISITOR.Visitor_Name, VISITOR.Phone_Number, VISITOR.Vehicle_Number, APPOINTMENT.Purpose, APPOINTMENT.People_meet, APPOINTMENT.Place, GATE_ENTRY.CheckIn_Date, GATE_ENTRY.CheckIn_Time, GATE_ENTRY.CheckOut_Date, GATE_ENTRY.CheckOut_Time FROM ((APPOINTMENT JOIN VISITOR ON APPOINTMENT.Appointment_ID = VISITOR.Appointment_ID)"+
                   "INNER JOIN GATE_ENTRY ON VISITOR.Gate_Entry_ID = GATE_ENTRY.Gate_Entry_ID)";
    
      ResultSet rs = st.executeQuery(sql);
      while(rs.next()) {
      %> 

    <tr>
    <td><%=rs.getString("Visitor_ID")%></td>
    <td><%=rs.getString("Visitor_Name")%></td> 
    <td><%=rs.getString("Phone_Number")%></td>
    <td><%=rs.getString("Vehicle_Number")%></td>
    <td><%=rs.getString("Purpose")%></td>
    <td><%=rs.getString("People_meet")%></td>
    <td><%=rs.getString("Place")%></td>
    <td><%=rs.getString("CheckIn_Date")%></td>
    <td><%=rs.getString("CheckIn_Time")%></td>
    <td><%=rs.getString("CheckOut_Date")%></td>
    <td><%=rs.getString("CheckOut_Time")%></td>
    </tr>
    
<%
}
conn.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
    
       </table>
       <br><br>
       <center> 
           <input type="button" name="printbtn" id="printbtn" value="Print" style="height:30px;width:70px;" onClick="printpage()">
       </center> 
        </div>
        </div>
      </div>

</section>
        </div>
        
  <!-- End page content -->
  
<script>
// Get the Sidebar
var mySidebar = document.getElementById("mySidebar");

// Get the DIV with overlay effect
var overlayBg = document.getElementById("myOverlay");

// Toggle between showing and hiding the sidebar, and add overlay effect
function w3_open() {
  if (mySidebar.style.display === 'block') {
    mySidebar.style.display = 'none';
    overlayBg.style.display = "none";
  } else {
    mySidebar.style.display = 'block';
    overlayBg.style.display = "block";
  }
}

// Close the sidebar with the close button
function w3_close() {
  mySidebar.style.display = "none";
  overlayBg.style.display = "none";
}
</script>

</body>
</html>

