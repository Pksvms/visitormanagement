<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>

<%
    
try {
  
      // Loading and register drivers
      // using Class.forname() method
      Class.forName("com.mysql.jdbc.Driver");
  
      /* Step 3: Create a connection */
      // using DriverManager
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pks_visitormanager","project","fypteam");
   
             
      //Creating the Statement object
      Statement stmt = conn.createStatement();
      //Query to get the number of rows in a table
      String query = "select count(*) from APPOINTMENT";
      //Executing the query
      ResultSet rs = stmt.executeQuery(query);
      //Retrieving the result
      rs.next();
      int count = rs.getInt(1);
      out.println(""+count);
    
        }
        catch (Exception e) {
  
            // Exception handled here if it is generic
            // program based
            e.printStackTrace();
        }
        finally {
  
          
        }
%>
