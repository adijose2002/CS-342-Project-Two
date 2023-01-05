import java.util.ArrayList;
import java.util.Collections;

public class Deck extends ArrayList < Card > {
    int size = 0;

    Deck() // this creates a deck that has been already shuffled
    {
        int[] array = {
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                10,
                11,
                12,
                13,
                14
        }; {
        int size = 0;
        char[] suitss = {
                'C',
                'D',
                'S',
                'H'
        };
        for (int suit = 1; suit <= 4; suit++) {
            for (int value = 2; value <= 14; value++) {
                this.add(new Card(suitss[suit], array[value]));
                size++;
            }
        }
        Collections.shuffle(this);
    }
    }

    void newDeck() // this clears the old deck and creates a brand new one
    {
        this.clear(); {
        int[] array = {
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                10,
                11,
                12,
                13,
                14
        }; {
            int size = 0;
            char[] suitss = {
                    'C',
                    'D',
                    'S',
                    'H'
            };
            for (int suit = 1; suit <= 4; suit++) {
                for (int value = 2; value <= 14; value++) {
                    this.add(new Card(suitss[suit], array[value]));
                    size++;
                }
            }
            Collections.shuffle(this);
        }
    }
    }
}