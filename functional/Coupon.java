package com.bridgeit.functional;
import Utility.util;

public class Coupon {

	public static int getCoupon(int n) {
System.out.println(Math.random() * n); 
return (int) (Math.random() * n);
	    }
	public static int collect(int n) {
	        boolean[] isCollected = new boolean[n];  
	        int count = 0;                         
	        int distinct  = 0;                       
	        	while (distinct < n) {
	            int value = getCoupon(n);            
	            count++;                          
	            if (!isCollected[value]) {           
	                distinct++;
	                isCollected[value] = true;
	            }
	        }System.out.println("distinct numbers: " +distinct);
	        return count;
	        
	    }
		public static void main(String[] args) {
	        System.out.println("enter the number");
		
		int n = util.printint();
	        int count = collect(n);
	        System.out.println("total count  "+count);
	    } 
	} 


