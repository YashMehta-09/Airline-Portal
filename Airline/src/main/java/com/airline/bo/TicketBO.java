package com.airline.bo;

import com.airline.dao.TicketDetailsDAO;
import com.airline.model.Ticket;

/**
 * @author yasha
 *
 */
public class TicketBO {
	
	
	TicketDetailsDAO ticketDetailsDAO = new TicketDetailsDAO();

	/**
	 * @param ticket
	 * @return status
	 */
	public boolean createTicket(Ticket ticket)
	{
		
		boolean status = ticketDetailsDAO.createTicket(ticket);
		
		return status;
	}
	
	
	/**
	 * @param ticketId
	 * @return ticket
	 */
	public Ticket getTicketDetails(int ticketId ) {
		
		Ticket ticket=ticketDetailsDAO.getTicketDetails(ticketId);
		
		
		System.out.println(ticket.getTicketId()+"bo");
		
		return ticket;
		
	}
	
	/**
	 * @param status
	 * @param ticketId
	 * @param payment
	 * @return ticketstatus
	 */
	public boolean updateTicketStatus(String status,int ticketId,float payment) {
		
		boolean ticketstatus=ticketDetailsDAO.updateTicket(status, ticketId,payment);
		
		if(ticketstatus) {
			System.out.println(ticketstatus+"bo");
		}
		else {
			System.out.println(ticketstatus+"bo");

		}
		return ticketstatus;
	}
}
