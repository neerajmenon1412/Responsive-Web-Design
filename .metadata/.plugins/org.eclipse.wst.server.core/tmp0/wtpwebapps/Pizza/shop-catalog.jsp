<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimal-ui">
		<title>Peri Peri, Pizza Menu</title>

    	<link href="favicon.png" type="image/x-icon" rel="shortcut icon">
		<link href="assets/css/masterCat.css" rel="stylesheet">
		<script src="assets/plugins/jquery/jquery-1.11.3.min.js"></script>
		
		<!-- CSS for POPUP -->
		<link rel="stylesheet" href="assets/plugins/popup/css/form-elements.css">
        <link rel="stylesheet" href="assets/plugins/popup/css/style.css">
	</head>
<body>
<form action="shopcatalog" method="get">
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

							<!-- <input class="header-basket sb-toggle-right" type="submit"/> -->
							<%
								String email = (String)session.getAttribute("email");
								System.out.println(email);
								if(email == null || email == "fail")
								{%>
									<span class="header-basket" id="btnsubmit" disabled="disabled" type="submit"><a class="btn btn-link-1 launch-modal" data-modal-id="modal-login"><img class="img-responsive" src="assets\img\cart-512.png"></a></span>
								<%}
								else
								{%>
									<button class="header-basket" id="btnsubmit" disabled="disabled" type="submit"><img class="img-responsive" src="assets\img\cart-512.png"></button>
								<%}
							
							%>
						</div>
						
						
					</header>
					<!-- end header -->

					<div class="section-title">
						<div class="container">
							<div class="row">
								<div class="col-xs-12">
									<div class="section__inner">
										<h1 class="ui-title-page">Pizza Menu</h1>
										<ol class="breadcrumb">
											<li><a href="http://localhost:8080/Pizza/">Home</a></li>
											<li class="active">Menu</li>
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

								<div class="filter clearfix"></div>
<!-- Start Selection Disable  -->								
<div  style="-moz-user-select: none; -webkit-user-select: none; -ms-user-select:none; user-select:none;-o-user-select:none;" unselectable="on" onselectstart="return false;" onmousedown="return false;">
 
					<div class="section-catalog">
						<div class="container">
							<div class="row">
								<div class="col-xs-12">
									<div class="pizza-builder__wrap-check">
										<div class="pizza-builder__item pizza-builder__item_mod-b" tabindex="1">
	<a href="catpages/1BBQ-Chicken.jsp">
											<div class="pizza-builder__check-img pizza-builder__check-img pizza-builder__check-img_mod-a">
												<img class="img-responsive center-block" src="assets/media/list-catalog/1.png" height="258" width="258" alt="Foto">
											</div>
											<div class="pizza-builder__check-name">BBQ Chicken</div>
	</a>										
											<div class="pizza-builder__check-description pizza-builder__check-description_mod-a">Slow Cooked marinated Chicken, Mushrooms, Shallots on a Garlic base, Red & Green Chilli.</div>	
<!-- Size Selection -->
<script>
function myFunction1() {
    var x = document.getElementById("mybbqchicken").value;
    document.getElementById("demo1").innerHTML = "Rs. " + x;

}
</script>
											<p class="pizza-builder__check-price pizza-builder__check-price_mod-a" id="demo1">Rs. 290</p>
<!-- Checkbox Selection -->
					<script type="text/javascript">
					function ShowHideBBQChickenSQ(bbqchicken)
					{
					var dvcheck = document.getElementById("bbqchickensq");
					dvcheck.style.display = bbqchicken.checked ? "block" : "none";
					}
					</script>
												
											<input class="filter-categories__radio forms__check hidden" type="checkbox" id="bbqchicken" value="BBQ Chicken" name="chkpizza" onclick="ShowHideBBQChickenSQ(this)" />
												<label class="filter-categories__check-label forms__label forms__label-check" for="bbqchicken">Check to Buy
												</label>
											<div id="bbqchickensq" style="display: none">	
											<div class="cart__title-inner">Size</div>
											<select class="selectpicker" data-style="ui-select" id="mybbqchicken" onchange="myFunction1()" name="selbbqchicken">
												<option value="290">Small</option>
												<option value="390">Medium</option>
												<option value="590">Large</option>
											</select>
											<div class="cart__title-inner">quantity</div>
													<div class="cart__enumerator">
														<a class="cart__enumerator-btn cart__enumerator-btn_minus js-minus">-</a>
														<input class="cart__enumerator-input" type="text" placeholder="1" name="quanbbqchicken">
														<a class="cart__enumerator-btn cart__enumerator-btn_plus js-plus">+</a>
													</div>
											</div>	
										</div>

										<div class="pizza-builder__item pizza-builder__item_mod-b" tabindex="1">
	<a href="catpages/2Peri-Peri-Chicken.jsp">									
											<div class="pizza-builder__check-img pizza-builder__check-img pizza-builder__check-img_mod-a">
												<img class="img-responsive center-block" src="assets/media/list-catalog/2.png" height="253" width="252" alt="Foto">
											</div>
											<div class="pizza-builder__check-name">Peri-Peri Chicken</div>
	</a>										
											<div class="pizza-builder__check-description pizza-builder__check-description_mod-a">Chicken marinated in Moorish spices, Tomatoes, Capsicum Medley, topped with a Slice of Lemon & Yoghurt sauce.</div>
<!-- Size Selection -->
<script>
function myFunction2() {
    var x = document.getElementById("myperiperichicken").value;
    document.getElementById("demo2").innerHTML = "Rs. " + x;

}
</script>
											<p class="pizza-builder__check-price pizza-builder__check-price_mod-a" id="demo2">Rs. 260</p>
