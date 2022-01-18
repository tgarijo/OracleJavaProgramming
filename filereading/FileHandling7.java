package filereading;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileHandling7 {

	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
		Path path =  fs.getPath(".\\"); //Use windows
		System.out.println("Default Directory[ " + path + "]");
	}

}
