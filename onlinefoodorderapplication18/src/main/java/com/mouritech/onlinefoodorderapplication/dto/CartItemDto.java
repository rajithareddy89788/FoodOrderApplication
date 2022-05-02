package com.mouritech.onlinefoodorderapplication.dto;


import java.util.List;

import javax.validation.constraints.NotNull;

import com.mouritech.onlinefoodorderapplication.entity.FoodCart;
import com.mouritech.onlinefoodorderapplication.entity.Items;

public class CartItemDto {
    private long itemId;
    private @NotNull Integer quantity;
    private @NotNull String itemName;
    private long restaurentId;
    private Integer itemPrice;

    public Integer getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}

	public long getRestaurentId() {
		return restaurentId;
	}

	public void setRestaurentId(long restaurentId) {
		this.restaurentId = restaurentId;
	}

	public CartItemDto() {
    }

    public CartItemDto(FoodCart cart) {
        this.setItemId(cart.getCartId());
        this.setQuantity(cart.getQuantity());
        this.setItemName(cart.getItems().getItemName());
    }

   

   

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

	
	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	

	
	

}
