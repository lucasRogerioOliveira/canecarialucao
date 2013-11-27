package com.canecaria.dao;

import java.util.List;


public interface GenericDao<T> {
	
	void save(T entity);
	
	void delete(T entity);
	
	List<T> listAll();

	T searchById(Long id);

}
