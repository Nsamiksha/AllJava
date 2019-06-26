package com.bridgeit.designpattern.singleton;

public class demo {

	public static void main(String args[]) {
		
	Singleton obj1 = new Singleton();
	Singleton obj2 = new Singleton();
	Singleton obj3 = Singleton.getInstance();
	Singleton obj4 = Singleton.getInstance();
	
//	obj.write();
	System.out.println("non - singleton ");
	System.out.println(obj1.hashCode());
	System.out.println(obj2.hashCode());
	System.out.println();
	System.out.println("SIngleton");
	System.out.println(obj3.hashCode());
	System.out.println(obj4.hashCode());
}
}