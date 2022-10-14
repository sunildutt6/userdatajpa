package com.sunil.userdatajpaproject.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@ControllerAdvice
public class handlerException extends RuntimeException{
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public String userNotFound() {
		return "User not found in system";
	}
	 
}
