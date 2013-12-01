package com.canecaria.dao;

import java.util.List;

import com.canecaria.model.User;

public interface UserDao {

	/**
	 * Search User by userName.
	 * 
	 * @param userName
	 * @return user - {@link User}
	 */
	List<User> searchByUsername(String userName);

}
