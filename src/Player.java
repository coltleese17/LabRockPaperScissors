
public abstract class Player {
	private String name;
	private String rpsValue;
	
	public Player (String name, String rpsValue) {
		this.name = name;
		this.rpsValue = rpsValue;
	}

	public String getName() {
		return name;
	}

	public String getRpsValue() {
		return rpsValue;
	}
	
	
	
	public static RoshamboEnum generateRoshambo(DumbPlayer dumbPlayer) {
		return RoshamboEnum.ROCK;
	}
	
	public static RoshamboEnum generateRoshambo(ExpertPlayer expertPlayer) {
		double randomNum = 0 + (int)(Math.random() * 100);
		if (randomNum <= 33.33) {
		return RoshamboEnum.ROCK;
		}
		else if (randomNum > 33.33 && randomNum <66.67 ) {
			return RoshamboEnum.PAPER;
		}
		else {
			return RoshamboEnum.SCISSORS;
		}
	}
	
	public static RoshamboEnum generateRoshambo(String playerValue) {
		if (playerValue.equalsIgnoreCase("r")){
			return RoshamboEnum.ROCK;
		}
		
		else if (playerValue.equalsIgnoreCase("p")){
			return RoshamboEnum.PAPER;
		}
		
		else if (playerValue.equalsIgnoreCase("s")) {
			return RoshamboEnum.SCISSORS;
		}
		return RoshamboEnum.SCISSORS;
		
	}

}
