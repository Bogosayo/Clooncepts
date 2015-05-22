package playGame;

public class Main {

	public static void main(String[] args) {
		
		Deck deck = new DeckV1("E:\\Development\\Git Stuff\\clooncepts\\src\\playGame\\cards1.txt");
		//hi Deck deck = new DeckV1("/home/bogosayo/Dev/workspace/Clooncepts/src/playGame/cards1.txt");
		/*
		int numPlayers = 2;
		Player players[] = createPlayers(numPlayers, deck);
		*/
		Game game = new Game(2,deck);
		
		game.endGame();

	}
	
	 
	
	public static void playGame(Player[] players, Deck deck){
		int winner = 0;
		int turn = 1;
		int numPlayers = (players.length - 1);
		boolean correctGuess = false;
		
		while(correctGuess == false){
			
		}
	}

}
