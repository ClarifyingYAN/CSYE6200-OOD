package edu.neu.csye6200;

public class Item {
	private int ID;
	private String name;
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getID() {
		return ID;
	}
	public void setId(int ID) {
		this.ID = ID;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + ID + ", name=" + name + ", price=" + price + "]";
	}
	
	public String toCSVString() {
		return ID + "," + name + "," + price;
	}
	
	public static int CompareByID(Item o1, Item o2) {
		return o1.getID()-o2.getID();
	}
	
	public static int CompareByName(Item o1, Item o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
	public static int CompareByPrice(Item o1, Item o2) {
		return Double.compare(o1.getPrice(), o2.getPrice());
	}
}
