package edu.neu.csye6200;

public class Driver {
	public static void main(String[] args) {
		Student.demo();
		Teacher.demo();
	}
	/**
	 * Console output:
	 
	    There are 4 students:
		Student [ID=1, age=20, firstName=John, lastName=James, parentFirstName=Mary, parentLastName=James studentID=1000001, GPA=3.8]
		Student [ID=2, age=23, firstName=Mike, lastName=Rivers, parentFirstName=John, parentLastName=Rivers studentID=1000432, GPA=3.7]
		Student [ID=3, age=21, firstName=Bill, lastName=Smith, parentFirstName=Charlie, parentLastName=Smith studentID=1000322, GPA=3.9]
		Student [ID=4, age=25, firstName=Tim, lastName=Jones, parentFirstName=Brown, parentLastName=Jones studentID=1000233, GPA=3.3]
		Sort by ID
		Student [ID=1, age=20, firstName=John, lastName=James, parentFirstName=Mary, parentLastName=James studentID=1000001, GPA=3.8]
		Student [ID=2, age=23, firstName=Mike, lastName=Rivers, parentFirstName=John, parentLastName=Rivers studentID=1000432, GPA=3.7]
		Student [ID=3, age=21, firstName=Bill, lastName=Smith, parentFirstName=Charlie, parentLastName=Smith studentID=1000322, GPA=3.9]
		Student [ID=4, age=25, firstName=Tim, lastName=Jones, parentFirstName=Brown, parentLastName=Jones studentID=1000233, GPA=3.3]
		Sort by student ID
		Student [ID=1, age=20, firstName=John, lastName=James, parentFirstName=Mary, parentLastName=James studentID=1000001, GPA=3.8]
		Student [ID=4, age=25, firstName=Tim, lastName=Jones, parentFirstName=Brown, parentLastName=Jones studentID=1000233, GPA=3.3]
		Student [ID=3, age=21, firstName=Bill, lastName=Smith, parentFirstName=Charlie, parentLastName=Smith studentID=1000322, GPA=3.9]
		Student [ID=2, age=23, firstName=Mike, lastName=Rivers, parentFirstName=John, parentLastName=Rivers studentID=1000432, GPA=3.7]
		Sort by last name
		Student [ID=1, age=20, firstName=John, lastName=James, parentFirstName=Mary, parentLastName=James studentID=1000001, GPA=3.8]
		Student [ID=4, age=25, firstName=Tim, lastName=Jones, parentFirstName=Brown, parentLastName=Jones studentID=1000233, GPA=3.3]
		Student [ID=2, age=23, firstName=Mike, lastName=Rivers, parentFirstName=John, parentLastName=Rivers studentID=1000432, GPA=3.7]
		Student [ID=3, age=21, firstName=Bill, lastName=Smith, parentFirstName=Charlie, parentLastName=Smith studentID=1000322, GPA=3.9]
		Sort by first name
		Student [ID=3, age=21, firstName=Bill, lastName=Smith, parentFirstName=Charlie, parentLastName=Smith studentID=1000322, GPA=3.9]
		Student [ID=1, age=20, firstName=John, lastName=James, parentFirstName=Mary, parentLastName=James studentID=1000001, GPA=3.8]
		Student [ID=2, age=23, firstName=Mike, lastName=Rivers, parentFirstName=John, parentLastName=Rivers studentID=1000432, GPA=3.7]
		Student [ID=4, age=25, firstName=Tim, lastName=Jones, parentFirstName=Brown, parentLastName=Jones studentID=1000233, GPA=3.3]
		Sort by GPA
		Student [ID=4, age=25, firstName=Tim, lastName=Jones, parentFirstName=Brown, parentLastName=Jones studentID=1000233, GPA=3.3]
		Student [ID=2, age=23, firstName=Mike, lastName=Rivers, parentFirstName=John, parentLastName=Rivers studentID=1000432, GPA=3.7]
		Student [ID=1, age=20, firstName=John, lastName=James, parentFirstName=Mary, parentLastName=James studentID=1000001, GPA=3.8]
		Student [ID=3, age=21, firstName=Bill, lastName=Smith, parentFirstName=Charlie, parentLastName=Smith studentID=1000322, GPA=3.9]
		
		There is 1 teacher:
		Teacher [ID=1, age=45, firstName=Brown, lastName=Lucy, parentFirstName=Smith, parentLastName=Lucy hourlyWage=40.0]
		
	 * 
	 */
}
