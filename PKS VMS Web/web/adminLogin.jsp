<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
        
<%--css--%>
<style>
body {
	margin: 0;
	width: 100%;
	height: 100vh;
	font-family: 'Lato', sans-serif;
	color: #000000;
	background: linear-gradient(125deg,#E4FFCD,#6DD5FA,#2980B9,#E4FFCD);
	background-size: 400% 400%;
	animation: gradientBG 15s ease infinite;
}
@keyframes gradientBG {
	0% {
		background-position: 0% 50%;
	}
	50% {
		background-position: 100% 50%;
	}
	100% {
		background-position: 0% 50%;
	}
}
.container {
	width: 100%;
	position: absolute;
	top: 5%;
	text-align: center;
	
}
            
header{
        padding:5px;
}
body{
        margin:0;  
}
form {
        border: 3px solid #f1f1f1;
        background-color: white;
        width:35%;  
}            
.imgcontainer{
        text-align: center;
        margin:15px 0px 12px 0px;
}           
.avatar{
        width: 25%;
        border-radius:50%;
}                    
.container1{
        padding: 18px;
}
input[type=text], input[type=password] {
        width: 55%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
}  
.button {
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 40%;
}
.button:hover {
        opacity: 0.8;
}            
</style>

    </head>
    <body>
        <div class="container">
        
        <header>
            <center><img src="images/pks-logo.png" alt="" width="240" height="110"></center>
        </header>

    <center>
        <h2>Admin Login</h2>
      
        <form  method="post" action="" id="newForm" name="myForm">
            <div class="imgcontainer">
            <img class="avatar" src="images/avatar.png" >
            </div>
            
            <div class ="container1">
            Username<br> 
            <input type="text" name="username" required/><br><br>
            Password<br> 
            <input type="password" name="password" pattern=".{0}|.{8,}" required title="Wrong format, should contain atleast 8 character" required/><br><br>
            <input type="submit" value="Login" class="button"  /> 
            <input type="reset" value ="Reset" class="button"/>  
           </form>
        </div> 
          
    </center>
    
    <%
    try {
        String name = request.getParameter("username");
        String pass = request.getParameter("password");
    %>
    <%
        if(!(name == null || (name.equals(""))))
        if(name.equals("PKSVMSadmin") && pass.equals("PksVms05"))
         {
           response.sendRedirect("appointmentList.jsp");
   
           }
        else
        {
          out.println("<center>Login failed: Invalid username or password.</center>");
          out.println("<center>Please try again.</center>"); 
        }
    }

    catch (Exception e) {
          out.println("Something went wrong !! Please try again.");
          }
    

    %>
    </body>
     
    </script>
</html>