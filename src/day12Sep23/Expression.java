package day12Sep23;

public class Expression {
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("a = " + a); // a = 10
		System.out.println("a + b = " + a + b); // a + b = 1020
		System.out.println("a + b = " + (a + b)); // a + b = 30
		System.out.println(a + " = a");
		System.out.println(a + b + " = a"); // 30 = a
//	                        String + int  =>  String
//	                        int + int + String -> addition of int + string 
//	                        String + (int = int) =>  String + addition of int

	}
}
