package com.mouritech.onlinefoodorderapplication.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public class CustomerNotFoundException extends RuntimeException {

		/**
		 * 
		 */
		private static final long serialVersionUID = -7170527259470261623L;

		public CustomerNotFoundException(String message) {
			super(message);
		}

}
