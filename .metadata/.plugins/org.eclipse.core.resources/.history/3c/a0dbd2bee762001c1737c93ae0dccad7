package com.mouritech.swiggy_application.dto;

import com.mouritech.swiggy_application.entity.Items;

public class ItemDto {
	private long id;

	private String itemName;

	private int price;

	private long restaurentId;

	public ItemDto(Items items) {
		this.setId(items.getId());

		this.setItemName(items.getItemName());

		this.setPrice(items.getPrice());
		this.setRestaurentId(items.getRestaurent().getId());
	}

	public ItemDto(String itemName, int price, long restaurentId) {
		this.itemName = itemName;
		this.price = price;
		this.restaurentId = restaurentId;
	}

	public ItemDto() {
		// TODO Auto-generated constructor stub
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

	public long getRestaurentId() {
		return restaurentId;
	}

	public void setRestaurentId(long restaurentId) {
		this.restaurentId = restaurentId;
	}

}
