public class DemoSwitchExpression {

  public static enum Color{
    RED, BLUE, YELLOW;
  }
  public static void main(String[] args) {
    
    Color color = Color.RED;
    switch(color) {
      case RED:
      System.out.println("RED");
      break;
      case BLUE:
      System.out.println("BLUE");
      break;
    }
    // Switch expression
    // 1. Return soming
    // 2. check if all possible enum value is hardCode
    // 3. No break, because it is for return value
    String result = 
    switch(color) {
      case RED,BLUE -> "RED, BLUE, Best Match!"; //return soming, RED or BLUE 
      case YELLOW -> {
        int x = 3;
        if (x == 3){
          yield "Yellow";
        }else {
          yield "Gold";
        }
      } //yield,a java keyworld simlute to return
      
    };
    System.out.println(result);

    // yield
    //
  }
}
