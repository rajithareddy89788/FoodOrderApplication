package com.mouritech.onlinefoodorderapplication.dto;

import java.util.List;

public class RestaurantItemCartDto {
	
	private List<String>restaurantName;
	
	private List<String> itemNames;

	
	

	
	public List<String> getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(List<String> restaurantName) {
		this.restaurantName = restaurantName;
	}

	public List<String> getItemNames() {
		return itemNames;
	}

	public void setItemNames(List<String> itemNames) {
		this.itemNames = itemNames;
	}
	
	

}
