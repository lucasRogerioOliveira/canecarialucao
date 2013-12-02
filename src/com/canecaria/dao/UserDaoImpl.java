package com.canecaria.dao;

import java.util.List;

import javax.persistence.TypedQuery;

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
	
	@Override
	public User searchByUsername(String userName) {
		
		String jpql = "select u from User u inner join u.login l where l.userName = :login";
		TypedQuery<User> query = entityManager.createQuery(jpql,User.class);
		query.setParameter("login", userName);
		
		return (User) query.getSingleResult();
	}
}
