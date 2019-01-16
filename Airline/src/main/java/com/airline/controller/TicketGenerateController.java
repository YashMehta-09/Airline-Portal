package com.airline.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airline.bo.TicketBO;
import com.airline.model.Passenger;
import com.airline.model.Ticket;
import com.airline.model.User;

/**
 * Servlet implementation class TicketGenerateController
 */
public class TicketGenerateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TicketGenerateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession(false);
		RequestDispatcher dispatch = null;
		
		
		int passenger=(Integer)session.getAttribute("passenger");
		
		String book = request.getParameter("Book");
		String specialService = request.getParameter("SpecialServices");
		String skipSpecialService = request.getParameter("SkipSpecialServices");
		
	
		if(book!=null)
		{
			System.out.println("Passenger Details Taken");
			
			List<Passenger> list = new ArrayList<Passenger>();
			
			for(int i=0;i<passenger;i++)
			{
				String salutation = request.getParameter("salutation"+(i+1));
				String firstName = request.getParameter("firstname"+(i+1));
				String lastName = request.getParameter("lastname"+(i+1));
				String passengerType = request.getParameter("passengertype"+(i+1));
				Passenger p = new Passenger();
				System.out.println(salutation);
				System.out.println(firstName);
				System.out.println(lastName);
				System.out.println(passengerType);
				p.setFirstName(firstName);
				p.setLastName(lastName);
				p.setSalutation(salutation);
				p.setPassengerType(passengerType);
				list.add(p);
				System.out.println("Added to list");
				
			}
			Ticket ticket = (Ticket) session.getAttribute("ticket");
			
			//User user = (User) session.getAttribute("user");

			System.out.println(ticket.getStatus());
			ticket.setPassengerList(list);
			/*ticket.setUser(user);
			System.out.println(ticket.getUser().getEmailId());
			TicketBO ticketBO = new TicketBO();
			boolean status = ticketBO.createTicket(ticket);
			System.out.println(status);*/
			System.out.println("After Booked");
			
			dispatch = request.getRequestDispatcher("views/specialservices.jsp");
			dispatch.forward(request, response);
		}
		else if(specialService!=null)
		{
			System.out.println("Special Service Taken");
			dispatch = request.getRequestDispatcher("views/visa.jsp");
			dispatch.forward(request, response);
		}
		
		else if(skipSpecialService!=null)
		{
			System.out.println("Skipped Special Service");
			dispatch = request.getRequestDispatcher("views/visa.jsp");
			dispatch.forward(request, response);
		}
	}

}

