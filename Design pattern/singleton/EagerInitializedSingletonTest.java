package com.bridgeit.designpattern.singleton;

public class EagerInitializedSingletonTest {

	public static void main(String[] args) {
		//EagerInitializedSingleton obj =new EagerInitializedSingleton();
		
		EagerInitializedSingleton Object =  EagerInitializedSingleton.getInstance();
		Object.print();
	}

}
