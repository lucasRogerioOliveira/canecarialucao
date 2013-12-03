package com.canecaria.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.canecaria.model.type.Theme;

@Generated(value="Dali", date="2013-11-20T08:07:06.579-0200")
@StaticMetamodel(Product.class)
public class Product_ {
	public static volatile SingularAttribute<Product, Long> id;
	public static volatile SingularAttribute<Product, String> description;
	public static volatile SingularAttribute<Product, Integer> quantity;
	public static volatile SingularAttribute<Product, Double> costPrice;
	public static volatile SingularAttribute<Product, Double> salePrice;
	public static volatile SingularAttribute<Product, Theme> theme;
	public static volatile SingularAttribute<Product, Specification> spec;
}
