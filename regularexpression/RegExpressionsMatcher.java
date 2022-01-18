package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionsMatcher {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("(J|j)ava");
		
		String str = "Java courses are the best! You have got love java.";
		System.out.println(str);
		
		Matcher m = p.matcher(str);
		str = m.replaceAll("Oracle");
		System.out.println(str);
	}

}
