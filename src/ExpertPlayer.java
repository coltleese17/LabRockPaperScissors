
public class ExpertPlayer extends Player {

	public ExpertPlayer(String name, RoshamboEnum roshamboEnum) {
		super(name, roshamboEnum);
		
	}
	
	@Override
	public RoshamboEnum generateRoshambo() {
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

	
}
