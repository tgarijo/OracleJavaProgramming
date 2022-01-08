package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class StudenDriver {

	public static void main(String[] args) {
		ArrayList<Student> studentNames = new ArrayList<Student>();
		
		addStudents(studentNames);
		displayStudents(studentNames);
		Collections.sort(studentNames);
		displayStudents(studentNames);
	}

	static void addStudents(ArrayList<Student> studentNames) {
		studentNames.add(new Student("Mark", "Mywords", 95));
		studentNames.add(new Student("Andrew", "Apic", 45));
		studentNames.add(new Student("Beth", "Tween", 78));	
	}
	
	static void displayStudents(ArrayList<Student> studentNames) {
		for (Student student : studentNames) {
			System.out.println(student);
		}
		System.out.print("\n");
	}		
}
