package guessMyNumberGame;

import java.util.Scanner;

public class GuessTheMyNumkber {
	public static void main(String[] args) {
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.println("Your guess:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int j=num; j<=10; j++){
			
			if(num==6)
			{
				System.out.println("That is right! You are a good guesser.");
				break;
			}
				else {
					System.out.println("That is incorrect. Guess again.");
					System.out.println("Your guess:");
					break;
				}
			
		}
	}

}
