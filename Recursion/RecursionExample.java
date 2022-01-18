package Recursion;

public class RecursionExample {

	public static void main(String[] args) {
		//recurseMethod(4);
		factorial(5);
		fibonacci(100);
		
	}

	 static double fibonacci(double d) {
		if ( d < 2) 
			return d;
		else {
			return fibonacci(d - 1 ) + fibonacci(d - 2);
		}
		
	}

	static double factorial(double d ) {		
		if (d <= 1 ) {
			return 1;
		}else{
			return d * factorial(d-1);
		}
		
	}

	static void recurseMethod(int num) {
		if(num == 0)
			return;
		else {
			System.out.println("hello " + num );
			recurseMethod(--num);
			System.out.println(""+num);
			return;
		}
		
	}

}
