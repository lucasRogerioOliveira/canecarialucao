package com.canecaria.service;

import java.util.List;

import com.canecaria.dao.ProductDaoImpl;
import com.canecaria.model.Product;

/**
 * Classe service de Product
 * @author bruna
 *
 */
public class ProductService {
	
	private ProductDaoImpl productDao;
	List<String> messages;
	
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
	
	
}
