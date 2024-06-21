import java.util.Scanner;

public class DemoObject {

  public static void main(String[] args) {
    //getClass()
    StringBuilder sb = new StringBuilder(); // java.langStringBuilder
    Scanner scanner = new Scanner(System.in); // java.util.Scanner

    Object object = new Object(); // Object is a super parent 
    object = "abc";
    object = Double.valueOf(13);
    object = new Cat();
    //All Classes extend Object.class. Inherit all methods from Object.class
    System.out.println(new Cat().toString()); // "I am cat"
    System.out.println(new Dog().toString()); // Dog@682a0b20 <- Object address

    //Object.hashcode
    Cat c1 = new Cat();
    Cat c2 = new Cat();
    System.out.println(c1.hashCode()); //generate an int value by object reference -> 1023892928
    System.out.println(c2.hashCode());

    String x1 = new String("abc");
    String x2 = new String("abc");
    System.out.println(x1 == x2); //false
    System.out.println(x1.hashCode()); //96354
    System.out.println(x2.hashCode()); //96354

    Minicat mc1 = new Minicat("Hi", "Red");
    System.out.println(mc1.hashCode());
    Minicat mc2 = new Minicat("Hi", "Red");
    System.out.println(mc2.hashCode());
  }

  
  
  // Java Ensure the Type Safty during compile time
  // public static Object sum (Object x, Object y) {
  //   return x + y; // "+" operatiors -> String, Integer, int Double, double , etc...
  // }

  public static int length(String x){
    return x.length();
  }

  //During complier time, Compiler cannot ensure the object in heap is a String object
  // public static int length(Object x){
  //   return x.length();
  // }
}
