package com.devsuperior.movieflix.services.exception;

public class ForBiddenException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ForBiddenException(String str) {
		super(str);
	}

}
