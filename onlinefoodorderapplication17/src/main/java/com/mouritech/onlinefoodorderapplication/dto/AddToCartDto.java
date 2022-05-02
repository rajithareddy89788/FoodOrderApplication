package com.mouritech.onlinefoodorderapplication.dto;



import java.util.List;

import javax.validation.constraints.NotNull;

public class AddToCartDto {
    private long id;
   
    private List<NewCartDto> newCartDto;
    //private String shippingAddress;

   
    	
    

  


   
    public long getId() {
		return id;
	}





	public AddToCartDto() {
		// TODO Auto-generated constructor stub
	}





	public AddToCartDto(List<NewCartDto> newCartDto) {
		super();
		this.newCartDto = newCartDto;
	}





	public void setId(long id) {
		this.id = id;
	}





	public List<NewCartDto> getNewCartDto() {
		return newCartDto;
	}





	public void setNewCartDto(List<NewCartDto> newCartDto) {
		this.newCartDto = newCartDto;
	}





	
    
}
