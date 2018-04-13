import java.util.*;
public class Guess{
	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		Random rand = new Random();
		int num = rand.nextInt(101);
		int user = -1;
		int attempt = 0;
		System.out.println("Welcome to the guessing game! Guess a number between 1 and 100");
		while(user != num) {
			user = test.nextInt();
			System.out.println("You guessed " + user);
			// System.out.println(num);
			if(user > num) {
				System.out.println("That number is too high, try again");
			} else if(user < num){ System.out.println("Unfortunately that is too low, try again");
			} else { System.out.println("That's it! You guessed the number in " + attempt + " " + "attempts!");
		}
		attempt++;
		}
	}
}