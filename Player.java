package playGame;

import java.util.HashMap;
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
		System.out.println(hand);
	}
}
