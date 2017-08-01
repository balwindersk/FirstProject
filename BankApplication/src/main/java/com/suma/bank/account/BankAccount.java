/**
 * 
 */
package com.suma.bank.account;

/**
 * @author SUMA
 *
 */
public abstract class BankAccount implements Account {

	private long accountNumber;
	private double amount;
	private String owner;
	/**
	 * @return the accountNumber
	 */
	public long getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 * @param accountNumber
	 * @param amount
	 * @param owner
	 */
	public BankAccount(long accountNumber, double amount, String owner) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.owner = owner;
	}
	@Override
	public void deposit(float amount) {
		if(amount > 0){
			this.amount = this.amount + amount;
		}
	}
	@Override
	public void transfer(Account to, float amount) {
		BankAccount account = (BankAccount)to;
		if(amount > 0 ){
			account.setAmount(account.getAmount() + amount);
		}
	}
}
