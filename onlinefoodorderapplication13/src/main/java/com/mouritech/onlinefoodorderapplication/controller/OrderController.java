package com.mouritech.onlinefoodorderapplication.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlinefoodorderapplication.dto.CustomerVerificationDto;
import com.mouritech.onlinefoodorderapplication.entity.Customer;
import com.mouritech.onlinefoodorderapplication.entity.Order;
import com.mouritech.onlinefoodorderapplication.exception.ResourceNotFoundException;
import com.mouritech.onlinefoodorderapplication.exceptions.CustomerNotFoundException;
import com.mouritech.onlinefoodorderapplication.service.CustomerService;
import com.mouritech.onlinefoodorderapplication.service.CustomerService1;
import com.mouritech.onlinefoodorderapplication.service.OrderService;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/order")
@Api(value = "")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	//save an order
		@PostMapping("/orders")
		public Order saveOrder(@Valid @RequestBody Order order)
		{
			return orderService.saveOrder(order);
		}
		//get all orders
		@GetMapping("/orders")
		public List<Order> getAllOrders()
		{
			return orderService.getAllOrders();
		}
		//update orders
//		@PutMapping("/orders/{id}")
//		public ResponseEntity<Order> updateOrder(@PathVariable(value = "id") String orderId,
//		         @Valid @RequestBody Order orderDetails) throws OrderNotFoundException {
//		
//			return orderService.updateOrders(orderId,orderDetails);
//		
//		}
		//delete order
//		@DeleteMapping("/orders/{orderId}")
//		public ResponseEntity<?> deleteOrder( 
//				@PathVariable(value = "orderId") String orderId)
//		throws OrderNotFoundException{
//			return orderService.deleteOrder(orderId);
//			
//		}

//		//get order by orderId
//		@GetMapping("/orders/{id}")
//	  public ResponseEntity<Order> getOrderById(@PathVariable(value = "id") String orderId)
//	      throws OrderNotFoundException {
//			return orderService.getOrderById(orderId);
//			
//		}
		
		@GetMapping("/orders/{customerid}")
		public ResponseEntity<List<Order>> getAllOrdersByCustomerId(@PathVariable("customerid") long custId) throws CustomerNotFoundException {
			return orderService.getAllOrdersByCustomerId(custId);
		}
		
		@PostMapping("/orders/{customerid}/customer")
		public ResponseEntity<Order> createOrder(@PathVariable("customerid") long custId,
				@RequestBody Order newOrder) throws CustomerNotFoundException {
			return orderService.createOrder(custId,newOrder);
			
		}

}