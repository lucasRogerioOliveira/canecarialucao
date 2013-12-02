package com.canecaria.service;

import java.util.List;

import com.canecaria.dao.UserDaoImpl;
import com.canecaria.model.Login;
import com.canecaria.model.User;

public class UserService {

	private UserDaoImpl userDAO;
	private LoginService loginService;

	public UserService() {
		userDAO = new UserDaoImpl();
		loginService = new LoginService();
	}

	public User save(User user) throws Exception {
		Login login = user.getLogin();
		if (formatUsername(user) & isUsernameAvailable(user) & matchPassword(user)) {
			login = (Login) loginService.save(login);
			user.setLogin(login);
		} else {
			throw new Exception();
		}
		
		return userDAO.save(user);
	}
	
	private boolean formatUsername(User user) {
		Login login = user.getLogin();
		String username = login.getUserName();
		username = username.trim();
		username = username.toLowerCase();
		login.setUserName(username);
		
		if (username == null || username.equals("")) {
			String message = "Campo login vazio. Insira um login para efetivar o cadastro.";
			login.getMessages().add(message);
			return false;
		}
		
		return true;
	}

	private boolean matchPassword(User user) {
		Login login = user.getLogin();
		String password = login.getPassword();
		String confirmPassword = login.getConfirmPassword();
		
		if (password != confirmPassword) {
			String message = "As senhas não conferem. Digite novamente";
			login.getMessages().add(message);
		}
			
		return true;
	}
	
	private boolean isUsernameAvailable(User user) {
		Login login = user.getLogin();
		String username = login.getUserName();
		List<User> result = userDAO.searchByUsername(username);
		
		if (result.size() >= 1) {
			String message = "Não foi possível salvar novo usuário. Este login já está cadastrado.";
			login.getMessages().add(message);
			return false;
		}
		
		return true;
	}
}
