package day18Sep23;

public class Min3Nos {
	public static void main(String[] args) {
		int a = 100, b = 100, c = 400;

		if (a == b && a == c)
			System.out.println(a + " a=b=c is the minimum number");
		else {
			if (a < b && a < c)
				System.out.println(a + " is the minimum number");
			else if (b < c)
				System.out.println(b + " is the minimum number");
			else
				System.out.println(c + " is the minimum number");
		}
	}
}
