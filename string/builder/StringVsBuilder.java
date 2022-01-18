package string.builder;

public class StringVsBuilder {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Test immutability");
		
		String str2 = "Test immutability";
		
		System.out.println("StringBuilder: " + str.hashCode());
		System.out.println("String: " + str2.hashCode());
		
		str.replace(0, str.length(), "HelloWord");
		str2="HelloWorld";
		
		System.out.println("StringBuilder: " + str.hashCode());
		System.out.println("String: " + str2.hashCode());
		
		System.out.println("Reverse: " + str.reverse());
		System.out.println("Reverse: " + str.reverse());
		
		str.append(" is fun" );		
		System.out.println("Append string = : " + str);
		
		str.delete(8, 13);
		System.out.println("delete  string = : " + str);
		
		str.insert(4, " INSERTED ");		
		System.out.println("Insert string = : " + str);
		
	}
}
