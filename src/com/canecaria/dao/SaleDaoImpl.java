package com.canecaria.dao;

import com.canecaria.model.Sale;

public class SaleDaoImpl implements SaleDao {

	private GenericDaoImpl<Sale, Long> dao;
	
	public void salvar(Sale sale) {
		dao.save(sale);
	}
	
	@Override
	public Sale searchAll() {
		return null;
	}


}
