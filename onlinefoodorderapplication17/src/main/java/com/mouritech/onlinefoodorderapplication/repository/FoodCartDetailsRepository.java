package com.mouritech.onlinefoodorderapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlinefoodorderapplication.dto.FoodCartDetailsDto;
import com.mouritech.onlinefoodorderapplication.entity.Customer;
import com.mouritech.onlinefoodorderapplication.entity.FoodCartDetails;

@Repository
public interface FoodCartDetailsRepository extends JpaRepository<FoodCartDetails, Long>  {

	FoodCartDetails save(FoodCartDetailsDto newCart);
	

}
