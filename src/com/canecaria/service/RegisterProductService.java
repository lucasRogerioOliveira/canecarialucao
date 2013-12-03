package com.canecaria.service;

import java.util.List;

import com.canecaria.dao.ProductDaoImpl;
import com.canecaria.model.Product;

public class RegisterProductService {
	
	private ProductDaoImpl productDao;
	private List<String> messages;
	
	public RegisterProductService() {
		productDao = new ProductDaoImpl();
	}
	
	public Product save(Product product) throws Exception {
		validateProductSave(product);
		return (Product) productDao.save(product);
	}
	
	private Boolean validateProductSave(Product product) throws Exception {
		
		if (product == null) {
			throw new Exception("Não foi possível salvar novo Produto.");
		}
		return true;
	}

	public List<String> getMessages() {
		return messages;
	}
	
	
}
