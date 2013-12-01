package com.canecaria.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.canecaria.model.Address;
import com.canecaria.model.Login;
import com.canecaria.model.User;
import com.canecaria.service.UserService;

@ManagedBean
@RequestScoped
public class RegisterUserManager {
	
	private User user;
	
	private UserService userService;
	
	public RegisterUserManager() {
		userService = new UserService();
		user = new User();
		user.setLogin(new Login());
		user.setAddress(new Address());
	}
	
	public void addUserAction() {
		userService.save(user);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
