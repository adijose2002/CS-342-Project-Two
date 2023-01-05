public class Card {

    private char suit;
    private int value;

    //GETTERS AND SETTERS
    public char getSuit() {
        return suit;
    }
    public void setSuit(char SUIT) {
        this.suit = SUIT;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int VAL) {
        this.value = VAL;
    }

    Card(char Suit, int Val) {
        this.suit = Suit;
        this.value = Val;

    }

}