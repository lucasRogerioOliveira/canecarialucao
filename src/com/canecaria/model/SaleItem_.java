package com.canecaria.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-11-20T08:07:06.585-0200")
@StaticMetamodel(SaleItem.class)
public class SaleItem_ {
	public static volatile SingularAttribute<SaleItem, Long> id;
	public static volatile SingularAttribute<SaleItem, Integer> quantity;
	public static volatile SingularAttribute<SaleItem, Double> price;
	public static volatile SingularAttribute<SaleItem, Product> product;
}
