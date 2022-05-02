package com.mouritech.onlinefoodorderapplication.mapper;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mouritech.onlinefoodorderapplication.dto.FoodCartDetailsDto;
import com.mouritech.onlinefoodorderapplication.dto.RestaurantItemsDto;
import com.mouritech.onlinefoodorderapplication.entity.FoodCartDetails;
import com.mouritech.onlinefoodorderapplication.entity.Restaurant;

@Component
public class FoodCartDetailsMapper {
	
	@Autowired
	ModelMapper modelMapper;
	
	public FoodCartDetailsDto convertEntityToDto(FoodCartDetails foodCartDetails)
	{
		return new FoodCartDetailsDto(foodCartDetails.getId(),foodCartDetails.getCreatedDate(),foodCartDetails.isActive());
	}
	
	public FoodCartDetails convertDtoToEntity(FoodCartDetailsDto foodCartDetailsDto)
	{
		return new FoodCartDetails(foodCartDetailsDto.getId(),foodCartDetailsDto.getCreatedDate(),foodCartDetailsDto.isActive());
	}


}
