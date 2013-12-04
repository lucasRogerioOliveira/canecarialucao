package com.canecaria.controller.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.canecaria.model.Product;
import com.canecaria.service.CartService;

@RequestScoped
@ManagedBean
public class CartMB {
	
	private Product product;
	private CartService cartService;
	
	public CartMB() {
		product = new Product();
		cartService = new CartService();
	}
	
	public void addToCart() {
		
		product.setSalePrice(25.00);
		product.setId(1L);
		product.setName("Teste2");
		cartService.addToCart(product);
	}
	
	public void removeFromCart() {
		cartService.removeFromCart(product);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
