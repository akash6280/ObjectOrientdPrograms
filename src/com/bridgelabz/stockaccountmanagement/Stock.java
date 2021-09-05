package com.bridgelabz.stockaccountmanagement;

public class Stock {
	private String stockName;
	private int numberOfShares;
	private double sharePrice;

	public Stock(String name, int numberOfShares, double sharePrice) {
		this.stockName = name;
		this.numberOfShares = numberOfShares;
		this.sharePrice = sharePrice;
	}

	public String getName() {
		return stockName;
	}

	public void setName(String name) {
		this.stockName = name;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
}