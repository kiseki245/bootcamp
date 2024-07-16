public enum Direction {
  EAST(1), NORTH(2), WEST(-1), SORTH(-2);
  private int num;

  private Direction(int num){
    this.num = num;
  }
  //Advantage: Able to present some relationship among the enum objects
  public int getNum(){
    return num;
  }
  public boolean isOppsite(Direction direction){
    // for (Direction d : Direction.values()) {
    //   if (d.getNum() == direction.getNum() * -1){
    //     return true;
    //   }
    // }
    // return false;

    return this.getNum() == direction.getNum() * -1;
  }

  public static boolean isOppsite(Direction direction1, Direction direction2){
    return direction1.getNum() == direction2.getNum() * -1;

  }

  public Direction oppsite(){
    for (Direction d : Direction.values()) {
      if (this.getNum() == 0 - d.getNum())
      return d;
    }
    return null;
  }

  public static Direction oppsite(Direction direction){
    for (Direction d : Direction.values()) {
      if (direction.getNum() == 0 - d.getNum())
      return d;
    }
    return null;
  }
  public static void main(String[] args) {
    System.out.println(Direction.EAST.isOppsite(WEST));
    System.out.println(Direction.EAST.isOppsite(SORTH));
    System.out.println(Direction.EAST.isOppsite(NORTH));


    System.out.println(Direction.isOppsite(EAST, WEST));

    System.out.println(Direction.WEST.oppsite()); //Instance method check
    System.out.println(Direction.oppsite(SORTH)); // Static metgod check

    
  }
}
