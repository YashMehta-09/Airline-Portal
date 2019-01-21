
package com.airline.exception;

/**
 * @author yasha
 *
 */
public class ApplicationException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * @param cause
	 */
	public  ApplicationException(String message,Throwable cause) {
		
		super(message,cause);
	}
	/**
	 * @param message
	 */
	public ApplicationException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ApplicationException(Throwable cause) {
		super(cause);
	}

}

