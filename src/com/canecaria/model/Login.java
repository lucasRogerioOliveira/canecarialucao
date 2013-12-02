package com.canecaria.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import com.canecaria.type.TypePermission;

@Entity
public class Login {
	
	@GeneratedValue
	@Id
	private Long id;
	
	private String userName;
	
	private String password;
	
	@Transient
	private String confirmPassword;

	@Enumerated(EnumType.STRING)
	private TypePermission permission;
	
	@OneToOne
	private User user;

	public Login() {

	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public TypePermission getPermission() {
		return permission;
	}

	public void setPermission(TypePermission permission) {
		this.permission = permission;
	}
	
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
