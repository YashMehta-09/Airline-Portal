package com.airline.dao;

import com.airline.model.User;

public interface DAO {

	public boolean create(User user);
	public boolean validate(User user);
}