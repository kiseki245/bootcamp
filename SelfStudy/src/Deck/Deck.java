import java.util.Arrays;

public class Deck {

    public static int length = 52;
    public static int JokerLength = 54;
    private Card[] cards;

    public Deck(boolean includeJoker){
        int idx = 0;
        if (!includeJoker) {
            this.cards = new Card[length];
            for (Suit suit : Suit.values()) {
                if (suit == Suit.JOKER || suit == Suit.BWJOKER)
                    break;
                for (Rank rank : Rank.values()) {
                    if (rank == Rank.BWJOKER || rank == Rank.JOKER)
                        break;
                    this.cards[idx++] = new Card(suit, rank);
                }
            }
        } else {
            this.cards = new Card[JokerLength];
            this.cards = new Card[JokerLength];
                        for(Suit suit : Suit.values()){
                            if (suit == Suit.JOKER || suit == Suit.BWJOKER)
                                break;
                            for (Rank rank : Rank.values()) {
                                if (rank == Rank.BWJOKER || rank == Rank.JOKER)
                                    break;
                                this.cards[idx++] = new Card(suit, rank);
                        }
                        }
            this.cards[JokerLength - 2] = new Card(Suit.BWJOKER, Rank.BWJOKER);
            this.cards[JokerLength - 1] = new Card(Suit.JOKER, Rank.JOKER);

        }
    }


    public Card[] getCard(){
        return this.cards;
    }

    public void shuffle(int times){
        ShuffleManager sm = new ShuffleManager((getCard()));
        sm.shuffle(times);
        this.cards = sm.getCards();
    }

    public static void main(String[] args) {
        Deck deck = new Deck(true);
        for (Card card : deck.getCard()) {
            System.out.println(card.getSuit() + " " + card.getRank());
        }
    }
}
