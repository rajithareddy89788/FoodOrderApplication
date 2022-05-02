package com.mouritech.onlinefoodorderapplication.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.onlinefoodorderapplication.dto.CartDto;
import com.mouritech.onlinefoodorderapplication.dto.CartItemDto;
import com.mouritech.onlinefoodorderapplication.dto.FoodCartDetailsDto;
import com.mouritech.onlinefoodorderapplication.dto.NewCartDto;
import com.mouritech.onlinefoodorderapplication.entity.Customer;
import com.mouritech.onlinefoodorderapplication.entity.FoodCart;
import com.mouritech.onlinefoodorderapplication.entity.FoodCartDetails;
import com.mouritech.onlinefoodorderapplication.entity.Order;
import com.mouritech.onlinefoodorderapplication.entity.OrderItem;
import com.mouritech.onlinefoodorderapplication.exceptions.OrderNotFoundException;
import com.mouritech.onlinefoodorderapplication.mapper.FoodCartDetailsMapper;
import com.mouritech.onlinefoodorderapplication.repository.FoodCartDetailsRepository;
import com.mouritech.onlinefoodorderapplication.repository.OrderItemsRepository;
import com.mouritech.onlinefoodorderapplication.repository.OrderRepository;
import com.mouritech.onlinefoodorderapplication.serviceImpl.FoodCartServiceImpl;

@Service
@Transactional
public class FoodCartDetailsService {
	@Autowired
	private FoodCartDetailsRepository cartRepository;
	@Autowired
	private FoodCartDetailsMapper foodCartDetailsMapper ;
	
	public FoodCartDetails insertCart(FoodCartDetailsDto foodCartDetailsDto) {
		FoodCartDetails foodCartDetails=foodCartDetailsMapper.convertDtoToEntity(foodCartDetailsDto);
		NewCartDto newCartDto=new NewCartDto();
		foodCartDetails.setId(newCartDto.getCartId());
		// TODO Auto-generated method stub
		return cartRepository.save(foodCartDetails);
	}

	
}
