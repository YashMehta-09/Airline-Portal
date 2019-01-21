package com.airline.dao;

import java.util.List;

import com.airline.model.Flight;

/**
 * @author yasha
 *
 */
public interface FlightDAO {
	
	/**
	 * @param flight
	 * @return List<Flight>
	 */
	public List<Flight> records(Flight flight);

}