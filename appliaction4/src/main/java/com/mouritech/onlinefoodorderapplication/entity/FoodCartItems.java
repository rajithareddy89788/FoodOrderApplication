package com.mouritech.onlinefoodorderapplication.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;

//import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import org.hibernate.annotations.OnDelete;
//import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "foodcartitems")
public class FoodCartItems {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cartItemId")
	private long cartItemId;
	private String itemName;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cartid")
	@JsonIgnore
	private FoodCart foodCart;

	public Items getItems1() {
		return items1;
	}

	public void setItems1(Items items1) {
		this.items1 = items1;
	}

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "itemid")
	@JsonIgnore

	private Items items1;

	public long getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(long cartItemId) {
		this.cartItemId = cartItemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public FoodCart getFoodCart() {
		return foodCart;
	}

	public void setFoodCart(FoodCart foodCart) {
		this.foodCart = foodCart;
	}

//	public Items getItems() {
//		return items;
//	}
//	public void setItems(Items items) {
//		this.items = items;
//	}
	public FoodCartItems() {
		// TODO Auto-generated constructor stub
	}

	public FoodCartItems(String itemName, FoodCart foodCart) {
		super();
		this.itemName = itemName;
		this.foodCart = foodCart;

	}

}
