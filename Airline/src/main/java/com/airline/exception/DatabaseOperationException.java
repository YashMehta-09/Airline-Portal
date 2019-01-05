
package com.airline.exception;

public class DatabaseOperationException  extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DatabaseOperationException(String message,Throwable cause) {
		super(message);
	}
	public DatabaseOperationException(String message) {
		super(message);
	}
	public DatabaseOperationException(Throwable cause) {
		super(cause);
	}

}