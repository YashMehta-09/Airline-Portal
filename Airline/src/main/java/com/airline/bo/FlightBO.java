package com.airline.bo;

import java.util.List;

import com.airline.dao.FlightRecordsDAO;
import com.airline.model.Flight;

/**
 * @author yasha
 *
 */
public class FlightBO {
	
	//List<FlightDetails> list=new ArrayList<>();
	
	/**
	 * @param flight
	 * @return List<Flight>
	 */
	public List<Flight>  flightRecords(Flight flight){
		
		
		FlightRecordsDAO flightDAO=new FlightRecordsDAO();
		
	List<Flight> list=flightDAO.records(flight);
	
		
		return list;
		
	}

}
