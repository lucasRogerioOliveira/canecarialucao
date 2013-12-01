package com.canecaria.dao;

import org.junit.Before;
import org.junit.Test;

import com.canecaria.model.Login;
import com.canecaria.model.Sale;
import com.canecaria.model.User;

public class SaleDaoImplTest {
	
	private SaleDaoImpl dao;
	
	private UserDaoImpl userDAO;
	private LoginDaoImpl loginDAO;
	
	@Before
	public void init() {
		dao = new SaleDaoImpl();
		userDAO = new UserDaoImpl();
		loginDAO = new LoginDaoImpl();
	}

	@Test
	public void devePersistirRegistro() {
		
		User user = new User();
		user.setName("Willian lindo");
		
		user.setLogin(new Login());
		user.getLogin().setUserName("Willian");
		user.getLogin().setPassword("pass");

		Login login = (Login) loginDAO.save(user.getLogin());
		user.getLogin().setId(login.getId());
		userDAO.save(user);
		
//		Sale sale = new Sale();
//		sale.setTotal(3000.00);
//		dao.save(sale);
		
	}
	
	
}
