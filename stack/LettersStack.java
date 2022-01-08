package stack;

import java.util.LinkedList;

public class LettersStack {

	public static void main(String[] args) {
		LinkedList<String> letterS = new LinkedList<String>();
		
		letterS.push("A");
		letterS.push("B");
		letterS.push("C");
		letterS.push("D");
		
		System.out.println("Linked list : " + letterS);
		
		System.out.println("Stack Size: " + letterS.size());
		
		while(!letterS.isEmpty()) {
			System.out.println(letterS.pop());					
		}
		
		System.out.println("Linked list : " + letterS);
		
	}
}
