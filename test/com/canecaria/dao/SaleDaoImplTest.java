package com.canecaria.dao;

import org.junit.Before;
import org.junit.Test;

import com.canecaria.model.Sale;
import com.canecaria.model.User;
import com.canecaria.dao.UserDao;
import com.canecaria.dao.UserDaoImpl;

public class SaleDaoImplTest {
	
	private SaleDaoImpl dao;
	
	@Before
	public void init() {
		dao = new SaleDaoImpl();
	}

	@Test
	public void devePersistirRegistro() {
		
		Sale sale = new Sale();
		sale.setTotal(3000.00);
		dao.save(sale);
		
		User user = new User();
		user.setName("Willian Lindão");
		UserDaoImpl userDao = new UserDaoImpl();
		userDao.save(user);
	}
	
	
}
