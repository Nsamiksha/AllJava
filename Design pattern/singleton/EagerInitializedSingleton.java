package com.bridgeit.designpattern.singleton;

public class EagerInitializedSingleton {
	
	
	
	
	
	
	
	 private static final EagerInitializedSingleton instance = 
			 new EagerInitializedSingleton();
	    
	
	  private EagerInitializedSingleton(){}

	    public static EagerInitializedSingleton getInstance(){
	        return instance;
	    }
	
	void print() {
		System.out.println("object created");
	}
	
	
	
}
