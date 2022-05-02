package com.mouritech.onlinefoodorderapplication.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefoodorderapplication.dto.OrderDto;
import com.mouritech.onlinefoodorderapplication.entity.Order;
import com.mouritech.onlinefoodorderapplication.entity.Orderdetails;
import com.mouritech.onlinefoodorderapplication.exception.ResourceNotFoundException;
import com.mouritech.onlinefoodorderapplication.exceptions.CustomerNotFoundException;
import com.mouritech.onlinefoodorderapplication.exceptions.OrderNotFoundException;

public interface OrderService {
	
    
	Order saveOrder(Order order);

	List<Order> getAllOrders();

	//ResponseEntity<Order> updateOrders(String orderId, @Valid Order orderDetails) throws OrderNotFoundException;

	ResponseEntity<?> deleteOrder(String orderId) throws OrderNotFoundException ;

	ResponseEntity<Order> getOrderById(String orderId) throws OrderNotFoundException;

	ResponseEntity<List<Order>> getAllOrdersByCustomerId(long CustId) throws CustomerNotFoundException;



	ResponseEntity<Order> createOrder(long customerId, Order newOrder) throws CustomerNotFoundException;

}