<!-- Checkbox Selection -->
					<script type="text/javascript">
					function ShowHidePeriPeriChickenSQ(periperichicken)
					{
					var dvcheck = document.getElementById("periperichickensq");
					dvcheck.style.display = periperichicken.checked ? "block" : "none";
					}
					</script>
												
											<input class="filter-categories__radio forms__check hidden" type="checkbox" id="periperichicken" value="Peri-Peri Chicken" name="chkpizza" onclick="ShowHidePeriPeriChickenSQ(this)" />
												<label class="filter-categories__check-label forms__label forms__label-check" for="periperichicken">Check to Buy
												</label>
											<div id="periperichickensq" style="display: none">	
											<div class="cart__title-inner">Size</div>
											<select class="selectpicker" data-style="ui-select" id="myperiperichicken" onchange="myFunction2()" name="selperiperichicken">
												<option value="260">Small</option>
												<option value="360">Medium</option>
												<option value="550">Large</option>
											</select>
											<div class="cart__title-inner">quantity</div>
													<div class="cart__enumerator">
														<a class="cart__enumerator-btn cart__enumerator-btn_minus js-minus">-</a>
														<input class="cart__enumerator-input" type="text" placeholder="1" name="quanperiperichicken">
														<a class="cart__enumerator-btn cart__enumerator-btn_plus js-plus">+</a>
													</div>
											</div>	
										</div>

										<div class="pizza-builder__item pizza-builder__item_mod-b" tabindex="1">
	<a href="catpages/3Chicken-Bonanza.jsp">											
											<div class="pizza-builder__check-img pizza-builder__check-img pizza-builder__check-img_mod-a">
												<img class="img-responsive center-block" src="assets/media/list-catalog/3.png" height="258" width="258" alt="Foto">
											</div>
											<div class="pizza-builder__check-name">Chicken Bonanza</div>
	</a>										
											<div class="pizza-builder__check-description pizza-builder__check-description_mod-a">Spanish Onions, Roasted Capsicum, Jalapenos & Chilli on a Spicy Tomato Salsa base, served with Fresh Avocado Salsa.</div>
<!-- Size Selection -->
<script>
function myFunction3() {
    var x = document.getElementById("mychickenbonanza").value;
    document.getElementById("demo3").innerHTML = "Rs. " + x;

}
</script>
											<p class="pizza-builder__check-price pizza-builder__check-price_mod-a" id="demo3">Rs. 250</p>
<!-- Checkbox Selection -->
					<script type="text/javascript">
					function ShowHideChickenBonanzaSQ(chickenbonanza)
					{
					var dvcheck = document.getElementById("chickenbonanzasq");
					dvcheck.style.display = chickenbonanza.checked ? "block" : "none";
					}
					</script>
												
											<input class="filter-categories__radio forms__check hidden" type="checkbox" id="chickenbonanza" value="Chicken Bonanza" name="chkpizza" onclick="ShowHideChickenBonanzaSQ(this)" />
												<label class="filter-categories__check-label forms__label forms__label-check" for="chickenbonanza">Check to Buy
												</label>
											<div id="chickenbonanzasq" style="display: none">	
											<div class="cart__title-inner">Size</div>
											<select class="selectpicker" data-style="ui-select" id="mychickenbonanza" onchange="myFunction3()" name="selchickenbonanza">
												<option value="250">Small</option>
												<option value="430">Medium</option>
												<option value="550">Large</option>
											</select>
											<div class="cart__title-inner">quantity</div>
													<div class="cart__enumerator">
														<a class="cart__enumerator-btn cart__enumerator-btn_minus js-minus">-</a>
														<input class="cart__enumerator-input" type="text" placeholder="1" name="quanchickenbonanza">
														<a class="cart__enumerator-btn cart__enumerator-btn_plus js-plus">+</a>
													</div>
											</div>	
										</div>

										<div class="pizza-builder__item pizza-builder__item_mod-b" tabindex="1">
	<a href="catpages/4Meat-Deluxe.jsp">
											<div class="pizza-builder__check-img pizza-builder__check-img pizza-builder__check-img_mod-a">
												<img class="img-responsive center-block" src="assets/media/list-catalog/4.png" height="251" width="251" alt="Foto">
											</div>
											<div class="pizza-builder__check-name">Meat Deluxe</div>
	</a>										
											<div class="pizza-builder__check-description pizza-builder__check-description_mod-a">Chorizo Sausage, Spanish Onions, Roasted Capsicum, Jalapeños & Chilli on a Spicy Tomato Salsa base, served with Fresh Avocado Salsa.</div>
<!-- Size Selection -->
<script>
function myFunction4() {
    var x = document.getElementById("mymeatdeluxe").value;
    document.getElementById("demo4").innerHTML = "Rs. " + x;

}
</script>
											<p class="pizza-builder__check-price pizza-builder__check-price_mod-a" id="demo4">Rs. 280</p>
