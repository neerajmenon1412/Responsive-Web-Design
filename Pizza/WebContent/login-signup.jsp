<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimal-ui">
		<title>Peri Peri, Log in / Sign up</title>

    	<link href="favicon.png" type="image/x-icon" rel="shortcut icon">
		<link href="assets/css/master.css" rel="stylesheet">
		<script src="assets/plugins/jquery/jquery-1.11.3.min.js"></script>
<title>Insert title here</title>

	<script type="text/javascript">
			function validate()
			{
				document.getElementById("postcodeerror").style.visibility = "hidden";
				document.getElementById("post").style.border="";
				
				if(document.getElementById("addre").checked = true)
				{
					if(isNaN(document.signupform.postcode.value) || document.signupform.postcode.value.length != 6)
					{
						if(document.signupform.phone.value.length == 10)
						{
							document.getElementById("phoneno").style.border="";
							document.getElementById("phoneerror").style.visibility = "hidden";
						}	
						
						document.getElementById("post").style.border="1px solid #dd1037";
						document.getElementById("postcodeerror").style.visibility = "visible";
						document.signupform.postcode.focus();
						return false;
					}
				
					if(isNaN(document.signupform.phone.value) || document.signupform.phone.value.length != 10)
					{
						document.getElementById("phoneno").style.border="1px solid #dd1037";
						document.getElementById("phoneerror").style.visibility = "visible";
						document.signupform.phone.focus();
						return false;
					}
					else
					{
						document.getElementById("phoneno").style.border="";
						document.getElementById("phoneerror").style.visibility = "hidden";
					}
					
					if(document.getElementById("pwd").value.length < 6)
					{
						document.getElementById("pwderror").innerHTML = "Password must contain at least six characters";
						document.getElementById("pwd").style.border="1px solid #dd1037";
						document.getElementById("pwderror").style.visibility = "visible";
						return false;
					}
					
					re = /[0-9]/;
					if(!re.test(document.getElementById("pwd").value))
					{
						document.getElementById("pwderror").innerHTML = "Password must contain at least one digit";
						document.getElementById("pwd").style.border="1px solid #dd1037";
						document.getElementById("pwderror").style.visibility = "visible";
						return false;
					}
					
					re = /[a-z]/;
					if(!re.test(document.getElementById("pwd").value))
					{
						document.getElementById("pwderror").innerHTML = "Password must contain at least one lowercase letter";
						document.getElementById("pwd").style.border="1px solid #dd1037";
						document.getElementById("pwderror").style.visibility = "visible";
						return false;
					}
					
					re = /[A-Z]/;
					if(!re.test(document.getElementById("pwd").value))
					{
						document.getElementById("pwderror").innerHTML = "Password must contain at least one uppercase letter";
						document.getElementById("pwd").style.border="1px solid #dd1037";
						document.getElementById("pwderror").style.visibility = "visible";
						return false;
					}
				}
			}
	</script>
</head>
<body>
<!-- Loader -->
		<div id="page-preloader"><span class="spinner"></span></div>
		<!-- Loader end -->


		<div class="layout-theme animated-css" id="wrapper" data-header="sticky" data-header-top="200">

			<div id="sb-site">

				<div class="wrap-content">


					<!-- HEADER -->
					<header class="header clearfix">
						<div class="header__wrap">
							<span class="sb-toggle-left"><i class="icon pe-7s-menu"></i></span>
							<a class="logo" href="http://localhost:8080/Pizza/"><img class="img-responsive" src="assets/img/logo_mod-a.png" alt="Logo"></a>
						</div>
					</header>
					<!-- end header -->

					<div class="section-title">
						<div class="container">
							<div class="row">
								<div class="col-xs-12">
									<div class="section__inner">
										<h1 class="ui-title-page">Log in / Sign up</h1>
										<ol class="breadcrumb">
											<li><a href="http://localhost:8080/Pizza/">Home</a></li>
											<li class="active">Login - Signup</li>
										</ol>
									</div>
									<!-- end section__inner -->
								</div>
								<!-- end col -->
							</div>
							<!-- end row -->
						</div>
						<!-- end container -->
					</div>
					<!-- end section-title -->


					<div class="section_mod-f">
						<div class="container">
							<div class="row">
								<div class="col-md-8">
									<!-- <form class="comment-reply-form" id="comment-reply-form" action="#" method="get"> -->
									<!-- <form class="comment-reply-form" id="comment-reply-form" action="s" method="post"> -->
										<section class="section-area">

											<br>
											<br>
					<!-- Checkbox Selection -->
<script type="text/javascript">
        $(function () {
            $("#addre").click(function () {
                if ($(this).is(":checked")) {
                    $("#dvPassport").hide();
					$("#dvPassportx").show();
                } else {
                    $("#dvPassport").show();
					$("#dvPassportx").hide();
                }
            });
        });
