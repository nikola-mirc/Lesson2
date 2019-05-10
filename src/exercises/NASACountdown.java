package exercises;

public class NASACountdown {

	public static void main(String[] args) {

		for (int i = 10; i >= 0; i--) {

			System.out.println(i);

			if (i == 1) {

				System.out.println("Blastoff!");
				break;
			}
		}

	}
}