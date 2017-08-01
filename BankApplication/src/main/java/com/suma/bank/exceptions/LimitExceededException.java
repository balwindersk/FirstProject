/**
 * 
 */
package com.suma.bank.exceptions;

/**
 * @author SUMA
 *
 */
public class LimitExceededException extends BusinessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * sdgzhz
	 * xbm
	 * @param message
	 */
	public LimitExceededException(String message) {
		super(message);
	}

}
