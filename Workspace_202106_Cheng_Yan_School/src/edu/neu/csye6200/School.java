package edu.neu.csye6200;

import java.util.*;

public class School {
	public List<Student>  studentRoster = null;
	public List<Person>  personRoster = null;
	{
		studentRoster = new ArrayList<Student>();
		personRoster = new ArrayList<Person>();
	}
	
	public void add(Student student) {
		studentRoster.add(student);
	}
	
	public void addPerson(Student student) {
		personRoster.add(student);
	}
	
	public void sortStudents(Comparator<Student> c) {
		studentRoster.sort(c);
	}
	
	public void sortPersons(Comparator<Person> c) {
		personRoster.sort(c);
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(studentRoster.size()).append(" objects in the studentRoster list.\n");
		sb.append(String.format("%2s: %5s %2s %4s\n", "ID", "lastName", "age", "Gpa"));
		for (Student student : studentRoster)
			sb.append(student + "\n");
		
		sb.append("\n");
		sb.append(personRoster.size()).append(" objects in the personRoster list.\n");
		sb.append(String.format("%2s: %5s %2s %4s\n", "ID", "lastName", "age", "Gpa"));
		for (Person person : personRoster)
			sb.append(person + "\n");
		
		return sb.toString();
	}
	
	public static void demo() {
		System.out.println(School.class.getSimpleName() + ".demo() START...\n");
		School school = new School();
		
		// add student to personRoster
		school.addPerson(new Student(45, 1, "Jane", 3.2f));
		school.addPerson(new Student(32, 2, "Peter", 2.8f));
		school.addPerson(new Student(65, 3, "Bob", 4.0f));
		school.addPerson(new Student(32, 4, "Tim", 2.4f));
		school.addPerson(new Student(27, 5, "Effy", 3.5f));
		
		// add student to studentRoster
		school.add(new Student(18, 1, "James", 3.8f));
		school.add(new Student(17, 2, "Tony", 3.9f));
		school.add(new Student(20, 3, "Henry", 4.0f));
		school.add(new Student(24, 4, "Mike", 3.5f));
		school.add(new Student(22, 5, "Stephen", 3.6f));
		
		// sort by age
		System.out.println("Sorted by age");
		school.sortPersons(Person::compareByAge);
		school.sortStudents(Person::compareByAge);
		System.out.println(school);
		
		// sort by ID
		System.out.println("\nPerson sorted by ID");
		school.sortPersons(Person::compareByID);
		school.sortStudents(Person::compareByID);
		System.out.println(school);
		
		// sort by LastName
		System.out.println("\nPerson sorted by LastName");
		school.sortPersons(Person::compareByLastName);
		school.sortStudents(Person::compareByLastName);
		System.out.println(school);
		
		// sort by GPA
		System.out.println("\nStudent sorted by GPA");
		school.sortPersons((o1, o2) -> Double.compare((((Student) o1).getGpa()), ((Student) o2).getGpa()));
		school.sortStudents(Student::compareByGpa);
		System.out.println(school);
		
		
		System.out.println("\n" + School.class.getSimpleName() + ".demo() DONE...");
	}
	
}
