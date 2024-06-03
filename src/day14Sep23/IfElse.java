package day14Sep23;

public class IfElse {
	public static void main(String[] args) {
		int weight = 21;
		if (weight <= 0)
			System.out.println("Invalid weight : " + weight);
		else {
			if (weight < 20)
				System.out.println("You are underweight: " + weight + "kg");
			else if (weight <= 60 && weight >= 20)
				System.out.println("You are fit: " + weight + "kg");
			else if (weight > 60 && weight <= 80)
				System.out.println("You are FAT Level 1 obesity: " + weight + "kg");
			else if (weight > 80 && weight <= 100)
				System.out.println("You are FAT Level 2 obesity: " + weight + "kg");
			else
				System.out.println("You are FAT Level 3 obesity: " + weight + "kg");
		}
	}
}
