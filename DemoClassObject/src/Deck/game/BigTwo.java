package Deck.game;

import java.util.Arrays;

import Deck.Card;
import Deck.Deck;

public class BigTwo extends Deck{
  private Card[] cards;
  public BigTwo(Card[] card){
    
  }

  public static boolean isFourKind(Card[] cards) {
    return false;
  }

  public static boolean isStraight(Card[] cards) {
    return false;
  }

  public static boolean isFullHouse(Card[] cards) {
    return false;
  }

  public static boolean isRoyalFlush(Card[] cards) {
    return false;
  }
  

  public static void main(String[] args) {
    // Problem 1: How to design/handle the 2 Joker Card in the classes? (parent
    // class/ interface)
    Deck deck = new Deck();

    System.out.println(Arrays.toString(deck.getCards()));
    // Problem 2: 52? rank? Rank.TWO is the highest in Big Two.
    
  }
}