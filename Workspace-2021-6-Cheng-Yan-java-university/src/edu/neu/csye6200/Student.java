package edu.neu.csye6200;

public class Student extends Person implements Comparable<AbstractPersonAPI> {
	private double gPA;
	public double getGPA() {
		return gPA;
	}
	public void setGPA(double gPA) {
		this.gPA = gPA;
	}
	public Student(int id, String firstName, String lastName, int age, double gPA) {
		super(id, firstName, lastName, age);
		this.gPA = gPA;
	}
	
	@Override
	public String toString() {
		return "Student [" + super.toString() + ", gPA=" + gPA + "]";
	}
	
	public static int compareByGpa(AbstractPersonAPI o1, AbstractPersonAPI o2) {
		Student s1=null;
		Student s2=null;
		if (o1 instanceof Student) {
			s1 = (Student) o1;
		}
		if (o2 instanceof Student) {
			s2 = (Student) o2;
		}
		
		return Double.compare(s1.getGPA(), s2.getGPA());
	}
	
	@Override
	public int compareTo(AbstractPersonAPI o) {
		Student s=null;
		if (o instanceof Student) {
			s = (Student) o;
		}
		
		return Double.compare(this.getGPA(), s.getGPA());
	}

}
