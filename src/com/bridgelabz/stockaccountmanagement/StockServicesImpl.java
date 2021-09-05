package com.bridgelabz.stockaccountmanagement;

import java.util.ArrayList;

public class StockServicesImpl implements StockServicesIF {
	public void calulateValueOfEachStock(ArrayList<Stock> stocks) {
		
		double totalValueOfStock=0;
		double valueOfEachStock=0;
		for(Stock stock:stocks) {
			valueOfEachStock=stock.getNumberOfShares()*stock.getSharePrice();
			System.out.println("Stock name :"+stock.getName()+" Value :"+valueOfEachStock);
			totalValueOfStock+=valueOfEachStock;
		}
		System.out.println("Total value of Stock "+totalValueOfStock);
	}
}
