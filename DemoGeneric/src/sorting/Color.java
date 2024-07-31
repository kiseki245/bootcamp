package sorting;

public enum Color {
  
  RED(1), BLACK(2), WHITE(3);
  private int value;

  
  Color(int value){
    this.value = value;
  }
  public int getValue(){
    return this.value;
  }
}
