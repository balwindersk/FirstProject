/**
 * 
 */
package com.suma.bank;

import java.util.ArrayList;
import java.util.List;

import com.suma.bank.account.BankAccount;
import com.suma.bank.exceptions.BusinessException;

/**
 * @author SUMA
 *
 */
public class Bank {

	private String name;
	List<BankAccount> accounts;
	public BankAccount getAccount(long accountNumber){
		for(BankAccount account : this.accounts){
			if(account!=null && account.getAccountNumber() == accountNumber){
				return account;
			}
		}
		return null;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the accounts
	 */
	public List<BankAccount> getAccounts() {
		if(this.getAccounts() == null){
			this.accounts = new ArrayList<BankAccount>();
		}
		return accounts;
	}
	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}
	
	public void deposit(BankAccount to, float amount){
		to.deposit(amount);
	}
	public void withdraw(BankAccount from, float amount) throws BusinessException{
		from.withdraw(amount);
	}
	public void transfer(BankAccount from, BankAccount to, float amount) throws BusinessException{
		from.withdraw(amount);
		to.deposit(amount);
	}
}
