package com.mouritech.onlinefoodorderapplication.dto;

import java.util.Date;

import com.mouritech.onlinefoodorderapplication.entity.FoodCart;
import com.mouritech.onlinefoodorderapplication.entity.FoodCartDetails;

public class FoodCartDetailsDto {
	private long id;
	 private Date createdDate;
	 private boolean isActive;
	 
	 public FoodCartDetailsDto(FoodCartDetails foodCartDetails) {
	        this.setId(foodCartDetails.getId());
	        this.setCreatedDate(foodCartDetails.getCreatedDate());
	        this.setActive(foodCartDetails.isActive());
	 }
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public FoodCartDetailsDto(Date createdDate, boolean isActive) {
		super();
		this.createdDate = createdDate;
		this.isActive = isActive;
	}
	public FoodCartDetailsDto(long id, Date createdDate, boolean isActive) {
		super();
		this.id = id;
		this.createdDate = createdDate;
		this.isActive = isActive;
	}
	public FoodCartDetailsDto() {
		// TODO Auto-generated constructor stub
	}
	 

}
