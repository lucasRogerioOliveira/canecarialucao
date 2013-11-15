package com.canecaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.canecaria.type.Theme;

@Entity
public class Product {
	
	@GeneratedValue
	@Id
	private Long id;
	
	private String description;
	
	private Integer quantity;
	
	@Column(nullable=false)
	private Double costPrice;
	
	private Double salePrice;
	
	@Enumerated(EnumType.STRING)
	private Theme theme;
	
	@OneToOne
	private Specification spec;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public Specification getSpec() {
		return spec;
	}

	public void setSpec(Specification spec) {
		this.spec = spec;
	}
	

}
