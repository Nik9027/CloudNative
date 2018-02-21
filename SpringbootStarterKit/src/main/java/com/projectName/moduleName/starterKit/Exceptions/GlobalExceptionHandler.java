package com.projectName.moduleName.starterKit.Exceptions;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	
	  @ExceptionHandler(Exception.class)
	  @ResponseStatus(value=HttpStatus.NOT_FOUND)

	    @ResponseBody

		public ErrorResponse handleException(HttpServletRequest request, Exception ex){
			logger.info("Exception Occured:: URL="+request.getRequestURL());
		return new ErrorResponse("Exception Occured", "Invalid  user operation");
		}
	  
	  @ExceptionHandler(UserIdNotFoundException.class)
	    @ResponseStatus(HttpStatus.NOT_FOUND)
	    @ResponseBody
	    public ErrorResponse handleUserNotFoundException(final UserIdNotFoundException ex) {
	        logger.error("User not found thrown", ex);
	        return new ErrorResponse("USER_NOT_FOUND", "The user was not found");
	    }
	 
	
	


}