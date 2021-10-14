package edu.neu.csye6200;

public class Tiger extends AbstractAnimalAPI {
	
	String description = "I'm a tiger.";

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
