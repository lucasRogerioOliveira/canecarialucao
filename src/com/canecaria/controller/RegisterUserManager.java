package com.canecaria.controller;

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
	
	private List<String> msgAnswer;
	
	public RegisterUserManager() {
		userService = new UserService();
		user = new User();
		user.setLogin(new Login());
		user.setAddress(new Address());
	}
	
	public void addUserAction() {
		try {
			userService.save(user);
			msgAnswer.add("Cadastrado com sucesso");
		} catch (Exception e) {
			msgAnswer = user.getLogin().getMessages();
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
