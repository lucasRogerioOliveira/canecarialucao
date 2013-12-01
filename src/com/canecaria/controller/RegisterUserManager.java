package com.canecaria.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
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
	
	private String msgAnswer;
	
	public RegisterUserManager() {
		userService = new UserService();
		user = new User();
		user.setLogin(new Login());
		user.setAddress(new Address());
	}
	
	public void addUserAction() {
		try {
			userService.save(user);
			msgAnswer = "Cadastrado com sucesso";
		} catch (Exception e) {
			msgAnswer = e.getMessage();
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
