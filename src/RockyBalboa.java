

public class RockyBalboa extends Player {

	public RockyBalboa(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		
		return Roshambo.ROCK;
	}

	@Override
	public String toString() {
		return "Rocky Balboa";
	}
	

}