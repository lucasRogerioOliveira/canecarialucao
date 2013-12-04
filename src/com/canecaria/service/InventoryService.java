package com.canecaria.service;

import java.util.List;

import com.canecaria.dao.ProductDaoImpl;
import com.canecaria.model.Product;

public class InventoryService {
	private ProductDaoImpl productDao;
	
	public InventoryService() {
		productDao = new ProductDaoImpl();
	}
	
	public List<Product> listProduct() {
		return productDao.listAll();
	}

}
