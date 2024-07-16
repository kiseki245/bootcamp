public enum Suit {
    DIAMOND(1), //
    CLUB(2), //
    HEART(3), //
    SPADE(4), //
    BWJOKER(5),
    JOKER(6)
    ;

    private int value;

    private Suit(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }

    public boolean isHigherThan(Suit suit){
        return this.value > suit.getValue();
    }
}
