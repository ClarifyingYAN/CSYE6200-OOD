package edu.neu.csye6200;

public class Student extends Person {
	private double Gpa;

	public Student(int age, int ID, String lastName, double Gpa) {
		super(age, ID, lastName);
		this.Gpa = Gpa;
	}

	public double getGpa() {
		return Gpa;
	}

	public void setGpa(double Gpa) {
		this.Gpa = Gpa;
	}

	@Override
	public String toString() {
		return String.format("%2s: %8s %3d %4.2f", ID, lastName, age, Gpa);
	}
	
	public static int compareByGpa(Student o1, Student o2) {
		return Double.compare(o1.getGpa(), o2.getGpa());
	}
	
}
