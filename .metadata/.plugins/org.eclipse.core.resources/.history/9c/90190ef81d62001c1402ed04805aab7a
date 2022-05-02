package com.mouritech.swiggy_application.service;

import java.util.List;
import java.util.Optional;

import com.mouritech.swiggy_application.dto.ItemDto2;
import com.mouritech.swiggy_application.dto.RestaurentDto;
import com.mouritech.swiggy_application.dto.RestaurentDto2;
import com.mouritech.swiggy_application.entity.Restaurent;
import com.mouritech.swiggy_application.entity.User;

public interface RestaurentService {
	void addToRestaurent(RestaurentDto restaurentDto, User users);
	List<RestaurentDto2> listRestaurents();
	

	List<Restaurent> readRestaurent(String restaurentName);

	Optional<Restaurent> readRestaurent(long restaurentId);

	List<Restaurent> getRestaurentByName(String restaurentName);
}
