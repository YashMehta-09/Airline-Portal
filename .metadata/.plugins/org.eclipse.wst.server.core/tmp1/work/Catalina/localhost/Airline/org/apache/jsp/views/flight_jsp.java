/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.13
 * Generated at: 2019-01-25 09:45:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.airline.model.*;
import com.airline.controller.*;

public final class flight_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("com.airline.controller");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.airline.model");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Flight Details</title>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("\n");
      out.write("body { background-image: linear-gradient(#abc 100%, #000);}\n");
      out.write("\n");
      out.write("h1, table { text-align: center; }\n");
      out.write("\n");
      out.write("table {border-collapse: collapse;  width: 70%; margin: 0 auto 7rem;}\n");
      out.write("\n");
      out.write("th, td { padding: 0.2rem; font-size: 1.3rem; }\n");
      out.write("\n");
      out.write("tr {background: hsl(50, 50%, 80%); }\n");
      out.write("\n");
      out.write("tr, td { transition: .2s ease-in; } \n");
      out.write("\n");
      out.write("tr:first-child {background: hsla(12, 100%, 40%, 0.5); }\n");
      out.write("\n");
      out.write("tr:nth-child(even) { background: hsla(50, 50%, 80%, 0.7); }\n");
      out.write("\n");
      out.write("td:empty {background: hsla(50, 25%, 60%, 0.7); }\n");
      out.write("\n");
      out.write("tr:hover:not(#firstrow), tr:hover td:empty {background: #ff0; pointer-events: visible;}\n");
      out.write("tr:hover:not(#firstrow) { transform: scale(1.05); font-weight: 500; box-shadow: 0px 3px 7px rgba(0, 0, 0, 0.5);}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t");

		User user = (User) session.getAttribute("user");
		int passenger = (Integer) session.getAttribute("passenger");
		System.out.print(passenger);
		if (user != null)

		{
	
      out.write("\n");
      out.write("\n");
      out.write("\t<h2>");
      out.print(user.getEmailId());
      out.write("</h2>\n");
      out.write("\n");
      out.write("\t");

		}
	
      out.write("\n");
      out.write("\t<h1>Flight List</h1>\n");
      out.write("\t<table id=\"racetimes\">\n");
      out.write("\t\t<tr id=\"firstrow\">\n");
      out.write("\t\t<th>Flight Id</th>\n");
      out.write("\t\t\t\t<th>Airline Name</th>\n");
      out.write("\t\t\t\t<th>Departure</th>\n");
      out.write("\t\t\t\t<th>Arrival</th>\n");
      out.write("\n");
      out.write("\t\t\t\t<th>Date</th>\n");
      out.write("\t\t\t\t<th>Departure Time</th>\n");
      out.write("\t\t\t\t<th>Arrival Time</th>\n");
      out.write("\t\t\t\t<th>Duration</th>\n");
      out.write("\n");
      out.write("\t\t\t\t<th>Business Seat</th>\n");
      out.write("\t\t\t\t<th>Business Seat Price</th>\n");
      out.write("\t\t\t\t<th>Economy Seat</th>\n");
      out.write("\n");
      out.write("\t\t\t\t<th>Economy Seat Price</th>\n");
      out.write("\t\t\t\t<th>Booking Status</th>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t");

			
					if (user != null)
			
					{
				
      out.write("\n");
      out.write("\t\t\t\t<th>ReserveSeat</th>\n");
      out.write("\t\t\t\t<th>PrebookSeat</th>\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t");

				List<Flight> flightlist = (List<Flight>) session.getAttribute("flights");

				for (Flight f : flightlist) {
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<td>");
      out.print(f.getFlightId());
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t<td>");
      out.print(f.getAirlineName());
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t<td>");
      out.print(f.getSource());
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t<td>");
      out.print(f.getDestination());
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t<td>");
      out.print(f.getDate());
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t<td>");
      out.print(f.getDepartureTime());
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t<td>");
      out.print(f.getArrivalTime());
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t<td>");
      out.print(f.getDuration());
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t<td>");
      out.print(f.getBusinessSeat());
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t<td>");
      out.print(f.getBusinessPrice());
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t<td>");
      out.print(f.getEconomySeat());
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t<td>");
      out.print(f.getEconomyPrice());
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t<form method=\"post\" action=\"FlightDetailsController\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\"\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tstyle=\"background-color: #32CD32;\" name=\"Booked\" value=\"Economy\">BOOK Economy</button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\"\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tstyle=\"background-color: #32CD32;\" name=\"Booked\" value=\"Business\">BOOK Business</button>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\n");
      out.write("\t\t\t\t");

			
					if (user != null)
			
					{
				
      out.write("\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\"\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tstyle=\"background-color: #32CD32;\" name=\"Reserve\" value=\"Economy\">Reserve\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tEconomy</button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\"\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tstyle=\"background-color: #32CD32;\" name=\"Reserve\" value=\"Business\">Reserve\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tBuisness</button>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\"\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tstyle=\"background-color: #32CD32;\" name=\"PreBook\" value=\"Economy\">Prebook\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tEconomy</button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\"\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tstyle=\"background-color: #32CD32;\" name=\"PreBook\" value=\"Business\">Prebook\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tBuisness</button>\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\t\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t <input type=\"hidden\" name=\"flightid\" value=");
      out.print(f.getFlightId());
      out.write(">\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"airlinename\"\n");
      out.write("\t\t\t\t\tvalue=");
      out.print(f.getAirlineName());
      out.write("> <input type=\"hidden\"\n");
      out.write("\t\t\t\t\tname=\"source\" value=");
      out.print(f.getSource());
      out.write("> <input\n");
      out.write("\t\t\t\t\ttype=\"hidden\" name=\"destination\" value=");
      out.print(f.getDestination());
      out.write(">\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"date\" value=");
      out.print(f.getDate());
      out.write("> <input\n");
      out.write("\t\t\t\t\ttype=\"hidden\" name=\"departuretime\" value=");
      out.print(f.getDepartureTime());
      out.write(">\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"arrivaltime\"\n");
      out.write("\t\t\t\t\tvalue=");
      out.print(f.getArrivalTime());
      out.write("> <input type=\"hidden\"\n");
      out.write("\t\t\t\t\tname=\"duration\" value=");
      out.print(f.getDuration());
      out.write("> <input\n");
      out.write("\t\t\t\t\ttype=\"hidden\" name=\"businessseat\" value=");
      out.print(f.getBusinessSeat());
      out.write(">\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"businessprice\"\n");
      out.write("\t\t\t\t\tvalue=");
      out.print(f.getBusinessPrice());
      out.write("> <input type=\"hidden\"\n");
      out.write("\t\t\t\t\tname=\"economyseat\" value=");
      out.print(f.getEconomySeat());
      out.write("> <input\n");
      out.write("\t\t\t\t\ttype=\"hidden\" name=\"economyprice\" value=");
      out.print(f.getEconomyPrice());
      out.write(">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");

				}
			
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t</table>\n");
      out.write("\n");
      out.write(" </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
