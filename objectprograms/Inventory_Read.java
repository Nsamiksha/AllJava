package com.bridgeit.objectprograms;

import java.io.File;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class Inventory_Read {

	public static void main(String[] args) {

		
		String path="/home/user/javaPrograms/rice.json";
		File file=new File(path);
		ObjectMapper mapper=new ObjectMapper();
		try
		{
			JsonNode node=mapper.readTree(file);
			JsonNode invent=node.get("Rice");
			System.out.println("*RICE*");
			for(JsonNode json:invent)
			{
				String name=json.path("name").asText();
				int price=json.path("price").asInt();
				int weight=json.path("weight").asInt();
				System.out.println("name:"+name+"\nPrice:"+price+"\nWeight:"+weight);
				System.out.println("total: "+price*weight+" Rs"+"\n");
			}
			JsonNode inventory=node.get("Pulses");
			System.out.println("*PULSES*");
			for(JsonNode json:inventory)
			{
				String name=json.path("name").asText();
				int price=json.path("price").asInt();
				int weight=json.path("weight").asInt();
				System.out.println("name:"+name+"\nPrice:"+price+"\nWeight:"+weight);
				System.out.println("total: "+price*weight+" Rs"+"\n");
			}
			JsonNode inventories=node.get("wheat");
			System.out.println("*WHEAT*");
			for(JsonNode json:inventories)
			{
				String name=json.path("name").asText();
				int price=json.path("price").asInt();
				int weight=json.path("weight").asInt();
				System.out.println("name:"+name+"\nPrice:"+price+"\nWeight:"+weight);
				System.out.println("total: "+price*weight+" Rs"+"\n");
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}
	}

	}


