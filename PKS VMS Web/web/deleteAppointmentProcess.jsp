<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>

<%
try {
     
    String appointmentid = request.getParameter("appointmentid");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pks_visitormanager","project","fypteam");

    Statement st=conn.createStatement();
    int i=st.executeUpdate("DELETE FROM APPOINTMENT WHERE Appointment_ID="+ appointmentid);
    
    RequestDispatcher rd=request.getRequestDispatcher("appointmentList.jsp");  
    rd.include(request,response); 
}
catch (Exception e){
    out.println("<center>Something went wrong !! Please try again. An error occured: </center>"+e.getMessage());
}

%>
