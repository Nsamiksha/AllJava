package com.bridgeit.datastructure;

import com.bridgeit.linkedlist_methods.stackMethods;

import Utility.util;


public class AnagramStack {
	
	public static void main(String[] args) {
		
		stackMethods<Integer> anagramStack = new stackMethods<Integer>();	
		int[] prime = util.primenumbers();
		
		int[] ana = util.anagram(prime);
		
    for(int i = 0;i<ana.length;i++) {
			
	anagramStack.push1(ana[i]);
					}
		
	System.out.println("Anagrams in stack:");	
	
   anagramStack.showAnagramStack();
   
   System.out.println("\n");
		
   stackMethods<Integer> reverseAnagramStack = new stackMethods<Integer>();	
   for(int i = 0;i<ana.length;i++) {
   int reverse = anagramStack.pop();
   reverseAnagramStack.push1(reverse);
		
	}
	System.out.println("Reverse Anagrams in stack:");	
	reverseAnagramStack.showAnagramStack();
	}
	
}
