package com.bridgelabz.stockaccountmanagement;
import java.util.*;

public class StockAccountMain {
	 static Scanner scanner=new Scanner(System.in);
	 
	 public static void main(String[] args) {
		 
		System.out.println("Enter number of Stocks");
		int numberOfStocks=scanner.nextInt();
		StockPortFolio stockPortfolio = new StockPortFolio(numberOfStocks);
		
		for(int count=1;count<=numberOfStocks;count++) {
			System.out.println("Enter name, no of shares and share price for stock");
			String stockName = scanner.next();
			int noOfShares = scanner.nextInt();
			int sharePrice = scanner.nextInt();
			scanner.nextLine();
			Stock stock = new Stock(stockName,noOfShares,sharePrice);
			stockPortfolio.addStock(stock);
		}
		StockServicesIF stockservies=new StockServicesImpl();
		stockservies.calulateValueOfEachStock(stockPortfolio.getStocks());
	}
}
