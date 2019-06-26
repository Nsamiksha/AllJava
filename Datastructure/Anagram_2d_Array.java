package com.bridgeit.datastructure;

import Utility.util;

public class Anagram_2d_Array {

	public static void main(String[] args) {
		int first = 0;
	int[] prime = util.primenumbers();
	int[] ana = util.anagram(prime);
	
	int a = ana.length;
	
	int[][] anagramNumbers = new int[79][2]; 
	for(int i = 0 ; i < 79 ; i++) {
		for(int k = 0;k< 2 ;k++) {
			
			anagramNumbers[i][k] = ana[first];
			first++;
			
		}
		
	}
	for(int i = 0 ; i < 79 ; i++) {
		for(int k = 0;k< 2 ;k++) {
			
			System.out.print(anagramNumbers[i][k]+   " ");	
		
		}
		System.out.println("\n");	
	}
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

