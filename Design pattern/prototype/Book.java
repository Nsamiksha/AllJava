package com.bridgeit.designpattern.prototype;

public class Book {

	String name;
	int price;
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", id=" + id + "]";
	}
}
