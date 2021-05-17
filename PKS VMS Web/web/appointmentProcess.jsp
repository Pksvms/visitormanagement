<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page language="java"%>

<%   
try {
    String FullName = request.getParameter("fullname");
    String ICNum = request.getParameter("icnum");
    String ContactNo = request.getParameter("contactno");
    String mail = request.getParameter("email");
    String CarPlate = request.getParameter("carplate");
    String AppointmentDate = request.getParameter("appointmentdate");
    String Reason = request.getParameter("purpose");
    String Peoplemeet = request.getParameter("peoplemeet");
    String location = request.getParameter("place");
    String checkValues[] = request.getParameterValues("symptoms");
    String value="";
    String Trip = request.getParameter("travel");
    String State = request.getParameter("countries");
    String Situation = "Empty";
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pks_visitormanager?zeroDateTimeBehavior=convertToNull&autoReconnect=true&characterEncoding=UTF-8&characterSetResults=UTF-8","project","fypteam");
   
    for(int i=0;i<checkValues.length;i++) {
        value += checkValues[i]+", ";   
    }
      
    Statement st = conn.createStatement();
    st.executeUpdate("INSERT INTO APPOINTMENT (Visitor_Name, IC_num, Phone_Number, Email, Vehicle_Number, "
                    + "Appointment_date, Purpose, People_meet, Place, Symptoms, Travel, Countries, Status) values "
                    + "('"+FullName+"','"+ICNum+"','"+ContactNo+"','"+mail+"','"+CarPlate+"','"+AppointmentDate+"','"+Reason+"','"
                    + ""+Peoplemeet+"','"+location+"','"+value+"','"+Trip+"','"+State+"','"+Situation+"')");
   
    RequestDispatcher rd=request.getRequestDispatcher("appointmentSucess.jsp");  
    rd.include(request,response);
    
}
catch (Exception e) {
    out.println("Something went wrong !! Please <a href='visitorAppoinment.jsp'>try again</a>");
}
%>


     



