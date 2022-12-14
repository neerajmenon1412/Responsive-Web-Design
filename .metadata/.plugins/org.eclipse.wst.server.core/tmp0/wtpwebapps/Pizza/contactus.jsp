<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimal-ui">
		<title>Peri Peri, Contact Us</title>

    	<link href="favicon.png" type="image/x-icon" rel="shortcut icon">
		<link href="assets/css/master.css" rel="stylesheet">
		<script src="assets/plugins/jquery/jquery-1.11.3.min.js"></script>
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
										<h1 class="ui-title-page">Contact Us</h1>
										<ol class="breadcrumb">
											<li><a href="http://localhost:8080/Pizza/">Home</a></li>
											<li class="active">Contact</li>
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


					<div class="section_mod-b">
						<div class="container">
							<div class="row">

								<div class="col-md-8">
									<h3 class="ui-title-inner ui-title-inner_mod-a">Feel free to contact us with any questions!</h3>
									<p>If you have questions or comments, please get a hold of us in whichever way is most convenient.</p>
									<form class="comment-reply-form" id="comment-reply-form" action="contact" method="post">
										<div class="row">
											<div class="col-md-6">
												<label class="comment-reply-form__title ui-form-label">YOUR NAME *</label>
												<input class="form-control" type="text" id="comment-author" name="contactname" required >
											</div>
											<div class="col-md-6">
												<label class="comment-reply-form__title ui-form-label">EMAIL *</label>
												<input class="form-control" type="email" id="comment-email" name="contactemail" required>
											</div>
										</div>
										<label class="comment-reply-form__title ui-form-label">SUBJECT</label>
										<input class="form-control" type="text" id="comment-website" name="contactsubject" required>
										<label class="comment-reply-form__title ui-form-label">YOUR MESSAGE</label>
										<textarea class="form-control" id="comment-text" name="contactmsg" rows="6" required></textarea>
										<button class="comment-reply-form__btn ui-btn ui-btn-primary btn-effect">send message</button>
									</form>
									<!-- end comment-reply-form -->
								</div>
								<div class="col-md-4">
									<div class="section-contact">
										<section class="contact-block">
											<h3 class="contact-block__title ui-title-inner">Get in Touch</h3>
											<div class="contact-block__inner">Phone: <span class="color_primary">+91 9664356445 </span></div>
											<div class="contact-block__inner">Email: <span class="color_primary">akkipatil1994@gmail.com</span></div>
											<div class="contact-block__inner">Phone: <span class="color_primary">+91 9870111444 </span></div>
											<div class="contact-block__inner">Email: <span class="color_primary">neerajmenon1412gmail.com</span></div>													
										</section>
										<section class="contact-block">
											<h3 class="contact-block__title ui-title-inner">Store Address</h3>
											<div class="contact-block__info">Shankar Smurti Bldg </div>
											<div class="contact-block__inner">Plot no.:506, Sec:22 </div>
											<div class="contact-block__inner">Turbhe, Navi Mumbai</div>
										</section>
										<section class="contact-block">
											<h3 class="contact-block__title ui-title-inner">Working Hours</h3>
											<div class="contact-block__inner">Tuesday: 10:00 - 21:00</div>
											<div class="contact-block__inner">Wednesday: 10:00 - 21:00</div>
											<div class="contact-block__inner">Thursday: 10:00 - 21:00</div>
											<div class="contact-block__inner">Friday: 10:00 - 21:00</div>
											<div class="contact-block__inner">Saturday: 12:00 - 19:00</div>
											<div class="contact-block__inner">Sunday / Monday: Closed</div>
										</section>
									</div>
								</div>
							</div>
						</div>
					</div>


					<section class="section-subscribe">
						<form class="form-subscribe" action="subscribe" method="post">
							<div class="container">
								<div class="row">
									<div class="col-xs-12">
										<h2 class="ui-title-block ui-title-block_mod-a form-subscribe__title">Sign up for the newsletter and get exclusive deals.</h2>
										<input class="form-control" type="email" placeholder="Enter your email address" name="subscribe_email" required>
										<input type="hidden" name="page" value="contact">
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
										<div class="text-center">Copyright © 2016 <a class="copyright__link" href="">Peri Peri.</a> All rights reserved.</div>
									</div>
								</div>
							</div>
						</div><!-- end copyright -->
					</footer>
					<!-- end footer -->

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
							<a class="navig-menu__link" href="about.jsp">about us</a>
						</li>
						<li class="navig-menu__item">
							<a class="navig-menu__link" href="contactus.jsp">contact</a>
						</li>
					</ul>
				</nav>
				<!-- end main-nav -->

				<div class="border-bottom"></div>
				<%
					String email = (String)session.getAttribute("email");
												
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