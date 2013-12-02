package com.canecaria.dao;

import javax.persistence.EntityManager;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {
	
	private EMFactory emFactory = new EMFactory();
	
	public EntityManager entityManager;
	
	public GenericDaoImpl() {
		if(entityManager == null)
			entityManager = emFactory.createEntityManager();
	}
	
	@Override
	public T save(final T entity) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();
			entityManager.close();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return entity;
	}
	
	@Override
	public boolean delete(final T entity) {
		try {
			entityManager.getTransaction().begin();
			entityManager.remove(entity);
			entityManager.getTransaction().commit();
			entityManager.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public T searchById(final Class<T> entity, Long id) {
		entityManager.getTransaction().begin();
		entityManager.find(entity, id);
		entityManager.getTransaction().commit();
		entityManager.close();
		return null;
	}
}
