package com.airline.exception;

/**
 * @author yasha
 *
 */
public class BusinessException  extends Exception{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * @param cause
	 */
	public BusinessException(String message, Throwable cause) {
		super(message, cause);
		
	}

	/**
	 * @param message
	 */
	public BusinessException(String message) {
		super(message);
	
	}

	/**
	 * @param cause
	 */
	public BusinessException(Throwable cause) {
		super(cause);
		
	}
	
	

}

