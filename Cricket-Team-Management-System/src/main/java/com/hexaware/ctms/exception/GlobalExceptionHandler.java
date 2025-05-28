package com.hexaware.ctms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(PlayerNotFoundException.class)
	public ResponseEntity<String> PlayerNotFoundExceptionHandler()
	{
		return new ResponseEntity<String>("The requested player is not found",HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> ExceptionHandler()
	{
		return new ResponseEntity<String>("Data not valid, enter correct data",HttpStatus.NOT_ACCEPTABLE);
	}

}
