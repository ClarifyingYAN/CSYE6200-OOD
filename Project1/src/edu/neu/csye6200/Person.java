package edu.neu.csye6200;

public class Person {
	public int ID;
	public int age;
	public String firstName;
	public String lastName;
	public String parentFirstName;
	public String parentLastName;
	
	public Person(int iD, int age, String firstName, String lastName, String parentFirstName, String parentLastName) {
		super();
		ID = iD;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.parentFirstName = parentFirstName;
		this.parentLastName = parentLastName;
	}
	
	public Person() {
		
	}

	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
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
	public String getParentFirstName() {
		return parentFirstName;
	}
	
	public void setParentFirstName(String parentFirstName) {
		this.parentFirstName = parentFirstName;
	}
	
	public String getParentLastName() {
		return parentLastName;
	}
	
	public void setParentLastName(String parentLastName) {
		this.parentLastName = parentLastName;
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
	
	public static int compareByFirstName(Person o1, Person o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

	@Override
	public String toString() {
		return "ID=" + ID + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", parentFirstName=" + parentFirstName + ", parentLastName=" + parentLastName;
	}
	
	
}
