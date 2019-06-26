package com.bridgeit.designpattern.proxy;

public class ProxyPatternClient {
	 public static void main(String[] args)   
	    {  
	        OfficeInternetAccess access = new ProxyInternetAccess("Samiksha Nannaware");  
	        access.grantInternetAccess();  
	    }  
}
