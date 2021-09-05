package com.bridgelabz.stockaccountmanagement;
import java.util.*;
public class StockPortFolio {

	private ArrayList<Stock> stocks;
	
	public ArrayList<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(ArrayList<Stock> stocks) {
		this.stocks = stocks;
	}

	public  StockPortFolio(int noOfStocks) {
		this.stocks = new ArrayList<Stock>(noOfStocks);
	}
	
	public void addStock(Stock stock) {
		stocks.add(stock);
	}
 
}
