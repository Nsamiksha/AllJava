package com.bridgeit.objectprograms;

public class Inventory_Elements {

	
	private String name;
	private int weight;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Inventory_Elements [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}
	
}
