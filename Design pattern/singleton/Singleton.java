package com.bridgeit.designpattern.singleton;

public class Singleton {

	private static Singleton single = new Singleton();
	
	public static  Singleton getInstance() {
		return single;
	}
	
	public void write() {
		System.out.println("hello");
	}
}
