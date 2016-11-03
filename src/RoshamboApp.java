import java.util.Scanner;


public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playerName;
		String expertOrDumb;
		RoshamboEnum compFinal = null;
		String playerRpsChoice;
		String choice = "y";
		
		//System.out.println(RoshamboEnum.ROCK);
		ExpertPlayer expertPlayer = new ExpertPlayer("Expert Player", "rock");
		DumbPlayer dumbPlayer = new DumbPlayer("Dumb Player", "rock");
		
		//System.out.println(Player.generateRoshambo(dumbPlayer1));
		//stem.out.println(Player.generateRoshambo("Rock"));
		System.out.println("Welcome to Rock Paper Scissors!");
		
		System.out.println("Enter your name: ");
		playerName = scan.nextLine();
		
		while (choice.equalsIgnoreCase("y")) {
		
		do {
		System.out.println("Would you like to play against ExpertPlayer or DumbPlayer(e/d)?");
		expertOrDumb = scan.nextLine();
		} while(!expertOrDumb.equalsIgnoreCase("e") && !expertOrDumb.equalsIgnoreCase("d"));
		
		do {
		System.out.println("Rock, Paper, or Scissors? (R/P/S)");
		playerRpsChoice = scan.nextLine();
		} while(!playerRpsChoice.equalsIgnoreCase("r") && (!playerRpsChoice.equalsIgnoreCase("p")) && !playerRpsChoice.equalsIgnoreCase("s"));
		
		RoshamboEnum playerFinal = Player.generateRoshambo(playerRpsChoice);
		System.out.println(playerName + ":" + playerFinal );
		
		if (expertOrDumb.equalsIgnoreCase("e")) {
			compFinal = Player.generateRoshambo(expertPlayer);
			System.out.println(expertPlayer.getName() + ":" + compFinal );
		} else if (expertOrDumb.equalsIgnoreCase("d")) {
			compFinal = Player.generateRoshambo(dumbPlayer);
			System.out.println(dumbPlayer.getName() + ":" + compFinal);
		}
		
		System.out.println(winLoseTie(playerFinal, compFinal));
		
		do {
		System.out.println("Play again?");
		choice = scan.nextLine();
		} while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n"));
		
		} 
		
		System.out.println("Thanks for playing");
		}

		public static String winLoseTie (RoshamboEnum playerEnum, RoshamboEnum compEnum) {
			if ((playerEnum == RoshamboEnum.ROCK) && (compEnum == RoshamboEnum.SCISSORS) || 
				((playerEnum == RoshamboEnum.PAPER) && (compEnum == RoshamboEnum.ROCK)) ||
				((playerEnum == RoshamboEnum.SCISSORS) && (compEnum == RoshamboEnum.PAPER))) {
				return "You win";
			}
			else if (playerEnum == compEnum) {
					return "You Tie";
			}
			return "You Lose";
		}
}
