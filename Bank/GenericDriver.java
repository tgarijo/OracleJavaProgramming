package Bank;

public class GenericDriver {

	public static void main(String[] args) {


		Generic<Integer> integerCell = new Generic<Integer>();
		Generic<String> stringCell = new Generic<String>();
		integerCell.setValue(1);
		stringCell.setValue("One");
		int num = integerCell.getValue();
		String str = stringCell.getValue();
		System.out.println("Integer value: " + num);
		System.out.println("String value: " + str);
		
	}

}
