package com.bridgelabz.inventorymanagementsystem;

public class InventoryFactory {
	private String name;
	private Double weight;
	private Double pricePerKG;
	
	public InventoryFactory(String name, Double weight, Double pricePerKG) {
		this.name = name;
		this.weight = weight;
		this.pricePerKG = pricePerKG;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getPricePerKG() {
		return pricePerKG;
	}
	public void setPricePerKG(Double pricePerKG) {
		this.pricePerKG = pricePerKG;
	}
}
