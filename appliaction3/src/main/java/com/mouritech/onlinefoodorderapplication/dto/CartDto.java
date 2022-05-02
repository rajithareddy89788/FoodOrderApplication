package com.mouritech.onlinefoodorderapplication.dto;

import java.util.List;

import com.mouritech.onlinefoodorderapplication.entity.FoodCart;

public class CartDto {
    private List<CartItemDto> cartItems;
    private double totalCost;
    private String shippingAddress;

    public CartDto(CartDto cart) {
       this.setShippingAddress(cart.getShippingAddress());
    }
    
    
    public CartDto() {
		// TODO Auto-generated constructor stub
	}


	public CartDto(List<CartItemDto> cartItems, double totalCost, String shippingAddress) {
	
		this.cartItems = cartItems;
		this.totalCost = totalCost;
		this.shippingAddress = shippingAddress;
	}


	public CartDto(List<CartItemDto> cartItems, double totalCost) {
		super();
		this.cartItems = cartItems;
		this.totalCost = totalCost;
	}


	public List<CartItemDto> getcartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItemDto> cartItemDtoList) {
        this.cartItems = cartItemDtoList;
    }
    

    public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public double getTotalCost() {
        return totalCost;
    }

   public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
   }
   
}
