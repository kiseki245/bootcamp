public class BigTwo {

    public static void main(String[] args) {
        // Problem 1: How to design/handle the 2 Joker Card in the classes? (parent
        // class/ interface)

        Deck deck = new Deck(false);
//        for (Card card : deck.getCard()) {
//            System.out.println(card.getSuit() + " " + card.getRank());
//        }

        // Problem 2: 52? rank? Rank.TWO is the highest in Big Two.
        for (Card card : deck.getCard()) {
            if (card.getRank() == Rank.TWO){
                Rank.TWO.setValue(15);
                System.out.println(card.getRank().getValue() + " " + card.getSuit());
            }

        }
    }
}
