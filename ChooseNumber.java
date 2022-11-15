// task2

 import java.util.Scanner;
public class ChooseNumber {
	public static void
	guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in);
		int m = 1 + (int)(100
							* Math.random());
		int t = 8;
          int i, s;
		System.out.println(
			"A number is chosen"
			+ " between 1 to 100."
			+ "Guess the number"
			+ " within 8 trials.");

		for (i = 0; i < t; i++) {
			System.out.println(
				"Guess the number:");
                          	s = sc.nextInt();
			if (m == s) {
				System.out.println(
					"Congratulations!"
					+ " your guess is correct");
				break;
			}
			else if (m > s
					&& i != t- 1) {
				System.out.println(
					"The number is "
					+ "grater than " + s);
			}
			else if (m < s
					&& i != t - 1) {
				System.out.println(
					"The number is"
					+ " less than " + s);
			}
		}

		if (i == t) {
			System.out.println(
				"You have exhausted"
				+ t   +"  trials.");

			System.out.println(
				"The number was " + m);
		}
	}
	public static void main(String arg[])
	{
		guessingNumberGame();
	}
}
