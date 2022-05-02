package com.mouritech.onlinefoodorderapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mouritech.onlinefoodorderapplication.entity.FoodCart;
import com.mouritech.onlinefoodorderapplication.entity.User;

@Repository
public interface FoodCartRepository extends JpaRepository<FoodCart, Long>{

	List<FoodCart> findByItems_ItemId(long itemId);

	FoodCart findByItems_ItemName(String itemName);

	List<FoodCart> findAllByUserOrderByCreatedDateDesc(User user);

    List<FoodCart> deleteByUser(User user);


}
