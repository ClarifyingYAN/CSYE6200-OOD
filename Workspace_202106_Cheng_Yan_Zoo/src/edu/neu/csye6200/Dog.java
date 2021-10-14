package edu.neu.csye6200;

public class Dog extends AnimalAPI {
	
	String description = "I'm a dog.";

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
