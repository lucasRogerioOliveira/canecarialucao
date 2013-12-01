package com.canecaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.canecaria.type.TypePermission;

@Entity
public class Login {
	
	@GeneratedValue
	@Id
	private Long id;
	
	private String userName;
	
	private String password;
	
	@Enumerated(EnumType.STRING)
	private TypePermission permission;

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
	
	

}
