package filereading;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizePathsDemo {

	public static void main(String[] args) {
		Path p1 = Paths.get("c:/data/development/java/Eclipse");
		Path p2 = Paths.get("c:/data/development");
		
		Path p3 = p2.relativize(p1);
		System.out.println(p3);

	}

}
