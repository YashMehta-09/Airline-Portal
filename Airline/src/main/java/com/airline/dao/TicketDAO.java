package com.airline.dao;

import com.airline.model.Ticket;

/**
 * @author yasha
 *
 */
public interface TicketDAO {

	/**
	 * @param ticket
	 * @return status
	 */
	public boolean createTicket(Ticket ticket);
	
}
