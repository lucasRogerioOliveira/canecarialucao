package com.canecaria.dao;

import com.canecaria.model.User;

public class UserDaoImpl extends GenericDaoImpl<User, Long> implements UserDao {

	protected UserDaoImpl() {
		super(User.class);
	}

}
