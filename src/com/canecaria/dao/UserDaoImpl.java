package com.canecaria.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import com.canecaria.model.User;

public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {

	@Override
	public List<User> listAll() {
		String jpql = "select u from User u";
		TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
		return query.getResultList();
	}

	@Override
	public List<User> searchByUsername(String userName) {
		
		String jpql = "select u from User u inner join u.login l where l.userName = :login";
		TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
		query.setParameter("login", userName);
		
		return (List<User>) query.getResultList();
	}
}
