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
	
	public User save(User user) {

		try {
			verificarUsuarioSalvar(user);
			Login login = (Login) loginService.save(user.getLogin());
			user.getLogin().setId(login.getId());
			return userDAO.save(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	private boolean verificarUsuarioSalvar(User user) throws Exception {
		
		List<User> result = userDAO.searchByUsername(user.getLogin().getUserName());
		if (result.size() >= 1) {
			throw new Exception("Não foi possível salvar novo usuário. Login já cadastrado.");
		}
		return true;
	}
}
