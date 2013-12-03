package com.canecaria.dao;

import org.junit.Before;
import org.junit.Test;

import com.canecaria.model.Login;
import com.canecaria.model.Sale;
import com.canecaria.model.User;
import com.canecaria.service.RegisterUserService;

public class SaleDaoImplTest {
	
	private SaleDaoImpl dao;
	
	private RegisterUserService userService;
//	private LoginDaoImpl loginDAO;
	
	@Before
	public void init() {
		dao = new SaleDaoImpl();
		userService = new RegisterUserService();
//		loginDAO = new LoginDaoImpl();
	}

	@Test
	public void devePersistirRegistro() throws Exception {
		
		User user = new User();
		user.setName("Outro User");
		
		user.setLogin(new Login());
		user.getLogin().setUserName("teste");
		user.getLogin().setPassword("pass");

//		Login login = (Login) loginDAO.save(user.getLogin());
//		user.getLogin().setId(login.getId());
		userService.save(user);
		
	}
	
	
}
