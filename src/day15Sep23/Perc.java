package day15Sep23;

public class Perc {
	public static void main(String[] args) {
		float perc = 92f;
		if (perc < 0 || perc > 100)
			System.out.println("invalid Percentage: " + perc);
		else {
			if (perc < 50)
				System.out.println("you are FAILED !");
			else if (perc >= 50 && perc < 60)
				System.out.println("you are PASSED !");
			else if (perc >= 60 && perc < 70)
				System.out.println("you are passed in FIRST CLASS!");
			else
				System.out.println("you are PASSED in DISTINCETION !");
		}

	}
}
