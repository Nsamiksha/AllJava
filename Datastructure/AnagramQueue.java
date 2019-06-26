package com.bridgeit.datastructure;

import com.bridgeit.linkedlist_methods.Queue;

import Utility.util;

public class AnagramQueue {
	
	public static void main(String[] args) {
		
	
		Queue<Integer> anagram = new Queue<Integer>();
		int[] prime = util.primenumbers();
		int[] ana = util.anagram(prime);
		/*for(int i = 0;i<prime.length;i++) {
			System.out.print(prime[i] + " ");
		}*/
		
		//System.out.println("\n");
		
		for(int i = 0;i<ana.length;i++) {
			
			anagram.enQueue(ana[i]);
			
			//System.out.print(ana[i]+ " ");
		}
		anagram.show();
		
}
}