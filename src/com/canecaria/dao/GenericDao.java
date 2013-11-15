package com.canecaria.dao;
import java.io.Serializable;
import java.util.List;


public interface GenericDao<T, Type extends Serializable> {
	
	void save(T entity);
	
	void delete(T entity);
	
	List<T> listAll();

	T searchById(Long id);

}