<!-- Checkbox Selection -->
					<script type="text/javascript">
					function ShowHideMeatDeluxeSQ(meatdeluxe)
					{
					var dvcheck = document.getElementById("meatdeluxesq");
					dvcheck.style.display = meatdeluxe.checked ? "block" : "none";
					}
					</script>
												
											<input class="filter-categories__radio forms__check hidden" type="checkbox" id="meatdeluxe" value="Meat Deluxe" name="chkpizza" onclick="ShowHideMeatDeluxeSQ(this)" />
												<label class="filter-categories__check-label forms__label forms__label-check" for="meatdeluxe">Check to Buy
												</label>
											<div id="meatdeluxesq" style="display: none">	
											<div class="cart__title-inner">Size</div>
											<select class="selectpicker" data-style="ui-select" id="mymeatdeluxe" onchange="myFunction4()" name="selmeatdeluxe">
												<option value="280">Small</option>
												<option value="390">Medium</option>
												<option value="580">Large</option>
											</select>
											<div class="cart__title-inner">quantity</div>
													<div class="cart__enumerator">
														<a class="cart__enumerator-btn cart__enumerator-btn_minus js-minus">-</a>
														<input class="cart__enumerator-input" type="text" placeholder="1" name="quanmeatdeluxe">
														<a class="cart__enumerator-btn cart__enumerator-btn_plus js-plus">+</a>
													</div>
											</div>	
										</div>

										<div class="pizza-builder__item pizza-builder__item_mod-b" tabindex="1">
	<a href="catpages/5Chicken-Supreme.jsp">
											<div class="pizza-builder__check-img pizza-builder__check-img pizza-builder__check-img_mod-a">
												<img class="img-responsive center-block" src="assets/media/list-catalog/5.png" height="259" width="259" alt="Foto">
											</div>
											<div class="pizza-builder__check-name">Chicken Supreme</div>
	</a>										
											<div class="pizza-builder__check-description pizza-builder__check-description_mod-a">Slow Cooked Pulled Chicken, Red Capsicum on a Tomato base, Garnished with Avocado, Coriander & Lime, topped with mayo.</div>
<!-- Size Selection -->
<script>
function myFunction5() {
    var x = document.getElementById("mychickensupreme").value;
    document.getElementById("demo5").innerHTML = "Rs. " + x;

}
</script>
											<p class="pizza-builder__check-price pizza-builder__check-price_mod-a" id="demo5">Rs. 290</p>
<!-- Checkbox Selection -->
					<script type="text/javascript">
					function ShowHideChickenSupremeSQ(chickensupreme)
					{
					var dvcheck = document.getElementById("chickensupremesq");
					dvcheck.style.display = chickensupreme.checked ? "block" : "none";
					}
					</script>
												
											<input class="filter-categories__radio forms__check hidden" type="checkbox" id="chickensupreme" value="Chicken Supreme" name="chkpizza" onclick="ShowHideChickenSupremeSQ(this)" />
												<label class="filter-categories__check-label forms__label forms__label-check" for="chickensupreme">Check to Buy
												</label>
											<div id="chickensupremesq" style="display: none">	
											<div class="cart__title-inner">Size</div>
											<select class="selectpicker" data-style="ui-select" id="mychickensupreme" onchange="myFunction5()" name="selchickensupreme">
												<option value="290">Small</option>
												<option value="380">Medium</option>
												<option value="570">Large</option>
											</select>
											
											<div class="cart__title-inner">quantity</div>
													<div class="cart__enumerator">
														<a class="cart__enumerator-btn cart__enumerator-btn_minus js-minus">-</a>
														<input class="cart__enumerator-input" type="text" placeholder="1" name="quanchickensupreme">
														<a class="cart__enumerator-btn cart__enumerator-btn_plus js-plus">+</a>
													</div>
											</div>	
										</div>

										<div class="pizza-builder__item pizza-builder__item_mod-b" tabindex="1">
	<a href="catpages/6Exotic-Mushroom.jsp">									
											<div class="pizza-builder__check-img pizza-builder__check-img pizza-builder__check-img_mod-a">
												<img class="img-responsive center-block" src="assets/media/list-catalog/6.png" height="260" width="260" alt="Foto">
											</div>
											<div class="pizza-builder__check-name">Exotic Mushroom</div>
	</a>										
											<div class="pizza-builder__check-description pizza-builder__check-description_mod-a">Garlic Cloves, Red Pepper Flakes,Crushed Tomatoes, Mozzarella, Oyster Mushrooms, Caramelised Onions & Toasted Pine Nuts.</div>
<!-- Size Selection -->
<script>
function myFunction6() {
    var x = document.getElementById("myexoticmushroom").value;
    document.getElementById("demo6").innerHTML = "Rs. " + x;

}
</script>
											<p class="pizza-builder__check-price pizza-builder__check-price_mod-a" id="demo6">Rs. 260</p>
<!-- Checkbox Selection -->
					<script type="text/javascript">
					function ShowHideExoticMushroomSQ(exoticmushroom)
					{
					var dvcheck = document.getElementById("exoticmushroomsq");
					dvcheck.style.display = exoticmushroom.checked ? "block" : "none";
					}
					</script>
												
											<input class="filter-categories__radio forms__check hidden" type="checkbox" id="exoticmushroom" value="Exotic Mushroom" name="chkpizza" onclick="ShowHideExoticMushroomSQ(this)" />
												<label class="filter-categories__check-label forms__label forms__label-check" for="exoticmushroom">Check to Buy
												</label>
												
											<div id="exoticmushroomsq" style="display: none">	
											<div class="cart__title-inner">Size</div>
											<select class="selectpicker" data-style="ui-select" id="myexoticmushroom" onchange="myFunction6()" name="selexoticmushroom">
												<option value="260">Small</option>
												<option value="380">Medium</option>
												<option value="520">Large</option>
											</select>
											
											<div class="cart__title-inner">quantity</div>
													<div class="cart__enumerator">
														<a class="cart__enumerator-btn cart__enumerator-btn_minus js-minus">-</a>
														<input class="cart__enumerator-input" type="text" placeholder="1" name="quanexoticmushroom">
														<a class="cart__enumerator-btn cart__enumerator-btn_plus js-plus">+</a>
													</div>
											</div>	
										</div>

										<div class="pizza-builder__item pizza-builder__item_mod-b" tabindex="1">
	<a href="catpages/7Veg-Mediterranean.jsp">										
											<div class="pizza-builder__check-img pizza-builder__check-img pizza-builder__check-img_mod-a">
												<img class="img-responsive center-block" src="assets/media/list-catalog/7.png" height="257" width="253" alt="Foto">
											</div>
											<div class="pizza-builder__check-name">Veg Mediterranean</div>
	</a>											
											<div class="pizza-builder__check-description pizza-builder__check-description_mod-a"> Tomatoes, Green Capsicum, Spanish Onions, Feta & Oregano on a Garlic infused base, garnished with Mint Yoghurt & Lemon.</div>
