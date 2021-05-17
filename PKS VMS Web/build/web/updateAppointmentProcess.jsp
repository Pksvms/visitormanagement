<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<%
try {
    String Appointmentid = request.getParameter("appointmentid");
    String FullName = request.getParameter("fullname");
    String ICNum = request.getParameter("icnum");
    String ContactNo = request.getParameter("contactno");
    String mail = request.getParameter("email");
    String AppointmentDate = request.getParameter("appointmentdate");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pks_visitormanager","project","fypteam");

    String sql = "UPDATE APPOINTMENT set Visitor_Name=?,IC_num=?,Phone_Number=?,Email=?, Appointment_date=? WHERE Appointment_ID=?";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    
    pstmt.setString(1, FullName);
    pstmt.setString(2, ICNum);
    pstmt.setString(3, ContactNo);
    pstmt.setString(4, mail);
    pstmt.setString(5, AppointmentDate);
    pstmt.setString(6, Appointmentid);
    pstmt.executeUpdate();
    
    RequestDispatcher rd=request.getRequestDispatcher("appointmentList.jsp");  
    rd.include(request,response); 
}   
catch (Exception e) {
    out.println("Something went wrong !! Please try again.");
}
    

%> 
