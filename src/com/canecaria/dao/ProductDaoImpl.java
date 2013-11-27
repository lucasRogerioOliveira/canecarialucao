package com.canecaria.dao;

import com.canecaria.model.Product;

public class ProductDaoImpl extends GenericDaoImpl implements ProductDao  {

	protected ProductDaoImpl() {
		super(Product.class);
	}
	

}
