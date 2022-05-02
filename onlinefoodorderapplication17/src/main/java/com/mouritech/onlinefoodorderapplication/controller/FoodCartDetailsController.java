package com.mouritech.onlinefoodorderapplication.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlinefoodorderapplication.common.APIResponse;
import com.mouritech.onlinefoodorderapplication.dto.AddToCartDto;
import com.mouritech.onlinefoodorderapplication.dto.CartDto;
import com.mouritech.onlinefoodorderapplication.dto.FoodCartDetailsDto;
import com.mouritech.onlinefoodorderapplication.entity.Customer;
import com.mouritech.onlinefoodorderapplication.entity.FoodCart;
import com.mouritech.onlinefoodorderapplication.entity.FoodCartDetails;
import com.mouritech.onlinefoodorderapplication.entity.Items;
//import com.mouritech.onlinefoodorderapplication.entity.User;
import com.mouritech.onlinefoodorderapplication.exception.ResourceNotFoundException;
import com.mouritech.onlinefoodorderapplication.exceptions.AuthenticationFailException;
import com.mouritech.onlinefoodorderapplication.exceptions.CartItemNotExistException;
import com.mouritech.onlinefoodorderapplication.exceptions.ProductNotExistException;
import com.mouritech.onlinefoodorderapplication.service.AuthenticationService;
import com.mouritech.onlinefoodorderapplication.service.FoodCartDetailsService;
import com.mouritech.onlinefoodorderapplication.service.FoodCartService;
import com.mouritech.onlinefoodorderapplication.serviceImpl.FoodCartServiceImpl;
import com.mouritech.onlinefoodorderapplication.serviceImpl.ItemServiceImpl;

import io.swagger.annotations.Api; 



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/foodcartdetails")
@Api(value = "")
public class FoodCartDetailsController {
	@Autowired
	private FoodCartDetailsService cartService;
	
	
	@PostMapping("Cartdetailsadd")
	public FoodCartDetails insertCart(@RequestBody FoodCartDetailsDto foodCartDetailsDto) {
		return cartService.insertCart(foodCartDetailsDto);
	}
	
	
	

}