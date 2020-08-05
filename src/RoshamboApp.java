

import java.util.Scanner;

public class RoshamboApp {

	private static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		do {
		String prompt = "";
		Player player1 = createHumanPlayer();
		Player player2 = selectOpponent();
		Player oppChoice = player2;
		System.out.println("You are now playing against " + oppChoice);
		int choice = Validator.getInt(scnr, prompt);
		Roshambo hand1 = player1.generateRoshambo();
		Roshambo hand2 = player2.generateRoshambo();
		System.out.println(player1.getName()+" plays "+hand1.toString());
		
//		System.out.println(player1.getName()+" plays "+ Roshambo.toString());
		
		System.out.println(player2.getName()+" plays "+hand2);
		System.out.println("Would you like to play again (Y/N): ");
		}while (Validator.getYesNo(scnr, ""));
		System.out.println("Ok, have a fine day.");
	}

	public static Player selectOpponent() {
		

		System.out.println("Would you like to face Randy or Rocky?");
		String input = scnr.nextLine().toLowerCase();

		if (input.startsWith("ro")) {
			return new RockyBalboa("Rocky Balboa");
		} else {
			return new RandyRandomizer("Randy the Random");
		}

	}

	public static Human createHumanPlayer() {

		System.out.print("Enter your name:");
		String name = scnr.nextLine();

		return new Human(name);

	}

}