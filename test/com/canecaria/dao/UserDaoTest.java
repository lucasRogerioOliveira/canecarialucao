package com.canecaria.dao;

import org.junit.Test;

import com.canecaria.model.User;

public class UserDaoTest {
	UserDaoImpl dao = new UserDaoImpl();
	
	@Test
	public void insertUser() {
		User user = new User();
		dao.save(user);
//		dao.delete(user);
	}
}
