package com.canecaria.controller.managedBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.canecaria.model.Product;
import com.canecaria.model.User;
import com.canecaria.service.SaleService;

public class SaleMB {
	
	private List<Product> products;
	private User user;
	private SaleService saleService;
	
	public SaleMB() {
		products = new ArrayList<>();
		user = new User();
	}
	
	public void saveSale() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		ExternalContext externaContext = context.getExternalContext();
		HttpSession session = (HttpSession) externaContext.getSession(true);
		products = (List<Product>) session.getAttribute("cart");
		user = (User) session.getAttribute("usuarioLogado");
	}

}
