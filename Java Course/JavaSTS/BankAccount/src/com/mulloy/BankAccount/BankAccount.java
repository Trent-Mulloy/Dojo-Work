package com.mulloy.BankAccount;

public class BankAccount {
	private Double checkingBalance = 0.0;
	private Double savingBalance = 0.0;
	private static int numberOfAccounts = 0; 
	private static Double amountOfMoney = 0.0;

	public BankAccount() {
		BankAccount.numberOfAccounts ++;
		
	}

	
	
	
	public Double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public Double getSavingBalance() {
		return savingBalance;
	}

	public void setSavingBalance(Double savingBalance) {
		this.savingBalance = savingBalance;
	}

	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public static void setNumberOfAccounts(int numberOfAccounts) {
		BankAccount.numberOfAccounts = numberOfAccounts;
	}

	public static Double getAmountOfMoney() {
		return amountOfMoney;
	}

	public static void setAmountOfMoney(Double amountOfMoney) {
		BankAccount.amountOfMoney = amountOfMoney;
	}
	
	public void add(String account, Double amount) {
		if (account == "Checking") {
			Double x = this.getCheckingBalance();
			this.setCheckingBalance(x + amount);
			BankAccount.amountOfMoney += amount;
		}
		else if (account == "Saving") {
			Double x = this.getSavingBalance();
			this.setSavingBalance(x + amount);
			BankAccount.amountOfMoney += amount;
		}
		else {
			System.out.println("Please Select an account and amount");
		}
		
	}
	public void withdraw(String account, Double amount) {
		if (account == "Checking" && this.checkingBalance >= amount) {
			Double x = this.getCheckingBalance();
			this.setCheckingBalance(x - amount);
			BankAccount.amountOfMoney -= amount;
		}
		else if (account == "Saving" && this.savingBalance >= amount) {
			Double x = this.getSavingBalance();
			this.setSavingBalance(x - amount);
			BankAccount.amountOfMoney -= amount;
		}
		else {
			System.out.println("insufficent funds");
		}
		
	}
	
	public void checkBalance() {
		System.out.println("Checking Balance = " + this.checkingBalance + "\n" + "Saving Balance = " + this.savingBalance);
	} 
	
	

}
