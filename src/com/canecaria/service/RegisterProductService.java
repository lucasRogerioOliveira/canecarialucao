package com.canecaria.service;

import java.util.LinkedList;
import java.util.List;

import com.canecaria.dao.ProductDaoImpl;
import com.canecaria.model.Product;

public class RegisterProductService {
	
	private ProductDaoImpl productDao;
	private List<String> messages;
	
	public RegisterProductService() {
		productDao = new ProductDaoImpl();
		messages = new LinkedList<String>();
	}
	
	public Product save(Product product) throws Exception {
		if (!validateFields(product)) {
			throw new Exception();
		}
		
		return (Product) productDao.save(product);
	}
	
	private boolean validateFields(Product p) {
		if (isValidName(p) & isValidTheme(p) & isValidSalePrice(p)
				& isValidColor(p) & isValidWeight(p) & isValidMaterial(p)
				& isValidHeight(p) & isValidWidth(p) ) {
			return true;
		}
		
		return false;
	}
	
	private boolean isValidName(Product product) {
		String name = product.getName();
		if (name == null || name.equals("")) {
			String message = "O campo \"Nome da estampa\" é obrigatório.";
			messages.add(message);
			return false;
		}
		
		return true;
	}
	
	private boolean isValidTheme(Product product) {
//		String theme = product.getTheme();
//		if (theme == null || theme.equals("")) {
//			String message = "O campo \"Tema\" é obrigatório.";
//			messages.add(message);
//			return false;
//		}
		
		return true;
	}

// Não estamos usando esse atributo para nada
//	private boolean isValidCostPrice(Product product) {
//		double costPrice = product.getCostPrice();
//		if (costPrice == 0D) {
//			String message = "O campo \"Preço de custo\" é obrigatório.";
//			messages.add(message);
//			return false;
//		}
//		
//		return true;
//	}
	
	private boolean isValidSalePrice(Product product) {
		double salePrice = product.getSalePrice();
		if (salePrice == 0D) {
			String message = "O campo \"Preço de venda\" é obrigatório.";
			messages.add(message);
			return false;
		}
		
		return true;
	}
	
	private boolean isValidColor(Product product) {
		String color = product.getSpec().getColor();
		if (color == null || color.equals("")) {
			String message = "O campo \"Cor\" é obrigatório.";
			messages.add(message);
			return false;
		}
		
		return true;
	}
	
	private boolean isValidWeight(Product product) {
		String weight = product.getSpec().getWeight();
		if (weight == null || weight.equals("")) {
			String message = "O campo \"Peso\" é obrigatório.";
			messages.add(message);
			return false;
		}
		
		return true;
	}
	
	private boolean isValidMaterial(Product product) {
		String material = product.getSpec().getMaterial();
		if (material == null || material.equals("")) {
			String message = "O campo \"Material\" é obrigatório.";
			messages.add(message);
			return false;
		}
		
		return true;
	}
	
	private boolean isValidHeight(Product product) {
		String height = product.getSpec().getHeight();
		if (height == null || height.equals("")) {
			String message = "O campo \"Altura\" é obrigatório.";
			messages.add(message);
			return false;
		}
		
		return true;
	}
	
	private boolean isValidWidth(Product product) {
		String width = product.getSpec().getWidth();
		if (width == null || width.equals("")) {
			String message = "O campo \"Largura\" é obrigatório.";
			messages.add(message);
			return false;
		}
		
		return true;
	}

	public List<String> getMessages() {
		return messages;
	}
}