</script>

	<form class="comment-reply-form" id="comment-reply-form" action="login" method="post">
	<div id="dvPassport">
       											<h2 class="ui-title-inner ui-title-inner_mod-a">Login</h2>
											 <% String email = (String)session.getAttribute("email");
												if(email != "fail")
												{%>
													<div class="row">
														<div class="col-md-6">
															<label class="ui-form-label">EMAIL ADDRESS *</label>
															<input class="form-control" type="email" name="uemail" required>
														</div>
													</div>
													<div class="row">
														<div class="col-md-6">
															<label class="ui-form-label">PASSWORD *</label>
															<input class="form-control" type="password" name="upass" required>
														</div>
													</div>
												<%}
												else
												{%>
													<div class="row">
														<div class="col-md-6" >
															<label class="ui-form-label">EMAIL ADDRESS *</label>
															<input style="border: 1px solid #dd1037;" class="form-control" type="email" name="uemail" required>
														</div>
													</div>
													<div class="row">
														<div class="col-md-6">
															<label class="ui-form-label">PASSWORD *</label>
															<input style="border: 1px solid #dd1037;" class="form-control" type="password" name="upass" required>
														</div>
													</div>
												<%}
												
												if(email == "fail")
												{%>
													<div class="row">
													<div class="col-md-6" style="color:#dd1037;">The email or password you have entered does not match.</div>
													</div>
												<%}
											%>
											
											<!-- <button class="comment-reply-form__btn ui-btn ui-btn-primary btn-effect" type="submit">Login</button> -->
											<input type="submit" class="comment-reply-form__btn ui-btn ui-btn-primary btn-effect" value="Submit">
											
    </div>
	<input class="forms__check hidden" type="checkbox" id="addre"  value="">
    <label class="forms__label forms__label-check forms__label-check_mod-a" for="addre">Not a member yet? Join Now.</label>
    <hr />
			<%
				String exist = (String)session.getAttribute("exist");
    			if(exist == "true")
    			{%>
    				<div class="row">
    				<!-- <div class="col-md-6" style="color:#D94F2B;">email already exist</div> -->
    				<h2 class="ui-title-inner ui-title-inner_mod-a" style="color:#D94F2B;">This email id already exists!</h2>
    				</div>
    			<%}
			%>
				
	
    </form>

	
	<div id="dvPassportx" style="display: none">
	<form class="comment-reply-form" name="signupform" id="comment-reply-form" action="signup" method="post" onsubmit="return validate()">
        									
        									<h2 class="ui-title-inner ui-title-inner_mod-a">Sign Up</h2>
											<br>
											<div class="row">
												<div class="col-md-6">
													<label class="ui-form-label">FIRST NAME *</label>
													<input class="form-control" type="text" name="fname" required >
												</div>
												<div class="col-md-6">
													<label class="ui-form-label">LAST NAME *</label>
													<input class="form-control" type="text" name="lname" required >
												</div>
											</div>
											<label class="ui-form-label">ADDRESS *</label>
											<input class="form-control form-control_second" type="text" placeholder="Street address" name="street"required >
											<input class="form-control" type="text" placeholder="Apartment, suite, unit etc." name="apartment" required >
											<label class="ui-form-label">TOWN / CITY *</label>
											<input class="form-control" type="text" placeholder="Town / City" name="town" required >
											<div class="row">
												<div class="col-md-6">
													<label class="ui-form-label">POSTCODE *</label>
													<!-- <input class="form-control" type="text" placeholder="Postcode / Zip" name="postcode"> -->
													<input class="form-control" type="text" name="postcode" placeholder="Postcode / Zip" id="post" required>
													<label for="postcode" id="postcodeerror" style="visibility: hidden; color: #dd1037;"><b>Please provide valid postcode</b></label>
												</div>
												<div class="col-md-6">
													<label class="ui-form-label">PHONE *</label>
													<!-- <input class="form-control" type="text" name="phone"> -->
													<input class="form-control" type="text" name="phone" id="phoneno" required>
													<label for="phone" id="phoneerror" style="visibility: hidden; color: #dd1037;"><b>Please provide valid phone</b></label>
												</div>
											</div>
											<div class="row">
											<div class="col-md-6">
													<label class="ui-form-label">EMAIL ADDRESS *</label>
													<input class="form-control" type="email" name="email" required>
											</div>
											</div>
											<div class="row">
											<div class="col-md-6">
													<label class="ui-form-label">PASSWORD *</label>
													<input class="form-control" type="password" name="password" id="pwd" required>
													<b><label for="password" id="pwderror" style="visibility: hidden; color: #dd1037;"></label></b>
											</div>
											</div>
											<!-- <button class="comment-reply-form__btn ui-btn ui-btn-primary btn-effect" type="submit">Signup</button> -->
											<input type="submit" class="comment-reply-form__btn ui-btn ui-btn-primary btn-effect">
											
