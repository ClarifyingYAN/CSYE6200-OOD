package edu.neu.csye6200;

import java.util.*;

public class FoodItem extends Item {
	
	public FoodItem(String csvStringLine) {
		super();
		Scanner in = new Scanner(csvStringLine);
		in.useDelimiter(",");

		int ID=-1;
		try {
			ID = in.nextInt();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String name = in.next();
		double price=0.;
		try {
			price = in.nextDouble();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		setId(ID);
		setName(name);
		setPrice(price);
		
		in.close();
	}

	// TO DO toString
	@Override
	public String toString() {
		return "FoodItem [id=" + getID() + ", name=" + getName() + ", price=" + getPrice() + "]";
	}
	
	
}
