
package com.airline.exception;

/**
 * @author yasha
 *
 */
public class DatabaseOperationException  extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param message
	 * @param cause
	 */
	public DatabaseOperationException(String message,Throwable cause) {
		super(message);
	}
	/**
	 * @param message
	 */
	public DatabaseOperationException(String message) {
		super(message);
	}
	/**
	 * @param cause
	 */
	public DatabaseOperationException(Throwable cause) {
		super(cause);
	}

}