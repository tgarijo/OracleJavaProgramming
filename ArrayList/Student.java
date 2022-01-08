package ArrayList;

import java.util.ArrayList;

import java.util.Collections;

public class Student {
	public static void main(String[] args) {
		ArrayList<String> studentNames = new ArrayList<String>();
		
		addStudents(studentNames);
		displayStudents(studentNames);
		Collections.sort(studentNames);
		displayStudents(studentNames);
	}

	static void displayStudents(ArrayList<String> studentNames) {
		for (String student : studentNames) {
			System.out.println(student);
		}
		System.out.print("\n");
	}

	static void addStudents(ArrayList<String> studentNames) {
		studentNames.add("Mark");
		studentNames.add("Andrew");
		studentNames.add("Beth");		
		studentNames.add("Andrew");
	}
	
	
}
