package edu.neu.csye6200;

public class NortheasternU extends UniversityBase {
	public static void demo() {
		NortheasternU neu = new NortheasternU();
		// add three student
		neu.addStudent(new Student(203, "John", "James", 23, 3.8));
		neu.addStudent(new Student(208, "Bob", "Boris", 28, 3.4));
		neu.addStudent(new Student(123, "Adam", "Mike", 21, 3.9));
		// add three employee
		neu.addEmployee(new Employee(102, "Tim", "Ali", 45, 100));
		neu.addEmployee(new Employee(322, "Carl", "Jobs", 32, 90));
		neu.addEmployee(new Employee(232, "Stephen", "Tom", 50, 120));
		
		// natural order
		System.out.println("sort employees Natural by wage");
		System.out.println("sort students Natural by gpa");
		neu.sortStudents(null);
		neu.sortEmployees(null);
		neu.show();
		
		// id
		System.out.println("Sort by ID");
		neu.sortStudents(Person::compareById);
		neu.sortEmployees(Person::compareById);
		neu.show();
		
		// first name
		System.out.println("Sort by first name");
		neu.sortStudents(Person::compareByFirstName);
		neu.sortEmployees(Person::compareByFirstName);
		neu.show();
		
		// last name
		System.out.println("Sort by last name");
		neu.sortEmployees(Person::compareByLastName);
		neu.sortStudents(Person::compareByLastName);
		neu.show();
		
		// age
		System.out.println("Sort by age");
		neu.sortEmployees(Person::compareByAge);
		neu.sortStudents(Person::compareByAge);
		neu.show();
	}
}
