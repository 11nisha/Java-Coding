package day15Sep23;

public class Operator1 {
	public static void main(String[] args) {
		int a = 10, b = 10, c = 20, d = 30;
		// logical operator
		// and : &&
		// or : ||
		// not : !

		System.out.println(a > b && c > d); // 10 > 10 && 20 > 30 false
		System.out.println(a < b && c < d); // 10 < 10 && 20 < 30 false
											// false && true
		System.out.println(a == b && c < d); // 10 == 10 && 20 < 30 true
												// true && true
		System.out.println(a == b && c != d); // 10 == 10 && 20 != 30
												// true && true

		System.out.println(a != b && c != d); // false

		System.out.println(a != b || c != d); // true
		System.out.println(a != b || c == d); // false

		System.out.println(!(!(a != b || c == d))); // false
	}
	/*
	 * Truth table:&&: C1 C2 Result T T T T F F F T F F F F
	 * 
	 * ||: C1 C2 Result T T T T F T F T T F F F
	 * 
	 * ! C1 Result T F F T
	 */
}
