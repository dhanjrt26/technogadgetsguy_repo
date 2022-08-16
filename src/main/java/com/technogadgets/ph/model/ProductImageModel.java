package com.technogadgets.ph.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_imsges")
public class ProductImageModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int product_id;
	
	@Column(name="product_image")
	public Blob product_image;
	
	
	
	//
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public Blob getProduct_image() {
		return product_image;
	}

	public void setProduct_image(Blob product_image) {
		this.product_image = product_image;
	}
	
	
	

}
