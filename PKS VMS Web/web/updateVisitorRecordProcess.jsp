<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<%
try {  
    String Visitorid = request.getParameter("visitorid");
    String FullName = request.getParameter("fullname");
    String ICNum = request.getParameter("icnum");
    String ContactNo = request.getParameter("contactno");
    String Bodytemperature = request.getParameter("temperature");
    String Vehiclenum = request.getParameter("vehiclenumber");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pks_visitormanager","project","fypteam");

    String sql = "UPDATE VISITOR set Visitor_Name=?,IC_num=?,Phone_Number=?,Temperature=?,Vehicle_Number=? WHERE Visitor_ID=?";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    
    pstmt.setString(1, FullName);
    pstmt.setString(2, ICNum);
    pstmt.setString(3, ContactNo);
    pstmt.setString(4, Bodytemperature);
    pstmt.setString(5, Vehiclenum);
    pstmt.setString(6, Visitorid);
    pstmt.executeUpdate();
    
    RequestDispatcher rd=request.getRequestDispatcher("visitorList.jsp");  
    rd.include(request,response); 
}   
catch (Exception e) {
    out.println("Something went wrong !! Please try again.");
}
    

%> 

