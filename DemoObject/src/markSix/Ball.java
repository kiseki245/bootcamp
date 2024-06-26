package markSix;

import java.util.Arrays;

public class Ball {
  private int number;
  public Ball(int number){
    this.number = number;
  }



  public int getNumber(){
    return this.number;
  }

  @Override
  public String toString(){
    return " Number: " + this.number;
  }
  public static void main(String[] args) {
    byte b1 = 48; // Java (Special conversion: int -> byte, but without casting in downcast)

    int i1 = 48; 
    byte b2 = (byte) i1; //the type of i1 is int, so we have to esplicity covert the vaule
  
    int[] arr = new int[3];
    System.out.println(Arrays.toString(arr));
    int [] arr2 = new int[3];
    System.out.println(Arrays.toString(arr2));

    System.out.println(arr.equals(arr2)); //false

    System.out.println(Arrays.equals(arr, arr2)); // true
  

    Object ball = new Ball(40);
    //ball.getNumber(); since the ball is pointing to Object

    System.out.println(ball.getClass());// class
    Class<?> clazz = ball.getClass();
    System.out.println(clazz);
    System.out.println(ball instanceof Ball);
  }
}
