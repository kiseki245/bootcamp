package ExampleORStudy;

import java.math.BigDecimal;

public class Calculator {
  private int x;
  private int y;
  // static method -> instance method
  public static int sum(int x, int y){
    Calculator c1 = new Calculator();
    
    System.out.println(x + y);

    return x + y;
  }
  public static double sum(double x, double y){
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

  public int sum(){ //Instance method -> same as getter
    return this.x + this.y;
  }
  public int mulitply(){ //Instance method -> same as getter
    return this.x * this.y;
  }

  public static void test(String[] args){
      for (int i = 0; i < args.length; i++) {
        System.out.println(args[i]);
      }
  }

  public static void test2(String... args){ //String... -> String[] they are same type
    for(String s : args){
      System.out.println(s);
    }
  }

  public static void main(String[] args) {
    //static method{
    sum(1, 3);
    Calculator.sum(2, 3);
    //}
    
    Calculator c1 = new Calculator();
    c1.setX(2);
    c1.setY(3);
    System.out.println(c1.sum());
    c1.mulitply();

    //Method Overloading

    sum(1,2); // Because you are passing int value, so "overloading" determine

    sum(1.0f, 2.0f); // 1.0f -> float value, 2.0f -> float value
    //Will call double method upcast promption 

    //String.valueOf() -> Overloading
    String.valueOf(10L); //"10"
    System.out.println(String.valueOf(new char[] {'a', 'b', 'c'}));
    Calculator.test(new String[] {"fff", "def"});
    Calculator.test2("abc", "fgo");
  }
}
