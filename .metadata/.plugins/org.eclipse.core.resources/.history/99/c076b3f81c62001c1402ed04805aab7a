package com.mouritech.swiggy_application.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "restaurents")

public class Restaurent {
	// @JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	private String restaurentName;
	private String restaurentLocation;
	@JsonIgnore
	@OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
	@JoinColumn(nullable = false, name = "user_email")
	private User user;
	@OneToMany(mappedBy = "restaurent", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	List<Items> items;

	public Restaurent(String restaurentName, String restaurentLocation, User user, List<Items> items) {
		this.restaurentName = restaurentName;
		this.restaurentLocation = restaurentLocation;
		this.user = user;
		this.items = items;
	}

	public Restaurent(String restaurentName, String restaurentLocation, User user) {
		this.restaurentName = restaurentName;
		this.restaurentLocation = restaurentLocation;
		this.user = user;
	}

	public Restaurent() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRestaurentName() {
		return restaurentName;
	}

	public void setRestaurentName(String restaurentName) {
		this.restaurentName = restaurentName;
	}

	public String getRestaurentLocation() {
		return restaurentLocation;
	}

	public void setRestaurentLocation(String restaurentLocation) {
		this.restaurentLocation = restaurentLocation;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

}