<!-- Size Selection -->
<script>
function myFunction7() {
    var x = document.getElementById("myvegmediterranean").value;
    document.getElementById("demo7").innerHTML = "Rs. " + x;

}
</script>
											<p class="pizza-builder__check-price pizza-builder__check-price_mod-a" id="demo7">Rs. 230</p>
<!-- Checkbox Selection -->
					<script type="text/javascript">
					function ShowHideVegMediterraneanSQ(vegmediterranean)
					{
					var dvcheck = document.getElementById("vegmediterraneansq");
					dvcheck.style.display = vegmediterranean.checked ? "block" : "none";
					}
					</script>
												
											<input class="filter-categories__radio forms__check hidden" type="checkbox" id="vegmediterranean" value="Veg Mediterranean" name="chkpizza" onclick="ShowHideVegMediterraneanSQ(this)" />
												<label class="filter-categories__check-label forms__label forms__label-check" for="vegmediterranean">Click to Buy</label>
												
											<div id="vegmediterraneansq" style="display: none">	
											<div class="cart__title-inner">Size</div>
											<select class="selectpicker" data-style="ui-select" id="myvegmediterranean" onchange="myFunction7()" name="selvegmediterranean">
												<option value="230">Small</option>
												<option value="360">Medium</option>
												<option value="530">Large</option>
											</select>
											
											<div class="cart__title-inner">quantity</div>
													<div class="cart__enumerator">
														<a class="cart__enumerator-btn cart__enumerator-btn_minus js-minus">-</a>
														<input class="cart__enumerator-input" type="text" placeholder="1" name="quanvegmediterranean">
														<a class="cart__enumerator-btn cart__enumerator-btn_plus js-plus">+</a>
													</div>
											</div>	
										</div>

										<div class="pizza-builder__item pizza-builder__item_mod-b" tabindex="1">
	<a href="catpages/8Chicken-Mexicana.jsp">										
											<div class="pizza-builder__check-img pizza-builder__check-img pizza-builder__check-img_mod-a">
												<img class="img-responsive center-block" src="assets/media/list-catalog/8.png" height="250" width="250" alt="Foto">
											</div>
											<div class="pizza-builder__check-name">Chicken Mexicana</div>
	</a>								
											<div class="pizza-builder__check-description pizza-builder__check-description_mod-a">Pepperoni, Spanish Onions, Fresh Capsicum, Marinated Chicken , Olive Tapenade & Garlic on a Tomato base.</div>
<!-- Size Selection -->
<script>
function myFunction8() {
    var x = document.getElementById("mychickenmexicana").value;
    document.getElementById("demo8").innerHTML = "Rs. " + x;

}
</script>
											<p class="pizza-builder__check-price pizza-builder__check-price_mod-a" id="demo8">Rs. 270</p>
<!-- Checkbox Selection -->
					<script type="text/javascript">
					function ShowHideChickenMexicanaSQ(chickenmexicana)
					{
					var dvcheck = document.getElementById("chickenmexicanasq");
					dvcheck.style.display = chickenmexicana.checked ? "block" : "none";
					}
					</script>
												
											<input class="filter-categories__radio forms__check hidden" type="checkbox" id="chickenmexicana" value="Chicken Mexicana" name="chkpizza" onclick="ShowHideChickenMexicanaSQ(this)" />
												<label class="filter-categories__check-label forms__label forms__label-check" for="chickenmexicana">Click to Buy</label>
												
											<div id="chickenmexicanasq" style="display: none">	
											<div class="cart__title-inner">Size</div>
											<select class="selectpicker" data-style="ui-select" id="mychickenmexicana" onchange="myFunction8()" name="selchickenmexicana">
												<option value="270">Small</option>
												<option value="350">Medium</option>
												<option value="560">Large</option>
											</select>
											
											<div class="cart__title-inner">quantity</div>
													<div class="cart__enumerator">
														<a class="cart__enumerator-btn cart__enumerator-btn_minus js-minus">-</a>
														<input class="cart__enumerator-input" type="text" placeholder="1" name="quanchickenmexicana">
														<a class="cart__enumerator-btn cart__enumerator-btn_plus js-plus">+</a>
													</div>
											</div>	
										</div>

										<div class="pizza-builder__item pizza-builder__item_mod-b" tabindex="1">
	<a href="catpages/9Veg-Extravaganza.jsp">										
											<div class="pizza-builder__check-img pizza-builder__check-img pizza-builder__check-img_mod-a">
												<img class="img-responsive center-block" src="assets/media/list-catalog/9.png" height="251" width="247" alt="Foto">
											</div>
											<div class="pizza-builder__check-name">Veg Extravaganza</div>
	</a>										
											<div class="pizza-builder__check-description pizza-builder__check-description_mod-a">Spanish Onions, Roasted Capsicum, Jalapeños & Chilli on a Spicy Tomato Salsa base, served with Fresh Avocado Salsa.</div>
<!-- Size Selection -->
<script>
function myFunction9() {
    var x = document.getElementById("myvegextravaganza").value;
    document.getElementById("demo9").innerHTML = "Rs. " + x;

}
</script>
											<p class="pizza-builder__check-price pizza-builder__check-price_mod-a" id="demo9">Rs. 240</p>
