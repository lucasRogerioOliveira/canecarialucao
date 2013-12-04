package com.canecaria.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import com.canecaria.model.Product;
import com.canecaria.model.User;

public class ProductDaoImpl extends GenericDaoImpl<Product> implements ProductDao  {

	@Override
	public List<Product> listAll() {
		String jpql = "select p from Product p";
		TypedQuery<Product> query = entityManager.createQuery(jpql, Product.class);
		return query.getResultList();
	}

}
