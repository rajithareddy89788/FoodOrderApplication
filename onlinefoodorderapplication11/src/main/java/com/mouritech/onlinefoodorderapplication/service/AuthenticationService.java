package com.mouritech.onlinefoodorderapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.onlinefoodorderapplication.config.MessageStrings;
import com.mouritech.onlinefoodorderapplication.entity.AuthenticationToken;
import com.mouritech.onlinefoodorderapplication.entity.User;
import com.mouritech.onlinefoodorderapplication.exceptions.AuthenticationFailException;
import com.mouritech.onlinefoodorderapplication.repository.TokenRepository;
import com.mouritech.onlinefoodorderapplication.utils.Helper;

@Service
public class AuthenticationService {
	 @Autowired
	    TokenRepository repository;
	 public void saveConfirmationToken(AuthenticationToken authenticationToken) {
	        repository.save(authenticationToken);
	    }

	    public AuthenticationToken getToken(User user) {
	        return repository.findTokenByUser(user);
	    }

	    public User getUser(String token) {
	        AuthenticationToken authenticationToken = repository.findTokenByToken(token);
	        if (Helper.notNull(authenticationToken)) {
	            if (Helper.notNull(authenticationToken.getUser())) {
	                return authenticationToken.getUser();
	            }
	        }
	        return null;
	    }

	    public void authenticate(String token) throws AuthenticationFailException {
	        if (!Helper.notNull(token)) {
	            throw new AuthenticationFailException(MessageStrings.AUTH_TOEKN_NOT_PRESENT);
	        }
	        if (!Helper.notNull(getUser(token))) {
	            throw new AuthenticationFailException(MessageStrings.AUTH_TOEKN_NOT_VALID);
	        }
	    }

}
