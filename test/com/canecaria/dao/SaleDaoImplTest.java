package com.canecaria.dao;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import com.canecaria.model.Sale;

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
		sale.setTotal(15.00);
		sale.setDateSale(Calendar.getInstance());
		dao.salvar(sale);
		
//		User user = new User();
//		user.setCpf("32287661054");
//		user.setName("Josicleide");
//		userDAO.save(user);
	}
	
	
}
