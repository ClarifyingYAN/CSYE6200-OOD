package edu.neu.csye6200;

public class Rabbit extends AnimalAPI {
	String description = "I'm a rabbit.";

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
