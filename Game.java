package playGame;

public class Game {
	private Deck deck;
	private int numPlayers;
	private Player player[];
	
	private int turn;
	
	public Game(int numPlayers, Deck deck){
		this.deck = deck;
		this.numPlayers = numPlayers;
		this.turn = 0;
		
		this.player = new Player[numPlayers];

		Dealer dealer = new Dealer(deck);
		player = dealer.dealCards(player);
	}

	public void playGame(){
		
	}
	
	public void endGame(){
		revealCards();
	}
	
	private void revealCards(){
		for(int i = 0; i<=numPlayers; i++){
			System.out.println("\nPlayer " + i + " has:");
			player[i].revealHand();
		}
	}

}
