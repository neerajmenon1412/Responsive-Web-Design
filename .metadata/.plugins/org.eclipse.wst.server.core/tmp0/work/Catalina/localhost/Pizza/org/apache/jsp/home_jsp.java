/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.14
 * Generated at: 2016-03-30 17:27:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, minimal-ui\">\r\n");
      out.write("\t\t<title>Marherita, Home</title>\r\n");
      out.write("\r\n");
      out.write("\t\t<link href=\"favicon.png\" type=\"image/x-icon\" rel=\"shortcut icon\">\r\n");
      out.write("\t\t<link href=\"assets/css/master.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<script src=\"assets/plugins/jquery/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Loader -->\r\n");
      out.write("\t\t<div id=\"page-preloader\"><span class=\"spinner\"></span></div>\r\n");
      out.write("\t\t<!-- Loader end -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"layout-theme animated-css\" id=\"wrapper\" data-header=\"sticky\" data-header-top=\"700\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"sb-site\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"wrap-content\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"main-slider slider-pro\" id=\"my-slider\"\r\n");
      out.write("\t\t\t\t\t\tdata-slider-width=\"100%\"\r\n");
      out.write("\t\t\t\t\t\tdata-slider-height=\"100%\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sp-slides\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Slide 0 -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"sp-slide\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"sp-image img-responsive\" src=\"assets/media/main-slider/main-slider_bg-1.jpg\" height=\"1080\" width=\"1920\" alt=\"slider\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sp-layer main-slider__title\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-horizontal=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-vertical=\"-23%\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-position=\"centerCenter\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-transition=\"up\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-hide-transition=\"down\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-duration=\"800\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-delay=\"400\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-hide-delay=\"400\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tGet it while its hot!\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sp-layer main-slider__text text-center\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-horizontal=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-vertical=\"19%\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-position=\"centerCenter\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-width=\"45%\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-height=\"30%\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-transition=\"up\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-hide-transition=\"down\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-duration=\"800\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-delay=\"1200\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-hide-delay=\"1200\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"hidden-xs\">We create custom, personal pizzas with quality ingredients in only five minutes.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"shop-catalog.jsp\"><button class=\"comment-reply-form__btn ui-btn ui-btn-primary btn-effect\">order now</button></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Slide 1 -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"sp-slide\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"sp-image img-responsive\" src=\"assets/media/main-slider/main-slider_bg-1.jpg\" height=\"1080\" width=\"1920\" alt=\"slider\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sp-layer main-slider__title\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-horizontal=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-vertical=\"-23%\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-position=\"centerCenter\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-transition=\"up\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-hide-transition=\"down\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-duration=\"800\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-delay=\"400\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-hide-delay=\"400\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tGet it while its hot!\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sp-layer main-slider__text text-center\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-horizontal=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-vertical=\"19%\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-position=\"centerCenter\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-width=\"45%\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-height=\"30%\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-transition=\"up\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-hide-transition=\"down\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-duration=\"800\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-delay=\"1200\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-hide-delay=\"1200\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"hidden-xs\">We create custom, personal pizzas with quality ingredients in only five minutes.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"comment-reply-form__btn ui-btn ui-btn-primary btn-effect\">order now</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- end sp-slide -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Slide 2 -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"sp-slide\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"sp-image img-responsive\" src=\"assets/media/main-slider/main-slider_bg-1.jpg\" height=\"1080\" width=\"1920\" alt=\"slider\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sp-layer main-slider__title\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-horizontal=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-vertical=\"-23%\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-position=\"centerCenter\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-transition=\"up\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-hide-transition=\"down\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-duration=\"800\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-delay=\"400\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-hide-delay=\"400\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tGet it while its hot!\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sp-layer main-slider__text text-center\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-horizontal=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-vertical=\"19%\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-position=\"centerCenter\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-width=\"45%\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-height=\"30%\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-transition=\"up\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-hide-transition=\"down\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-duration=\"800\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-show-delay=\"1200\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-hide-delay=\"1200\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"hidden-xs\">We create custom, personal pizzas with quality ingredients in only five minutes.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"ui-btn ui-btn_mod-a btn-effect\" href=\"javascript:void(0);\">order online</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- end sp-slide -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- end sp-slides -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- end main-slider -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- HEADER -->\r\n");
      out.write("\t\t\t\t\t<header class=\"header clearfix wow slideInUp\" data-wow-duration=\"2s\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"header__wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sb-toggle-left\"><i class=\"icon pe-7s-menu\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"logo\" href=\"home.html\"><img class=\"img-responsive\" src=\"assets/img/logo_mod-a.png\" alt=\"Logo\"></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t\t<!-- end header -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<section class=\"section-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2 class=\"ui-title-block wow fadeInUp\" data-wow-duration=\"2s\">We are pizza makers, and our mission is to make cool pizza which feeds all your senses.</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"ui-subtitle-block wow fadeInUp\" data-wow-duration=\"2s\">We prefer to rely on instinct and feel, measuring by hand, not by the gram. This is the authentic way to make pizza. Sure its a little unrefined, but were proud. <br> Its pizza like this which feeds your sense of sharing, adding flavour to those occasions when you get together with friends and family. <br> And really, isnt that what its all about? Because when pizza feeds all your senses, its not just great, its sensational.</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"advantages\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"advantages__item wow fadeInLeft\" data-wow-duration=\"2s\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon pe-7s-leaf\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"advantages__title ui-title-inner\">Were Careful</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"advantages__description\">The crust is stored in a separate container, on a separate shelf in our fridge. The cheese, marinara sauce and pepperoni are stored in a  designated kit, and every pizza is freshly baked on designated parchment paper in our ovens.</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"advantages__item wow fadeInUp\" data-wow-duration=\"2s\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon pe-7s-medal\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"advantages__title ui-title-inner\">Were Certified</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"advantages__description\">Our cheese-only and cheese-and-pepperoni gluten-free pizzas are prepared using the procedures certified by the Gluten Intolerance Group (GIG), and we take specific caution when making these pizzas.</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"advantages__item wow fadeInRight\" data-wow-duration=\"2s\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon pe-7s-rocket\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"advantages__title ui-title-inner\">Youre Creative</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"advantages__description\">For those simply looking to reduce gluten in their diets, we offer a Create Your Own pizza option. The cheese, pepperoni and marinara come from our gluten-free kit, but all additional toppings are stored at our standard make table.</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- end advantages -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- end col -->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- end row -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- end container -->\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t<!-- end section-default -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"section-bg_mod-c wow bounceInUp\" data-wow-duration=\"2s\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"slider-goods slider-type-a slider_mod-a owl-carousel owl-theme owl-theme_mod-a enable-owl-carousel\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-pagination=\"false\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-navigation=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-single-item=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-auto-play=\"7000\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-transition-style=\"fade\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-main-text-animation=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-after-init-delay=\"3000\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-after-move-delay=\"1000\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-stop-on-hover=\"true\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"slider-type-a__item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"slider-type-a__img\"><img class=\"img-responsive\" src=\"assets/media/slider-other/1.png\" height=\"617\" width=\"618\" alt=\"Foto\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"slider-type-a__inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"slider-type-a__name\">Peri-Peri</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"slider-type-a__price\">$18 - $37</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"slider-type-a__description\">Marinated Chicken Breast Fillets, Shallots, Roasted Capsicum, Caramelised Onions & Bocconcini on a Tomato base, topped with Peri-Peri sauce</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"ui-btn ui-btn-primary btn-effect\" href=\"javascript:void(0);\">order now</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"slider-type-a__item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"slider-type-a__img\"><img class=\"img-responsive\" src=\"assets/media/slider-other/1.png\" height=\"617\" width=\"618\" alt=\"Foto\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"slider-type-a__inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"slider-type-a__name\">Peri-Peri</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"slider-type-a__price\">$18 - $37</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"slider-type-a__description\">Marinated Chicken Breast Fillets, Shallots, Roasted Capsicum, Caramelised Onions & Bocconcini on a Tomato base, topped with Peri-Peri sauce</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"ui-btn ui-btn-primary btn-effect\" href=\"javascript:void(0);\">order now</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- end slider -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- end container -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- end section-bg_mod-c -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<br/><br/>\r\n");
      out.write("\t\t\t\t\t<section class=\"section-default wow fadeInUp\" data-wow-duration=\"2s\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2 class=\"ui-title-block\">Latest News & Recipes</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<article class=\"post post_mod-a clearfix wow fadeInRight\" data-wow-duration=\"2s\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"entry-media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"assets/media/post/320x255/post_320x255_img-1.jpg\" class=\"prettyPhoto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"assets/media/post/320x255/post_320x255_img-1.jpg\" height=\"255\" width=\"320\" alt=\"Foto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"entry-main\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"entry-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"entry-meta\"><time datetime=\"2012-10-27 15:20\"><a href=\"javascript:void(0);\">January 22, 2015</a></time></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h2 class=\"entry-title ui-title-inner\">Perfect Pizza Using Baking Steel Broiler Method</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"entry-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<footer class=\"entry-footer clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"ui-btn ui-btn-primary btn-effect\" href=\"javascript:void(0);\">read more</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</footer>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</article>end post\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<article class=\"post post_mod-a clearfix wow fadeInUp\" data-wow-duration=\"2s\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"entry-media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"assets/media/post/320x255/post_320x255_img-2.jpg\" class=\"prettyPhoto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"assets/media/post/320x255/post_320x255_img-2.jpg\" height=\"255\" width=\"320\" alt=\"Foto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"entry-main\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"entry-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"entry-meta\"><time datetime=\"2012-10-27 15:20\"><a href=\"javascript:void(0);\">December 18, 2014</a></time></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h2 class=\"entry-title ui-title-inner\">Green Onion and Burrata Cheese Pizza Recipe</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"entry-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<footer class=\"entry-footer clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"ui-btn ui-btn-primary btn-effect\" href=\"javascript:void(0);\">read more</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</footer>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</article>end post\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<article class=\"post post_mod-a clearfix wow fadeInLeft\" data-wow-duration=\"2s\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"entry-media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"assets/media/post/320x255/post_320x255_img-3.jpg\" class=\"prettyPhoto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"assets/media/post/320x255/post_320x255_img-3.jpg\" height=\"255\" width=\"320\" alt=\"Foto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"entry-main\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"entry-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"entry-meta\"><time datetime=\"2012-10-27 15:20\"><a href=\"javascript:void(0);\">December 10, 2014</a></time></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h2 class=\"entry-title ui-title-inner\">Brussels Sprouts, Pepper and Bacon Hot Pizza Recipes</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"entry-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<footer class=\"entry-footer clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"ui-btn ui-btn-primary btn-effect\" href=\"javascript:void(0);\">read more</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</footer>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</article>end post\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\tend col\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\tend row\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\tend container\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t<!-- end section-default -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- end section-carusel -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<section class=\"section-subscribe wow fadeInUp\" data-wow-duration=\"2s\">\r\n");
      out.write("\t\t\t\t\t\t<form class=\"form-subscribe\" action=\"subscribe\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 class=\"ui-title-block ui-title-block_mod-a form-subscribe__title\">Sign up for the newsletter and get exclusive deals.</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"email\" placeholder=\"Enter your email address\" name=\"subscribe_email\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"page\" value=\"home\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"ui-btn ui-btn_mod-c btn-effect btn-effect\" type=\"submit\">subscribe</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- end col -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- end row -->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- end container -->\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t<!-- end footer-form -->\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t<!-- end section-subscribe -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- end wrap-content -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- end #sb-site -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"sb-slidebar sb-left\">\r\n");
      out.write("\t\t\t\t<!-- <form method=\"get\" class=\"form-search\" id=\"search-global-form\">\r\n");
      out.write("\t\t\t\t\t<input class=\"form-search__input\" type=\"text\" placeholder=\"Search\">\r\n");
      out.write("\t\t\t\t\t<button class=\"form-search__btn\"><i class=\"icon fa fa-search\"></i></button>\r\n");
      out.write("\t\t\t\t</form> -->\r\n");
      out.write("\t\t\t\t<nav class=\"main-nav\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"navig-menu list-unstyled\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"navig-menu__item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"navig-menu__link\" href=\"home.html\">Home</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"navig-menu__item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"navig-menu__link\" href=\"shop-catalog.jsp\">Pizza menu</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"navig-menu__item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"navig-menu__link\" href=\"blog.html\">blog</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"navig-menu__item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"navig-menu__link\" href=\"blog-details.html\">pages</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"navig-menu__item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"navig-menu__link\" href=\"about.html\">about us</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"navig-menu__item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"navig-menu__link\" href=\"contactus.jsp\">contact</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t<!-- end main-nav -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"border-bottom\"></div>\r\n");
      out.write("\t\t\t\t<!-- <a class=\"btn btn-link-1 launch-modal\" href=\"#\" data-modal-id=\"modal-register\">Launch modal</a> -->\r\n");
      out.write("\t\t\t\t<a class=\"link-account\" href=\"login-signup.jsp\">login </a>\r\n");
      out.write("\t\t\t\t<a class=\"link-account\" href=\"javascript:void(0);\">my account </a>\r\n");
      out.write("\t\t\t\t<a class=\"link-account\" href=\"javascript:void(0);\">checkout</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- end sb-left -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- SCRIPTS MAIN -->\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"assets/js/jquery-migrate-1.2.1.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/plugins/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/js/waypoints.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../../cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/js/modernizr.custom.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/js/cssua.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!--SCRIPTS THEME-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Sidebar -->\r\n");
      out.write("\t\t<script src=\"assets/plugins/slidebars/dist/slidebars.js\"></script>\r\n");
      out.write("\t\t<!-- Home slider -->\r\n");
      out.write("\t\t<script src=\"assets/plugins/slider-pro/dist/js/jquery.sliderPro.js\"></script>\r\n");
      out.write("\t\t<!-- Sliders -->\r\n");
      out.write("\t\t<script src=\"assets/plugins/owl-carousel/owl.carousel.min.js\"></script>\r\n");
      out.write("\t\t<!-- Isotope -->\r\n");
      out.write("\t\t<script src=\"assets/plugins/isotope/isotope.pkgd.min.js\"></script>\r\n");
      out.write("\t\t<!-- Modal -->\r\n");
      out.write("\t\t<script src=\"assets/plugins/prettyphoto/js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("\t\t<!-- Date select -->\r\n");
      out.write("\t\t<script src=\"assets/plugins/datetimepicker/jquery.datetimepicker.js\"></script>\r\n");
      out.write("\t\t<!-- Select customization -->\r\n");
      out.write("\t\t<script src=\"assets/plugins/bootstrap-select/dist/js/bootstrap-select.min.js\"></script>\r\n");
      out.write("\t\t<!-- Price slider -->\r\n");
      out.write("\t\t<script src=\"assets/plugins/nouislider/jquery.nouislider.all.min.js\"></script>\r\n");
      out.write("\t\t<!-- Chart -->\r\n");
      out.write("\t\t<script src=\"assets/plugins/rendro-easy-pie-chart/dist/jquery.easypiechart.min.js\"></script>\r\n");
      out.write("\t\t<!-- Animation -->\r\n");
      out.write("\t\t<script src=\"assets/js/wow.min.js\"></script>\r\n");
      out.write("\t\t<!-- Scrollspy -->\r\n");
      out.write("\t\t<script src=\"assets/js/scrollspy.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Custom -->\r\n");
      out.write("\t\t<script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}