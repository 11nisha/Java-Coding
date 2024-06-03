package day14Sep23;

public class Marriage {
	public static void main(String[] args) {
		char gender = 'M';
		int age = 24;

		if (gender == 'M') {
			if (age >= 21)
				System.out.println("MALE -> Eligible to get married !");
			else
				System.out.println("MALE -> NOT Eligible to get married !");
		} else {
			if (age >= 18)
				System.out.println("FEMALE -> Eligible to get married !");
			else
				System.out.println("FEMALE -> NOT Eligible to get married !");
		}
	}
}
