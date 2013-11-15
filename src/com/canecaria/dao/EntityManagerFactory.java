package com.canecaria.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerFactory {

	private EntityManager entityManager;

	public EntityManager createEntityManager() {
		EntityManagerFactory factory = (EntityManagerFactory) Persistence
				.createEntityManagerFactory("per_unit");
		entityManager = factory.createEntityManager();

//		em.getTransaction().begin();
//		em.persist(arg0);
//		em.merge(arg0);//
//		em.remove(arg0);
//		em.getTransaction().commit();

		return entityManager;
	}

	public void openTransaction() {
		entityManager.getTransaction().begin();
	}
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
}
