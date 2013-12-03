package com.canecaria.controller.managedBean;

import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import com.canecaria.model.Login;
import com.canecaria.service.LoginService;

@ManagedBean
@RequestScoped
public class LoginMB {
	private Login loginVo;
	private LoginService loginService;
	private List<String> messages;
	
	public LoginMB() {
		loginService = new LoginService();
		loginVo = new Login();
		messages = new LinkedList<String>();
	}
	
	public void actionLogin() {
		try {
			loginService.loginService(loginVo);
		} catch (Exception e) {
			e.printStackTrace();
			messages = loginService.getMessages();
		}
		
	}
	
	public void actionLogout() {
		loginService.logoutService();
	}

	public Login getLoginVo() {
		return loginVo;
	}

	public void setLoginVo(Login loginVo) {
		this.loginVo = loginVo;
	}

	public List<String> getMessages() {
		return messages;
	}
}
