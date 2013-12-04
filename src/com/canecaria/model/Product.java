package com.canecaria.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.servlet.http.Part;

@Entity
public class Product {
	
	@GeneratedValue
	@Id
	private Long id;
	
	private String name;
	
	private String description;
	
	private Integer quantity;
	
	private Double salePrice;
	
	private String theme;
	
	@Transient
	private Part photo1;
	@Transient
	private Part photo2;
	@Transient
	private Part photo3;
	@Transient
	private Part photo4;
	@Transient
	private Part photo5;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Specification spec;
	
	public Product() {
		spec = new Specification();
	}

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

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Specification getSpec() {
		return spec;
	}

	public void setSpec(Specification spec) {
		this.spec = spec;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Part getPhoto1() {
		return photo1;
	}

	public void setPhoto1(Part photo1) {
		this.photo1 = photo1;
	}

	public Part getPhoto2() {
		return photo2;
	}

	public void setPhoto2(Part photo2) {
		this.photo2 = photo2;
	}

	public Part getPhoto3() {
		return photo3;
	}

	public void setPhoto3(Part photo3) {
		this.photo3 = photo3;
	}

	public Part getPhoto4() {
		return photo4;
	}

	public void setPhoto4(Part photo4) {
		this.photo4 = photo4;
	}

	public Part getPhoto5() {
		return photo5;
	}

	public void setPhoto5(Part photo5) {
		this.photo5 = photo5;
	}
}
