import java.math.BigDecimal;

public class StringDemo {
  public static void main(String[] args) {
    String s = "Hello";

    s.concat("World"); // concat() method return new String, no impact to s
    System.out.println(s); //hello

    String s2 = s.concat(" World");
    System.out.println(s2); //Hello World
    // s2 is an object reference, helping you to remain the way to find the object

    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World");// Return itself "this"
    System.out.println(sb); // Hellow World
    sb.append("!!!!!");
    System.out.println(sb);

    // As a devekioerm yiu have ti figure out the impact of each Class
    // BigDecimal 
    BigDecimal bd = BigDecimal.valueOf(3.3);
    BigDecimal bd2 = BigDecimal.valueOf(3.4);
    bd.add(bd2);
    System.out.println(bd); // Remains 3.3 
    bd = bd.add(bd2); // will be 6.7

    BigDecimal bd3 = bd.multiply(BigDecimal.valueOf(2.0));
    
  }
}
