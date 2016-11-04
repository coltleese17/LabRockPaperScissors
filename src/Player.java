
public abstract class Player {
	private String name;
	private RoshamboEnum roshambo;
	private String choice;
	
	
	public Player (String name, RoshamboEnum roshambo) {
		this.name = name;
		this.roshambo = roshambo;
	}

	public Player(String name, String choice) {
		this.name = name;
		this.choice = choice;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public String getName() {
		return name;
	}

	public RoshamboEnum getRoshambo() {
		return roshambo;
	}

	public void setRoshambo(RoshamboEnum roshambo) {
		this.roshambo = roshambo;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public abstract RoshamboEnum generateRoshambo();

}
