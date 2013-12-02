package com.canecaria.dao;

import java.util.List;
import com.canecaria.model.Product;

public class ProductDaoImpl extends GenericDaoImpl<Product> implements ProductDao  {

	@Override
	public List listAll() {
		
		String jpql = "select p from Product p";
		
		return null;
	}

}
