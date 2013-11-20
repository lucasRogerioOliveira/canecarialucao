package com.canecaria.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-11-20T08:07:06.561-0200")
@StaticMetamodel(Address.class)
public class Address_ {
	public static volatile SingularAttribute<Address, Long> id;
	public static volatile SingularAttribute<Address, String> cep;
	public static volatile SingularAttribute<Address, String> number;
	public static volatile SingularAttribute<Address, String> complement;
}
