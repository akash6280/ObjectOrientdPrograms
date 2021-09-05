package com.bridgelabz.inventorymanagementsystem;

public class InventoryManager {
	
	public static void main(String[] args) {

	InventoryFactory rice=new InventoryFactory("Basmati", 10.2, 12.3);
	InventoryFactory wheat=new InventoryFactory("Duruum", 11.2, 32.3);
	InventoryFactory pulse=new InventoryFactory("Baked beans", 92.3, 21.3);
	
	System.out.println(new InventoryPriceCalculatorImpl().calculateInventoryValue(rice, wheat, pulse));
}

}