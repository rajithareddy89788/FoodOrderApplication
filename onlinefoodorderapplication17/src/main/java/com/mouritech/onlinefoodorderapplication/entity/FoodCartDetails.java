package com.mouritech.onlinefoodorderapplication.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mouritech.onlinefoodorderapplication.dto.AddToCartDto;


@Entity
@Table(name = "foodcartDetails")
public class FoodCartDetails {
	
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	 @Column(name = "created_date")
	    private Date createdDate;
	 @Column(name = "status")
	 private boolean isActive;
	 
	 @OneToMany(mappedBy = "foodCartDetails" )
	 //@JsonIgnore
		private Set<FoodCart> foodCart=new HashSet<FoodCart>();
	 
//	 @ManyToOne(fetch = FetchType.EAGER)
//		@JoinColumn(name = "customer_id")
//		 @JsonIgnore
//		private Customer customer;

	 
	public FoodCartDetails() {
		// TODO Auto-generated constructor stub
	}
	public FoodCartDetails(Long id, Date createdDate, boolean isActive) {
		super();
		this.id = id;
		this.createdDate = createdDate;
		this.isActive = isActive;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Set<FoodCart> getFoodCart() {
		return foodCart;
	}
	public void setFoodCart(Set<FoodCart> foodCart) {
		this.foodCart = foodCart;
	}
	
	 
//	 @Column(name = "shippingAddress")
//	 private String shippingAddress;
	 
	
	
	
	

}
