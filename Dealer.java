package playGame;

import java.util.*;

/**
 * Created by bogosayo on 5/17/15.
 */
public class Dealer {
    private Stack<Card> stacks[];
    private int numCategories;

    public Dealer(Deck deck){
        this.numCategories = deck.getDeck().size();
        this.stacks = new Stack[numCategories];
        int i = 0;
        for (Map.Entry<CardType, LinkedList<Card>> category : deck.getDeck().entrySet()){
            this.stacks[i] = new Stack<Card>();
            this.stacks[i].addAll(category.getValue());
            Collections.shuffle(this.stacks[i]);
        }


    }

    /**
     *
     * @param player
     * @return player with cards
     * (1) player[0] represents the hidden envelope
     *     must have one of each type of card
     * (2) combine stacks into 1 stack, then distribute amongst other players
     *     additional cards are not given to player[0],
     *     so only deal cards to players 1 to numPlayers
     * (3) return players when all cards are dealt
     */
    public Player[] dealCards(Player player[]){
        int numPlayers = player.length;
        /*** (1) ***/
        player[0] = new Player();
        for(int i = 0; i < numCategories; i++) {
            player[0].addCard(stacks[i].pop());
        }
        /*** (2) ***/
        Stack<Card> pile = combineRemaining();
        int pIndex = 1;
        while (!pile.isEmpty()){
            if (pIndex == numPlayers){
                pIndex = 1;
            }
            player[pIndex].addCard(pile.pop());
        }

        return player;

    }

    private Stack<Card> combineRemaining(){
        Stack<Card> pile = new Stack<Card>();
        for (int i = 0; i < numCategories; i++){
            pile.addAll(stacks[i]);
        }
        Collections.shuffle(pile);
        return pile;
    }


}
