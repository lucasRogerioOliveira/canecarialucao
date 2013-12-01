package com.canecaria.dao;

import org.junit.Before;
import org.junit.Test;

import com.canecaria.model.Login;
import com.canecaria.model.Sale;
import com.canecaria.model.User;
import com.canecaria.service.UserService;

public class SaleDaoImplTest {
	
	private SaleDaoImpl dao;
	
	private UserService userService;
	private LoginDaoImpl loginDAO;
	
	@Before
	public void init() {
		dao = new SaleDaoImpl();
		userService = new UserService();
		loginDAO = new LoginDaoImpl();
	}

	@Test
	public void devePersistirRegistro() {
		
		User user = new User();
		user.setName("Willian lindo");
		
		user.setLogin(new Login());
		user.getLogin().setUserName("teste");
		user.getLogin().setPassword("pass");

		Login login = (Login) loginDAO.save(user.getLogin());
		user.getLogin().setId(login.getId());
		userService.save(user);
		
	}
	
	
}
