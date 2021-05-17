<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>

<%
try {
     
    String visitorid = request.getParameter("visitorid");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pks_visitormanager","project","fypteam");

    Statement st=conn.createStatement();
    int i = st.executeUpdate("DELETE  VISITOR,GATE_ENTRY FROM VISITOR INNER JOIN GATE_ENTRY ON 	GATE_ENTRY.Gate_Entry_ID =VISITOR.Gate_Entry_ID WHERE VISITOR.Visitor_ID="+visitorid);
    
    RequestDispatcher rd=request.getRequestDispatcher("visitorList.jsp");  
    rd.include(request,response); 
}
catch (Exception e){
    out.println("<center>Something went wrong !! Please try again. An error occured: </center>"+e.getMessage());
}


%>
