package com.canecaria.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sale {
	
	@GeneratedValue
	@Id
	private Long id;
	
	private Calendar dateSale;
	
	private Double total;
	/*
	 * Usuário que está realizando a compra
	 * 
	 */
	@ManyToOne
	private User user;
	
	private Payment payment;
	
	private StatusPayment status;
	
	private Calendar dateSaleFinal;
	
	private List<SaleItem> salesItems;
	
	private Address address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getDateSale() {
		return dateSale;
	}

	public void setDateSale(Calendar dateSale) {
		this.dateSale = dateSale;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public StatusPayment getStatus() {
		return status;
	}

	public void setStatus(StatusPayment status) {
		this.status = status;
	}

	public Calendar getDateSaleFinal() {
		return dateSaleFinal;
	}

	public void setDateSaleFinal(Calendar dateSaleFinal) {
		this.dateSaleFinal = dateSaleFinal;
	}

	public List<SaleItem> getSalesItems() {
		return salesItems;
	}

	public void setSalesItems(List<SaleItem> salesItems) {
		this.salesItems = salesItems;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