<!-- Checkbox Selection -->
					<script type="text/javascript">
					function ShowHideVegExtravaganzaSQ(vegextravaganza)
					{
					var dvcheck = document.getElementById("vegextravaganzasq");
					dvcheck.style.display = vegextravaganza.checked ? "block" : "none";
					}
					</script>
												
											<input class="filter-categories__radio forms__check hidden" type="checkbox" id="vegextravaganza" value="Veg Extravaganza" name="chkpizza" onclick="ShowHideVegExtravaganzaSQ(this)" />
												<label class="filter-categories__check-label forms__label forms__label-check" for="vegextravaganza">Click to Buy</label>
												
											<div id="vegextravaganzasq" style="display: none">	
											<div class="cart__title-inner">Size</div>
											<select class="selectpicker" data-style="ui-select" id="myvegextravaganza" onchange="myFunction9()" name="selvegextravaganza">
												<option value="240">Small</option>
												<option value="370">Medium</option>
												<option value="560">Large</option>
											</select>
											
											<div class="cart__title-inner">quantity</div>
													<div class="cart__enumerator">
														<a class="cart__enumerator-btn cart__enumerator-btn_minus js-minus">-</a>
														<input class="cart__enumerator-input" type="text" placeholder="1" name="quanvegextravaganza">
														<a class="cart__enumerator-btn cart__enumerator-btn_plus js-plus">+</a>
													</div>
											</div>	
										</div>

										<div class="pizza-builder__item pizza-builder__item_mod-b" tabindex="1">
	<a href="catpages/10Country-Special.jsp">										
											<div class="pizza-builder__check-img pizza-builder__check-img pizza-builder__check-img_mod-a">
												<img class="img-responsive center-block" src="assets/media/list-catalog/10.png" height="262" width="261" alt="Foto">
											</div>
											<div class="pizza-builder__check-name">Country Special</div>
	</a>											
											<div class="pizza-builder__check-description pizza-builder__check-description_mod-a">Bell Pepper, Spinach & Ricotta base, garnished with Hollandaise & Lemon, served with Cracked Pepper & Sea Salt.</div>
<!-- Size Selection -->
<script>
function myFunction10() {
    var x = document.getElementById("mycountryspecial").value;
    document.getElementById("demo10").innerHTML = "Rs. " + x;

}
</script>
											<p class="pizza-builder__check-price pizza-builder__check-price_mod-a" id="demo10">Rs. 230</p>
<!-- Checkbox Selection -->
					<script type="text/javascript">
					function ShowHideCountrySpecialSQ(countryspecial)
					{
					var dvcheck = document.getElementById("countryspecialsq");
					dvcheck.style.display = countryspecial.checked ? "block" : "none";
					}
					</script>
												
											<input class="filter-categories__radio forms__check hidden" type="checkbox" id="countryspecial" value="Country Special" name="chkpizza" onclick="ShowHideCountrySpecialSQ(this)" />
												<label class="filter-categories__check-label forms__label forms__label-check" for="countryspecial">Click to Buy</label>
												
											<div id="countryspecialsq" style="display: none">	
											<div class="cart__title-inner">Size</div>
											<select class="selectpicker" data-style="ui-select" id="mycountryspecial" onchange="myFunction10()" name="selcountryspecial">
												<option value="230">Small</option>
												<option value="390">Medium</option>
												<option value="510">Large</option>
											</select>
											
											<div class="cart__title-inner">quantity</div>
													<div class="cart__enumerator">
														<a class="cart__enumerator-btn cart__enumerator-btn_minus js-minus">-</a>
														<input class="cart__enumerator-input" type="text" placeholder="1" name="quancountryspecial">
														<a class="cart__enumerator-btn cart__enumerator-btn_plus js-plus">+</a>
													</div>
											</div>	
										</div>

										<div class="pizza-builder__item pizza-builder__item_mod-b" tabindex="1">
	<a href="catpages/11Zesty-Chicken.jsp">										
											<div class="pizza-builder__check-img pizza-builder__check-img pizza-builder__check-img_mod-a">
												<img class="img-responsive center-block" src="assets/media/list-catalog/11.png" height="256" width="256" alt="Foto">
											</div>
											<div class="pizza-builder__check-name">Zesty Chicken</div>
	</a>										
											<div class="pizza-builder__check-description pizza-builder__check-description_mod-a">Marinated Chicken, Sundried Tomatoes, Roasted Capsicum & Feta on a Tomato base, garnished with Fresh Herbs & Lemon.</div>
<!-- Size Selection -->
<script>
function myFunction11() {
    var x = document.getElementById("myzestychicken").value;
    document.getElementById("demo11").innerHTML = "Rs. " + x;

}
</script>
											<p class="pizza-builder__check-price pizza-builder__check-price_mod-a" id="demo11">Rs. 280</p>
