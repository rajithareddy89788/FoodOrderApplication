package com.mouritech.onlinefoodorderapplication.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlinefoodorderapplication.entity.Order;
import com.mouritech.onlinefoodorderapplication.entity.Orderdetails;

@Repository
public interface OrderRepository extends JpaRepository<Order, String>{

	Optional<Order> findByOrderId(String orderId);



	List<Order> findByCustomer_CustomerId(long custId);
}
