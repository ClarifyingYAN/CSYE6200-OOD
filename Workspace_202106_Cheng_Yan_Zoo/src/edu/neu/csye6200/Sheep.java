package edu.neu.csye6200;

public class Sheep implements AnimalisticAPI {
	String description = "I'm a sheep.";

	@Override
	public void speak() {
		System.out.println(description);
	}
	
	@Override
	public String toString() {
		return description;
	}

	@Override
	public String toString(String str) {
		return description + str;
	}

}
