/**
 * 
 */
package com.suma.bank.account;

import com.suma.bank.exceptions.BusinessException;

/**
 * @author SUMA
 *
 */
public interface Account {
	public void deposit(float amount);
	public void withdraw(float amount) throws BusinessException;
	public void transfer(Account to, float amount);
}
