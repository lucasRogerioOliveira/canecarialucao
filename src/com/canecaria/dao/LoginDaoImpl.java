package com.canecaria.dao;

import java.util.List;

public class LoginDaoImpl<T> extends GenericDaoImpl<T> {

	@Override
	public List<T> listAll() {
		return null;
	}

	public List<T> searchByUserName() {
		String jpql = "select etc";
		
//		TypedQuery<Operation> query = entityManager.createQuery(jpql,Operation.class);
//		query.setParameter("op", op);
		
//		return query.getResultList();
		
		return null;
		

	}

}
