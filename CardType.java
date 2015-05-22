package playGame;

public enum CardType {
	WEAPON, SUSPECT, PLACE;
	
	public String toString(){
		switch(this) {
		case WEAPON : return "weapon";
		case SUSPECT : return "suspect";
		case PLACE	: return "place";
		default : return "error, unknown card type";
		}
	}
}