<!-- Checkbox Selection -->
					<script type="text/javascript">
					function ShowHideZestyChickenSQ(zestychicken)
					{
					var dvcheck = document.getElementById("zestychickensq");
					dvcheck.style.display = zestychicken.checked ? "block" : "none";
					}
					</script>
												
											<input class="filter-categories__radio forms__check hidden" type="checkbox" id="zestychicken" value="Zesty Chicken" name="chkpizza" onclick="ShowHideZestyChickenSQ(this)" />
												<label class="filter-categories__check-label forms__label forms__label-check" for="zestychicken">Click to Buy</label>
												
												
											<div id="zestychickensq" style="display: none">	
											<div class="cart__title-inner">Size</div>
											<select class="selectpicker" data-style="ui-select" id="myzestychicken" onchange="myFunction11()" name="selzestychicken">
												<option value="280">Small</option>
												<option value="440">Medium</option>
												<option value="580">Large</option>
											</select>
											
											<div class="cart__title-inner">quantity</div>
													<div class="cart__enumerator">
														<a class="cart__enumerator-btn cart__enumerator-btn_minus js-minus">-</a>
														<input class="cart__enumerator-input" type="text" placeholder="1" name="quanzestychicken">
														<a class="cart__enumerator-btn cart__enumerator-btn_plus js-plus">+</a>
													</div>
											</div>	
										</div>

										<div class="pizza-builder__item pizza-builder__item_mod-b" tabindex="1">
	<a href="catpages/12Chicken-Mediterranean.jsp">										
											<div class="pizza-builder__check-img pizza-builder__check-img pizza-builder__check-img_mod-a">
												<img class="img-responsive center-block" src="assets/media/list-catalog/12.png" height="253" width="253" alt="Foto">
											</div>
											<div class="pizza-builder__check-name">Chicken Mediterranean</div>
	</a>											
											<div class="pizza-builder__check-description pizza-builder__check-description_mod-a">Slow Cooked Marinated Chicken, Tomatoes, Green Capsicum, Spanish Onions, Feta & Oregano on a Garlic infused base, garnished with Mint Yoghurt & Lemon.</div>
<!-- Size Selection -->
<script>
function myFunction12() {
    var x = document.getElementById("mychickenmediterranean").value;
    document.getElementById("demo12").innerHTML = "Rs. " + x;

}
</script>
											<p class="pizza-builder__check-price pizza-builder__check-price_mod-a" id="demo12">Rs. 240</p>
<!-- Checkbox Selection -->
					<script type="text/javascript">
					function ShowHideChickenMediterraneanSQ(chickenmediterranean)
					{
					var dvcheck = document.getElementById("chickenmediterraneansq");
					dvcheck.style.display = chickenmediterranean.checked ? "block" : "none";
					}
					</script>
												
											<input class="filter-categories__radio forms__check hidden" type="checkbox" id="chickenmediterranean" value="Chicken Mediterranean" name="chkpizza" onclick="ShowHideChickenMediterraneanSQ(this)" />
												<label class="filter-categories__check-label forms__label forms__label-check" for="chickenmediterranean">Click to Buy</label>
												
											<div id="chickenmediterraneansq" style="display: none">	
											<div class="cart__title-inner">Size</div>
											<select class="selectpicker" data-style="ui-select" id="mychickenmediterranean" onchange="myFunction12()" name="selchickenmediterranean">
												<option value="240">Small</option>
												<option value="410">Medium</option>
												<option value="520">Large</option>
											</select>
											
											<div class="cart__title-inner">quantity</div>
													<div class="cart__enumerator">
														<a class="cart__enumerator-btn cart__enumerator-btn_minus js-minus">-</a>
														<input class="cart__enumerator-input" type="text" placeholder="1" name="quanchickenmediterranean">
														<a class="cart__enumerator-btn cart__enumerator-btn_plus js-plus">+</a>
													</div>
											</div>		
										</div>

										<div class="pizza-builder__item pizza-builder__item_mod-b" tabindex="1">
	<a href="catpages/13Veg-Primavera.jsp">										
											<div class="pizza-builder__check-img pizza-builder__check-img pizza-builder__check-img_mod-a">
												<img class="img-responsive center-block" src="assets/media/list-catalog/13.png" height="253" width="253" alt="Foto">
											</div>
											<div class="pizza-builder__check-name">Veg Primavera</div>
	</a>											
											<div class="pizza-builder__check-description pizza-builder__check-description_mod-a">Spinach & Ricotta, Paneer, Black Olives, Spanish Onions, Cherry Tomatoes & Feta served with Cracked Pepper & Sea Salt</div>
<!-- Size Selection -->
<script>
function myFunction13() {
    var x = document.getElementById("myvegprimavera").value;
    document.getElementById("demo13").innerHTML = "Rs. " + x;

}
</script>
											<p class="pizza-builder__check-price pizza-builder__check-price_mod-a" id="demo13">Rs. 280</p>

<!-- Checkbox Selection -->
					<script type="text/javascript">
					function ShowHideVegPrimaveraSQ(vegprimavera)
					{
					var dvcheck = document.getElementById("vegprimaverasq");
					dvcheck.style.display = vegprimavera.checked ? "block" : "none";
					}
					</script>
												
											<input class="filter-categories__radio forms__check hidden" type="checkbox" id="vegprimavera" value="Veg Primavera" name="chkpizza" onclick="ShowHideVegPrimaveraSQ(this)" />
												<label class="filter-categories__check-label forms__label forms__label-check" for="vegprimavera">Click to Buy</label>
												
											<div id="vegprimaverasq" style="display: none">	
											<div class="cart__title-inner">Size</div>
											<select class="selectpicker" data-style="ui-select" id="myvegprimavera" onchange="myFunction13()" name="selvegprimavera">
												<option value="280">Small</option>
												<option value="420">Medium</option>
												<option value="570">Large</option>
											</select>
											
											<div class="cart__title-inner">quantity</div>
													<div class="cart__enumerator">
														<a class="cart__enumerator-btn cart__enumerator-btn_minus js-minus">-</a>
														<input class="cart__enumerator-input" type="text" placeholder="1" name="quanvegprimavera">
														<a class="cart__enumerator-btn cart__enumerator-btn_plus js-plus">+</a>
													</div>
											</div>		
										</div>

										<div class="pizza-builder__item pizza-builder__item_mod-b" tabindex="1">
	<a href="catpages/14Peppy-Paneer.jsp">										
											<div class="pizza-builder__check-img pizza-builder__check-img pizza-builder__check-img_mod-a">
												<img class="img-responsive center-block" src="assets/media/list-catalog/14.png" height="253" width="254" alt="Foto">
											</div>
											<div class="pizza-builder__check-name">Peppy Paneer</div>
	</a>											
											<div class="pizza-builder__check-description pizza-builder__check-description_mod-a">Margherita with Mozzarella and Cherry Tomatoes on a Tomato base, garnished with Fresh Basil, served with Cracked Pepper & Sea Salt</div>
