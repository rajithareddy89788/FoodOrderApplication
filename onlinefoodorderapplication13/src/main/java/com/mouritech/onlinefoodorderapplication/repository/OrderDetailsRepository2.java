package com.mouritech.onlinefoodorderapplication.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlinefoodorderapplication.entity.OrderDetails1;
import com.mouritech.onlinefoodorderapplication.entity.Orderdetails;

@Repository
public interface OrderDetailsRepository2 extends JpaRepository<OrderDetails1, String>{

	List<OrderDetails1> findByOrder_OrderId(String orderId);

	Optional<OrderDetails1> findByOrderDetailsId(String orderDetailsId);


//	List<OrderDetails> findByOrder_Customer_CustId(String custId);
}
