/**
 * 
 */
package com.suma.bank.exceptions;

/**
 * @author SUMA
 *
 */
public class BusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 */
	public BusinessException(String message) {
		super(message);
	}

}
