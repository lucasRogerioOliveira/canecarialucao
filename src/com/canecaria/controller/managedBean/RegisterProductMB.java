package com.canecaria.controller.managedBean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.canecaria.model.Product;
import com.canecaria.service.RegisterProductService;

@ManagedBean
@RequestScoped
public class RegisterProductMB {
	
	private Product product;
	private RegisterProductService productService;
	private List<String> messages;
	
	public RegisterProductMB() {
		product = new Product();
		productService = new RegisterProductService(); 
	}
	
	public void registerProduct() {
		try {
			
		} catch (Exception e) {
			messages = productService.getMessages();
		}
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<String> getMessages() {
		return messages;
	}
}
