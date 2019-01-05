<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.*"%>

<%@page import="com.airline.model.*"%>

<%@page import="com.airline.controller.*"%>





<!DOCTYPE html>

<html>

<head>

<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>

</head>

<body>

	<%
		List<Flight> flightlist = (List<Flight>) session.getAttribute("flights");
		User user =(User) session.getAttribute("user");
		
		if(user!=null)
		{
	%>
	<h2><%=user.getEmailId() %></h2>
	<%	}
		else
		{
			out.print("Guest");
		}
		%>

	<h2>FLIGHT LIST</h2>





	<table>

		<tr>
			<th>Flight Id</th>
			<th>Airline Name</th>
			<th>Departure</th>
			<th>Arrival</th>

			<th>Date</th>
			<th>Departure Time</th>
			<th>Arrival Time</th>
			<th>Duration</th>

			<th>Business Seat</th>
			<th>Business Seat Price</th>
			<th>Economy Seat</th>

			<th>Economy Seat Price</th>
			<th>Booking Status</th>
		</tr>

		<%
		for (Flight f : flightlist) 
		{
			
		%>


		<tr>

			<td><%=f.getFlightId()%></td>

			<td><%=f.getArilineName()%></td>

			<td><%=f.getSource()%></td>

			<td><%=f.getDestination()%></td>



			<td><%=f.getDate()%></td>

			<td><%=f.getDepartureTime()%></td>

			<td><%=f.getArrivalTime()%></td>

			<td><%=f.getDuration()%></td>

			<td><%=f.getBusinessSeat()%></td>

			<td><%=f.getBusinessPrice()%></td>

			<td><%=f.getEconomySeat()%></td>

			<td><%=f.getEconomyPrice()%></td>





		</tr>

		<%
			}
		%>
	
</body>

</html>

