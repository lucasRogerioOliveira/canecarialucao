package com.canecaria.service;

import com.canecaria.dao.LoginDaoImpl;
import com.canecaria.model.Login;

public class LoginService {
	
	private LoginDaoImpl<Login> loginDAO = new LoginDaoImpl<Login>();
	
	public Login save(Login login) {
		return loginDAO.save(login);
	} 
	

}
