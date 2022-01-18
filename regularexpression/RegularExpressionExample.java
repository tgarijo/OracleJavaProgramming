package regularexpression;

public class RegularExpressionExample {

	public static void main(String[] args) {
		if(getAnimal("cat")) {
			System.out.println("This is a valid animal");
		}else {
			System.out.println("This is not a valid animal");
		}

	}

	private static boolean getAnimal(String animal) {
		// TODO Auto-generated method stub
		
		//return animal.matches("[0-9]."); consists a number followed any character
		//return animal.matches("cat|dog");
		//return animal.matches("[Cc]at|[Dd]og");
		//return animal.matches("[a-z]at");
		return animal.matches("[a-zA-Z](at|AT)");
		
		
		
	}

	
}
