package edu.neu.csye6200;

import java.util.*;

/**
 * demo abstract class API
 * @author Cheng Yan
 *
 */
public class ZooAbstractAnimals implements Runnable{
	
	List<AbstractAnimalAPI> list = new ArrayList<>();

	@Override
	public void run() {
		System.out.println("This is from " + getClass().getSimpleName());
		for (AbstractAnimalAPI abstractAnimalAPI : list) {
			System.out.println(abstractAnimalAPI.toString(" From Overloaded toString method."));
		}
		System.out.println();
	}
	
	public void add(AbstractAnimalAPI animal) {
		this.list.add(animal);
	}
	
	public String toString() {
		return null;
	}
	
	public static void demo() {
		ZooAbstractAnimals zooAbstractAnimals = new ZooAbstractAnimals();
		zooAbstractAnimals.add(new Lion());
		zooAbstractAnimals.add(new Tiger());
		zooAbstractAnimals.add(new Jaguar());
		
		zooAbstractAnimals.run();
	}
	
}
