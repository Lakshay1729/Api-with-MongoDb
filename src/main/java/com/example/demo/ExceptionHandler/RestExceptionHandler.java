package com.example.demo.ExceptionHandler;

import org.springframework.http.MediaType;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

	
//	 @ExceptionHandler(value = Exception.class)
//	 @ResponseBody
//	  public ErrorMessage resourceNotFoundException(ResourceNotFoundException ex) {
//	    ErrorMessage message = new ErrorMessage(
//	        HttpStatus.NOT_FOUND,
//	        ex.getMessage(),
//	        LocalDateTime.now());
//	    
//	    return message;
//	  }
	 
	 @ResponseBody
	 @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
	 public String handleHttpMediaTypeNotAcceptableException() {
	     return "acceptable MIME type:" + MediaType.APPLICATION_JSON_VALUE;
	 }
}
