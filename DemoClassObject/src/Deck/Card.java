package Deck;

import java.util.Arrays;
import java.util.Objects;

public class Card {
  // private String suit;
  // private String rank;

  private Suit suit;
  private Rank rank;
  
  public Card(Suit suit, Rank rank){
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit(){
    return this.suit;
  }

  public Rank getRank(){
    return this.rank;
  }

  

  @Override
  public String toString(){
    return "Card(" + "suits" + this.suit + "ranks" + this.rank; 
  }
  public boolean isHigherThen(Card card){
    // Compare rank first, if they are equal, then compare suit
    if (this.getRank().isHigherThen(card.getRank()))
      return true; 
    if (this.getRank() == card.getRank() && this.getSuit().isHigherThen(card.getSuit()))
        return true;
      //early exit condition
    return false;
  }

  
  
  public static void main(String[] args) {
    Card MyCard = new Card(Suit.SPADE, Rank.TWO);
    Card Target = new Card(Suit.SPADE, Rank.ACE);
    System.out.println(MyCard.isHigherThen(Target));

    Object Target2 = new Card(null, null);
    System.out.println(new Card(Suit.CLUB, Rank.NINE).isHigherThen(new Card(Suit.DIAOMAND, Rank.ACE)));
  }

}
