package com.mouritech.onlinefoodorderapplication.dto;



import javax.validation.constraints.NotNull;

public class AddToCartDto {
   // private long id;
    private @NotNull long itemId;
    private @NotNull Integer quantity;

    public AddToCartDto() {
    	
    }

  


   
//    public long getId() {
//		return id;
//	}
//
//
//
//
//
//	public void setId(long id) {
//		this.id = id;
//	}





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
}
