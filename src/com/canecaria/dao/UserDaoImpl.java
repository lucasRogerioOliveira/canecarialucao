package com.canecaria.dao;

import java.util.List;

import com.canecaria.model.User;

public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {

	@Override
	public List<User> listAll() {
		return null;
	}

	@Override
	public User searchById(Long id) {
		return null;
	}
	
	public User searchByUsername(String username) {
		// Realizar pesquisa no banco pelo username do usuário (userName -> coluna 4)
		return new User();
	}
}
