package com.canecaria.model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-11-20T08:07:06.583-0200")
@StaticMetamodel(Sale.class)
public class Sale_ {
	public static volatile SingularAttribute<Sale, Long> id;
	public static volatile SingularAttribute<Sale, Calendar> dateSale;
	public static volatile SingularAttribute<Sale, Double> total;
	public static volatile SingularAttribute<Sale, User> user;
	public static volatile SingularAttribute<Sale, Payment> payment;
	public static volatile SingularAttribute<Sale, StatusPayment> status;
	public static volatile SingularAttribute<Sale, Calendar> dateSaleFinal;
	public static volatile ListAttribute<Sale, SaleItem> salesItems;
	public static volatile SingularAttribute<Sale, Address> address;
}
