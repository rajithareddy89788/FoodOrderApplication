package com.mouritech.onlinefoodorderapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouritech.onlinefoodorderapplication.entity.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	List<User> findAll();

    User findByEmail(String email);

    User findUserByEmail(String email);

}
