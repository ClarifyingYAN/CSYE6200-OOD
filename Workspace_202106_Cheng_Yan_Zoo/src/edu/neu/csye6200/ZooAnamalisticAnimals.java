package edu.neu.csye6200;

import java.util.*;

/**
 * demo interface API
 * @author Cheng Yan
 *
 */
public class ZooAnamalisticAnimals implements Runnable {
	
	List<AnimalisticAPI> list = new ArrayList<>();

	@Override
	public void run() {
		System.out.println("This is from " + getClass().getSimpleName());
		for (AnimalisticAPI animalisticAPI : list) {
			System.out.println(animalisticAPI.toString(" From Overloaded toString method."));
		}
		System.out.println();
	}
	
	public void add(AnimalisticAPI animal) {
		this.list.add(animal);
	}
	
	@Override
	public String toString() {
		String str = this.getClass().getName();
		return str;
	}
	
	public static void demo() {
		ZooAnamalisticAnimals zooAnamalisticAnimals = new ZooAnamalisticAnimals();
		zooAnamalisticAnimals.add(new Horse());
		zooAnamalisticAnimals.add(new Cow());
		zooAnamalisticAnimals.add(new Sheep());
		
		zooAnamalisticAnimals.run();
	}
	
}
