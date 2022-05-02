package com.mouritech.onlinefoodorderapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="order_details1")
public class OrderDetails1 {
	@Id
	@Column(name = "orderDetails_id")
	private String orderDetailsId;
	@Column(name = "unit_price", nullable = false)
	private int price;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "total_price")
	private int totalPrice;
	
	
	@Column(name = "itemId")
	private int itemId;
	
	@Column(name = "itemName")
	private String itemName;
	
	@Column(name = "comments")
	private String comments;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "orderId")
	 //@JsonIgnore
	
	
	
	private Order order;
	

	public OrderDetails1() {
		super();
	}


	

	



	public String getOrderDetailsId() {
		return orderDetailsId;
	}








	public void setOrderDetailsId(String orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}








	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}


	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public OrderDetails1(int price, int quantity, int totalPrice, int itemId, String itemName, String comments,
			Order order) {
		super();
		this.price = price;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.itemId = itemId;
		this.itemName = itemName;
		this.comments = comments;
		this.order = order;
	}


	public OrderDetails1(String orderDetailsId, int price, int quantity, int totalPrice, int itemId, String itemName,
			String comments, Order order) {
		super();
		this.orderDetailsId = orderDetailsId;
		this.price = price;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.itemId = itemId;
		this.itemName = itemName;
		this.comments = comments;
		this.order = order;
	}
	
}
	


