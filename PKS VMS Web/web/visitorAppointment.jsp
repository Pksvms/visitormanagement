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
					<li><a class="smoothscroll"  href="#process">APPOINTMENT</a></li>
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

	   			<h5>Welcome to PKS Visitor Management System</h5>

	   			<a class="button" href="#process" title="">Book appointment</a>

	   		</div>  
   			
   		</div>   		 		
   	</div> 

   </section> <!-- /intro -->


   <!-- Process Section
   ================================================== -->
   <section id="process">  

   	<div class="row section-intro">
   		<div class="col-twelve with-bottom-line">

   			<script>
function yesnoCheck() {
    if (document.getElementById('yesCheck').checked) {
        document.getElementById('ifYes').style.visibility = 'visible';
    }
    else document.getElementById('ifYes').style.visibility = 'hidden';
    } 

</script>

    <center>
        <div class="form">
        <h1>Visitor Appointment</h1>
        <form method="post" action="appointmentProcess.jsp">

            <br>Full Name<br>
            <input type="text" name="fullname" size="30" required>
               
            <br>IC Number<br>
            <input type="text" name="icnum" size="30" required>
            
            <br>Contact Number<br>
            <input type="text" name="contactno" size="30" required>
                 
            <br>Email Address<br>
            <input type="text" name="email" size="30" required>
            
            <br>Car Plate Number<br>
            <input type="text" name="carplate" size="30" required>

            <br>Select an appointment date<br>
            <input type="date" name="appointmentdate" required>
            
            <br>Purpose<br>
            <select name="purpose">
                <option value="To fetch staff or student">To fetch staff or student</option>
                <option value="Business purpose">Business purpose</option>
                <option value="Delivery item">Delivery item</option>
                <option value="Meet someone">Meet someone</option>
            </select><br>
            
            <br>State the person that you want to meet.(optional)<br>
            <input type="text" name="peoplemeet" size="30">
            
            <br>Select the place that you want to visit(building).<br>
            <select name="place" id='place'>
                <option value="Asrama perempuan">Asrama perempuan</option>
                <option value="Asrama lelaki">Asrama lelaki</option>
                <option value="Bangunan pentadbiran">Bangunan Pentadbiran</option>
                <option value="Bangunan Staff">Bangunan Staff</option> 
                <option value="Bilik Kuliah Blok C">Bilik Kuliah Blok C</option>
                <option value="Bilik Kuiah Pentagon">Bilik Kuliah Pentagon</option> 
                <option value="Cafeteria">Cafeteria</option>
                <option value="Cybercafe">Cybercafe</option>
                <option value="GMart">GMart</option>
                <option value="Jabatan Kejuruteraan Awam(JKA)">Jabatan Kejuruteraan Awam (JKA)</option>
                <option value="Jabatan Kejuteraan Mekanikal(JKM)">Jabatan Kejuteraan Mekanikal(JKM)</option>
                <option value="Jabatan Kejuteraan Petrokimia (JKPK)">Jabatan Kejuteraan Petrokimia (JKPK)</option>
                <option value="Jabatan Kejuteraan Elektrik (JKE)">Jabatan Kejuteraan Elektrik (JKE)</option>
                <option value="Jabatan Matematik Sains & Komputer (JMSK)">Jabatan Matematik Sains & Komputer (JMSK)</option>
                <option value="Jabatan Teknologi Maklumat & Komunikasi (JTMK)">Jabatan Teknologi Maklumat & Komunikasi (JTMK)</option>
                <option value="Jabatan Pengajian Am (JPA)">Jabatan Pengajian Am (JPA)</option>
                <option value="Jabatan Perdagangan (JP)">Jabatan Perdagangan (JP)</option>
                <option value="Jabatan Sukan Ko-Kurikulum dan Kebudayaan (JSKK)">Jabatan Sukan Ko-Kurikulum dan Kebudayaan (JSKK)</option>
                <option value="Kantin">Kantin</option>
                <option value="Masjid">Masjid</option>
                <option value="Pejabat Penyelia Asrama">Pejabat Penyelia Asrama</option>
                <option value="Perpustakaan">Perpustakaan</option>
            </select><br>
                
            <br>Do you have one or more of the following symptoms? Please mark "/" in the corresponding box.<br>
            <input type="checkbox" name="symptoms" value="Fever">
            Fever<br>
            <input type="checkbox" name="symptoms" value="Chill">
            Chill<br>
            <input type="checkbox" name="symptoms" value="Cough">
            Cough<br>
            <input type="checkbox" name="symptoms" value="Sore throat">
            Sore throat<br>
            <input type="checkbox" name="symptoms" value="Runny nose">
            Runny Nose<br>
            <input type="checkbox" name="symptoms" value="Difficulty in breathing">
            Difficulty in breathing<br>
            <input type="checkbox" name="symptoms" value="None">
            NONE of the above<br>
            
            <br>Have you been to other countries over the past 30 days ?<br>
            <input type="radio" name="travel" value="Yes" onclick="javascript:yesnoCheck();" id="yesCheck">
            Yes<br>
            <input type="radio" name="travel" value="No" onclick="javascript:yesnoCheck();" id="noCheck">
            No<br>
              
            <div id="ifYes" style="visibility:hidden"><br><br>If yes, which country that have you visited ?<br>
            <select name="countries" id='yes'>
                <option value="No">
                <option value="Afghanistan">Afghanistan</option>
                <option value="Aland Islands">Aland Islands</option>
                <option value="Albania">Albania</option>
                <option value="American Samoa">American Samoa</option>
                <option value="Andorra">Andorra</option>
                <option value="Angola">Angola</option>
                <option value="Anguilla">Anguilla</option>
                <option value="Antarctica">Antarctica</option>
                <option value="Antigua and Barbuda">Antigua and Barbuda</option>
                <option value="Argentina">Argentina</option>
                <option value="Armenia">Armenia</option>
                <option value="Aruba">Aruba</option>
                <option value="Australia">Australia</option>
                <option value="Austria">Austria</option>
                <option value="Azerbaijin">Azerbaijin</option>
                <option value="Baden">Baden</option>
                <option value="Bahamas">Bahamas</option>
                <option value="Bahrain">Bahrain</option>
                <option value="Bangladesh">Bangladesh</option>
                <option value="Barbados">Barbados</option>
                <option value="Bavaria">Bavaria</option>
                <option value="Belarus">Belarus</option>
                <option value="Belgium">Belgium</option>
                <option value="Belize">Belize</option>
                <option value="Benin">Benin</option>
                <option value="Bolivia">Bolivia</option>
                <option value="Bosnia and Herzegovina">Bosnia and Herzegovina</option>
                <option value="Botswana">Botswana</option>
                <option value="Brazil">Brazil</option>
                <option value="Brunei">Brunei</option>
                <option value="Brunswick and Lüneburg">Brunswick and Lünerburg</option>
                <option value="Bulgaria">Bulgaria</option>
                <option value="Burkina Faso">Burkina Faso</option>
                <option value="Burma">Burma</option>
                <option value="Burundi">Burundi</option>
                <option value="Cabo Verde">Cabo Verde</option>
                <option value="Cambodia">Cambodia</option>
                <option value="Cameroon">Cameroon</option>
                <option value="Canada">Canada</option>
                <option value="Cayman Islands">Cayman Islands</option>
                <option value="Central African Republic">Central African Republic</option>
                <option value="Central American Federation">Central American Federation</option>
                <option value="Chad">Chad</option>
                <option value="Chile">Chile</option>
                <option value="China">China</option>
                <option value="Colombia">Colombia</option>
                <option value="Comoros">Comoros</option>
                <option value="Congo Free State">Congo Free State</option>
                <option value="Costa Rica">Consta Rica</option>
                <option value="Cote d’Ivoire">Cote d'Ivoire</option>
                <option value="Croatia">Croatia</option>
                <option value="Cuba">Cuba</option>
                <option value="Cyprus">Cyprus</option>
                <option value="Czechia">Czechia</option>
                <option value="Czechoslovakia">Czechoslovakia</option>
                <option value="Democratic Republic">Democratic Republic</option>
                <option value="Denmark">Denmark</option>
                <option value="Djibouti">Djibouti</option>
                <option value="Dominica">Dominica</option>
                <option value="Dominican Republic">Dominican Republic</option>
                <option value="Duchy of Parma">Duchy of Parma</option>
                <option value="East Germany">East Germany</option>
                <option value="Ecuador">Ecuador</option>
                <option value="Egypt">Egypt</option>
                <option value="El Salvador">El Salvador</option>
                <option value="Equatorial Guinea">Equatorial Guinea</option>
                <option value="Eritrea">Eritrea</option>
                <option value="Estonia">Estonia</option>
                <option value="Eswatini">Eswatini</option>
                <option value="Ethiopia">Ethiopia</option>
                <option value="Falkland Islands">Falkland Islands</option>
                <option value="Faroe Islands">Faroe Islands</option>
                <option value="Fiji">Fiji</option>
                <option value="Finland">Finland</option>
                <option value="France">Frances</option>
                <option value="French Guiana">French Guiana</option>
                <option value="French Polynesia">French Polynesia</option>
                <option value="French Southern Territories">French Southern Territories</option>
                <option value="Gabon">Gabon</option>
                <option value="The Gambia">The Gambia</option>
                <option value="Georgia">Georgia</option>
                <option value="Germany">Germany</option>
                <option value="Ghana">Ghana</option>
                <option value="Gibraltar">Gibraltar</option>
                <option value="Greece">Greece</option>
                <option value="Greenland">Greenland</option>
                <option value="Grenada">Grenada</option>
                <option value="Guadeloupe">Guadeloupe</option>
                <option value="Guam">Guam</option>
                <option value="Guatemala">Guatemala</option>
                <option value="Guinea">Guinea</option>
                <option value="Guinea Bissau">Guinea Bissau</option>
                <option value="Guyana">Guyana</option>
                <option value="Haiti">Haiti</option>
                <option value="Holy See">Holy See</option>
                <option value="Honduras">Honduras</option>
                <option value="Hong Kong">Hong Kong</option>
                <option value="Hungary">Hungary</option>
                <option value="Iceland">Iceland</option>
                <option value="India">India</option>
                <option value="Indonesia">Indonesia</option>
                <option value="Iran">Iran</option>
                <option value="Iraq">Iraq</option>
                <option value="Ireland">Ireland</option>
                <option value="Israel">Israel</option>
                <option value="Italy">Italy</option>
                <option value="Ivory Coast">Ivory Coast</option>
                <option value="Jamaica">Jamaica</option>
                <option value="Japan">Japan</option>
                <option value="Jordan">Jordan</option>
                <option value="Kazakhstan">Kazakhstan</option>
                <option value="Kenya">Kenya</option>
                <option value="Kiribati">Kiribati</option>
                <option value="North Korea">North Korea</option>
                <option value="South Korea">South Korea</option>
                <option value="Kosovo">Kosovo</option>
                <option value="Kuwait">Kuwait</option>
                <option value="Kyrgyzstan">Kyrgyzstan</option>
                <option value="Lao">Lao</option>
                <option value="Latvia">Latvia</option>
                <option value="Lebanon">Lebanon</option>
                <option value="Lesotho">Lesotho/option>
                <option value="Liberia">Liberia</option>
                <option value="Libya">Libya</option>
                <option value="Liechtenstein">Liechtenstein</option>
                <option value="Lithuania">Lithuania</option>
                <option value="Luxembourg">Luxembourg</option>
                <option value="Macau">Macau</option>
                <option value="Madagascar">Madagascar</option>
                <option value="Malawi">Malawi</option>
                <option value="Maldives">Maldives</option>
                <option value="Mali">Mali</option>
                <option value="Malta">Malta</option>
                <option value="Marshall Islands">Faroe Islands</option>
                <option value="Martinique">Martinique</option>
                <option value="Mauritania">Mauritania</option>
                <option value="Mauritius">Mauritius</option>
                <option value="Mayotte">Mayotte</option>
                <option value="Mexico">Mexico</option>
                <option value="Micronesia">Micronesia</option>
                <option value="Moldova">Moldova</option>
                <option value="Monaco">Monaco</option>
                <option value="Mongolia">Mongolia</option>
                <option value="Montenegro">Montenegro</option>
                <option value="Montserrat">Montserrat</option>
                <option value="Morocco">Morocco</option>
                <option value="Mozambique">Mozambique</option>
                <option value="Myanmar">Myanmar</option>
                <option value="Namibia">Namibia</option>
                <option value="Nauru">Nauru</option>
                <option value="Nepal">Nepal</option>
                <option value="Netherlands">Netherlands</option>
                <option value="Netherlands Antilles">Netherlands Antilles</option>
                <option value="New Caledonia">New Caledonia</option>
                <option value="New Zealand">New Zealand</option>
                <option value="Nicaragua">Nicaragua</option>
                <option value="Niger">Niger</option>
                <option value="Nigeria">Nigeria</option>
                <option value="Niue">Niue</option>
                <option value="North Macedonia">North Macedonia</option>
                <option value="Northern Mariana Islands">Northern Mariana Islands</option>
                <option value="Norway">Norway</option>
                <option value="Oman">Oman</option>
                <option value="Pakistan">Pakistan</option>
                <option value="Palau">Palau</option>
                <option value="Palestinian territories">Palestinian territories</option>
                <option value="Panama">Panama</option>
                <option value="Papua New Guinea">Papua New Guinea</option>
                <option value="Paraguays">Paraguay</option>
                <option value="Peru">Peru</option>
                <option value="Philippines">Philippines</option>
                <option value="Pitcairn Island">Pitcairn Island</option>
                <option value="Poland">Poland</option>
                <option value="Portugal">Portugal</option>
                <option value="Puerto Rico">Puerto Rico</option>
                <option value="Qatar">Qatar</option>
                <option value="Reunion Island">	Reunion Island</option>
                <option value="Romania">Romania</option>
                <option value="Russian Federation">Russian Federation</option>
                <option value="Rwanda">Rwanda</option>
                <option value="Saint Kitts and Nevis">Saint Kitts and Nevis</option>
                <option value="Saint Lucia">Saint Lucia</option>
                <option value="Saint Vincent and the Grenadines">Saint Vincent and the Grenadines</option>
                <option value="Samoa">Samoa</option>
                <option value="San Marino">San Marino</option>
                <option value="Sao Tome and Principe">Sao Tome and Principe</option>
                <option value="Saudi Arabia">Saudi Arabia</option>
                <option value="Senegal">Senegal</option>
                <option value="Serbia">Serbia</option>
                <option value="Seychelles">Seychelles</option>
                <option value="Sierra Leone">Sierra Leone</option>
                <option value="Singapore">Singapore</option>
                <option value="Slovakia">Slovakia</option>
                <option value="Slovenia">Slovenia</option>
                <option value="Solomon Islandss">Solomon Islands</option>
                <option value="Somalia">Somalia</option>
                <option value="South Africa">South Africa</option>
                <option value="South Korea">South Korea</option>
                <option value="Spain">Spain</option>
                <option value="Sri Lanka">Sri Lanka</option>
                <option value="Sudan">Sudan</option>
                <option value="Suriname">Suriname</option>
                <option value="Swaziland">Swaziland</option>
                <option value="Sweden">Sweden</option>
                <option value="Switzerland">Switzerland</option>
                <option value="Syria">Syria</option>
                <option value="Taiwan">Taiwan</option>
                <option value="Tajikistans">Tajikistan</option>
                <option value="Tanzania">Tanzania</option>
                <option value="Thailand">Thailand</option>
                <option value="Tibet">Tibet</option>
                <option value="Timor Leste">Timor Leste</option>
                <option value="Togo">Togo</option>
                <option value="Tokelau">Tokelau</option>
                <option value="Tonga">Tonga</option>
                <option value="Trinidad and Tobago">Trinidad and Tobago</option>
                <option value="Tunisia">Tunisia</option>
                <option value="Turkey">Turkey</option>
                <option value="Turkmenistan">Turkmenistan</option>
                <option value="Turks and Caicos Islands">Turks and Caicos Islands</option>
                <option value="Tuvalu">Tuvalu</option>
                <option value="Uganda">Uganda</option>
                <option value="Ukraine">Faroe Islands</option>
                <option value="United Arab Emirates">United Arab Emirates</option>
                <option value="United Kingdom">United Kingdom</option>
                <option value="United States">United States</option>
                <option value="Uruguay">Uruguay</option>
                <option value="Uzbekistan">Uzbekistan</option>
                <option value="Vanuatu">Vanuatu</option>
                <option value="Vatican City State">Vatican City State</option>
                <option value="Venezuela">Venezuela</option>
                <option value="Vietnam">Vietnam</option>
                <option value="Virgin Islands">Virgin Islands</option>
                <option value="Wallis and Futuna Islands">Wallis and Futuna Islands</option>
                <option value="Western Sahara">Western Sahara</option>
                <option value="Yemen">Yemen</option>
                <option value="Zambia">Zambia</option>
                <option value="Zimbabwe">Zimbabwe</option>    
            </select>
            </div><br>
                        

            <input type="submit" value="Submit"  style="height:45px;width:115px;font-size:16px;" class="button">
            <input type="reset" value="Reset"  style="height:45px;width:115px;font-size:16px;" class="button">
            

            <br><br><br><br>
           
        </form>
    </center>

</div> <!-- /process-content --> 

   </section> <!-- /process-->    

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
	

	<!-- pricing
   ================================================== -->

   <section id="pricing">

   	<div class="row section-intro">
   		<div class="col-twelve with-bottom-line">
   			<h1>Contact Us</h1>

                        <p class="lead"><img src="images/pks-logo.png" alt="" style="width:150px"></p>
                        
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