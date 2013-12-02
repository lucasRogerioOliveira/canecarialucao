package com.canecaria.controller;

import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.canecaria.model.Address;
import com.canecaria.model.Login;
import com.canecaria.model.User;
import com.canecaria.service.UserService;

@ManagedBean
@SessionScoped
public class RegisterUserManager {
	
	private User user;
	private UserService userService;
	private List<String> messages;
	
	public RegisterUserManager() {
		userService = new UserService();
		user = new User();
		messages = new LinkedList<String>();
	}
	
	public void addUserAction() {
		messages.clear();
		
		try {
			userService.save(user);
			messages.add("Cadastrado com sucesso");
		} catch (Exception e) {
			messages = userService.getMessages();
		}
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
