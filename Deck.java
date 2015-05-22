package playGame;

import java.util.HashMap;
import java.util.LinkedList;

public abstract class Deck {
	protected CardType type1;
	protected CardType type2;
	protected CardType type3;
	protected HashMap<CardType, LinkedList<Card>> deck;
	
	public HashMap<CardType, LinkedList<Card>> getDeck(){
		return deck;
	}
	
}
