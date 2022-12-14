<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimal-ui">
		<title>Peri Peri, Checkout</title>

	<link href="favicon.png" type="image/x-icon" rel="shortcut icon">
		<link href="assets/css/master.css" rel="stylesheet">
		<script src="assets/plugins/jquery/jquery-1.11.3.min.js"></script>
	
	<script type="text/javascript">
		function validate()
		{
			document.getElementById("postcodeerror").style.visibility = "hidden";
			document.getElementById("post").style.border="";
			
			if(document.getElementById("addre").checked == true)
			{
				if(isNaN(document.checkoutform.postcode.value) || document.checkoutform.postcode.value.length != 6)
				{
					if(document.checkoutform.phone.value.length == 10)
					{
						document.getElementById("phoneno").style.border="";
						document.getElementById("phoneerror").style.visibility = "hidden";
					}
					
					document.getElementById("post").style.border="1px solid #dd1037";
					document.getElementById("postcodeerror").style.visibility = "visible";
					document.checkoutform.postcode.focus();
					return false;
				}
				
				if(isNaN(document.checkoutform.phone.value) || document.checkoutform.phone.value.length != 10)
				{
					document.getElementById("phoneno").style.border="1px solid #dd1037";
					document.getElementById("phoneerror").style.visibility = "visible";
					document.checkoutform.phone.focus();
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
										<h1 class="ui-title-page">Checkout</h1>
										<ol class="breadcrumb">
											<li><a href="http://localhost:8080/Pizza/">Home</a></li>
											<li class="active">Checkout</li>
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

<!--
					<div class="container">
						<div class="row">
							<div class="col-md-8">
								<div class="checkout-top-line">Returning customer? <a class="checkout-top-line__link" href="javascript:void(0);">Click here to login</a></div>
							</div>
					</div>-->
					
					<form class="comment-reply-form" id="comment-reply-form" name="checkoutform" action="newaddress" method="post" onsubmit="return validate()">
					<div class="section_mod-f">
						<div class="container">
							<div class="row">
								<div class="col-md-8">
									<!-- <form class="comment-reply-form" id="comment-reply-form" action="#" method="post"> -->
									
									
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
	
	<div id="dvPassport">
       											<h2 class="ui-title-inner ui-title-inner_mod-a">Delivery Address</h2>
												
												${address.get(0)} ${address.get(1)}
												<br/>${address.get(2)},
												<br/>${address.get(3)},
												<br/>Postcode: ${address.get(4)}
												<br/>Phone: ${address.get(5)}
												
												<h2>Users original Address</h2>
											
    </div>
    <script type="text/javascript">

	function chk()
	{
		document.getElementById("firstname").required = true;
		document.getElementById("lastname").required = true;
		document.getElementById("addr").required = true;
		document.getElementById("apartment").required = true;
		document.getElementById("town").required = true;
		document.getElementById("post").required = true;
		document.getElementById("phoneno").required = true;
	}
		
		
	</script>
	<input class="forms__check hidden" type="checkbox" id="addre"  name="check" onclick="chk()"/>
    <label class="forms__label forms__label-check forms__label-check_mod-a" for="addre">Delivery to a different address?</label>
    <hr />

	
	
	<div id="dvPassportx" style="display: none">
        									<h2 class="ui-title-inner ui-title-inner_mod-a">New Delivery Address</h2>
											<div class="row">
												<div class="col-md-6">
													<label class="ui-form-label">FIRST NAME *</label>
													<input class="form-control" type="text" name="fname" id="firstname" >
												</div>
												<div class="col-md-6">
													<label class="ui-form-label">LAST NAME *</label>
													<input class="form-control" type="text" name="lname" id="lastname" >
												</div>
											</div>
											<label class="ui-form-label">ADDRESS *</label>
											<input class="form-control form-control_second" type="text" name="address" placeholder="Street address" id="addr">
											<input class="form-control" type="text" placeholder="Apartment, suite, unit etc." id="apartment">
											<label class="ui-form-label">TOWN / CITY *</label>
											<input class="form-control" type="text" name="town" placeholder="Town / City" id="town">
											<div class="row">
												<div class="col-md-6">
													<label class="ui-form-label">POSTCODE *</label>
													<input class="form-control" type="text" name="postcode" placeholder="Postcode / Zip" id="post">
													<label for="postcode" id="postcodeerror" style="visibility: hidden; color: #dd1037;"><b>Please provide valid postcode</b></label>
												</div>
												<div class="col-md-6">
													<label class="ui-form-label">PHONE *</label>
													<input class="form-control" type="text" name="phone" id="phoneno">
													<label for="phone" id="phoneerror" style="visibility: hidden; color: #dd1037;"><b>Please provide valid phone</b></label>
												</div>
											</div>
    </div>
												
											

					
										</section>
										<!-- end section -->


									
								</div>
								<!-- end col -->

								<div class="col-md-4">
									<div class="section-table-order section-table-order_mod-a">
										<section class="section-area">
											<h2 class="table-order__title ui-title-inner">Your Order</h2>
											<table class="table-order">
												<thead>
													<tr>
														<th>PRODUCT</th>
														<th>TOTAL</th>
													</tr>
												</thead>
												<tbody>
												<%
												//int total_pizza = (int)request.getAttribute("total_pizza");
																								
												int total_pizza = (int)session.getAttribute("total_pizza");
											    
											    /* String[] pizza_name = (String[])request.getAttribute("pizza_name");
											    Integer[] quantity = (Integer[])request.getAttribute("pizza_quantity");
											    Integer[] pizza_size = (Integer[])request.getAttribute("pizza_size"); */
											    
											    String[] pizza_name = (String[])session.getAttribute("pizza_name");
											    Integer[] quantity = (Integer[])session.getAttribute("pizza_quantity");
											    Integer[] pizza_size = (Integer[])session.getAttribute("pizza_size");
											    
											    System.out.println("quantity 1= "+quantity[0]);
											    System.out.println("quantity 2= "+quantity[1]);
											    System.out.println("Pizza size = "+pizza_size[0]);
											    
											    int order_total=0;
											    
											    for(int i=0;i<total_pizza;i++)
											    {
											    	order_total = order_total + quantity[i]*pizza_size[i];
											    	
											    	if(i==total_pizza-1)
											    	{
											    		if(pizza_size[i]<300)
											    		{
											    %>
											    	<tr>
														<%-- <td class="border-cell no-br"><%= pizza_name[i]%><span class="color_primary"> x </span><span class="enumerator__input"><%= quantity[i] %></span><span>(Small)</span> --%>
														<td class="border-cell no-br"><%= pizza_name[i]%><span class="color_primary"> x </span><span class="enumerator__input"><%= quantity[i] %> x (S)</span>
														</td>
														<td class="border-cell">
															<span class="table-order__price">Rs. <%= quantity[i]*pizza_size[i] %></span>
														</td>
													</tr>
											   <% 		}
											    		else if(pizza_size[i]>300 && pizza_size[i]<500)
											    		{%>
											    		<tr>
														<%-- <td class="border-cell no-br"><%= pizza_name[i]%><span class="color_primary"> x </span><span class="enumerator__input"><%= quantity[i] %></span><span>(Medium)</span> --%>
														<td class="border-cell no-br"><%= pizza_name[i]%><span class="color_primary"> x </span><span class="enumerator__input"><%= quantity[i] %> x (M)</span>
														</td>
														<td class="border-cell">
															<span class="table-order__price">Rs. <%= quantity[i]*pizza_size[i] %></span>
														</td>
														
														
													</tr>	
											    		<% }else if(pizza_size[i]>500)
															{%>
											    			<tr>
															<%-- <td class="border-cell no-br"><%= pizza_name[i]%><span class="color_primary"> x </span><span class="enumerator__input"><%= quantity[i] %></span><span>(Large)</span> --%>
															<td class="border-cell no-br"><%= pizza_name[i]%><span class="color_primary"> x </span><span class="enumerator__input"><%= quantity[i] %> x (L)</span>
															</td>
															<td class="border-cell">
																<span class="table-order__price">Rs. <%= quantity[i]*pizza_size[i] %></span>
															</td>
															
															
														</tr>	
															<%}
														
											    	}
											    	else
											    	{
											    		if(pizza_size[i]<300)
														{%>
											    			<tr>
															<%-- <td class=" no-br"><%= pizza_name[i]%><span class="color_primary"> x </span><span class="enumerator__input"><%= quantity[i] %></span><span>(Small)</span> --%>
															<td class=" no-br"><%= pizza_name[i]%><span class="color_primary"> x </span><span class="enumerator__input"><%= quantity[i] %> x (S)</span>
															</td>
														<td>
															<span class="table-order__price">Rs. <%= quantity[i]*pizza_size[i] %></span>
														</td>
													</tr>
													<%	}
											    		else if(pizza_size[i]>300 && pizza_size[i]<500)
											    		{%>
											    		<tr>
															<%-- <td class=" no-br"><%= pizza_name[i]%><span class="color_primary"> x </span><span class="enumerator__input"><%= quantity[i] %></span><span>(Medium)</span> --%>
															<td class=" no-br"><%= pizza_name[i]%><span class="color_primary"> x </span><span class="enumerator__input"><%= quantity[i] %> x (M)</span>
															</td>
														<td>
															<span class="table-order__price">Rs. <%= quantity[i]*pizza_size[i] %></span>
														</td>
													</tr>
											    			
											    	<%	}
											    		else if(pizza_size[i]>500)
											    		{%>
											    			<tr>
															<%-- <td class=" no-br"><%= pizza_name[i]%><span class="color_primary"> x </span><span class="enumerator__input"><%= quantity[i] %></span><span>(Large)</span> --%>
															<td class=" no-br"><%= pizza_name[i]%><span class="color_primary"> x </span><span class="enumerator__input"><%= quantity[i] %> x (L)</span>
															</td>
														<td>
															<span class="table-order__price">Rs. <%= quantity[i]*pizza_size[i] %></span>
														</td>
													</tr>
											    		<%}
														
											    		%>
											    		
											    <%	}
											    }
												
												%>
													<tr>
														<td class="table-order__total">Order Total</td>
														<td class="table-order__total">Rs. <%= order_total%></td>
													</tr> 
												</tbody>
											</table>
										</section>
										<!-- end section-area -->

										<section class="section_mod-g">
											<h2 class="table-order__title ui-title-inner">Payment Methods</h2>
											<!-- <form class="form-payment" action=""> -->
											<!-- <form class="form-payment" id="comment-reply-form" action="/newaddress" method="post"> -->
													<br>
													<span class="form-payment__item-title">Cash on Delivery</span>
													<span class="form-payment__description">Make your payment directly at your doorstep.</span>
													<br>
										<!-- <button class="form-payment__btn ui-btn ui-btn-primary btn-effect" onclick="mymsg">place order</button> -->
										
										<button class="form-payment__btn ui-btn ui-btn-primary btn-effect" type="submit">place order</button>

											<!-- </form> -->
										</section>


									</div>
									<!-- end section-table-order -->
								</div>
								<!-- end col -->
								</form>
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
										<input type="hidden" name="page" value="checkout">
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
							<a class="navig-menu__link" href="about.html">about us</a>
						</li>
						<li class="navig-menu__item">
							<a class="navig-menu__link" href="contactus.jsp">contact</a>
						</li>
					</ul>
				</nav>
				<!-- end main-nav -->

				<div class="border-bottom"></div>
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