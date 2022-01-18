package filereading;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReading {
	public static void main(String[] args) {
		ArrayList<String> employees = new ArrayList<String>();
		readFile(employees);
		displayEmployees(employees);
		
		
	}
	static void displayEmployees(ArrayList<String> employees) {
		for(String employee: employees)
			System.out.println(employee);
	}
	
	static void readFile(ArrayList<String> employees) {
		String line = "";
		BufferedReader fileInput = null;
		
		try {
			fileInput = new BufferedReader(new FileReader(
						new File(".\\filereading\\employees.txt")));
			
			line = fileInput.readLine();
			
			while(line != null ) {
				employees.add(line);	
				line = fileInput.readLine();
			}
			fileInput.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			
		} catch (EOFException e) {
			System.out.println("No mopre lines to read");
			
		} catch (IOException e) {
			System.out.println("Error reading file");
		}
	}
}
