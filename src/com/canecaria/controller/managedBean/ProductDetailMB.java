package com.canecaria.controller.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.canecaria.model.Product;
import com.canecaria.service.ProductDetailService;

@ManagedBean
@RequestScoped
public class ProductDetailMB {
	private ProductDetailService productDetailService;
	private Product product;
	private Long productId;
	
	public ProductDetailMB() {
		productDetailService = new ProductDetailService(); 
	}
	
	public void actionShowDetails() {
		product = productDetailService.showDetails(productId);
	}

	public Product getProduct() {
		return product;
	}
}
