package com.bridgeit.designpattern.mediator;

public class MediatorPattern {
	  public static void main(String[] args) {
	      User robert = new User("Veejay");
	      User john = new User("Mahesh");

	      robert.sendMessage("Hi! Veejay!");
	      john.sendMessage("Hello! Mahesh!");
	   }
	
}
