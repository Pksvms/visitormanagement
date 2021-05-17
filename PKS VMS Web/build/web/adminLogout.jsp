<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>

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
	top: 2%;
	text-align: center;	
}

header{
        padding:5px;
}               
form {
        border: 3px solid #f1f1f1;
        background-color: white;
        width:35%;
        margin-left:33%;
}            
.imgcontainer{
        text-align: center;
        margin:45px 0px 35px 0px;
}            
.avatar{
        width: 35%;
        border-radius:50%;
}                     
.container1{
        padding: 25px;
}                   
.button {
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 40%;
        border-radius: 12px;
}
.button:hover {
        opacity: 0.8;
}                                
</style>
                    
    </head>
    <body>
        <div class="container">
        
        <header>
            <center><img src="images/pks-logo.png" alt="" width="250" height="120"></center>
        </header> <br><br>
        
        <form>
        <center>
        <div class="imgcontainer">
            <img class="avatar" src="images/logout.png">
        </div>
                
        <div class ="container1">
        <h2>You are successfully logged out!</h2><br><br><br>      
        <input type="button" class="button" value="Back to login page" onClick="window.location='adminLogin.jsp'">
        </form>
        </div>
        </center>
    </div>
</body>
</html>
