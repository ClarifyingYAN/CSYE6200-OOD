package edu.neu.csye6200;

import java.util.Scanner;

public class ServiceItem extends Item {
	public ServiceItem(String csvStringLine) {
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
		return "ServiceItem [id=" + getID() + ", name=" + getName() + ", price=" + getPrice() + "]";
	}
}
