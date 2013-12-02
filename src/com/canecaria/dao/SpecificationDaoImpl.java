package com.canecaria.dao;

import java.util.List;

public class SpecificationDaoImpl extends GenericDaoImpl implements SpecificationDao {

	@Override
	public List listAll() {

		String jpql = "select spec from Specification spec";
		
		return null;
	}

}
