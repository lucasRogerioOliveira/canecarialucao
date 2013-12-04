package com.canecaria.service;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.canecaria.model.Product;
import com.mysql.jdbc.log.Log;

/**
 * Cart Service
 * @author bruna
 *
 */
public class CartService {
	
	private List<Product> products;
	
	/**
	 * Add product to cart
	 * */
	public void addToCart(Product product) {
		
		FacesContext context = FacesContext.getCurrentInstance();
		ExternalContext externaContext = context.getExternalContext();
		HttpSession session = (HttpSession) externaContext.getSession(true);
		products = (List<Product>) session.getAttribute("cart");
		if (products == null) {
			products = new ArrayList<>();
			products.add(product);
			session.setAttribute("cart", products);
			System.out.println("Primeira vez");
			System.out.println("Quant produtos no carrinho: " + products.size());
		}
		else {
			products.add(product);
			System.out.println("Quant produtos no carrinho depois de add: " + products.size());
			session.setAttribute("cart", products);
		}
		
	}

	/**
	 * Remove product from Cart
	 * */
	public void removeFromCart(Product product) {
		
		FacesContext context = FacesContext.getCurrentInstance();
		ExternalContext externaContext = context.getExternalContext();
		HttpSession session = (HttpSession) externaContext.getSession(true);
		products = (List<Product>) session.getAttribute("cart");
		
		products.remove(product);
		session.setAttribute("cart", products);
		
	}
	
}
