import java.util.ArrayList;
import java.util.Collections;

public class Dealer {
    Deck theDeck;
    ArrayList < Card > dealersHand;

    Dealer() {
        theDeck = new Deck();

    }

    public ArrayList < Card > dealHand() {
        dealersHand = new ArrayList < Card > ();

        for (int i = 0; i < 3; i++) {
            if (theDeck.size > 34) {
                theDeck.newDeck();
            }
            theDeck.size = theDeck.size - 1;
            dealersHand.add(theDeck.remove(i));
        }

        return dealersHand;
    }

}