</form>
    </div>
    
    											
												
											

					
										</section>
										<!-- </form> -->
										<!-- end section -->


									
								</div>
								<!-- end col -->

								<div class="col-md-4">
									<div class="section-contact">
										<section class="contact-block">
											<h3 class="contact-block__title ui-title-inner">Get in Touch</h3>
											<div class="contact-block__inner">Phone: <span class="color_primary">+91 9664356445 </span></div>
											<div class="contact-block__inner">Email: <span class="color_primary">akkipatil1994@gmail.com</span></div>										
										</section>
										<section class="contact-block">
											<h3 class="contact-block__title ui-title-inner">Store Address</h3>
											<div class="contact-block__info">Shankar Smurti Bldg </div>
											<div class="contact-block__inner">Plot no.:506, Sec:22 </div>
											<div class="contact-block__inner">Turbhe, Navi Mumbai</div>
										</section>
									</div>
									
								</div>
								<!-- end col -->
								
							</div>
							<!-- end row -->
						</div>
						<!-- end container -->
					</div>
					<!-- end section_mod-b -->
					
					

					<section class="section-subscribe">
						<form class="form-subscribe" action="subscribe" method="post">
							<div class="container">
								<div class="row">
									<div class="col-xs-12">
										<h2 class="ui-title-block ui-title-block_mod-a form-subscribe__title">Sign up for the newsletter and get exclusive deals.</h2>
										<input class="form-control" type="email" placeholder="Enter your email address" name="subscribe_email" required>
										<input type="hidden" name="page" value="lo-si">
										<button class="ui-btn ui-btn_mod-c btn-effect btn-effect" type="submit">subscribe</button>
									</div>
									<!-- end col -->
								</div>
								<!-- end row -->
							</div>
							<!-- end container -->
						</form>
						<!-- end footer-form -->
					</section>
					<!-- end section-subscribe -->		
					<footer class="footer">
						<div class="copyright border-top">
							<div class="container">
								<div class="row">
									<div class="col-xs-12">
										<div class="text-center">Copyright ? 2016 <a class="copyright__link" href="">Peri Peri.</a> All rights reserved.</div>
									</div>
								</div>
							</div>
						</div><!-- end copyright -->
					</footer>
					
				</div>
				<!-- end wrap-content -->

			</div>
			<!-- end #sb-site -->


			<div class="sb-slidebar sb-left">
				<nav class="main-nav">
					<ul class="navig-menu list-unstyled">
						<li class="navig-menu__item">
							<a class="navig-menu__link" href="http://localhost:8080/Pizza/">Home</a>
						</li>
						<li class="navig-menu__item">
							<a class="navig-menu__link" href="shop-catalog.jsp">Pizza menu</a>
						</li>
						<li class="navig-menu__item">
							<a class="navig-menu__link" href="about.html">about us</a>
						</li>
						<li class="navig-menu__item">
							<a class="navig-menu__link" href="contactus.jsp">contact</a>
						</li>
					</ul>
				</nav>
				<!-- end main-nav -->

				<div class="border-bottom"></div>
				<%
					if(email == null || email == "fail")
					{	session.setAttribute("email", null);
					%>
						<a class="link-account" href="login-signup.jsp">login</a>
					<%}
					else
					{%>
						<!-- <a class="link-account" onclick="logout()" href="http://localhost:8080/Pizza/">log out</a> -->
						<a class="link-account" href="logout.jsp">log out</a>
					<%}
				%>
			</div>
			<!-- end sb-left -->

			

		</div>
		<!-- end layout-theme -->



		<!-- SCRIPTS MAIN -->

		<script src="assets/js/jquery-migrate-1.2.1.js"></script>
		<script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
		<script src="assets/js/waypoints.min.js"></script>
		<script src="../../cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
		<script src="assets/js/modernizr.custom.js"></script>
		<script src="assets/js/cssua.min.js"></script>


		<!--SCRIPTS THEME-->

		<!-- Sidebar -->
		<script src="assets/plugins/slidebars/dist/slidebars.js"></script>
		<!-- Home slider -->
		<script src="assets/plugins/slider-pro/dist/js/jquery.sliderPro.js"></script>
		<!-- Sliders -->
		<script src="assets/plugins/owl-carousel/owl.carousel.min.js"></script>
		<!-- Isotope -->
		<script src="assets/plugins/isotope/isotope.pkgd.min.js"></script>
		<!-- Modal -->
		<script src="assets/plugins/prettyphoto/js/jquery.prettyPhoto.js"></script>
		<!-- Date select -->
		<script src="assets/plugins/datetimepicker/jquery.datetimepicker.js"></script>
		<!-- Select customization -->
		<script src="assets/plugins/bootstrap-select/dist/js/bootstrap-select.js"></script>
		<!-- Price slider -->
		<script src="assets/plugins/nouislider/jquery.nouislider.all.min.js"></script>
		<!-- Chart -->
		<script src="assets/plugins/rendro-easy-pie-chart/dist/jquery.easypiechart.min.js"></script>
		<!-- Animation -->
		<script src="assets/js/wow.min.js"></script>

		<!-- Custom -->
		<script src="assets/js/custom.js"></script>

</body>
</html>