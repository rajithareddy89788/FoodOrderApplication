package com.mouritech.swiggy_application.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.swiggy_application.entity.User;
import com.mouritech.swiggy_application.exception.ResourceNotFoundException;
import com.mouritech.swiggy_application.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User getUserByEmail(String Email) {
		Optional<User> result = userRepository.findByEmail(Email);
		if (result.isPresent()) {
			return result.get();
		} else {
			throw new ResourceNotFoundException("User with email  is not found.");
		}

	}

	public User findById(long theId) {

		Optional<User> result = userRepository.findById(theId);
		User users = null;
		if (result.isPresent()) {
			users = result.get();
		} else {
			throw new RuntimeException("Did not find user id-" + theId);
		}
		return users;
	}

}
