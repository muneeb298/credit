package com.cg.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.exceptions.PasswordNotFoundException;
import com.cg.exceptions.UserIdNotFoundException;

@ControllerAdvice
public class UserExceptionController {
	
	@ExceptionHandler(value=UserIdNotFoundException.class)
	public ResponseEntity<Object> userExceptionHandler(Exception ex) {
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=PasswordNotFoundException.class)
	public ResponseEntity<Object> passwordExceptionHandler(Exception ex) {
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
}
