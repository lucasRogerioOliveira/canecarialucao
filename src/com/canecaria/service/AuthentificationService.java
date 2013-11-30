package com.canecaria.service;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.canecaria.dao.UserDaoImpl;
import com.canecaria.model.Login;
import com.canecaria.model.User;

public class AuthentificationService {
	private UserDaoImpl userDao;
	
	public boolean loginService(Login loginVo) {
		User user = userDao.searchByUsername(loginVo.getUserName());
		
		if (user != null) {
			Login loginDB =  user.getLogin();
			
			if (loginVo.getPassword() == loginDB.getPassword()) {
				FacesContext context = FacesContext.getCurrentInstance();
				ExternalContext externaContext = context.getExternalContext();
				HttpSession session = (HttpSession) externaContext.getSession(true);
				session.setAttribute("userId", user.getId());
				return true;
			}
		}
		
		return false;
	}
	
	public void logoutService() {
		FacesContext context = FacesContext.getCurrentInstance();
		ExternalContext externaContext = context.getExternalContext();
		HttpSession session = (HttpSession) externaContext.getSession(false);
		session.invalidate();
	}
}
