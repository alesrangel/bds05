package com.devsuperior.movieflix.services.exception;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String str) {
		super(str);
	}

}
