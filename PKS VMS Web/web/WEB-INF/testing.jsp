<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
<style>
            body {
                margin:5px;
                font-size:15px;
            }   
            
            table {
                padding: 5px;
                border: 3px solid #f1f1f1;
                width:50px;
                
            }
            
            th, td {
                padding: 15px;
            }
            
            button {
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 25%;
            }
</style>

    </head>
    <body>
        <table border="1">
            <tr>
                <th colspan="12"><br><h1>Visitor Appointment Information</h1>
            </tr>
              <tr>
                 <th>Appointment ID</th>
                 <th>Full Name</th>
                 <th>IC Number</th>
                 <th>Contact Number</th>
                 <th>Email Address</th>
                 <th>Appointment Date</th>
                 <th>Car Plate Number</th>
                 <th>Purpose</th>
                 <th>Symptoms</th>
                 <th>Travel</th>
                 <th>Countries</th>
                 <th>Actions</th>   
              </tr>
        </table>
    </body>
</html>
