package com.bridgeit.designpattern.prototype;

public class PrototypeMain implements Cloneable {
	
	 static BookShop bs = new BookShop();
	public static void main(String[] args) throws CloneNotSupportedException {

	
		bs.setName("PrinceSoft");
		bs.insert();
	
		System.out.println(bs);
		
//		bs.getBooklist().remove(0);

		
		BookShop bs1 = (BookShop) bs.clone();
        bs1.setName("SamiSoft");
		System.out.println(bs1);

}
}