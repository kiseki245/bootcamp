package Deck;

import java.util.Random;

public class shuffleManager {
  //attribute Dependency
  private Card[] cards;

  private shuffleManager(Card[] cards){
    this.cards = cards;
  }

  //Behavior
  public void shuffle(){
    int idx = new Random().nextInt(length); // 0-51;
    Card[] randomcards = new Card[Deck.length];
    int count = 0;
    for (int i = 0; i < length; i++) {
      cards[count++] = this.cards[i];
      
    }
    for (int i = 0; i < idx; i++) {
      cards[count++] = this.cards[i]
    }
    this.cards = randomcards;
  
  }
}
