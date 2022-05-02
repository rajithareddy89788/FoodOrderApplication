package com.mouritech.onlinefoodorderapplication.dto;

import com.mouritech.onlinefoodorderapplication.entity.Customer;

public class SignInResponseDto {
	  private String status;
	    private String token;
	    private String customerEmail;
	    
	    

	   
		public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    public String getToken() {
	        return token;
	    }

	    public void setToken(String token) {
	        this.token = token;
	    }

		
		
		public SignInResponseDto() {
			// TODO Auto-generated constructor stub
		}

		public SignInResponseDto(String status, String token, String customerEmail) {
			super();
			this.status = status;
			this.token = token;
			this.customerEmail = customerEmail;
		}

		public String getCustomerEmail() {
			return customerEmail;
		}

		public void setCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
		}

		

		
	   

}
