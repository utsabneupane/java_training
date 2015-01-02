package com.lftechnology.java_training.dec31;

/**
 * a program to test class SavingsAccount. Instantiate two savingsAccount
 * objects, saver1 and saver2, with balances of $2000.00 and $3000.00,
 * respectively. Set annualInterestRate to 4%, then calculate the monthly
 * interest and print the new balances for both savers. Then set the
 * annualInterestRate to 5%, calculate the next month's interest and print the
 * new balances for both savers.
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
public class SavingAccountManipulate {

	public static void main(String[] args) {
		SavingAccount saver1 = new SavingAccount();
		SavingAccount saver2 = new SavingAccount();
		SavingAccount.setannualInterestRate(4);
		saver1.setSavingBalance(2000);
		saver2.setSavingBalance(3000);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		saver1.displayValue();
		saver2.displayValue();
		System.out.println("After changing to new Interest rate: ");
		SavingAccount.modifyInterestRate(5);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		saver1.displayValue();
		saver2.displayValue();
	}

}

/**
 * a class SavingsAccount. It use a static variable annualInterestRate to store
 * the annual interest rate for all account holders. Each object of the class
 * contains a private instance variable savingsBalance indicating the amount the
 * saver currently has on deposit. Provide method calculateMonthlyInterest to
 * calculate the monthly interest by multiplying the savingsBalance by
 * annualInterestRate divided by 12. This interest should be added to
 * savingsBalance. Provide a static method modifyInterestRate that sets the
 * annualInterestRate to a new value.
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
class SavingAccount {
	private static float annualInterestRate = 0;
	private float savingBalance = 0;

	/**
	 * set value to savingBalance from user inputted balance
	 * 
	 * @param savingBalance
	 */
	protected void setSavingBalance(float savingBalance) {
		this.savingBalance = savingBalance;
	}

	/**
	 * 
	 * @return Saving Balance
	 */
	protected float getSavingBalance() {
		return this.savingBalance;
	}

	/**
	 * set value to annual Interest from user inputted interest
	 * 
	 * @param interestRate
	 */
	protected static void setannualInterestRate(float interestRate) {
		annualInterestRate = interestRate;
	}

	/**
	 * display current balance with interest rate
	 */
	protected void displayValue() {
		System.out.println("your Current Balance is: $" + this.savingBalance
				+ " with interest rate " + annualInterestRate + "%");
	}

	/**
	 * calculate monthly interest rate and store to Saving balance
	 */
	protected void calculateMonthlyInterest() {
		this.savingBalance += (this.savingBalance * (annualInterestRate / 100) / 12);
	}

	/**
	 * modify interest rate to new value
	 * 
	 * @param newInterestRate
	 */
	protected static void modifyInterestRate(float newInterestRate) {
		annualInterestRate = newInterestRate;
	}

}
