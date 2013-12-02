package com.canecaria.service;

import com.canecaria.dao.SpecificationDaoImpl;
import com.canecaria.model.Specification;

public class SpecificatioService {
	
	private SpecificationDaoImpl specDao;
	
	/**
	 * Save new register.
	 * 
	 * @param spec - {@link Specification}
	 * @return specification - {@link Specification}
	 * @throws Exception
	 */
	public Specification save(Specification spec) throws Exception {
		
		if (spec == null) {
			throw new Exception("Não foi possível salvar novo Produto. Especificação está nulo.");
		}
		return (Specification) specDao.save(spec);
	}
	
}
