 package com.bridgeit.functional;


import Utility.util;

import java.lang.Math;


public class CoinFlip{
	public static void main(String[] args) {
	 System.out.println("Enter no of coins to be tossed");
	while(true){
	    
		int s = util.printint();
	if(s>0){
double a = Math.random();
		if ( a > 0.5){
		System.out.println("Heads");
		}
		else{
		System.out.println("Tails");
		}
		 System.out.println("%head vs %tail  = " + a*100+ "  &  " + (1-a)*100);
				 
	break;
	}
	else{
	System.out.println("please enter positive number");
	}
	}
	}
	}
	 
