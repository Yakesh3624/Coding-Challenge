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
	
	@ExceptionHandler(EmptyTableException.class)
	public ResponseEntity<String> EmptyTableExceptionHandler()
	{
		return new ResponseEntity<String>("There is not data currently please add some data and continue",HttpStatus.NO_CONTENT);
	}

}
