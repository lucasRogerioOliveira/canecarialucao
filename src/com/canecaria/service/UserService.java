package com.canecaria.service;

import com.canecaria.dao.UserDaoImpl;
import com.canecaria.model.User;

public class UserService {
	
	private UserDaoImpl userDAO;
	
	public void save(User user) {
		userDAO.save(user);
	}
	
	private boolean verificarUsuarioSalvar(User user) {
		return true;
	}
	
}
