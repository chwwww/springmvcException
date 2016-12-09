package com.chw.core.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.chw.core.exception.BusinessException;
import com.chw.core.exception.ParameterException;

/*
 * 基于@exceptionHandler异常处理
 */

public class BaseController {
	
	@ExceptionHandler
	public String exp(HttpServletRequest request, Exception ex){
		request.setAttribute("ex", ex);
		if(ex instanceof BusinessException){
			return "error-business";
		}else if(ex instanceof ParameterException){
			return "error-parameter";
		}else{
			return "error";
		}
		
	}

}
