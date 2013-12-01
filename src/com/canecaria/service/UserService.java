package com.canecaria.service;

import com.canecaria.dao.LoginDaoImpl;
import com.canecaria.dao.UserDaoImpl;
import com.canecaria.model.Login;
import com.canecaria.model.User;

public class UserService {
	
	private UserDaoImpl userDAO;
	private LoginDaoImpl loginDAO;
	
	public UserService() {
		userDAO = new UserDaoImpl();
		loginDAO = new LoginDaoImpl();
	}
	
	public void save(User user) {
		Login login = (Login) loginDAO.save(user.getLogin());
		user.getLogin().setId(login.getId());
		userDAO.save(user);
	}
	
	private boolean verificarUsuarioSalvar(User user) {
		return true;
	}
	
}
