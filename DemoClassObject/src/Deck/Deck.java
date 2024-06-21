package Deck;

import java.util.Arrays;

public class Deck {
  private static String[] suits =
      new String[] {"DIAMOND", "CLUB", "HEART", "SPADE"};
  private static String[] ranks = new String[] {"ACE", "TWO", "THREE", "FOUR",
      "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
  public static int length = suits.length * ranks.length;

  private Card[] cards;

  public Deck() {
    this.cards = new Card[length];
    int idx = 0;
    for (String suit : suits) {
      for (String rank : ranks) {
        this.cards[idx++] = new Card(suit, rank);
      }
    }
  }

  public static void test() {
    System.out.println("hello");
    Deck d = new Deck();
    d.getCards();
  }

  public Card[] getCards() {
    return this.cards;
  }

  public void shuffle(int times) {
    ShuffleManager sm = new ShuffleManager(getCards());
    sm.shuffle(times);
    this.cards = sm.getCards();
  }

  public static void main(String[] args) {
    Deck deck = new Deck();
    deck.shuffle(100);
    System.out.println("Card[] after shuffle():");
    for (Card card : deck.getCards()) {
      System.out.println(card);
    }

    Deck.test();
  }

}