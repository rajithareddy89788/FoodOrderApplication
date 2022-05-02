package com.mouritech.swiggy_application.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mouritech.swiggy_application.dto.ItemDto;

@Entity
@Table(name = "items")

public class Items {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String itemName;

	private int price;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "restaurent_id", nullable = false)
	Restaurent restaurent;

	public Items(ItemDto itemsDto, Restaurent restaurent) {
		this.itemName = itemsDto.getItemName();
		this.price = itemsDto.getPrice();
		this.restaurent = restaurent;
	}

	public Items() {

	}

	public Items(String itemName, int price, Restaurent restaurent) {
		this.itemName = itemName;
		this.price = price;
		this.restaurent = restaurent;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Restaurent getRestaurent() {
		return restaurent;
	}

	public void setRestaurent(Restaurent restaurent) {
		this.restaurent = restaurent;
	}

}
