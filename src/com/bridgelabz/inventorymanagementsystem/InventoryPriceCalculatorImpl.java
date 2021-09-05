package com.bridgelabz.inventorymanagementsystem;

public class InventoryPriceCalculatorImpl implements InventoryPriceCalculatorIF{

	@Override
	public double calculateInventoryValue(InventoryFactory rice, InventoryFactory wheat, InventoryFactory pulse) {
		
		return rice.getPricePerKG()*rice.getWeight() + wheat.getPricePerKG()*wheat.getWeight() +pulse.getPricePerKG()*pulse.getWeight();
	}

}