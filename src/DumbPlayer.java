public class DumbPlayer extends Player {

	public DumbPlayer(String name, RoshamboEnum roshamboEnum) {
		super(name, roshamboEnum);
	}

	@Override
	public RoshamboEnum generateRoshambo() {
		return RoshamboEnum.ROCK;
	}

}
