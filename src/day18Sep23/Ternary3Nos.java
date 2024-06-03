package day18Sep23;

public class Ternary3Nos {
	public static void main(String[] args) {
		int a = 5, b = 4, c = 30, res;
		res = (a > b && a > c) ? a : (b > c) ? b : c;
		System.out.println("the biggest no is : " + res);
	}
}
