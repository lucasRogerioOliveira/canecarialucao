package com.canecaria.controller.managedBean;

import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.canecaria.model.Product;
import com.canecaria.service.InventoryService;

@ManagedBean
@RequestScoped
public class InventoryMB {

	private InventoryService inventoryService;
	private List<Product> products;
	
	public InventoryMB() {
		inventoryService = new InventoryService();
		products = new LinkedList<Product>();
		actionListProduct();
	}
	
	public void actionListProduct() {
		products = inventoryService.listProduct();
	}

	public List<Product> getProducts() {
		return products ;
	}
}
