package edu.neu.csye6200;

public class Employee extends Person implements Comparable<AbstractPersonAPI> {
	private double wage;
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public Employee(int id, String firstName, String lastName, int age, double wage) {
		super(id, firstName, lastName, age);
		this.wage = wage;
	}
	
	@Override
	public String toString() {
		return "Employee [" + super.toString() + ", wage=" + wage + "]";
	}
	
	public static int compareByWage(AbstractPersonAPI o1, AbstractPersonAPI o2) {
		Employee e1=null;
		Employee e2=null;
		if (o1 instanceof Employee) {
			e1 = (Employee) o1;
		}
		if (o2 instanceof Employee) {
			e2 = (Employee) o2;
		}
		
		return Double.compare(e1.getWage(), e2.getWage());
	}
	
	@Override
	public int compareTo(AbstractPersonAPI o) {
		Employee e=null;
		if (o instanceof Employee) {
			e = (Employee) o;
		}
		
		return Double.compare(this.getWage(), e.getWage());
	}

}
