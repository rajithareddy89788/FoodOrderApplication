package com.mouritech.onlinefoodorderapplication.dto;

import javax.validation.constraints.NotNull;

public class AddToCartDto {
    private Integer id;
    private @NotNull Integer ItemId;
    private @NotNull Integer quantity;

    public AddToCartDto() {
    }



  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


  

    public Integer getItemId() {
		return ItemId;
	}





	public void setItemId(Integer itemId) {
		ItemId = itemId;
	}





	public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
