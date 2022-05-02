package com.mouritech.onlinefoodorderapplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlinefoodorderapplication.common.APIResponse;
import com.mouritech.onlinefoodorderapplication.dto.AddToCartDto;
import com.mouritech.onlinefoodorderapplication.dto.ResponseDto;
import com.mouritech.onlinefoodorderapplication.dto.SignInDto;
import com.mouritech.onlinefoodorderapplication.dto.SignInResponseDto;
import com.mouritech.onlinefoodorderapplication.dto.SignupDto;
import com.mouritech.onlinefoodorderapplication.entity.Customer;
import com.mouritech.onlinefoodorderapplication.entity.FoodCart;
import com.mouritech.onlinefoodorderapplication.entity.Items;
import com.mouritech.onlinefoodorderapplication.exceptions.AuthenticationFailException;
import com.mouritech.onlinefoodorderapplication.exceptions.CustomException;
import com.mouritech.onlinefoodorderapplication.repository.CustomerRepository1;

import com.mouritech.onlinefoodorderapplication.service.AuthenticationService;

import com.mouritech.onlinefoodorderapplication.service.CustomerService2;
import com.mouritech.onlinefoodorderapplication.service.FoodCartService;
import com.mouritech.onlinefoodorderapplication.serviceImpl.ItemServiceImpl;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/foodcart")
@Api(value = "")
public class FoodCartController {
	@Autowired
	private FoodCartService foodCartService;
	
	@Autowired
	private AuthenticationService authenticationService;
	@Autowired
	private ItemServiceImpl itemService;
	@PostMapping("/add")
	public ResponseEntity<APIResponse> placeCart(@RequestBody List<AddToCartDto> dto1,  @RequestParam("token") String token)
			{
		authenticationService.authenticate(token);

		Customer customer = authenticationService.getCustomer(token);
		 //List<Items> productList = new  ArrayList<>();
		//productList.add(itemService.getProductById(dto1.get(0).getItemId()));
		Items product = itemService.getProductById(dto1.get(0).getItemId());
		foodCartService.addFoodCart(dto1,customer,product);
		return new ResponseEntity<>(new APIResponse(true, "Items added in cart"), HttpStatus.CREATED);
	}
	@GetMapping("/cartlist")
	public ResponseEntity<List<FoodCart>> getAllCartsOfCustomer(@RequestParam("token") String token)
			throws AuthenticationFailException {

		authenticationService.authenticate(token);

		Customer customer = authenticationService.getCustomer(token);

		List<FoodCart> foodCartList = foodCartService.listFoodCarts(customer);
		System.out.println(foodCartList);

		return new ResponseEntity<>(foodCartList, HttpStatus.OK);
	}
}
