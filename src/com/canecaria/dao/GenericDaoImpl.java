package com.canecaria.dao;

import javax.persistence.EntityManager;

public abstract class GenericDaoImpl<T, Long> /*implements GenericDao<T, Long>*/ {
	
	private EMFactory emFactory;
	
	private EntityManager entityManager;
	
	public GenericDaoImpl() {
		if(entityManager == null)
			entityManager = emFactory.createEntityManager();
	}
	
	public void save(final T entity) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			
		}
	}

	public void delete(final T entity) {
		entityManager.getTransaction().begin();
		entityManager.remove(entity);
		entityManager.getTransaction().commit();
	}

	public T searchById(final Class<T> entity, Long id) {
		entityManager.getTransaction().begin();
		entityManager.find(entity, id);
		entityManager.getTransaction().commit();
		return null;
	}

	
	private boolean validationCreate() {
		// pra que serve esse método mesmo?
		return true;
	}
	
	private boolean validationUpdate() {
		return true;
	}

}
