package com.bridgelabz;

import java.util.ArrayList;

import java.util.Scanner;

public class StockAccountPortfolio {

	double totalValueOfStokes;
	int noOfStocks;
	Scanner sc = new Scanner(System.in);
	ArrayList<Stock> list = new ArrayList<Stock>();

	public void StockAccountPortfolio() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of stokes: --: ");
		noOfStocks = sc.nextInt();

		for (int i = 0; i < noOfStocks; i++) {
			Stock stock = new Stock();
			System.out.println("Enter Stock Name :- ");
			stock.setStockName(sc.next());
			System.out.println("Enter Number Of Shares :- ");
			stock.setSharePrice(sc.nextInt());
			System.out.println("Enter each Share rate :- ");
			stock.setSharePrice(sc.nextDouble());
			list.add(stock);
			double stockValue = stock.getNoOfShares() * stock.getSharePrice();
			totalValueOfStokes = totalValueOfStokes + stockValue;
			sc.close();

		}

	}

	void display() {
		for (Stock stock : list) {
			System.out.println(stock);
		}
	}

}
