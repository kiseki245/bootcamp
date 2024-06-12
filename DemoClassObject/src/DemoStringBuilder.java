public class DemoStringBuilder {
  public static void main(String[] args) {
    
    String x = "hello"; //String is slow performance,
    // StringBuilder ab = "Hello"; String and StringBuilder is different object
    StringBuilder sb = new StringBuilder("hello"); // "new StringBuilder()" -? constructor
    Cat cat = new Cat();

    x += "world";

    sb.append(" world");
    System.out.println(sb.toString());
    //StringBuilder performance is faster than String
    sb.replace(1, 2, "xx"); // return self object
    System.out.println(sb.toString());
    sb.setCharAt(4, 'A');
    System.out.println(sb.toString());
  
    sb.reverse();
    System.out.println(sb.toString()); //dlrow oAlxxh

    //insert
    // deleteCharAt

    
  }
}
