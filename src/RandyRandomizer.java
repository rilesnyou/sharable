

import java.util.Random;

public class RandyRandomizer extends Player{
	
	private Random rand;
	public RandyRandomizer(String name) {
		super(name);
		rand = new Random();
	}
	@Override
	public Roshambo generateRoshambo() {
//		int choice = rand.nextInt(3);
//		return Roshambo.values()[choice];
		return getRoshambo((int) (Math.random()*3));
		
	}
	@Override
	public String toString() {
		return "Randy the Random";
	}
	
}
