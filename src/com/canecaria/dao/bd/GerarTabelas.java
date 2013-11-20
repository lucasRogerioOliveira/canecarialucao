package com.canecaria.dao.bd;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class GerarTabelas {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("canecarialucao");
		
		factory.close();
		
	}

}
