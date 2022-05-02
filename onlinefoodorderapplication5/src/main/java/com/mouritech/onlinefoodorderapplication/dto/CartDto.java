package com.mouritech.onlinefoodorderapplication.dto;

import java.util.List;

import javax.validation.constraints.NotNull;




public class CartDto {
	 private List<CartItemDto> cartItems;
	 
	
	public CartDto(List<CartItemDto> cartItems) {
			this.cartItems = cartItems;
	}
			
	public List<CartItemDto> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<CartItemDto> cartItems) {
		this.cartItems = cartItems;
	}
	
	  

}
