/**
 * 
 */
package com.suma.bank.account;

import com.suma.bank.exceptions.BusinessException;
import com.suma.bank.exceptions.NoFundsAvailableException;
import com.suma.bank.util.AppConstants;

/**
 * @author SUMA
 *
 */
public class CheckingAccount extends BankAccount {

	public CheckingAccount(long accountNumber, double amount, String owner) {
		super(accountNumber, amount, owner);
	}

	@Override
	public void withdraw(float amount) throws BusinessException {
		if(amount > this.getAmount()){
			throw new NoFundsAvailableException(AppConstants.NO_FUNDS_AVAILABLE);
		}else{
			this.setAmount(this.getAmount() - amount);
		}
	}

}
