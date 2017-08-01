/**
 * 
 */
package com.suma.bank.account;

import static com.suma.bank.util.AppConstants.LIMIT_EXCEEDED_MSG;

import com.suma.bank.exceptions.BusinessException;
import com.suma.bank.exceptions.LimitExceededException; 

/**
 * @author SUMA
 *
 */
public class IndividualAccount extends InvestmentAccount {

	public IndividualAccount(long accountNumber, double amount, String owner) {
		super(accountNumber, amount, owner);
	}

	public void withdraw(float amount) throws BusinessException  {
		if(amount > 500){
			throw new LimitExceededException(LIMIT_EXCEEDED_MSG);
		}else{
			super.withdraw(amount);
		}
	}

}
