<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimal-ui">
		<title>Peri Peri, Peppy Paneer</title>

	<link href="favicon.png" type="image/x-icon" rel="shortcut icon">
		<link href="../assets/css/masterpizpag.css" rel="stylesheet">
		<script src="../assets/plugins/jquery/jquery-1.11.3.min.js"></script>
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
							<a class="logo" href="http://localhost:8080/Pizza/"><img class="img-responsive" src="../assets/img/logo_mod-a.png" alt="Logo"></a>
						</div>
					</header>
					<!-- end header -->

					<div class="section-title">
						<div class="container">
							<div class="row">
								<div class="col-xs-545">
									<div class="section__inner">
										<h1 class="ui-title-page">Peppy Paneer</h1>
										<ol class="breadcrumb">
											<li><a href="http://localhost:8080/Pizza/">Home</a></li>
											<li><a href="../shop-catalog.jsp">Pizza Menu</a></li>
											<li class="active">Peppy Paneer</li>
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


					<div class="container">
						<div class="row">
							<div class="col-xs-12">
								<article class="post post_first text-center clearfix">
									<div class="entry-media">			
											<img class="img-responsive" src="img/e14.jpg" height="600" width="1100">							
									</div>
									
									
									<div class="entry-main">
										<div class="entry-header">
											<h2 class="entry-title ui-title-inner">Peppy Paneer Pizza is known as vegetarians delight with mozzarella roofed with spicy red pepper garnished with fresh basil!</h2>
										</div>
									</div>
								</article><!-- end post -->
								
								<article class="post post_mod-b clearfix">
									
											<div class="col-md-6">	
												<div>
													<h3 class="panel-title"><span class="panel-title__number"></span>Different Crust's Size</h3><br><br>
												</div>
												
														
														<label class="pizza-builder__radio-label" for="pizza-size_9">
															<span class="pizza-builder__radio-number pizza-builder__radio-number_9"><span class="pizza-builder__radio-inner">9"</span></span>
															<span class="pizza-builder__radio-title">Small<br>Rs. 240</span>
														</label>

														
														<label class="pizza-builder__radio-label" for="pizza-size_14">
															<span class="pizza-builder__radio-number pizza-builder__radio-number_14"><span class="pizza-builder__radio-inner">14"</span></span>
															<span class="pizza-builder__radio-title">Medium<br>Rs. 370</span>
														</label>



														
														<label class="pizza-builder__radio-label" for="pizza-size_18">
															<span class="pizza-builder__radio-number pizza-builder__radio-number_18"><span class="pizza-builder__radio-inner">18"</span></span>
															<span class="pizza-builder__radio-title">Large<br>Rs. 530</span>
														</label>
											</div>
											<div class="col-md-6">
											<div>
													<h3 class="panel-title"><span class="panel-title__number"></span>Ingredients</h3><br><br>
											<div class="entry-content">
											<p>Margherita with Mozzarella and Cherry Tomatoes on a Tomato base, garnished with Fresh Basil, served with Cracked Pepper & Sea Salt.</p>
										    </div>
											</div>
											</div>
									
								</article><!-- end post -->

							</div>
							<!-- end col -->
						</div>
						<!-- end row -->
					</div>
					<!-- end container -->


					<footer class="footer">
						<div class="copyright border-top">
							<div class="container">
								<div class="row">
								<div class="col-xs-99">
										<div class="text-center">Copyright © 2016 <a class="copyright__link" href="http://localhost:8080/Pizza/">Peri Peri.</a> All rights reserved.</div>
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
							<a class="navig-menu__link" href="../shop-catalog.jsp">Pizza menu</a>
						</li>
						<li class="navig-menu__item">
							<a class="navig-menu__link" href="../about.jsp">about us</a>
						</li>
						<li class="navig-menu__item">
							<a class="navig-menu__link" href="../contactus.jsp">contact</a>
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
						<a class="link-account" href="../login-signup.jsp">login</a>
					<%}
					else
					{%>
						<!-- <a class="link-account" onclick="logout()" href="http://localhost:8080/Pizza/">log out</a> -->
						<a class="link-account" href="../logout.jsp">log out</a>
					<%}
				%>
			</div>
			<!-- end sb-left -->
		</div>
		<!-- end layout-theme -->



		<!-- SCRIPTS MAIN -->

		<script src="../assets/js/jquery-migrate-1.2.1.js"></script>
		<script src="../assets/plugins/bootstrap/js/bootstrap.min.js"></script>
		<script src="../assets/js/waypoints.min.js"></script>
		<script src="../../../cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
		<script src="../assets/js/modernizr.custom.js"></script>
		<script src="../assets/js/cssua.min.js"></script>


		<!--SCRIPTS THEME-->

		<!-- Sidebar -->
		<script src="../assets/plugins/slidebars/dist/slidebars.js"></script>
		<!-- Custom -->
		<script src="../assets/js/custom.js"></script>

	</body>
</html>


