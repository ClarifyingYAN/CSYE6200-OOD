package edu.neu.csye6200;

import java.util.*;

public class Student extends Person {
	private int studentID;
	private double GPA;
	
	public Student(int iD, int age, String firstName, String lastName, String parentFirstName, String parentLastName,
			int studentID, double GPA) {
		super(iD, age, firstName, lastName, parentFirstName, parentLastName);
		this.studentID = studentID;
		this.GPA = GPA;
	}
	
	/**
	 * construct a new student by a CSV string.
	 * @param CSVString
	 */
	public Student(String CSVString) {
		super();
		Scanner in = new Scanner(CSVString);
		in.useDelimiter(",");
		
		try {
			this.setID(in.nextInt());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			this.setAge(in.nextInt());
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		this.setFirstName(in.next());
		this.setLastName(in.next());
		this.setParentFirstName(in.next());
		this.setParentLastName(in.next());
		try {
			this.setStudentID(in.nextInt());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			this.setGPA(in.nextDouble());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		in.close();
	}

	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public double getGPA() {
		return GPA;
	}
	
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	
	/**
	 * parse CSV format string, and return a new student object.
	 * @param CSVString
	 * @return
	 */
	public static Student parseCSVString(String CSVString) {
		Scanner in = new Scanner(CSVString);
		in.useDelimiter(",");
		
		int id=0, age=0, studentID=0;
		double GPA=0.;
		
		try {
			id = in.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			age = in.nextInt();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		String firstName = in.next();
		String lastName = in.next();
		String parentFirstName = in.next();
		String parentLastName = in.next();
		
		try {
			studentID = in.nextInt();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		try {
			GPA = in.nextDouble();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		in.close();
		return new Student(id, age, firstName, lastName, parentFirstName, parentLastName, studentID, GPA);
	}
	
	public static int compareByStudentID(Student s1, Student s2) {
		return s1.getStudentID() - s2.getStudentID();
	}
	
	public static int compareByGPA(Student s1, Student s2) {
		return Double.compare(s1.getGPA(), s2.getGPA());
	}

	/**
	 * parse a student object to a CSV string
	 * @param student
	 * @return
	 */
	public String parseToCSVString(Student student) {
		StringBuilder sb = new StringBuilder();
		sb.append(student.getID());
		sb.append(","+student.getAge());
		sb.append(","+student.getFirstName());
		sb.append(","+student.getLastName());
		sb.append(","+student.getParentFirstName());
		sb.append(","+student.getParentLastName());
		sb.append(","+student.getStudentID());
		sb.append(","+student.getGPA());
		
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return "Student [" + super.toString() + " studentID=" + studentID + ", GPA=" + GPA + "]";
	}

	public void writeToCSV(String fileName, List<String> contentLine) {
		FileUtil.write(fileName, contentLine);
	}
	
	public static void demo() {
		String[] studentCSVString = {
				"1,20,John,James,Mary,James,001000001,3.8",
				"2,23,Mike,Rivers,John,Rivers,001000432,3.7",
				"3,21,Bill,Smith,Charlie,Smith,001000322,3.9",
				"4,25,Tim,Jones,Brown,Jones,001000233,3.3"
		};
		
		String fileName = "./students.csv";
		FileUtil.write(fileName, Arrays.asList(studentCSVString)); // write to file
		List<String> CSVStrings = FileUtil.read(fileName); // readFile;
		List<Student> students = new ArrayList<>();
		
		CSVStrings.forEach( s -> students.add(Student.parseCSVString(s)));
		
		System.out.println("There are " + students.size() + " students:");
		students.forEach(System.out::println);
		
		System.out.println("Sort by ID");
		students.sort(Student::compareByID);
		students.forEach(System.out::println);
		
		System.out.println("Sort by student ID");
		students.sort(Student::compareByStudentID);
		students.forEach(System.out::println);
		
		System.out.println("Sort by last name");
		students.sort(Student::compareByLastName);
		students.forEach(System.out::println);
		
		System.out.println("Sort by first name");
		students.sort(Student::compareByFirstName);
		students.forEach(System.out::println);
		
		System.out.println("Sort by GPA");
		students.sort(Student::compareByGPA);
		students.forEach(System.out::println);
		
	}
	
}
