package com.airline.bo;

import com.airline.dao.TicketDetailsDAO;
import com.airline.model.Ticket;

/**
 * @author yasha
 *
 */
public class TicketBO {

	/**
	 * @param ticket
	 * @return status
	 */
	public boolean createTicket(Ticket ticket)
	{
		TicketDetailsDAO ticketDetailsDAO = new TicketDetailsDAO();
		boolean status = ticketDetailsDAO.createTicket(ticket);
		
		return status;
	}
	
	
	
	
}
