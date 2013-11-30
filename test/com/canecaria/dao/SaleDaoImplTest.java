package com.canecaria.dao;

import org.junit.Before;
import org.junit.Test;

import com.canecaria.model.Sale;
import com.canecaria.model.User;

public class SaleDaoImplTest {
	
	private SaleDaoImpl dao;
	
	private UserDaoImpl userDAO;
	
	@Before
	public void init() {
		dao = new SaleDaoImpl();
		userDAO = new UserDaoImpl();
	}

	@Test
	public void devePersistirRegistro() {
		
//		Address address = new Address();
//		address.setNumber("123");
		
		Sale sale = new Sale();
		sale.setTotal(3000.00);
		dao.save(sale);
		
		User user = new User();
		user.setName("Nome Fictício");
		UserDaoImpl userDao = new UserDaoImpl();
		userDao.save(user);
	}
	
	
}
