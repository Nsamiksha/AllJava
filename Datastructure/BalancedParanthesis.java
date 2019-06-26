package com.bridgeit.datastructure;

import com.bridgeit.linkedlist_methods.stackMethods;

import Utility.util;

public class BalancedParanthesis {
	public static void main(String[] args) {
		stackMethods<Character> list2 = new stackMethods<Character>();
		System.out.println("enter the expression");
		String expression = util.printstring();
		System.out.println(expression);
		
		boolean b = list2.isBalanced(expression);
		if(b==true) {
			System.out.println("balanced");
		}
		else
			System.out.println("unbalanced");
		
		
		
		
		/*list2.push(12);
		list2.push(14);
		list2.push(127);
		list2.push(102);
		list2.show();
		System.out.println("\n");
		list2.pop();
		list2.show();
		System.out.println("\n");
		list2.peek();
		System.out.println("\n");
		list2.isEmpty();
		list2.size();*/
		
		
}
}