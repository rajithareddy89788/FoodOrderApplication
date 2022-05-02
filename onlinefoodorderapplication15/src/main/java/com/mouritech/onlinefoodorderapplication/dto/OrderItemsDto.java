package com.mouritech.onlinefoodorderapplication.dto;

import javax.validation.constraints.NotNull;

public class OrderItemsDto {
	 private @NotNull double price;
	    private @NotNull int quantity;
	    private @NotNull long orderId;
	    private @NotNull long ItemId;
		
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public long getOrderId() {
			return orderId;
		}
		public void setOrderId(long orderId) {
			this.orderId = orderId;
		}
		public long getItemId() {
			return ItemId;
		}
		public void setItemId(long itemId) {
			ItemId = itemId;
		}
		public OrderItemsDto(double price, int quantity, long orderId, long itemId) {
			super();
			this.price = price;
			this.quantity = quantity;
			this.orderId = orderId;
			ItemId = itemId;
		}
		public OrderItemsDto() {
			// TODO Auto-generated constructor stub
		}
	    
	    

}
