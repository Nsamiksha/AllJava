package com.bridgeit.objectprograms;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.impl.DefaultPrettyPrinter;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import Utility.util;

public class User_Main {
	
	
	

	public static ObjectMapper mapper = new ObjectMapper();



	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

	String	string = "";
		
		ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

		List<Commercial_User_Elements> user = new ArrayList<>();

		System.out.println("enter the total no of User");
		int totalUser = util.printint();
		int count = 0;
		while(count<totalUser) {
		System.out.println("enter the email id");
		String emailID = util.printstring();
		System.out.println("enter the user name");
		String userName = util.printstring();
		System.out.println("enter the phone number");
		long phoneNUMBER = util.printlong();
		
		Date current=new Date();
		SimpleDateFormat simple=new SimpleDateFormat("dd/MM/yyyy");
		String date=simple.format(current);
		
		Commercial_User_Elements user1 = new Commercial_User_Elements();
		user1.setEmailID(emailID);
		user1.setUserName(userName);
		user1.setPhoneNO(phoneNUMBER);
		user1.setDate(date);
		user.add(user1);
		count++;
		System.out.println("\n");	
	

}
		writer.writeValue(
				new File("/home/user/user123.json/"),
				user);
	}
}



