package com.bridgelabz;

import java.util.Scanner;

public class StockAccountMain {

	public static void main(String[] args) {

		StockAccountPortfolio stock = new StockAccountPortfolio();
		BankAccount account = new BankAccount();
		Scanner sc = new Scanner(System.in);

		boolean exit = true;
		while (exit) {
			System.out.println("Enter --->  1 to Add stock");
			System.out.println("Enter --->  2 to Display stock");
			System.out.println("Enter --->  3 to debit ammount stock");
			System.out.println("Enter --->  4 to Exit");
			int option = sc.nextInt();
			sc.close();
			switch (option) {
			case 1:
				stock.StockAccountPortfolio();
				break;
			case 2:
				stock.display();
				break;
			case 3:
				account.debitAmmount(stock.totalValueOfStokes);
				break;
			case 4:
				exit = false;
				break;
			}
			

		}
	}

}
