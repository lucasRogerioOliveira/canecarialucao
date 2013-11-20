package com.canecaria.model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-11-20T08:07:06.592-0200")
@StaticMetamodel(User.class)
public class User_ {
	public static volatile SingularAttribute<User, Long> id;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, String> phone;
	public static volatile SingularAttribute<User, Calendar> birthday;
	public static volatile SingularAttribute<User, String> rg;
	public static volatile SingularAttribute<User, String> cpf;
	public static volatile SingularAttribute<User, String> gender;
	public static volatile SingularAttribute<User, Address> address;
	public static volatile SingularAttribute<User, Login> login;
}
