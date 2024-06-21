package Deck;

import java.util.Arrays;

public class Card {
  private String suit;
  private String rank;
  public Card(String suit, String rank){
    this.suit = suit;
    this.rank = rank;
  }

  public String getSuit(){
    return this.suit;
  }

  public String getRank(){
    return this.rank;
  }
  public String toString(){
    return "Card(" + "suits" + this.suit + "ranks" + this.rank; 
  }
  
  public static void main(String[] args) {
  }

}
