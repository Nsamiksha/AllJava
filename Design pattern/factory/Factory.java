package com.bridgeit.designpattern.factory;

public class Factory  {

	getcal object;
	
	public getcal implement(String type) {
		if(type.toLowerCase().equals("add"))
		{
			object = new add();
		}else if(type.toLowerCase().equals("subtract"))
		{
			object = new Sub();
		}else if(type.toLowerCase().equals("multiple"))
		{
			object = new Multiple();
		}else {
			System.out.println("invalid");
		}
		return object;
	}
}
