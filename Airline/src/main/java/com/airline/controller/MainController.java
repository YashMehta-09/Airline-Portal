package com.airline.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airline.bo.FlightBO;
import com.airline.bo.UserBO;
import com.airline.dao.MySqlDAO;
import com.airline.model.Flight;
import com.airline.model.User;

public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MainController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Logged Out");
		HttpSession session = request.getSession(false);
		session.invalidate();
		RequestDispatcher dispatch = request.getRequestDispatcher("Index.jsp");
		dispatch.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		RequestDispatcher dispatch = null;

		User user = new User();
		UserBO userBO = new UserBO();

		String emailId = request.getParameter("email");
		String password = request.getParameter("password");
		String contact = request.getParameter("contact");

		user.setEmailId(emailId);
		user.setPassword(password);
		user.setContact(contact);

		if ("Login".equals(request.getParameter("Login"))) {
			System.out.println("Inside Login");
			boolean status = userBO.validate(user);
			// System.out.println(status);
			if (status) {
				dispatch = request.getRequestDispatcher("views/main.jsp");
				session.setAttribute("user", user);
				dispatch.forward(request, response);
			}
		} else if ("Signup".equals(request.getParameter("Signup"))) {
			System.out.println("Inside Signup");
			boolean status = userBO.create(user);
			// System.out.println(status);
			if (status) {
				dispatch = request.getRequestDispatcher("views/main.jsp");
				session.setAttribute("user", user);
				dispatch.forward(request, response);
			}
		} else if ("Flights".equals(request.getParameter("Flights"))) {
			System.out.println("Flights");

			String source = request.getParameter("source");
			String destination = request.getParameter("destination");
			String date = request.getParameter("date");
			Date date1=null;
			System.out.println(date);
			if(date.isEmpty()) {

				date1=new Date();

				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");

				date=sdf.format(date1);

				//System.out.println(date);

			}
			else
			{
				SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
				try {
					date1 = fmt.parse(date);
					fmt.applyPattern("dd-MM-yyyy");
					System.out.println(date1);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println(source);
			System.out.println(destination);
			
			Flight flightdetails = new Flight();

			flightdetails.setDestination(destination);
			flightdetails.setSource(source);

			/*SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date d = null;
			try {
				d = sdf.parse(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}*/

			flightdetails.setDate(date1);
			System.out.println(date1);

			FlightBO flightBO = new FlightBO();

			List<Flight> flightList = flightBO.flightRecords(flightdetails);

			session.setAttribute("flights", flightList);

			if (flightList.size() == 0) {

			} else {
				dispatch = request.getRequestDispatcher("views/flight.jsp");
				dispatch.forward(request, response);
			}
		}
	}

}
