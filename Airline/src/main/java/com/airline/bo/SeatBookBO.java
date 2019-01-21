package com.airline.bo;

import com.airline.dao.SeatDetailsDAO;

/**
 * @author yasha
 *
 */
public class SeatBookBO {
	
	
	
	
	/**
	 * @param flightSeat
	 * @param flightId
	 * @param passengerCount
	 * @param type
	 * @return record
	 */
	public boolean updateSeat(int flightSeat,String flightId,int passengerCount,String type) {
		
		
		
		
		System.out.println(passengerCount);
		
		System.out.println(flightId);
		
		System.out.println(flightSeat);
		
		System.out.println(type);
		
		int updatedSeatCount=flightSeat-passengerCount;
		
		SeatDetailsDAO seat=new SeatDetailsDAO();
		
		System.out.println(updatedSeatCount+"bo");
		
		boolean record=seat.seatUpdate(updatedSeatCount, flightId,type);
		
		System.out.println(record+"bo");
		
		
		return record;
	}

}
