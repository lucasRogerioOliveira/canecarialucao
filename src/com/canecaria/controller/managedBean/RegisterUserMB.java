package com.canecaria.controller.managedBean;

import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.canecaria.model.Address;
import com.canecaria.model.Login;
import com.canecaria.model.User;
import com.canecaria.service.RegisterUserService;

@ManagedBean
@SessionScoped
public class RegisterUserMB {
	
	private User user;
	private RegisterUserService userService;
	private List<String> messages;
	
	public RegisterUserMB() {
		userService = new RegisterUserService();
		user = new User();
		messages = new LinkedList<String>();
	}
	
	public String addUserAction() {
		messages.clear();
		
		try {
			userService.save(user);
			messages.add("Cadastrado com sucesso");
		} catch (Exception e) {
			messages = userService.getMessages();
		}
		
		return "";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<String> getMessages() {
		return messages;
	}	
}
