
public class UserPlayer extends Player {
	

	public UserPlayer(String name, String choice) {
		super(name, choice);
	}

	
	public RoshamboEnum generateRoshambo() {
		if (this.getChoice().equalsIgnoreCase("r")){
		return RoshamboEnum.ROCK;
		}

		else if (this.getChoice().equalsIgnoreCase("p")){
		return RoshamboEnum.PAPER;
		}

		else if (this.getChoice().equalsIgnoreCase("s")) {
		return RoshamboEnum.SCISSORS;
		}
		return RoshamboEnum.SCISSORS;
	}


	
}



