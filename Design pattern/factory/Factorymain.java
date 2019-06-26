package com.bridgeit.designpattern.factory;

import Utility.util;

public class Factorymain {

	public static void main(String[] args) {
		
		System.out.println("enter first number : ");
		double num1 = util.printdouble();
		System.out.println("enter second number : ");
		double num2 = util.printdouble();
		
		System.out.println("what do you want");
		String string = util.printstring();
		
		Factory f = new Factory() ;
		getcal object1 = f.implement(string);
	
		object1.calculate(num1,num2);
	}
}