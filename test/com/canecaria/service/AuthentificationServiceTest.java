package com.canecaria.service;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.canecaria.dao.UserDaoImpl;
import com.canecaria.model.Login;
import com.canecaria.model.User;

public class AuthentificationServiceTest {
	private AuthentificationService service;
	private User user;
	private Login login;
	private UserDaoImpl userDao;
	
	@Before
	public void init() {
		user = new User();
		userDao = new UserDaoImpl();
		service = new AuthentificationService();
	}
	

	public void setUserDatas() {
		login.setUserName("username");
		login.setPassword("password");
		user.setLogin(login);
		user.setName("Usuário");
	}
	
	@Test
	public void userAccess() {
		setUserDatas();
		userDao.save(user);
		
		boolean result = service.loginService(login);
		Assert.assertTrue(result);
	}

}
