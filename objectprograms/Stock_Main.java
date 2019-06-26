package com.bridgeit.objectprograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.impl.DefaultPrettyPrinter;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import Utility.util;

public class Stock_Main {

	public static ObjectMapper mapper = new ObjectMapper();



	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

		List<Stock_Elements> stocks = new ArrayList<>();

System.out.println("enter the total no of stocks");
int totalStock = util.printint();
int count = 0;
while(count<totalStock) {
System.out.println("enter the name of company");
String shareName = util.printstring();
System.out.println("enter the total shares of company");
int totalShare = util.printint();
System.out.println("enter the value of each share");
int priceOfEach = util.printint();

System.out.println("\n");

Stock_Elements stock = new Stock_Elements();
stock.setStockname(shareName);
stock.setNumberOfShare(totalShare);
stock.setEachSharePrice(priceOfEach);
stock.setToatlStockCount(priceOfEach * totalShare);
stocks.add(stock);
 
count++;


}

writer.writeValue(
		new File("/home/user/stock123.json/"),
		stocks);



Stock_List list = new Stock_List();
list.setStocks(stocks);

for (Stock_Elements list1 : list.getStocks()) {
	System.out.println("COMPANY NAME: " + list1.getStockname());
	System.out.println("TOTAL SHARES OF COMPANY: " + list1.getNumberOfShare());
	System.out.println("PRICE OF EACH SHARE: " + list1.getEachSharePrice());
	System.out.println("TOTAL PRICE OF " + list1.getStockname() + " is : "
	+ list1.getNumberOfShare()*list1.getEachSharePrice() );
	System.out.println("\n");
}
System.out.println("TOTAL VALUE OF STOCK: " + list.getTotalStockValue());
	}

}
