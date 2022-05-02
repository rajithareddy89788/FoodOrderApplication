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
import javax.persistence.ManyToOne;
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

	private int no_of_items;

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

	public int getNo_of_items() {
		return no_of_items;
	}

	public void setNo_of_items(int no_of_items) {
		this.no_of_items = no_of_items;
	}

	public FoodCart(List<Items> items, Customer customer, int no_of_items) {
		super();
		this.items = items;
		this.customer = customer;
		this.no_of_items = no_of_items;
	}

	public FoodCart(List<Items> items, int no_of_items) {
		super();
		this.items = items;
		this.no_of_items = no_of_items;
	}

	
	
	

}
