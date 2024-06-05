package ExampleORStudy;

public class Calculator {
  private int x;
  private int y;
  // static method -> instance method
  public static int sum(int x, int y){
    Calculator c1 = new Calculator();
    x = c1.getX();
    y = c1.getY();
    
    System.out.println(x + y);
    return x + y;
  }

  public void setX(int x){
    this.x = x;
  }
  public void setY(int y){
    this.y = y;
  }
  public int getX(){ //getter
    return this.x;
  }

  public int getY(){ //getter
    return this.x;
  }
  public static void main(String[] args) {

    Calculator c1 = new Calculator();
    c1.setX(2);
    c1.setY(3);
    c1.sum();
    // System.out.println(c1.mulitply());
  }
}
