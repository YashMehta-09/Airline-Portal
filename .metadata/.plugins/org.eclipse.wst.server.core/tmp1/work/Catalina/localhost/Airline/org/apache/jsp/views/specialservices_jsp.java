/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.13
 * Generated at: 2019-01-14 10:29:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class specialservices_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Booking Form HTML Template</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Google font -->\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Cantata+One\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Imprima\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css4/bootstrap.min.css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Custom stlylesheet -->\r\n");
      out.write("\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css4/style.css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("\r\n");
      out.write("\t\t  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"TicketGenerateController\" method=\"post\" onSubmit=\"\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");

			int passenger = (Integer) session.getAttribute("passenger");

			System.out.println(passenger);
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"booking\" class=\"section\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"section-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"booking-cta\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");

								for (int i = 0; i < passenger; i++)

								{
							
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<center>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\"color: white\">Make Your Reservation for\r\n");
      out.write("\t\t\t\t\t\t\t\t\tPassenger");
      out.print(i + 1);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</center>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<br> <br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"booking-form\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"form-label\">Seat type 1</span> <select\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"seattype1");
      out.print(i + 1);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"select");
      out.print(i + 1);
      out.write("\">Select</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"window");
      out.print(i + 1);
      out.write("\">Window</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"aisle");
      out.print(i + 1);
      out.write("\">Aisle</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"near emergency");
      out.print(i + 1);
      out.write("\">Near\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tEmergency</option>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select> <span class=\"select-arrow\"></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"form-label\">Seat type 2</span> <select\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"seattype2");
      out.print(i + 1);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<optgroup label=\"Seat Location Type2\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"select");
      out.print(i + 1);
      out.write("\">Select</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"front");
      out.print(i + 1);
      out.write("\">Front</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"middle");
      out.print(i + 1);
      out.write("\">Middle</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"back");
      out.print(i + 1);
      out.write("\">Back</option>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</optgroup>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select> <span class=\"select-arrow\"></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"form-label\">Meal</span> <select\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"meal");
      out.print(i + 1);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"select");
      out.print(i + 1);
      out.write("\">Select</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"veg");
      out.print(i + 1);
      out.write("\">Veg</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"nonveg");
      out.print(i + 1);
      out.write("\">Non Veg</option>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select> <span class=\"select-arrow\"></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"form-label\"> Handicapped</span> <select\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"medical");
      out.print(i + 1);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<optgroup label=\" Physically disabled\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"No");
      out.print(i + 1);
      out.write("\">No</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</optgroup>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<optgroup label=\"if handicapped\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"wheelchair");
      out.print(i + 1);
      out.write("\">Wheelchairs</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"nurses");
      out.print(i + 1);
      out.write("\">Nurses</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"attendants");
      out.print(i + 1);
      out.write("\">Attendants</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"secial medicines");
      out.print(i + 1);
      out.write("\">Special\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tMedicines</option>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</optgroup>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select> <span class=\"select-arrow\"></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-btn\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p></p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"submit-btn\" name=\"SpecialServices\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"SpecialServices\">Choose Special Services</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<form method=\"post\" action=\"TicketGenerateController\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("<p></p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p></p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"submit-btn\" name=\"SkipSpecialServices\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"SkipSpecialServices\">Skip</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<!-- This templates was made by Colorlib (https://colorlib.com) -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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