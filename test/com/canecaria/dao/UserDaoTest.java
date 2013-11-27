package com.canecaria.dao;

import org.junit.Before;
import org.junit.Test;

import com.canecaria.model.User;

public class UserDaoTest {
	
	UserDaoImpl dao; 

	@Before
	public void init() {
		dao = new UserDaoImpl();
	}
	
	
	@Test
	public void insertUser() {
		User user = new User();
		user.setCpf("32287661054");
		user.setName("Josicleide");
		dao.save(user);
	}
}
