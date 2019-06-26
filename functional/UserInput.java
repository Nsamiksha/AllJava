package com.bridgeit.functional;

import Utility.util;

public class UserInput {
	
	public static void main(String[] args) {
	System.out.println("Enter username");
	while(true) {
	
	String userName = util.printstring();
	String str1 = "Hello <<username>>, How are you?";
	
	if (userName.length()>3 ){
		str1 = str1.replace("<<username>>", userName);
	    System.out.println(str1);

	}
	else {
    System.out.println("enter valid username with min three character");
	
	}
	}
	}

	}




