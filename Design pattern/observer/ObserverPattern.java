package com.bridgeit.designpattern.observer;

import Utility.util;

public class ObserverPattern {

	 public static void main(String[] args) {
	      Subject subject = new Subject();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("enter First state change: ");	
	      int num1=util.printint();
	      subject.setState(num1);
	      System.out.println("Second state change:");
	      int num2=util.printint();
	      subject.setState(num2);
	   }
	
	
}
