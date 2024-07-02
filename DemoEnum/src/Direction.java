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
    if (direction.getNum() % 2 == 0){
      return true;
    }
  }
  public static void main(String[] args) {
    
  }
}
