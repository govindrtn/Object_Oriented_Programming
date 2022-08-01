package com.bridgelabz;

import java.util.Scanner;

public class BankAccount {

	public void debitAmmount(Double accountBalance) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ammount debit from account");
		int debit = sc.nextInt();
		sc.close();

		if (debit > accountBalance) {
			System.out.println("Account balance is  " + accountBalance);
		} else {
			accountBalance = accountBalance - debit;
			System.out.println("Remaning Account balance is " + accountBalance);
		}
	}
}