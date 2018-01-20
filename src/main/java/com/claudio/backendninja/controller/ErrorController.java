package com.claudio.backendninja.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {
	
	public static final String ISE_VIEW = "error/500";
	
	@ExceptionHandler(Exception.class) // se puede poner el tipo de excepcion a manejar
	public String showInternalServerError(){
		System.err.println("Ejecutado metodo que maneja excepciones");
		return ISE_VIEW;
	}

}
