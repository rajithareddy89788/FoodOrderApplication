package com.mouritech.swiggy_application.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mouritech.swiggy_application.dto.ItemDto;
import com.mouritech.swiggy_application.dto.OfferDto;

@Entity
@Table(name = "offers")

public class Offers {
	@JsonIgnore
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private int offerValue;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "restaurentId", nullable = false)
	Restaurent restaurent;

	public Offers(OfferDto offerDto, Restaurent restaurent) {
		this.offerValue = offerDto.getOfferValue();

		this.restaurent = restaurent;
	}

	public Offers() {

	}

	public Offers(int offerValue, Restaurent restaurent) {
		super();
		this.offerValue = offerValue;
		this.restaurent = restaurent;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Restaurent getRestaurent() {
		return restaurent;
	}

	public void setRestaurent(Restaurent restaurent) {
		this.restaurent = restaurent;
	}

	public int getOfferValue() {
		return offerValue;
	}

	public void setOfferValue(int offerValue) {
		this.offerValue = offerValue;
	}

}
