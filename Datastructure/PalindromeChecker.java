package com.bridgeit.datastructure;

import com.bridgeit.linkedlist_methods.Dequeue_Methods;

import Utility.util;

public class PalindromeChecker {
  
	
	public static void main(String[] args) {
		
		
		
	Dequeue_Methods<String> palin = new Dequeue_Methods<String>();
	//Dequeue_Methods<String> palin2 = new Dequeue_Methods<String>();
	char c = 0 ;
	char d = 0 ;
	String check = ""; 
	System.out.println("Enter a string to check whether it is palindrome ?");
	
	
	String word = util.printstringline().trim();
	System.out.println(word);
	for(int i = 0; i<word.length();i++) {
		 c = word.charAt(i);
		palin.insertElementsatRearEnd(c);
		
	}
//palin.show();
//System.out.println("\n");
	for(int i = 0; i<word.length();i++) {
		 d = palin.removeFromEnd();
		 check = check + d ;
	}
	
//	System.out.println(check);
	
	if(word.equals(check)) {
		System.out.println(word + " is palindrome");
	}
	else {
		System.out.println(word + " is not a palindrome");
	}
		
}
}
