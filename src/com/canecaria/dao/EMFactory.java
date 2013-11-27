package com.canecaria.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFactory {

	private EntityManager entityManager;
	
	private EntityManagerFactory factory;

	public EntityManager createEntityManager() {
		
		factory = Persistence.createEntityManagerFactory("canecarialucao");
		entityManager = factory.createEntityManager();

		return entityManager;
	}

	public void openTransaction() {
		entityManager.getTransaction().begin();
	}
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
}
