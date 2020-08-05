

import java.util.Scanner;

public abstract class Player {

	private String name;
	private static Scanner scnr = new Scanner(System.in);

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Roshambo generateRoshambo() {
		String userIn = scnr.nextLine().toLowerCase();
		if(userIn.startsWith("r")) {
			return Roshambo.ROCK;
		} else if (userIn.startsWith("p")) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
		
	}
	public static Roshambo getRoshambo(int i) {
		
		switch (i) {

		case 0:
			return Roshambo.ROCK;
		case 1:
			return Roshambo.PAPER;
		case 2:
			return Roshambo.SCISSORS;
		default:
			return null;
			
		}
		
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", generateRoshambo()=" + generateRoshambo() + "]";
	}
	


	
}	