package Deck;
import java.util.Random;

public class Deck {
  public static String[] suits = new String[] {"DIAMOND", "CLUB", "HEART", "SPARE"};
  public static String[] ranks = new String[] {"ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN"};
  private static int length = suits.length * ranks.length;
  private Card[] cards;
  
  public Deck(){
    this.cards = new Card[suits.length * ranks.length];
    int idx = 0;
     for (String suit : suits){
      for (String rank : ranks){
        this.cards[idx++] = new Card(suit, rank);
      }
     }
    }
    
  
  public static void main(String[] args) {
    
  }

  public Card[] getCards(){
    return this.cards;
  }
}
