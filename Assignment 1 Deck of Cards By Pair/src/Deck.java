import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Ace", "Jack", "Queen", "King"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> deal(int numberOfCards) {
        List<Card> dealtCards = new ArrayList<>();
        for (int i = 0; i < numberOfCards && !cards.isEmpty(); i++) {
            dealtCards.add(cards.remove(0));
        }
        return dealtCards;
    }

    public void display() {
        for (Card card : cards) {
            System.out.println(card);
        }
        System.out.println("Number of cards remaining in the deck: " + cards.size());
    }

    public int getRemainingCards() {
        return cards.size();
    }
}
