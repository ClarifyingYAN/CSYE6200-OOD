package edu.neu.csye6200;

//import java.util.Comparator;
import java.util.*;

public class UniversityBase extends AbstractSchoolAPI {
	
	protected List<AbstractPersonAPI> employees = new ArrayList<>();
	protected List<AbstractPersonAPI> students = new ArrayList<>();

	@Override
	public void addEmployee(AbstractPersonAPI employee) {
		employees.add(employee);
	}

	@Override
	public void addStudent(AbstractPersonAPI student) {
		students.add(student);
	}

	@Override
	public String getEmployeesInfo() {
		StringBuilder sb = new StringBuilder();
		employees.forEach(employee -> sb.append(employee + "\n"));
		return sb.toString();
	}

	@Override
	public void showEmployees() {
		System.out.println(getEmployeesInfo());
	}

	@Override
	public String getStudentsInfo() {
		StringBuilder sb = new StringBuilder();
		students.forEach(student -> sb.append(student+ "\n"));
		return sb.toString();
	}

	@Override
	public void showStudents() {
		System.out.println(getStudentsInfo());
	}

	@Override
	public void show() {
		showEmployees();
		showStudents();
	}

	@Override
	public void sortEmployees(Comparator<AbstractPersonAPI> c) {
		 employees.sort(c);
	}

	@Override
	public void sortStudents(Comparator<AbstractPersonAPI> c) {
		students.sort(c);
	}

}
