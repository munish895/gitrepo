package com.mycart.mycart.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;



@Entity
public class Product implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productId;
	private String productDescription;
	private String productName;
	private double productPrice;
	private int productQuantity;
	
	@Transient 
	 private MultipartFile image; 
	  
	 public MultipartFile getImage() { 
	  return image; 
	 } 
	 public void setImage(MultipartFile image) { 
	  this.image = image; 
	 } 
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getproductDescription() {
		return productDescription;
	}
	public void setproductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	
	

}
