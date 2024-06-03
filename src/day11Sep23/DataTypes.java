package day11Sep23;

public class DataTypes {
	public static void main(String[] args) {
		byte humanAge; // variable declaration // local variables
		// System.out.println("humanAge : " + humanAge);
		humanAge = 23; // assignment statement
		humanAge = 24;
		humanAge = 124;
		// humanAge = 1240; single line comment

		System.out.println(humanAge);

		byte camelAge = 10; // declaration and assignment statment/initialization
		System.out.println(camelAge);
		System.out.println("Camel Age = " + camelAge + "      cyber success");

		short weight = 2000; // declarred and initialization
		System.out.println("Weight = " + weight + " Kg");

		int distance;
		distance = 123456;
		System.out.println("Distance between 2 points : " + distance + "km");

		long distanceBetweenEarthAndMoon = 2152345678L; // l or L is allowed
		System.out.println("Distance between Moon and Earth : " + distanceBetweenEarthAndMoon);

		char ch;
		// System.out.println(ch);
		ch = 'Z';
		System.out.println("ch = " + ch);
		ch = 'A';
		System.out.println("ch = " + ch);

		boolean result = true;
		System.out.println("result =              =>  " + result);
		result = false;

		System.out.println("result =              =>  " + result);

		float ElephantWeight = 4500.43F; // f or F is allowed
		System.out.println("ElephantWeight : " + ElephantWeight);

		double potasium = 0.0987654321; // d or D or blank suffix will do
		System.out.println("potasium : " + potasium);

		int i = 10;
		int I = 20;

	}
}
