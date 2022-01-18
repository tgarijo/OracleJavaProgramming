package filereading;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {
		Path[] paths = new Path[5];
		paths[0] = Paths.get(".\\employees.txt");
		paths[1] = Paths.get("./");
		paths[2] = Paths.get("./.././employees.txt");
		paths[3] = Paths.get(".", "employees.txt");
		paths[4] = Paths.get(URI.create("file:///~/test.txt"));
		
		for( int i = 0; i<paths.length; i++) {
			System.out.println("Default File Path p[" + i + "] - " + paths[i] );
		}
		
		System.out.println(paths[0].getFileName());
		System.out.println(paths[0].getParent());
		System.out.println(paths[0].getNameCount());
		System.out.println(paths[0].isAbsolute());
		System.out.println(paths[0].toAbsolutePath());
		System.out.println(paths[0].toUri());
		
		Path rp =  Paths.get("C:\\Data\\development\\java\\eclipse\\..\\OracleJavaProgramming\\employees.txt");
		System.out.println("r.normalize() [" + rp.normalize() + "]");

		System.out.println("p.subpath() [" + rp.getNameCount() + 
							"][" + (rp.normalize()).subpath(0, 3) +"]");
		
		System.out.println("p.subpath() [" + rp.getNameCount() + 
				"][" + (rp.normalize()).subpath(0,rp.normalize().getNameCount()) +"]");
	}

}
