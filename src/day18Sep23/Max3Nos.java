package day18Sep23;

public class Max3Nos {

	public static void main(String[] args) {
		int a = 1000, b = 200, c = 30;
		if (a > b && a > c)
			System.out.println(a + " is the biggest number");
		else if (b > c)
			System.out.println(b + " is the biggest number");
		else
			System.out.println(c + " is the biggest number");
	}
}
