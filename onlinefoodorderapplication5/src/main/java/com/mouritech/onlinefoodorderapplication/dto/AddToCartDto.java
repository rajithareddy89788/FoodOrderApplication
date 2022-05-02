package com.mouritech.onlinefoodorderapplication.dto;

import javax.validation.constraints.NotNull;



public class AddToCartDto {
	 private long id;
	    private @NotNull String itemName;
	   
	    private @NotNull Integer no_of_items;
		public AddToCartDto() {
			// TODO Auto-generated constructor stub
		}
		
		
		
		


		
		public AddToCartDto(@NotNull String itemName, @NotNull Integer no_of_items) {
			this.itemName = itemName;
			this.no_of_items = no_of_items;
		}







		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		

		





		public String getItemName() {
			return itemName;
		}







		public void setItemName(String itemName) {
			this.itemName = itemName;
		}







		public Integer getNo_of_items() {
			return no_of_items;
		}

		public void setNo_of_items(Integer no_of_items) {
			this.no_of_items = no_of_items;
		}



	
		
}
