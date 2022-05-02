package com.mouritech.onlinefoodorderapplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mouritech.onlinefoodorderapplication.entity.Items;
import com.mouritech.onlinefoodorderapplication.entity.Restaurant;

@Repository
public interface ItemsRepository2 extends JpaRepository<Items, Long>{

	@Query("SELECT c FROM Items c WHERE c.itemName=:itemName")
	Optional<Items> findByItemName(String itemName );


}
