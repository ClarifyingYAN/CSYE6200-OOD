package edu.neu.csye6200;

import java.util.Comparator;

public class Person implements Comparator<Person> {
	protected int age;
	protected int ID;
	protected String lastName;
	public Person(int age, int ID, String lastName) {
		super();
		this.age = age;
		this.ID = ID;
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return String.format("%2s: %8s %3d", ID, lastName, age);
	}
	
	/**
	 * default compare
	 */
	@Override
	public int compare(Person o1, Person o2) {
		return Person.compareByID(o1, o2);
	}
	
	public static int compareByAge(Person o1, Person o2) {
		return o1.getAge()-o2.getAge();
	}
	
	public static int compareByID(Person o1, Person o2) {
		return o1.getID()-o2.getID();
	}
	
	public static int compareByLastName(Person o1, Person o2) {
		return o1.getLastName().compareTo(o2.getLastName());
	}
	
}
