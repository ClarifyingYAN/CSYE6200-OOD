package edu.neu.csye6200;

/**
 * Concrete class API
 * @author Cheng Yan
 *
 */
public class AnimalAPI {

	public void speak() {
		System.out.println("I'm an animal!");
	}
	
	@Override
	public String toString() {
		
		return "I'm " + getClass().getSimpleName();
	}
	
	public String toString(String str) {
		System.out.println();
		return "I'm a cat, derived from " + str;
		
	}
	
}
