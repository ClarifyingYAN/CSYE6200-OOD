package edu.neu.csye6200;

public class Person extends AbstractPersonAPI {
	
	private int Id;
	
	private String firstName;
	
	private String lastName;
	
	private int age;

	public Person(int id, String firstName, String lastName, int age) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public int getId() {
		return Id;
	}

	@Override
	public void setId(int id) {
		this.Id = id;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age;
	}

	@Override
	public void show() {
		System.out.println(this.toString());
	}
	
	public static int compareByFirstName(AbstractPersonAPI o1, AbstractPersonAPI o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
	
	public static int compareByLastName(AbstractPersonAPI o1, AbstractPersonAPI o2) {
		return o1.getLastName().compareTo(o2.getLastName());
	}
	
	public static int compareByAge(AbstractPersonAPI o1, AbstractPersonAPI o2) {
		return o1.getAge()-o2.getAge();
	}
	
	public static int compareById(AbstractPersonAPI o1, AbstractPersonAPI o2) {
		return o1.getId()-o2.getId();
	}

}
