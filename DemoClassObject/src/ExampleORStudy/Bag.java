package ExampleORStudy;

import java.util.Arrays;

public class Bag {
  private int[] integers;
  
  public Bag(){

  }

  public Bag(int[] integers){
    this.integers = integers;
  }
  public void setIntegers(int[] integers){
    this.integers = integers;
  }

  public int[] getIntegers(){
    return this.integers;
  }

  public String toString(){
    return "Bag (" + Arrays.toString(this.integers) + ")";
  }


  public static void main(String[] args) {
    
    int[] integers = new int[] {3, 1, 2};
    Bag b1 = new Bag(integers);
    System.out.println(b1.toString());
    int[] x = b1.getIntegers();
    b1.setIntegers(new int[]{5, 6, 7});
    
    // Bag(Integers=[100, -2, 6])    
    
    System.out.println(new Bag(new int[] {100, -2, 6}).toString()); // You will not find this object again, since there has no object reference
    
    String s = "ijk";
    s.charAt(0);
  }
  
}
