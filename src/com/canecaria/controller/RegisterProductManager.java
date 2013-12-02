package com.canecaria.controller;

import javax.faces.bean.ManagedBean;


import javax.faces.bean.RequestScoped;

import com.canecaria.model.Product;
import com.canecaria.model.Specification;
import com.canecaria.service.ProductService;
import com.canecaria.service.SpecificatioService;

@ManagedBean
@RequestScoped
public class RegisterProductManager {
	
	private Product product;
	private Specification spec;
	
	private String msgAnswer;
	
	private ProductService productService;
	private SpecificatioService specService;
	
	public RegisterProductManager() {
		product = new Product();
		spec = new Specification();
		productService = new ProductService();
		specService = new SpecificatioService();
	}
	
	public void registerProduct() {
	
		try {
			productService.save(product);
			msgAnswer = "Registro salvo com sucesso!";
		} catch (Exception e) {
			msgAnswer = e.getMessage();
		}
		
	}

}
