package edu.neu.csye6200;

public class Teacher extends Person {
	public double hourlyWage;

	public Teacher(int iD, int age, String firstName, String lastName, String parentFirstName, String parentLastName,
			double hourlyWage) {
		super(iD, age, firstName, lastName, parentFirstName, parentLastName);
		this.hourlyWage = hourlyWage;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	@Override
	public String toString() {
		return "Teacher [" + super.toString() + " hourlyWage=" + hourlyWage + "]";
	}
	
	public static void demo() {
		System.out.println();
		Person teacher = new Teacher(1, 45, "Brown", "Lucy", "Smith", "Lucy", 40.);
		System.out.println("There is 1 teacher:");
		System.out.println(teacher);
	}
	
}
