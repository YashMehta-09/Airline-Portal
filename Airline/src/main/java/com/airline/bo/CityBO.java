package com.airline.bo;

import java.util.List;

import com.airline.dao.CityRecordsDAO;
import com.airline.model.Cities;

/**
 * @author yasha
 *
 */
public class CityBO {

	/**
	 * @return List<Cities>
	 */
	public List<Cities> cityRecords() {
		// TODO Auto-generated method stub
		
		CityRecordsDAO cityDAO = new CityRecordsDAO();
		List<Cities> cityList = cityDAO.records();
		
		return cityList;
	}

	
}
