package com.mouritech.onlinefoodorderapplication.dto;

import com.mouritech.onlinefoodorderapplication.entity.FoodCart;
import com.mouritech.onlinefoodorderapplication.entity.Items;

public class AddToCartDto {
	private String itemName;
	private long itemId;

	public AddToCartDto(Items items)
	{
		this.itemName=items.getItemName();
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public AddToCartDto() {
		// TODO Auto-generated constructor stub
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	
	
	

}
