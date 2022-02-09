package com.mulloy.BankAccount;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		
		account1.add("Checking", 25.5);
		account2.add("Saving", 500.0);
		account1.add("Checking", 20.0);
		account1.checkBalance();
		account2.checkBalance();
		
		System.out.println(BankAccount.getNumberOfAccounts());
		System.out.println(BankAccount.getAmountOfMoney());
		account1.checkBalance();
		account1.withdraw("Checking", 12.5);
		System.out.println(BankAccount.getAmountOfMoney());
		account1.checkBalance();
		

	}

}
