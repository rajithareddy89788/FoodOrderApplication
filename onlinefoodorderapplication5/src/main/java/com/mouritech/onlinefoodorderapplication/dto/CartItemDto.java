package com.mouritech.onlinefoodorderapplication.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.mouritech.onlinefoodorderapplication.entity.FoodCart;
import com.mouritech.onlinefoodorderapplication.entity.Items;



public class CartItemDto {
	private long id;
    private @NotNull Integer no_of_items;
    private @NotNull List<Items> items;
	public CartItemDto() {
		// TODO Auto-generated constructor stub
	}
	 public CartItemDto(FoodCart cart) {
	        this.setId(cart.getCartId());
	        this.setNo_of_items(cart.getNo_of_items());
	        this.setItems(cart.getItems());
	    }
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Integer getNo_of_items() {
		return no_of_items;
	}
	public void setNo_of_items(Integer no_of_items) {
		this.no_of_items = no_of_items;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	
}
