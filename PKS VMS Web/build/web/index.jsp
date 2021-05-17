<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html class="no-js oldie ie8" lang="en"> 
<head>

   <!--- basic page needs
   ================================================== -->
   <meta charset="utf-8">
	<title>PKS Visitor Management System</title>
	<meta name="description" content="">  
	<meta name="author" content="">

   <!-- mobile specific metas
   ================================================== -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

 	<!-- CSS
   ================================================== -->
   <link rel="stylesheet" href="css/base.css">  
   <link rel="stylesheet" href="css/main.css">
   <link rel="stylesheet" href="css/vendor.css">     

   <!-- script
   ================================================== -->
	<script src="js/modernizr.js"></script>

</head>

<body id="top">
    
    <!-- header 
   ================================================== -->
   <header>

   	<div class="row">

	   	<nav id="main-nav-wrap">
				<ul class="main-navigation">
					<li class="current"><a class="smoothscroll"  onClick="window.location='index.jsp'">HOME</a></li>
					<li><a class="smoothscroll"  href="#features">ABOUT US</a></li>
					<li><a class="smoothscroll"  href="#pricing">CONTACT US</a></li>				
				</ul>
			</nav>

			<a class="menu-toggle" href="#"><span>Menu</span></a>
   		
   	</div>   	
   	
   </header> <!-- /header -->

	<!-- intro section
   ================================================== -->
   <section id="intro">

   	<div class="shadow-overlay"></div>

   	<div class="intro-content">
   		<div class="row">

   			<div class="col-twelve">
	   				<img src="images/pks logo.png" alt="">
	   			</div>

	   			<h5>Welcome to PKS Visitor Management System.</h5>

                                <input type="button" name="visitor" value="Visitor" onClick="window.location='visitorAppointment.jsp'" style="height:65px;width:160px;font-size:20px;" class="button.large"><br>
                                <input type="button" name="admin" value="Admin" onClick="window.location='adminLogin.jsp'" style="height:65px;width:160px;font-size:20px;" class="button.large"><br>
                                
	   		</div>  
   			
   		</div>   		 		

   </section> <!-- /intro -->


   <!-- features Section
   ================================================== -->
	<section id="features">

		<div class="row section-intro">
   		<div class="col-twelve with-bottom-line">

   			<h1>About</h1>

                        <p class="lead">The PKS Visitor Management System help security comitee in Politeknik Kuching Sarawak (PKS) to manage visitor incoming and outgoing activities.</p>
                        <p class="lead">This system act as a brand new contactless solution for streamlining administration processes for the visitor to make an appointment before they come to PKS.</p>
   		</div>   		
   	</div>
		
	</section> <!-- /features -->
	

	 <section id="pricing">

   	<div class="row section-intro">
   		<div class="col-twelve with-bottom-line">

   			<h1>Contact Us</h1>

                        <p class="lead"><img src="images/pks-logo.png" alt="" width="170"></p>
                        
                        <p>
		        	Politeknik Kuching Sarawak
                                  KM 22, Jalan Matang,
                                 93050, Kuching, Sarawak<br>
                                 
                                info@www.poliku.edu.my </p>
                           <p>  082-845 596  </p>

   		</div>   		
   	</div>


   </section> <!-- /pricing --> 

   <div id="preloader"> 
    	<div id="loader"></div>
   </div>


   <!-- Java Script
   ================================================== --> 
   <script src="js/jquery-1.11.3.min.js"></script>
   <script src="js/jquery-migrate-1.2.1.min.js"></script>
   <script src="js/plugins.js"></script>
   <script src="js/main.js"></script>
   
   </body>
</html>