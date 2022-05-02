package com.mouritech.onlinefoodorderapplication.serviceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlinefoodorderapplication.dto.CheckoutDto;
import com.mouritech.onlinefoodorderapplication.dto.OrderDto;
import com.mouritech.onlinefoodorderapplication.entity.Customer;
import com.mouritech.onlinefoodorderapplication.entity.FoodCart;
import com.mouritech.onlinefoodorderapplication.entity.Orderdetails;
import com.mouritech.onlinefoodorderapplication.entity.Restaurant;
import com.mouritech.onlinefoodorderapplication.exception.ResourceNotFoundException;
import com.mouritech.onlinefoodorderapplication.repository.FoodCartRepository;
import com.mouritech.onlinefoodorderapplication.repository.OrderDetailsRepository;
import com.mouritech.onlinefoodorderapplication.service.OrderDetailsService;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;
@Service
public class OrderDetailsServiceImpl2  {
	
	@Autowired
	private OrderDetailsRepository orderRepository;
	
	@Autowired
	private FoodCartRepository foodCartRepository;
	
	
//	 @Value("${BASE_URL}")
//	    private String baseURL;

	    @Value("${STRIPE_SECRET_KEY}")
	    private String apiKey;

	    // create total price
	    SessionCreateParams.LineItem.PriceData createPriceData(CheckoutDto checkoutItemDto) {
	        return SessionCreateParams.LineItem.PriceData.builder()
	                .setCurrency("usd")
	                .setUnitAmount((long)(checkoutItemDto.getItemPrice()*100))
	                .setProductData(
	                        SessionCreateParams.LineItem.PriceData.ProductData.builder()
	                                .setName(checkoutItemDto.getItemName())
	                                .build())
	                .build();
	    }

	    // build each product in the stripe checkout page
	    SessionCreateParams.LineItem createSessionLineItem(CheckoutDto checkoutItemDto) {
	        return SessionCreateParams.LineItem.builder()
	                // set price for each product
	                .setPriceData(createPriceData(checkoutItemDto))
	                // set quantity for each product
	                .setQuantity(Long.parseLong(String.valueOf(checkoutItemDto.getQuantity())))
	                .build();
	    }

	    // create session from list of checkout items
	    public Session createSession(List<CheckoutDto> checkoutItemDtoList) throws StripeException {

	        // supply success and failure url for stripe
	        String successURL = baseURL + "payment/success";
	        String failedURL = baseURL + "payment/failed";

	        // set the private key
	        Stripe.apiKey = apiKey;

	        List<SessionCreateParams.LineItem> sessionItemsList = new ArrayList<>();

	        // for each product compute SessionCreateParams.LineItem
	        for (CheckoutDto checkoutItemDto : checkoutItemDtoList) {
	            sessionItemsList.add(createSessionLineItem(checkoutItemDto));
	        }

	        // build the session param
	        SessionCreateParams params = SessionCreateParams.builder()
	                .addPaymentMethodType(SessionCreateParams.PaymentMethodType.CARD)
	                .setMode(SessionCreateParams.Mode.PAYMENT)
	                .setCancelUrl(failedURL)
	                .addAllLineItem(sessionItemsList)
	                .setSuccessUrl(successURL)
	                .build();
	        return Session.create(params);
	    }
}


