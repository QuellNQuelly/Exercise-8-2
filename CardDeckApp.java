public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
        String[] deck = getDeck();
        displayCards(deck);

        System.out.println("\nSHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);

        int count = 2;
        System.out.println("\nHAND OF " + count + " CARDS");
        String[] hand = dealCards(deck, count);
        displayCards(hand);
    }

    private static String[] getDeck() {
        String[] deck = new String[52];

        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = {
            "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"
        };

        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }

        return deck;
    }

    private static void displayCards(String[] cards) {
        for (String card : cards) {
            System.out.print(card + " | ");
        }
        System.out.println();
    }

    private static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = (int)(Math.random() * deck.length);

            // swap cards
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    private static String[] dealCards(String[] deck, int count) {
        String[] hand = new String[count];

        for (int i = 0; i < count; i++) {
            hand[i] = deck[i];
        }

        return hand;
    }
}