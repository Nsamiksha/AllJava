package com.bridgeit.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

	String name;

	static List<Book> booklist = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static List<Book> getBooklist() {
		return booklist;
	}

	public void setBooklist(List<Book> booklist) {
		this.booklist = booklist;
	}
	
	public void insert() {
	for(int i =0 ;i<5; i++) {
		Book b = new Book();
		b.setName("java"+ i);
		b.setPrice(i*i);
		b.setId(i);	
		getBooklist().add(b);
	}
	}

	@Override
	public String toString() {
		return "BookShop [name=" + name + ", booklist=" + booklist + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
	

}
