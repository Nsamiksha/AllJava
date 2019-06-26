package com.bridgeit.objectprograms;

import java.util.List;

public class Inventory_List {

	
	
	private List<Inventory_Elements> inventories;

	public double getTotalInventory() {
		long totalInventory = 0;
		for (int i = 0; i < inventories.size(); i++) {
			totalInventory += inventories.get(i).getWeight();
		}
		return totalInventory;
	}

	public double getTotalInventoryValue() {
		long totalInventoryValue = 0;
		for (int i = 0; i < inventories.size(); i++) {
			totalInventoryValue += inventories.get(i).getPrice() * inventories.get(i).getWeight();
		}
		return totalInventoryValue;
	}

	public List<Inventory_Elements> getInventories() {
		return inventories;
	}

	public void setInventories(List<Inventory_Elements> inventories) {
		this.inventories = inventories;
	}

	
}
