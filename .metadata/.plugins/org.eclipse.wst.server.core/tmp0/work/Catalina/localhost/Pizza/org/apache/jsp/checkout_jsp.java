/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.14
 * Generated at: 2016-04-15 11:02:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, minimal-ui\">\r\n");
      out.write("\t\t<title>Peri Peri, Checkout</title>\r\n");
      out.write("\r\n");
      out.write("\t<link href=\"favicon.png\" type=\"image/x-icon\" rel=\"shortcut icon\">\r\n");
      out.write("\t\t<link href=\"assets/css/master.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<script src=\"assets/plugins/jquery/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction validate()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById(\"postcodeerror\").style.visibility = \"hidden\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"post\").style.border=\"\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(document.getElementById(\"addre\").checked == true)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tif(isNaN(document.checkoutform.postcode.value) || document.checkoutform.postcode.value.length != 6)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tif(document.checkoutform.phone.value.length == 10)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"phoneno\").style.border=\"\";\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"phoneerror\").style.visibility = \"hidden\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"post\").style.border=\"1px solid #dd1037\";\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"postcodeerror\").style.visibility = \"visible\";\r\n");
      out.write("\t\t\t\t\tdocument.checkoutform.postcode.focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(isNaN(document.checkoutform.phone.value) || document.checkoutform.phone.value.length != 10)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"phoneno\").style.border=\"1px solid #dd1037\";\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"phoneerror\").style.visibility = \"visible\";\r\n");
      out.write("\t\t\t\t\tdocument.checkoutform.phone.focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Loader -->\r\n");
      out.write("\t\t<div id=\"page-preloader\"><span class=\"spinner\"></span></div>\r\n");
      out.write("\t\t<!-- Loader end -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"layout-theme animated-css\" id=\"wrapper\" data-header=\"sticky\" data-header-top=\"200\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"sb-site\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"wrap-content\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- HEADER -->\r\n");
      out.write("\t\t\t\t\t<header class=\"header clearfix\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"header__wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sb-toggle-left\"><i class=\"icon pe-7s-menu\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"logo\" href=\"http://localhost:8080/Pizza/\"><img class=\"img-responsive\" src=\"assets/img/logo_mod-a.png\" alt=\"Logo\"></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t\t<!-- end header -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"section-title\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"section__inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1 class=\"ui-title-page\">Checkout</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"http://localhost:8080/Pizza/\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"active\">Checkout</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- end section__inner -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- end col -->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- end row -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- end container -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- end section-title -->\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"checkout-top-line\">Returning customer? <a class=\"checkout-top-line__link\" href=\"javascript:void(0);\">Click here to login</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>-->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<form class=\"comment-reply-form\" id=\"comment-reply-form\" name=\"checkoutform\" action=\"newaddress\" method=\"post\" onsubmit=\"return validate()\">\r\n");
      out.write("\t\t\t\t\t<div class=\"section_mod-f\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- <form class=\"comment-reply-form\" id=\"comment-reply-form\" action=\"#\" method=\"post\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<section class=\"section-area\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<!-- Checkbox Selection -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $(\"#addre\").click(function () {\r\n");
      out.write("                if ($(this).is(\":checked\")) {\r\n");
      out.write("                    $(\"#dvPassport\").hide();\r\n");
      out.write("\t\t\t\t\t$(\"#dvPassportx\").show();\r\n");
      out.write("                } else {\r\n");
      out.write("                    $(\"#dvPassport\").show();\r\n");
      out.write("\t\t\t\t\t$(\"#dvPassportx\").hide();\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"dvPassport\">\r\n");
      out.write("       \t\t\t\t\t\t\t\t\t\t\t<h2 class=\"ui-title-inner ui-title-inner_mod-a\">Delivery Address</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address.get(0)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address.get(1)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<br/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address.get(2)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<br/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address.get(3)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<br/>Postcode: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address.get(4)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<br/>Phone: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address.get(5)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>Users original Address</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("    </div>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tfunction chk()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById(\"firstname\").required = true;\r\n");
      out.write("\t\tdocument.getElementById(\"lastname\").required = true;\r\n");
      out.write("\t\tdocument.getElementById(\"addr\").required = true;\r\n");
      out.write("\t\tdocument.getElementById(\"apartment\").required = true;\r\n");
      out.write("\t\tdocument.getElementById(\"town\").required = true;\r\n");
      out.write("\t\tdocument.getElementById(\"post\").required = true;\r\n");
      out.write("\t\tdocument.getElementById(\"phoneno\").required = true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<input class=\"forms__check hidden\" type=\"checkbox\" id=\"addre\"  name=\"check\" onclick=\"chk()\"/>\r\n");
      out.write("    <label class=\"forms__label forms__label-check forms__label-check_mod-a\" for=\"addre\">Delivery to a different address?</label>\r\n");
      out.write("    <hr />\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"dvPassportx\" style=\"display: none\">\r\n");
      out.write("        \t\t\t\t\t\t\t\t\t<h2 class=\"ui-title-inner ui-title-inner_mod-a\">New Delivery Address</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"ui-form-label\">FIRST NAME *</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"fname\" id=\"firstname\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"ui-form-label\">LAST NAME *</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"lname\" id=\"lastname\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"ui-form-label\">ADDRESS *</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control form-control_second\" type=\"text\" name=\"address\" placeholder=\"Street address\" id=\"addr\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" placeholder=\"Apartment, suite, unit etc.\" id=\"apartment\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"ui-form-label\">TOWN / CITY *</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"town\" placeholder=\"Town / City\" id=\"town\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"ui-form-label\">POSTCODE *</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"postcode\" placeholder=\"Postcode / Zip\" id=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"postcode\" id=\"postcodeerror\" style=\"visibility: hidden; color: #dd1037;\"><b>Please provide valid postcode</b></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"ui-form-label\">PHONE *</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"phone\" id=\"phoneno\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"phone\" id=\"phoneerror\" style=\"visibility: hidden; color: #dd1037;\"><b>Please provide valid phone</b></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- end section -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- end col -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"section-table-order section-table-order_mod-a\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<section class=\"section-area\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h2 class=\"table-order__title ui-title-inner\">Your Order</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<table class=\"table-order\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>PRODUCT</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>TOTAL</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");

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
											    
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    \t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"border-cell no-br\">");
      out.print( pizza_name[i]);
      out.write("<span class=\"color_primary\"> x </span><span class=\"enumerator__input\">");
      out.print( quantity[i] );
      out.write(" x (S)</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"border-cell\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"table-order__price\">Rs. ");
      out.print( quantity[i]*pizza_size[i] );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t   ");
 		}
											    		else if(pizza_size[i]>300 && pizza_size[i]<500)
											    		{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    \t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"border-cell no-br\">");
      out.print( pizza_name[i]);
      out.write("<span class=\"color_primary\"> x </span><span class=\"enumerator__input\">");
      out.print( quantity[i] );
      out.write(" x (M)</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"border-cell\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"table-order__price\">Rs. ");
      out.print( quantity[i]*pizza_size[i] );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    \t\t");
 }else if(pizza_size[i]>500)
															{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    \t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"border-cell no-br\">");
      out.print( pizza_name[i]);
      out.write("<span class=\"color_primary\"> x </span><span class=\"enumerator__input\">");
      out.print( quantity[i] );
      out.write(" x (L)</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"border-cell\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"table-order__price\">Rs. ");
      out.print( quantity[i]*pizza_size[i] );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
														
											    	}
											    	else
											    	{
											    		if(pizza_size[i]<300)
														{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    \t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\" no-br\">");
      out.print( pizza_name[i]);
      out.write("<span class=\"color_primary\"> x </span><span class=\"enumerator__input\">");
      out.print( quantity[i] );
      out.write(" x (S)</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"table-order__price\">Rs. ");
      out.print( quantity[i]*pizza_size[i] );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
	}
											    		else if(pizza_size[i]>300 && pizza_size[i]<500)
											    		{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    \t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\" no-br\">");
      out.print( pizza_name[i]);
      out.write("<span class=\"color_primary\"> x </span><span class=\"enumerator__input\">");
      out.print( quantity[i] );
      out.write(" x (M)</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"table-order__price\">Rs. ");
      out.print( quantity[i]*pizza_size[i] );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    \t");
	}
											    		else if(pizza_size[i]>500)
											    		{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    \t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\" no-br\">");
      out.print( pizza_name[i]);
      out.write("<span class=\"color_primary\"> x </span><span class=\"enumerator__input\">");
      out.print( quantity[i] );
      out.write(" x (L)</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"table-order__price\">Rs. ");
      out.print( quantity[i]*pizza_size[i] );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    \t\t");
}
														
											    		
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    \t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    ");
	}
											    }
												
												
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"table-order__total\">Order Total</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"table-order__total\">Rs. ");
      out.print( order_total);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- end section-area -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<section class=\"section_mod-g\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h2 class=\"table-order__title ui-title-inner\">Payment Methods</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- <form class=\"form-payment\" action=\"\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- <form class=\"form-payment\" id=\"comment-reply-form\" action=\"/newaddress\" method=\"post\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"form-payment__item-title\">Cash on Delivery</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"form-payment__description\">Make your payment directly at your doorstep.</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- <button class=\"form-payment__btn ui-btn ui-btn-primary btn-effect\" onclick=\"mymsg\">place order</button> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"form-payment__btn ui-btn ui-btn-primary btn-effect\" type=\"submit\">place order</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- </form> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- end section-table-order -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- end col -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- end row -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- end container -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- end section_mod-b -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<section class=\"section-subscribe\">\r\n");
      out.write("\t\t\t\t\t\t<form class=\"form-subscribe\" action=\"subscribe\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 class=\"ui-title-block ui-title-block_mod-a form-subscribe__title\">Sign up for the newsletter and get exclusive deals.</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"email\" placeholder=\"Enter your email address\" name=\"subscribe_email\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"page\" value=\"checkout\">\r\n");
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
      out.write("\r\n");
      out.write("\t\t\t\t\t<footer class=\"footer\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"copyright border-top\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"text-center\">Copyright © 2016 <a class=\"copyright__link\" href=\"\">Peri Peri.</a> All rights reserved.</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div><!-- end copyright -->\r\n");
      out.write("\t\t\t\t\t</footer>\r\n");
      out.write("\t\t\t\t\t<!-- end footer -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- end wrap-content -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- end #sb-site -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"sb-slidebar sb-left\">\r\n");
      out.write("\t\t\t\t<nav class=\"main-nav\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"navig-menu list-unstyled\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"navig-menu__item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"navig-menu__link\" href=\"http://localhost:8080/Pizza/\">Home</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"navig-menu__item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"navig-menu__link\" href=\"shop-catalog.jsp\">Pizza menu</a>\r\n");
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
      out.write("\t\t\t\t<div class=\"border-bottom\"></div>\r\n");
      out.write("\t\t\t\t");

					String email = (String)session.getAttribute("email");
												
					if(email == null || email == "fail")
					{	session.setAttribute("email", null);
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a class=\"link-account\" href=\"login-signup.jsp\">login</a>\r\n");
      out.write("\t\t\t\t\t");
}
					else
					{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- <a class=\"link-account\" onclick=\"logout()\" href=\"http://localhost:8080/Pizza/\">log out</a> -->\r\n");
      out.write("\t\t\t\t\t\t<a class=\"link-account\" href=\"logout.jsp\">log out</a>\r\n");
      out.write("\t\t\t\t\t");
}
				
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- end sb-left -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end layout-theme -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\t\t<script src=\"assets/plugins/bootstrap-select/dist/js/bootstrap-select.js\"></script>\r\n");
      out.write("\t\t<!-- Price slider -->\r\n");
      out.write("\t\t<script src=\"assets/plugins/nouislider/jquery.nouislider.all.min.js\"></script>\r\n");
      out.write("\t\t<!-- Chart -->\r\n");
      out.write("\t\t<script src=\"assets/plugins/rendro-easy-pie-chart/dist/jquery.easypiechart.min.js\"></script>\r\n");
      out.write("\t\t<!-- Animation -->\r\n");
      out.write("\t\t<script src=\"assets/js/wow.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Custom -->\r\n");
      out.write("\t\t<script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
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
