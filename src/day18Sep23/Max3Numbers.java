package day18Sep23;

public class Max3Numbers {
	public static void main(String[] args) {

		int a = 10, b = 15, c = 10;

		if (a == b && b == c)
			System.out.println("a=b=c " + a + " all values are same ");
		else {
			if (a >= b) {
				if (a >= c) {
					if (a == b)
						System.out.println(a + " a=b is the biggest number");
					else if (a > c)
						System.out.println(a + " a is the biggest number");
					else if (a == c)
						System.out.println(a + " a=c is the biggest number");
				} else if (b >= c) {
					if (b > c)
						System.out.println(b + " b is the biggest number");
					else if (b == c)
						System.out.println(c + " b=c is the biggest number");
				} else
					System.out.println(c + " c is the biggest number");
			} else if (b >= c) {
				if (b > c)
					System.out.println(b + " b is the biggest number");
				else if (b == c)
					System.out.println(c + " b=c is the biggest number");
			} else
				System.out.println(c + " c is the biggest number");
		}
	}
}
