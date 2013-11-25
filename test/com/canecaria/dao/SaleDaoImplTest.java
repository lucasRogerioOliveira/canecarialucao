package com.canecaria.dao;

import org.junit.Before;
import org.junit.Test;

import com.canecaria.model.Sale;

public class SaleDaoImplTest {
	
	private SaleDaoImpl dao;
	
	@Before
	public void init() {
		dao = new SaleDaoImpl();
	}

	@Test
	public void devePersistirRegistro() {
		
		Sale sale = new Sale();
		dao.save(sale);
	}
	
	
}
