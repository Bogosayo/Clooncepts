package playGame;

/**
 * Created by bogosayo on 5/17/15.
 */
public class Card {
    private CardType type;
    private String name;

    public Card(CardType type, String name){
        this.type = type;
        this.name = name;

    }

    public CardType getType() {
        return type;
    }


    public String getName() {
        return name;
    }
}
