package com.bridgeit.datastructure;

import Utility.util;

public class N_Number {
	
		public static void main(String[] args) {
			System.out.print("Ënter the number betn 1 to 10 : ");
			int nodes =util.printint();
			long noOfBinaryTree = numofBST(nodes);
			System.out.println("For the entered nodes, possible Binary Tree Search combinations are.. "+ noOfBinaryTree);

		}


		static long numofBST(int number) {
			
//			formula -- (2n)!/(n+1)!*n!
			
	       long num1 = factorial(2*number);
	       long num2 = factorial(number + 1);
	       long num3 = factorial(number);
	       
	     	return num1/(num2*num3);
		}
	


public static long factorial(int n){
	  
	int fact=1;
	for(int i=1;i<=n;i++){
	 fact = fact*i;
	}
	return fact;
  }




}
