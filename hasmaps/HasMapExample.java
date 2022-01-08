package hasmaps;

import java.util.HashMap;
import java.util.Iterator;

public class HasMapExample {

	public static void main(String[] args) {
		HashMap<String,String> fruitBowl = new HashMap<String,String>();
		
		addElements(fruitBowl);
		displayElement(fruitBowl);
		findElement(fruitBowl, "Banana");
	}
	

	static void findElement(HashMap<String, String> fruitBowl, String fruit) {
		// TODO Auto-generated method stub
		if(fruitBowl.containsKey(fruit)) 
			System.out.println("The " + fruit + " is " +fruitBowl.get(fruit));
		else
			System.out.println("There is no " + fruit + " in the bowl");
		
	}


	static void displayElement(HashMap<String, String> fruitBowl) {
		System.out.println(fruitBowl);
		
		for(HashMap.Entry<String, String> fruit: fruitBowl.entrySet() )
		{
			System.out.println("Fruit: " + fruit.getKey() +
							   " - Color: " + fruit.getValue());
		}
		
	}

	static void addElements(HashMap<String, String> fruitBowl) {
		fruitBowl.put("Apple", "Green");
		fruitBowl.put("Cherry", "Red");
		fruitBowl.put("Orange", "Orange");
		fruitBowl.put("Banana", "Yellow");
		fruitBowl.put("Apple", "Red");
		
	}

}
