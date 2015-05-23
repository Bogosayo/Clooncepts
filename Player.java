package playGame;

import java.util.Iterator;
import java.util.LinkedList;

public class Player {

	private LinkedList<Card> hand;
	
	public Player(){
		hand = new LinkedList<Card>();
;	}
	
	public void addCard(Card dealtCard){
		hand.add(dealtCard);
	}

	
	public void revealHand(){
		System.out.println(hand.size() + " cards:");
		Iterator<Card> list = hand.iterator();
		while (list.hasNext()){
			System.out.print(list.next().getName() + ", ");

		}
	}

	public static Player[] createPlayers(int num){
		Player players[] = new Player[num];
		for (int i = 0; i < num; i++){
			players[i] = new Player();
		}
		return players;
	}
}
