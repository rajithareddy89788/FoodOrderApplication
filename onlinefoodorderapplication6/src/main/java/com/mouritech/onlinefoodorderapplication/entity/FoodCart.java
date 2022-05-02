package com.mouritech.onlinefoodorderapplication.entity;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "foodcart")
public class FoodCart {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cartid")
	private Long cartId;
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "foodcard_id")
	private List<Items> items;
//	cascade = CascadeType.ALL, orphanRemoval = true)List<Child> children = new ArrayList<>();
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "customerId")
//	private Customer customer;
	
//	@OneToMany(fetch = FetchType.EAGER)
//	@JoinColumn(name = "foodcard_id")
//	private List<Items> items;

	@OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customerId")
    private Customer customer;

	private int quantity;

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	

	public FoodCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public FoodCart(List<Items> items2, Integer quantity2, Customer user) {
		// TODO Auto-generated constructor stub
		
		this.items = items2;
	
		this.quantity = quantity2;
		this.customer = user;
	}
	}


	
	
	

}
