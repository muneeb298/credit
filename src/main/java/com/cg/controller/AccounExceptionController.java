package com.cg.controller;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.cg.exceptions.AccountNotFoundException;

@ControllerAdvice
public class AccounExceptionController {

	@ExceptionHandler(value=AccountNotFoundException.class)
	public ResponseEntity<Object> exceptionHandler(Exception ex) {
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
}
