package filereading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class FileHandling {

	static final String dir = ".\\filereading\\" ;
	
	public static void main(String[] args) {
		ArrayList<String> employees = new ArrayList<String>();
		readFile(employees);
		displayEmployees(employees);
		writeFile(employees);
	}
	
	static void displayEmployees(ArrayList<String> employees) {
		for(String employee: employees)
			System.out.println(employee);
	}
	
	static void readFile(ArrayList<String> employees) {
		String line="";
		Path path = Paths.get(dir + "employees.txt");
		
		try {
			BufferedReader  fileInput = 
					Files.newBufferedReader(path,Charset.forName("ISO-8859-1"));
			line = fileInput.readLine();
			while ( line != null ) {
				employees.add(line);
				line = fileInput.readLine();
			}
			fileInput.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void writeFile(ArrayList<String> employees) {
		Path path = Paths.get(dir + "userNames.txt");
		
		try {
			BufferedWriter bw = Files.newBufferedWriter(path,
					Charset.forName("ISO-8859-1"),
					StandardOpenOption.CREATE, StandardOpenOption.WRITE);
			for(String employee: employees) {
				bw.write(employee);
				bw.newLine();
			}
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
