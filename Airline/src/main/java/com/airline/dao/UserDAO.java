package com.airline.dao;


import com.airline.model.User;

/**
 * @author yasha
 *
 */
public interface UserDAO {

	/**
	 * @param user
	 * @return status
	 */
	public boolean create(User user);
	/**
	 * @param user
	 * @return status
	 */
	public boolean validate(User user);
}