<!-- Size Selection -->
<script>
function myFunction14() {
    var x = document.getElementById("mypeppypaneer").value;
    document.getElementById("demo14").innerHTML = "Rs. " + x;

}
</script>
											<p class="pizza-builder__check-price pizza-builder__check-price_mod-a" id="demo14">Rs. 240</p>

<!-- Checkbox Selection -->
					<script type="text/javascript">
					function ShowHidePeppyPaneerSQ(peppypaneer)
					{
					var dvcheck = document.getElementById("peppypaneersq");
					dvcheck.style.display = peppypaneer.checked ? "block" : "none";
					}
					</script>
												
											<input class="filter-categories__radio forms__check hidden" type="checkbox" id="peppypaneer" value="Peppy Paneer" name="chkpizza" onclick="ShowHidePeppyPaneerSQ(this)" />
											<label class="filter-categories__check-label forms__label forms__label-check" for="peppypaneer">Click to Buy</label>	
												

											<div id="peppypaneersq" style="display: none">	
											<div class="cart__title-inner">Size</div>
											<select class="selectpicker" data-style="ui-select" id="mypeppypaneer" onchange="myFunction14()" name="selpeppypaneer">
												<option value="240">Small</option>
												<option value="370">Medium</option>
												<option value="530">Large</option>
											</select>
											
											<div class="cart__title-inner">quantity</div>
													<div class="cart__enumerator">
														<a class="cart__enumerator-btn cart__enumerator-btn_minus js-minus">-</a>
														<input class="cart__enumerator-input" type="text" placeholder="1" name="quanpeppypaneer">
														<a class="cart__enumerator-btn cart__enumerator-btn_plus js-plus">+</a>
													</div>
											</div>		

										</div>

										<div class="pizza-builder__item pizza-builder__item_mod-b" tabindex="1">
	<a href="catpages/15Vegetarian-Supreme.jsp">										
											<div class="pizza-builder__check-img pizza-builder__check-img pizza-builder__check-img_mod-a">
												<img class="img-responsive center-block" src="assets/media/list-catalog/15.png" height="252" width="247" alt="Foto">
											</div>
											<div class="pizza-builder__check-name">Vegetarian Supreme</div>
	</a>											
											<div class="pizza-builder__check-description pizza-builder__check-description_mod-a">Grilled Eggplant, Marinated Artichokes, Baby Spinach, Roasted Capsicum, Mushrooms, Sundried Tomatoes & Bocconcini on a Tomato base</div>
<!-- Size Selection -->
<script>
function myFunction15() {
    var x = document.getElementById("myvegsupreme").value;
    document.getElementById("demo15").innerHTML = "Rs. " + x;

}
</script>
											<p class="pizza-builder__check-price pizza-builder__check-price_mod-a" id="demo15">Rs. 270</p>

<!-- Checkbox Selection -->
					<script type="text/javascript">
					function ShowHideVegSupremeSQ(vegsupreme)
					{
					var dvcheck = document.getElementById("vegsupremesq");
					dvcheck.style.display = vegsupreme.checked ? "block" : "none";
					}
					</script>
											<input class="filter-categories__radio forms__check hidden" type="checkbox" id="vegsupreme" value="Vegetarian Supreme" name="chkpizza" onclick="ShowHideVegSupremeSQ(this)" value="">
											<label class="filter-categories__check-label forms__label forms__label-check" for="vegsupreme">Click to Buy</label>
											<div id="vegsupremesq" style="display: none">	
											<div class="cart__title-inner">Size</div>
											<select class="selectpicker" data-style="ui-select" id="myvegsupreme" onchange="myFunction15()" name="selvegsupreme">
												<option value="270">Small</option>
												<option value="360">Medium</option>
												<option value="550">Large</option>
											</select>
											

											<div class="cart__title-inner">quantity</div>
													<div class="cart__enumerator">
														<a class="cart__enumerator-btn cart__enumerator-btn_minus js-minus">-</a>
														<input class="cart__enumerator-input" type="text" placeholder="1" name="quanvegsupreme">
														<a class="cart__enumerator-btn cart__enumerator-btn_plus js-plus">+</a>
													</div>
											</div>		
											
										</div>

										<div class="pizza-builder__item pizza-builder__item_mod-b" tabindex="1">
	<a href="catpages/16Roast-Beetroot.jsp">										
											<div class="pizza-builder__check-img pizza-builder__check-img pizza-builder__check-img_mod-a">
												<img class="img-responsive center-block" src="assets/media/list-catalog/16.png" height="255" width="254" alt="Foto">
											</div>
											<div class="pizza-builder__check-name">Roast Beetroot</div>
	</a>											
											<div class="pizza-builder__check-description pizza-builder__check-description_mod-a">Slowcooked Roasted Beetroot, Baby Spinach, Bocconcini topped with Crushed Walnuts and Honey.</div>
