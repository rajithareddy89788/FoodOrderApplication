package com.mouritech.onlinefoodorderapplication.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlinefoodorderapplication.dto.AddToCartDto;
import com.mouritech.onlinefoodorderapplication.dto.CartDto;
import com.mouritech.onlinefoodorderapplication.entity.FoodCart;
import com.mouritech.onlinefoodorderapplication.entity.Items;
import com.mouritech.onlinefoodorderapplication.exception.ResourceNotFoundException;
import com.mouritech.onlinefoodorderapplication.service.FoodCartService;
import com.mouritech.onlinefoodorderapplication.serviceImpl.FoodCartServiceImpl;
import com.mouritech.onlinefoodorderapplication.serviceImpl.ItemServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/foodcart")
@Api(value = "")
public class FoodCartController {
	@Autowired
	private FoodCartServiceImpl cartService;
	@Autowired
	private  ItemServiceImpl itemservice;
	@Autowired
	private FoodCartService cartService1;
	
	
	@PostMapping("Cart")
	public FoodCart insertCart(@RequestBody FoodCart newCart) {
		return cartService.insertCart(newCart);
	}
	@GetMapping("Cart")
	public List<FoodCart> showAllCarts() {
		return cartService.showAllCarts();
	}
	@GetMapping("Cart/{cid}")
	public FoodCart showCartById(@PathVariable("cid") Long CartId) throws ResourceNotFoundException  {
		return cartService.showCartById(CartId);
	}
	@PutMapping("Cart/{cid}")
	public FoodCart updateCartById(@PathVariable("cid") Long CartId, @RequestBody FoodCart Cart) throws ResourceNotFoundException
			{
		return cartService.updateCartById(CartId, Cart);
	}
//	@DeleteMapping("Cart/{cid}")
//	public String deleteCartById(@PathVariable("cid") long CartId) throws ResourceNotFoundException  {
//		cartService.deleteCartById(CartId);
//		return "deleted the Cart";
//	}
	
	 @DeleteMapping("Cart/{cid}")
	    public FoodCart deleteCartById(@PathVariable("cid") long CartId) throws ResourceNotFoundException  {
	        return cartService.deleteCartById(CartId);
	    }
	
//	@PostMapping("/createcartusingcustNameanditem/{customerName}/{restaurantName}/{itemName}/{quantity}")
//	public FoodCart createCart(@PathVariable("customerName") String customerName,@PathVariable("restaurantName") String restaurantName,@PathVariable("itemName") String itemName, @PathVariable("quantity") int quantity)
//	{
//		return cartService.createCart(customerName,restaurantName,itemName, quantity);
//	}
	
	@PostMapping("/createcartusingcustNameanditem/{customerName}/{restaurantName}/{itemName}")
	public FoodCart createCart(@PathVariable("customerName") String customerName,@PathVariable("restaurantName") String restaurantName,@PathVariable("itemName") String itemName)
	{
		return cartService.createCart(customerName,restaurantName,itemName);
	}
	
	
	@PutMapping("/updateCartAddNewItems/{cartId}/{restaurantName}/{itemName}")
	public FoodCart addItemsInCart(@PathVariable("cartId") Long cartId,@PathVariable("restaurantName") String restaurantName,@PathVariable("itemName") String itemName) throws ResourceNotFoundException {
		return cartService.addItemsInCart(cartId,restaurantName,itemName);
	}
	@PostMapping("/add")
    public ResponseEntity<ApiResponse> addToCart(@RequestBody AddToCartDto addToCartDto ) {
        
        Items items = itemservice.findByName(addToCartDto.getItemName());
        //System.out.println("product to add"+  product.getName());
        cartService.addToCart1(addToCartDto, items);
        return new ResponseEntity<ApiResponse>(HttpStatus.CREATED);

 }
 @GetMapping("/")
    public ResponseEntity<CartDto> getCartItems()  {
      
      
        CartDto cartDto = cartService.listCartItems();
        return new ResponseEntity<CartDto>(cartDto,HttpStatus.OK);
    }

//	@PutMapping("/updateCartAddNewItems/{cartId}/{restaurantName}/{itemName}/{quantity}")
//	public FoodCart addItemsInCart(@PathVariable("cartId") Long cartId,@PathVariable("restaurantName") String restaurantName,@PathVariable("itemName") String itemName, @PathVariable("quantity") int quantity)) throws ResourceNotFoundException {
//		return cartService.addItemsInCart(cartId,restaurantName,itemName);
//	}

}