package com.bridgeit.objectprograms;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import Utility.util;

public class Regular_Expression {

		public static void main(String[] args)
		{
			String path= "/home/user/javaPrograms/regular.json";
			File file = new File(path);
			
			ObjectMapper mapper=new ObjectMapper();
			try
			{
				JsonNode node = mapper.readTree(file);
				//System.out.println(""+node);
				String values="Regular Expression";
				//System.out.println(""+values);
				
				JsonNode json=node.path(values);
				
				String strng=json.asText();
				
				System.out.println(""+strng);
				
				System.out.println("Enter the name");
				
				String name= util.printstringline();
				
				if(Pattern.matches("[a-zA-Z\\s]+",name))
				{
					strng=strng.replaceAll("<<name>>", name);
				}
				System.out.println("Enter the full name");
				
				String fullname= util.printstringline();
				if(Pattern.matches("[a-zA-Z\\s]+", fullname))
				{
					
					strng=strng.replaceAll("<<full name>>", fullname);
				}
				else
				{
					System.out.println("enter valid data");
				}
				System.out.println("Enter the phone number");
				String num=util.printstring();
				if(Pattern.matches("[6789][0-9]{9}", num))
				{
					strng=strng.replaceAll("x{10}", num);
				}
				Date current=new Date();
				//System.out.println(current);
				SimpleDateFormat simple=new SimpleDateFormat("dd/MM/yyyy");
				String date=simple.format(current);
				//System.out.println(date);
				strng = strng.replaceAll("dd/MM/yyyy", date);
				System.out.println(""+strng);
				
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println(""+e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