<!-- Size Selection -->
<script>
function myFunction16() {
    var x = document.getElementById("myroastbeetroot").value;
    document.getElementById("demo16").innerHTML = "Rs. " + x;

}
</script>
											<p class="pizza-builder__check-price pizza-builder__check-price_mod-a" id="demo16">Rs. 250</p>
						
						
					<!-- Checkbox Selection -->
					<script type="text/javascript">
					function ShowHideRoastBeetrootSQ(roastbeetroot) {
					var dvcheck = document.getElementById("roastbeetrootsq");
					dvcheck.style.display = roastbeetroot.checked ? "block" : "none";
					}
					</script>
											<input class="filter-categories__radio forms__check hidden" type="checkbox" id="roastbeetroot" value="Roast Beetroot" name="chkpizza" onclick="ShowHideRoastBeetrootSQ(this)">
											<label class="filter-categories__check-label forms__label forms__label-check" for="roastbeetroot">Click to Buy</label>
											
											<div id="roastbeetrootsq" style="display: none">	
											<div class="cart__title-inner">Size</div>
											
											<select class="selectpicker" data-style="ui-select" id="myroastbeetroot" onchange="myFunction16()" name="selroastbeetroot">
												<option value="250">Small</option>
												<option value="350">Medium</option>
												<option value="550">Large</option>
											</select>
											
											
											<div class="cart__title-inner">quantity</div>
													<div class="cart__enumerator">
														<a class="cart__enumerator-btn cart__enumerator-btn_minus js-minus">-</a>
														<input class="cart__enumerator-input" type="text" placeholder="1" name="quanroastbeetroot">
														<a class="cart__enumerator-btn cart__enumerator-btn_plus js-plus">+</a>
																										</div>
											</div>		
											
											
										</div>
									</div>

									
								</div>
							</div>
							<!-- end row -->
						</div>
						<!-- end container -->
					</div>
					<!-- end section-catalog -->
</div>

<!-- EnD Selection Disable  -->

					<!-- here subscribtion -->
					<!-- end section-subscribe -->
				</div>
				<!-- end wrap-content -->
				<!-- here copyright -->
					
					<!-- end footer -->
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
				<!-- <a class="link-account" href="javascript:void(0);>login</a> -->
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
	
</form>
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
		
		<!-- MODAL for POPUP -->
        <div class="modal fade" id="modal-login" tabindex="-1" role="dialog" aria-labelledby="modal-login-label" aria-hidden="true">
        	<div class="modal-dialog">
        		<div class="modal-content">       			
        			<div class="modal-header">
        				<h3>Please Login</h3>
						<div class="entry-content">
        				<p>You need to be Logged In to place order.</p>
						</div>
        			</div>      			
        			<div class="modal-body">
	                    <button type="button" data-dismiss="modal" class="comment-reply-form__btn ui-btn ui-btn-primary btn-effect">OK</button>     
        			</div>        			
        		</div>
        	</div>
        </div>


        <!-- Javascript for POPUP -->
        <script src="assets/plugins/popup/js/jquery.backstretch.min.js"></script>
        <script src="assets/plugins/popup/js/scripts.js"></script>
		

	<script type="text/javascript">
		var checker1 = document.getElementById('bbqchicken');
		var checker2 = document.getElementById('periperichicken');
		var checker3 = document.getElementById('chickenbonanza');
		var checker4 = document.getElementById('meatdeluxe');
		var checker5 = document.getElementById('chickensupreme');
		var checker6 = document.getElementById('exoticmushroom');
		var checker7 = document.getElementById('vegmediterranean');
		var checker8 = document.getElementById('chickenmexicana');
		var checker9 = document.getElementById('vegextravaganza');
		var checker10 = document.getElementById('countryspecial');
		var checker11 = document.getElementById('zestychicken');
		var checker12 = document.getElementById('chickenmediterranean');
		var checker13 = document.getElementById('vegprimavera');
		var checker14 = document.getElementById('peppypaneer');
		var checker15 = document.getElementById('vegsupreme');
		var checker16 = document.getElementById('roastbeetroot');
		
		var sendbtn = document.getElementById('btnsubmit');

		checker1.onchange = function(){if(this.checked){sendbtn.disabled = false;}else{sendbtn.disabled = true;}}
		checker2.onchange = function(){if(this.checked){sendbtn.disabled = false;}else{sendbtn.disabled = true;}}
		checker3.onchange = function(){if(this.checked){sendbtn.disabled = false;}else{sendbtn.disabled = true;}}
		checker4.onchange = function(){if(this.checked){sendbtn.disabled = false;}else{sendbtn.disabled = true;}}
		checker5.onchange = function(){if(this.checked){sendbtn.disabled = false;}else{sendbtn.disabled = true;}}
		checker6.onchange = function(){if(this.checked){sendbtn.disabled = false;}else{sendbtn.disabled = true;}}
		checker7.onchange = function(){if(this.checked){sendbtn.disabled = false;}else{sendbtn.disabled = true;}}
		checker8.onchange = function(){if(this.checked){sendbtn.disabled = false;}else{sendbtn.disabled = true;}}
		checker9.onchange = function(){if(this.checked){sendbtn.disabled = false;}else{sendbtn.disabled = true;}}
		checker10.onchange = function(){if(this.checked){sendbtn.disabled = false;}else{sendbtn.disabled = true;}}
		checker11.onchange = function(){if(this.checked){sendbtn.disabled = false;}else{sendbtn.disabled = true;}}
		checker12.onchange = function(){if(this.checked){sendbtn.disabled = false;}else{sendbtn.disabled = true;}}
		checker13.onchange = function(){if(this.checked){sendbtn.disabled = false;}else{sendbtn.disabled = true;}}
		checker14.onchange = function(){if(this.checked){sendbtn.disabled = false;}else{sendbtn.disabled = true;}}
		checker15.onchange = function(){if(this.checked){sendbtn.disabled = false;}else{sendbtn.disabled = true;}}
		checker16.onchange = function(){if(this.checked){sendbtn.disabled = false;}else{sendbtn.disabled = true;}} 
</script>
		 



</body>
</html>