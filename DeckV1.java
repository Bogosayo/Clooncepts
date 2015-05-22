package playGame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DeckV1 extends Deck{
	
	public DeckV1(String fileName){
		type1 = CardType.SUSPECT;
		type2 = CardType.WEAPON;
		type3 = CardType.PLACE;
        deck = new HashMap<CardType, LinkedList<Card>>();
		
		readFile(fileName);
		
	}

    /**
     *
     * @param fileName
     *
     * (1) first line of file has number of cards per type
     * (2) second line is category cutoff string
     * (3) when cutoff is reached, store card list as array within hashmap
     */
    private void readFile(String fileName){
        String line;
        int typeIndex = 0;
        CardType types[] = new CardType[3];
        types[0] = type1;
        types[1] = type2;
        types[2] = type3;
        Card card;
        Card cardArray[];
        LinkedList<Card> cardList = new LinkedList<Card>();

        BufferedReader br = null;
        try{
            File file = new File(fileName);
            br = new BufferedReader(new FileReader(file));
            /*** (1) ***/
            line = br.readLine();
            String amounts[] = line.split(" ");
            /*** (2) ***/
            line = br.readLine();
            String cutoff = line;
            /*** (3) ***/
            while ((line = br.readLine()) != null){
                if (line.equals(cutoff)){
                    deck.put(types[typeIndex], cardList);
                    typeIndex++;

                    cardList = new LinkedList<Card>();
                }
                else{
                    if (!line.equals("")) {
                        card = new Card(types[typeIndex], line);

                        cardList.add(card);
                    }
                }

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
