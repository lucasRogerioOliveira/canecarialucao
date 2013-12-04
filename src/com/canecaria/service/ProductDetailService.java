package com.canecaria.service;

import com.canecaria.dao.ProductDaoImpl;
import com.canecaria.model.Product;

public class ProductDetailService {
	private ProductDaoImpl productDao;
	
	public ProductDetailService() {
		productDao = new ProductDaoImpl();
	}
	
	public Product showDetails(Long productId) {
		return productDao.searchById(Product.class, productId);
	}

}
