/**
 * 
 */
package com.suma.bank.exceptions;

/**
 * @author SUMA
 *
 */
public class NoFundsAvailableException extends BusinessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 */
	public NoFundsAvailableException(String message) {
		super(message);
	}

}
