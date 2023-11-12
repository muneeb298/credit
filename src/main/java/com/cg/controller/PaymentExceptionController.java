package com.cg.controller;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.exceptions.PaymentNotFoundException;

@ControllerAdvice
public class PaymentExceptionController {
	
	@ExceptionHandler(value=PaymentNotFoundException.class)
	public ResponseEntity<Object> exceptionHandler(Exception ex) {
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	
}
