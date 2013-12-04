package com.canecaria.service;

import java.util.LinkedList;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.canecaria.dao.UserDaoImpl;
import com.canecaria.model.Login;
import com.canecaria.model.User;

public class LoginService {
	private UserDaoImpl userDao;
	private List<String> messages;
	
	public LoginService() {
		messages = new LinkedList<String>();
		userDao = new UserDaoImpl();
	}
	
	public boolean loginService(Login loginVo) {
		if (loginVo == null) {
			return false;
		}
		
		String usernameVo = loginVo.getUserName();
		usernameVo = usernameVo.trim();
		usernameVo = usernameVo.toLowerCase();
		List<User> users = userDao.searchByUsername(usernameVo);
		
		if (users != null && users.size() > 0) {
			User user = users.get(0);
			Login loginDB =  user.getLogin();
			String passwordDB = loginDB.getPassword();
			String passwordVo = loginVo.getPassword();
			
			if (passwordDB.equals(passwordVo)) {
				FacesContext context = FacesContext.getCurrentInstance();
				ExternalContext externaContext = context.getExternalContext();
				HttpSession session = (HttpSession) externaContext.getSession(true);
				session.setAttribute("usuarioLogado", user);
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

	public List<String> getMessages() {
		return messages;
	}
}
