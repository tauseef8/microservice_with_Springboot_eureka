/**
 * 
 */
package com.tk.product;

import java.io.Serializable;

/**
 * @author Tauseef.Khan
 *
 */
public class Product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Double price;
	private String seller;
	private String name;
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Product [price=" + price + ", seller=" + seller + ", name=" + name + "]";
	}
	public Product(Double price, String seller, String name) {
		super();
		this.price = price;
		this.seller = seller;
		this.name = name;
	}
	
}
