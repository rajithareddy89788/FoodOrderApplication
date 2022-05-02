package com.mouritech.onlinefoodorderapplication.entity;

import java.util.Date;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "foodcart")
public class FoodCart {
	
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cartid")
	private Long cartId;
	 @Column(name = "created_date")
	    private Date createdDate;
	 
	 @Column(name = "shippingAddress")
	 private String shippingAddress;
	 
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "itemid")
	 @JsonIgnore
	
	
	private Items items;
//	cascade = CascadeType.ALL, orphanRemoval = true)List<Child> children = new ArrayList<>();
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "customerId")
//	private Customer customer;
	
//	@OneToMany(fetch = FetchType.EAGER)
//	@JoinColumn(name = "foodcard_id")
//	private List<Items> items;

//	@OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "userId")
//    private User customer;
	 //@JsonIgnore
//	, fetch = FetchType.LAZY
	    @OneToOne(targetEntity = Customer.class)
	    @JoinColumn(nullable = false, name = "customer_id")
	   // @JsonIgnore
	    private Customer customer;

	
	private int quantity;



	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	

	
	
	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	

	public FoodCart() {
		// TODO Auto-generated constructor stub
	}

	

	

	public FoodCart(Items product, Integer quantity2, String shippingAddress2, Customer customer2) {
		
		this.items=product;
		this.quantity=quantity2;
		this.shippingAddress=shippingAddress2;
		this.customer=customer2;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	

	
	
	

}
