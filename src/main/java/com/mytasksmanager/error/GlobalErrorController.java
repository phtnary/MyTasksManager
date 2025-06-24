package com.mytasksmanager.error;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalErrorController extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(SectionNotFoundException.class)
	public ProblemDetail handleSectionNotFound(SectionNotFoundException ex) {
		ProblemDetail result= ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, ex.getMessage());
		
		result.setTitle("Section no encontrada");
		result.setType(URI.create("http://VisitDoc/errors/Section-Not-Found"));
		
		
		return result;
		
	}
	
	@ExceptionHandler(SectionExistException.class)
	public ProblemDetail handleSectionExit(SectionExistException ex) {
		ProblemDetail result= ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, ex.getMessage());
		
		result.setTitle("La section ya existe");
		result.setType(URI.create("http://VisitDoc/errors/Section-Not-Found"));
		
		
		return result;
		
	}
}
