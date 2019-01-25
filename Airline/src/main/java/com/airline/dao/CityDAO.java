package com.airline.dao;

import java.util.List;

import com.airline.model.Cities;

/**
 * @author yasha
 *
 */
public interface CityDAO {

	/**
	 * @return List<Cities>
	 */
	public List<Cities> records();
}
