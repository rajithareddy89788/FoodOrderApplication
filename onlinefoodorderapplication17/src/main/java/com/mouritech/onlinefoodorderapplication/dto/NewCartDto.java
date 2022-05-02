package com.mouritech.onlinefoodorderapplication.dto;

import javax.validation.constraints.NotNull;

import com.mouritech.onlinefoodorderapplication.entity.FoodCart;

public class NewCartDto {
	private @NotNull long itemId;
    private  Integer quantity;
    private long cartId;
    public NewCartDto(FoodCart foodCart)
    {
    	this.setCartId(foodCart.getId());
    }
    
    
	public NewCartDto() {
		// TODO Auto-generated constructor stub
	}


	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public long getCartId() {
		return cartId;
	}
	public void setCartId(long cartId) {
		this.cartId = cartId;
	}
	
    

}
