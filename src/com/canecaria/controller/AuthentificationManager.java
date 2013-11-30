package com.canecaria.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.canecaria.model.Login;
import com.canecaria.service.AuthentificationService;

@ManagedBean
@SessionScoped
public class AuthentificationManager {
	private Login loginVo;
	private Long userId;
	private AuthentificationService service;
	
	public AuthentificationManager() {
		service = new AuthentificationService();
	}
	
	public void LoginAction() {
		if (service.loginService(loginVo)) {
		
		}
	}
	
	public void LogoutAction() {
		userId = null;
		service.logoutService();
	}

	public Login getLoginVo() {
		return loginVo;
	}

	public void setLoginVo(Login loginVo) {
		this.loginVo = loginVo;
	}

	public Long getUserId() {
		return userId;
	}
}
