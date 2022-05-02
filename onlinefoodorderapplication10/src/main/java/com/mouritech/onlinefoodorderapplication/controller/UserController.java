package com.mouritech.onlinefoodorderapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlinefoodorderapplication.dto.ResponseDto;
import com.mouritech.onlinefoodorderapplication.dto.SignInDto;
import com.mouritech.onlinefoodorderapplication.dto.SignInResponseDto;
import com.mouritech.onlinefoodorderapplication.dto.SignupDto;
import com.mouritech.onlinefoodorderapplication.entity.User;
import com.mouritech.onlinefoodorderapplication.exceptions.AuthenticationFailException;
import com.mouritech.onlinefoodorderapplication.exceptions.CustomException;
import com.mouritech.onlinefoodorderapplication.repository.UserRepository;
import com.mouritech.onlinefoodorderapplication.service.AuthenticationService;
import com.mouritech.onlinefoodorderapplication.service.UserService;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/customer")
@Api(value = "")
public class UserController {
	  @Autowired
	    UserRepository userRepository;

	    @Autowired
	    AuthenticationService authenticationService;

	    @Autowired
	    UserService userService;

	    @GetMapping("/all")
	    public List<User> findAllUser(@RequestParam("token") String token) throws AuthenticationFailException {
	        authenticationService.authenticate(token);
	        return userRepository.findAll();
	    }

	    @PostMapping("/signup")
	    public ResponseDto Signup(@RequestBody SignupDto signupDto) throws CustomException {
	        return userService.signUp(signupDto);
	    }

	    //TODO token should be updated
	    @PostMapping("/signIn")
	    public SignInResponseDto Signup(@RequestBody SignInDto signInDto) throws CustomException {
	        return userService.signIn(signInDto);
	    }
	

}
