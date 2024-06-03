package day18Sep23;

public class Ternary1 {
	public static void main(String[] args) {
		int a = 1000, b = 200, c = 30;
		int res;

		res = (a > b && b > c) ? a : (b > c) ? b : c;
		System.out.println("the bigeest no is : " + res);
	}
}
