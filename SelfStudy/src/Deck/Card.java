public class Card {
    private Rank rank;
    private Suit suit;
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public Rank getRank(){
        return this.rank;
    }

    public boolean isHigherThan(Card card){
        if (this.rank.isHigherThan(card.rank))
            return true; // exit method
        if (this.rank == card.getRank() && this.suit.isHigherThan(card.getSuit()))
            return true;
        return false;
    }

    public static void main(String[] args) {

    }
}
