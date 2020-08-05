

import java.util.Scanner;

public class Human extends Player{

	public Human(String name) {
		super(name);
	}



	
	
	@Override
	public Roshambo generateRoshambo() {
		Scanner scnr = new Scanner(System.in);
//		System.out.print("Rock, Paper, or Scissors? (R/P/S): ");
		String prompt = "1. Rock, 2. Paper, 3. Scissors";
		int userChoice = Validator.getInt(scnr, prompt);
		return getRoshambo(userChoice - 1);
	}
	
	

}
	

