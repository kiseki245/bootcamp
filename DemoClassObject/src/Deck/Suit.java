package Deck;

public enum Suit {
  DIAOMAND(1),
  CLUB(2),
  HEART(3),
  SPADE(4);
  private int rank;
  
  private Suit(int rank){
    this.rank = rank;
  }
  public int getRank(){
    return this.rank;
  }

  public void setSuit(int rank){
    this.rank = rank;
  }

  public boolean isHigherThen(Suit suit){
      if(this.rank > suit.rank){
        return true;
      }
      return false;
    }

    
    public static void main(String[] args) {
      System.out.println(Suit.SPADE.isHigherThen(CLUB));
      Suit target = Suit.DIAOMAND;
      Suit current = Suit.CLUB;
      
      if (current.isHigherThen(target)){
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }

