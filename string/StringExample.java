package string;

import java.util.ArrayList;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sample String";
		String sentence = "This is my sentence";
		
		
		ArrayList<String> words = new ArrayList<String>();
		
		
		String[] tokens = sentence.split("[ie]");
				
			
		displayString(str);
		System.out.println("");
		displayStringReverse(str);
		System.out.println("");
		displayStringReverseOther(str);
		searchString(str, 'i');
		
		parsingString(str, words);
		System.out.println(words);
		
		for(String s: tokens)
			System.out.print(s);
		
		
	}

	private static void parsingString(String str, ArrayList<String> words) {
		while(str.length() > 0 ) {
			for(int i=0; i<str.length(); i++) {
				if(i==str.length()-1) {
					words.add(str.substring(0));
					str="";
					break;
				}
				else if(str.charAt(i)==' ') {
					words.add(str.substring(0,i));				
					str=str.substring(i+1);
					break;
				}
			}
		}
		
	}

	private static void searchString(String str, char c) {
		for (int x= 0; x < str.length()-1;x++) {
			if(str.charAt(x) == c) {
				System.out.println("Char found in position: " + x );
				break;
			}
		}
			
	}

	private static void displayStringReverseOther(String str) {
		String strBackwards = "";
		
		for(int i=str.length()-1; i>=0; i--){
			strBackwards+=str.substring(i,i+1);
		}
		System.out.println(strBackwards);
	}

	private static void displayStringReverse(String str) {
		for(int x = str.length() - 1 ; x > -1; x--) {
			System.out.print(str.charAt(x));
		}
		
	}
	
	

	private static void displayString(String str) {
		
		for(int x=0; x < str.length(); x++) {
			System.out.print(str.charAt(x));
		}
		
	}

}
