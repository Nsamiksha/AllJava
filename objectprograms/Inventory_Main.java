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

public class Inventory_Main {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
	
		ObjectMapper mapper = new ObjectMapper();
		ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
		List<Inventory_Elements> inventories = new ArrayList<>();
		System.out.println("enter the no of inventory");
		int totalInventories = util.printint();
		int count = 1;
		while (count <= totalInventories) {
			System.out.println("enter the name");
			String name = util.printstring();
			System.out.println("enter the weight");
			int weight = util.printint();
			System.out.println("enter the price");
			double price = util.printdouble();
			System.out.println();
			Inventory_Elements inventory = new Inventory_Elements();
			inventory.setName(name);
			inventory.setWeight(weight);
			inventory.setPrice(price);
			
			
			inventories.add(inventory);

			count++;
		}
		writer.writeValue(
				new File("/home/user/inventory123.json/"),
				inventories);

		Inventory_List portfolio = new Inventory_List();
		
		portfolio.setInventories(inventories);
		
		
		
		for (Inventory_Elements list : portfolio.getInventories()) {
			System.out.println("NAME : " + list.getName());
			System.out.println("WEIGHT : " + list.getWeight());
			System.out.println("PRICE : " + list.getPrice()+ "/kg");
			System.out.println("TOTAL PRICE: " + list.getPrice()*list.getWeight());
			System.out.println("\n");
		}
		System.out.println("\n Total Inventory Value = " + portfolio.getTotalInventoryValue());	
		
	}
}
