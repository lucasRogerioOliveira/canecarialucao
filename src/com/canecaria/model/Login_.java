package com.canecaria.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.canecaria.model.type.TypePermission;

@Generated(value="Dali", date="2013-11-20T08:07:06.573-0200")
@StaticMetamodel(Login.class)
public class Login_ {
	public static volatile SingularAttribute<Login, Long> id;
	public static volatile SingularAttribute<Login, String> userName;
	public static volatile SingularAttribute<Login, String> password;
	public static volatile SingularAttribute<Login, TypePermission> permission;
}
