package edu.neu.csye6200;

public class Person {
	
	public Person(int age, String firstName, String lastName, char mi) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mi = mi;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getMi() {
		return mi;
	}
	public void setMi(char mi) {
		this.mi = mi;
	}
	
	public int age = 0;
	public String firstName = "";
	public String lastName = "";
	public char mi = 'C';
}
