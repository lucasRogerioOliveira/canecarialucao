package com.canecaria.dao;

import com.canecaria.model.User;

public interface UserDao {

	/**
	 * Search User by userName.
	 * 
	 * @param userName
	 * @return user - {@link User}
	 */
	User searchByUsername(String userName);

}
