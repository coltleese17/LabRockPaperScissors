import java.util.Scanner;


public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playerName;
		String expertOrDumb;
		String playerRpsChoice;
		String choice = "y"; 
		ExpertPlayer expertPlayer = new ExpertPlayer("Expert Player", null);
		DumbPlayer dumbPlayer = new DumbPlayer("DumbPlayer", null);
		UserPlayer userPlayer = new UserPlayer("Name", null);
		Player Opponent = null;
		
		System.out.println("Welcome to Rock Paper Scissors!");
		
		System.out.println("Enter your name: ");
		userPlayer.setName(scan.nextLine());
		
		//plays the game while equal to Y
		while (choice.equalsIgnoreCase("y")) {
		
		//chooses which player to play against and keeps prompting until they type e or d
		/*do {
		
		expertOrDumb = scan.nextLine();
		} while(!expertOrDumb.equalsIgnoreCase("e") && !expertOrDumb.equalsIgnoreCase("d")); */
		expertOrDumb = (Validator.validateTwoStrings(scan, "Would you like to play against ExpertPlayer or DumbPlayer? (e/d)", "e", "d"));
		
		if (expertOrDumb.equalsIgnoreCase("e")) {
			Opponent = expertPlayer;
			
		} else if (expertOrDumb.equalsIgnoreCase("d")) {
			Opponent = dumbPlayer;
		}
		
		playerRpsChoice = (Validator.validateThreeStrings(scan, "Rock, Paper, or Scissors? (R/P/S)", "r", "p", "s"));
		
		//Setting the Roshambo for player and computer 
		userPlayer.setChoice(playerRpsChoice);
		Opponent.setRoshambo(Opponent.generateRoshambo());
		
		//Storing the final variables to compare later
		RoshamboEnum playerFinal = userPlayer.generateRoshambo();
		RoshamboEnum compFinal = Opponent.generateRoshambo();
		
		//Printing out results
		System.out.println(userPlayer.getName() + ":" + playerFinal );
		System.out.println(Opponent.getName() + ":" + compFinal);
		System.out.println(winLoseTie(playerFinal, compFinal));
		
		choice = (Validator.validateTwoStrings(scan, "Would you like to play again? (y/n)", "y", "n"));
		
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
