package edu.neu.csye6200;

import java.util.*;

/**
 * demo concrete class API
 * @author Cheng Yan
 *
 */
public class ZooAnimals implements Runnable {
	
	List<AnimalAPI> list = new ArrayList<>();

	@Override
	public void run() {
		System.out.println("This is from " + getClass().getSimpleName());
		for (AnimalAPI animalAPI : list) {
			System.out.println(animalAPI.toString(" From Overloaded toString method."));
		}
		System.out.println();
	}
	
	public void add(AnimalAPI animal) {
		this.list.add(animal);
	}
	
	public String toString() {
		return null;
	}
	
	public static void demo() {
		ZooAnimals zooAnimals = new ZooAnimals();
		zooAnimals.add(new Dog());
		zooAnimals.add(new Cat());
		zooAnimals.add(new Rabbit());
		
		zooAnimals.run();
	}
	
}
