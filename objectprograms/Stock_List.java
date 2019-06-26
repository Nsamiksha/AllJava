package com.bridgeit.objectprograms;

import java.util.List;

public class Stock_List {

	
	private List<Stock_Elements> stocks;
	
	
//	public double getTotalStocks() {
//		long totalStocks = 0;
//		for (int i = 0; i < stocks.size(); i++) {
//			totalStocks += stocks.get(i).getWeight();
//		}
//		return totalStocks;
//	}

	public double getTotalStockValue() {
		long totalStockValue = 0;
		for (int i = 0; i < stocks.size(); i++) {
		long valueOfEachComapanyShare = stocks.get(i).getEachSharePrice() * 
				stocks.get(i).getNumberOfShare();
		totalStockValue += valueOfEachComapanyShare;
		}
		return totalStockValue;
	}

	public List<Stock_Elements> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock_Elements> stocks) {
		this.stocks = stocks;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
