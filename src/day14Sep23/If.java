package day14Sep23;

public class If {
	public static void main(String[] args) {
		int a = 1000, b = 1500;
		if (a > b) // if condition is true
		{
			System.out.println("I am inside IF block");
			System.out.println(a + " > " + b);
		} else // when condition is false
		{
			System.out.println("I am inside ELSE block");
			System.out.println(b + " > " + a);
		}
		System.out.println("I am after If-else block");
	}
}

/*
 * output: I am inside ELSE block 1500 > 1000 I am after If-else block
 * 
 * Please make use of /*
 */
/*
single line
comment is
marked using // . whatever you write after // is considered as a comment
*/