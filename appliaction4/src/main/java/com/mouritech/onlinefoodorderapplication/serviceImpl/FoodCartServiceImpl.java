package com.mouritech.onlinefoodorderapplication.serviceImpl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mouritech.onlinefoodorderapplication.config.MessageStrings;
import com.mouritech.onlinefoodorderapplication.dto.AddToCartDto;
import com.mouritech.onlinefoodorderapplication.dto.ResponseDto;
import com.mouritech.onlinefoodorderapplication.dto.SignInDto;
import com.mouritech.onlinefoodorderapplication.dto.SignInResponseDto;
import com.mouritech.onlinefoodorderapplication.dto.SignupDto;
import com.mouritech.onlinefoodorderapplication.entity.AuthenticationToken;
import com.mouritech.onlinefoodorderapplication.entity.Customer;
import com.mouritech.onlinefoodorderapplication.entity.FoodCart;
import com.mouritech.onlinefoodorderapplication.entity.FoodCartItems;
import com.mouritech.onlinefoodorderapplication.entity.Items;
import com.mouritech.onlinefoodorderapplication.enums.ResponseStatus;

import com.mouritech.onlinefoodorderapplication.exceptions.AuthenticationFailException;
import com.mouritech.onlinefoodorderapplication.exceptions.CustomException;

import com.mouritech.onlinefoodorderapplication.repository.CustomerRepository1;
import com.mouritech.onlinefoodorderapplication.repository.FoodCartItemsRepository;
import com.mouritech.onlinefoodorderapplication.repository.FoodCartRepository;
import com.mouritech.onlinefoodorderapplication.repository.ItemsRepository;
import com.mouritech.onlinefoodorderapplication.service.AuthenticationService;

import com.mouritech.onlinefoodorderapplication.service.CustomerService2;
import com.mouritech.onlinefoodorderapplication.service.FoodCartItemsService;
import com.mouritech.onlinefoodorderapplication.service.FoodCartService;
import com.mouritech.onlinefoodorderapplication.utils.Helper;

@Service
public class FoodCartServiceImpl implements FoodCartService {

	@Autowired
	private FoodCartRepository foodCartRepository;

	@Autowired
	private FoodCartItemsRepository foodCartItemsRepository;
	@Autowired
	private ItemsRepository itemsRepository;
	@Autowired
	private ItemServiceImpl itemService;

	@Override
	public void addFoodCart(List<AddToCartDto> dto1,Customer customer,Items items) {
		// List<Items>items= itemsRepository.findAll();
		FoodCart foodCart = new FoodCart();
		foodCart.setCreatedDate(new Date());
		foodCart.setCustomer(customer);
		
		foodCartRepository.save(foodCart);
		List<FoodCartItems> foodCartItemsList = new ArrayList<>();
		// List<Items> productList = new  ArrayList<>();
		for (AddToCartDto addToCartDto1 : dto1) {
			FoodCartItems foodCartItems1 = new FoodCartItems();

			foodCartItems1.setItemName(addToCartDto1.getItemName());
			foodCartItems1.setItems1(items);
			// productList.add(itemService.getProductById(addToCartDto1.getItemId()));
			
			System.out.println("fdhgfjhgjh" + foodCartItems1.getItemName());
			foodCartItems1.setFoodCart(foodCart);
			foodCartItemsList.add(foodCartItemsRepository.save(foodCartItems1));
		}
	}

	@Override
	public List<FoodCart> listFoodCarts(Customer customer) {
		 return foodCartRepository.findAllByCustomer(customer);
      
   }

	}
	 
