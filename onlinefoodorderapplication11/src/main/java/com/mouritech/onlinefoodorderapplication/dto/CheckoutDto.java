package com.mouritech.onlinefoodorderapplication.dto;

import java.util.List;

public class CheckoutDto {
	 private String itemName;
	    private int  quantity;
	    private int itemPrice;
	    private long itemId;
	    private long userId;

	    public CheckoutDto() {}

	   
	    public CheckoutDto(String itemName, int quantity, int itemPrice, long itemId, long userId) {
			super();
			this.itemName = itemName;
			this.quantity = quantity;
			this.itemPrice = itemPrice;
			this.itemId = itemId;
			this.userId = userId;
		}


		public String getItemName() {
			return itemName;
		}


		public void setItemName(String itemName) {
			this.itemName = itemName;
		}


		public int getQuantity() {
			return quantity;
		}


		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}


		public int getItemPrice() {
			return itemPrice;
		}


		public void setItemPrice(int itemPrice) {
			this.itemPrice = itemPrice;
		}


		public long getItemId() {
			return itemId;
		}


		public void setItemId(long itemId) {
			this.itemId = itemId;
		}


		public long getUserId() {
			return userId;
		}


		public void setUserId(long userId) {
			this.userId = userId;
		}


		
}
