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
    StringBuilder s1 = new StringBuilder();
    System.out.println("--------------------------");
    s1.append("Hello");
    String str = " World";
    s1.append(str);
    System.out.println(s1.toString());
    System.out.println(s1.indexOf("d"));
    s1.replace(6, 11, "Eddie");
    System.out.println(s1.toString());

    s1.insert(6, "I, m ");
    System.out.println(s1.toString());
    StringBuilder s2 = new StringBuilder("HereIsTheLoser");
    s2.insert(6, "Not"); // 6 is T, result is HereIsNotTheLoser so it will insert before the index
    System.out.println(s2.toString());

    s2.replace(0, 4, "Eddie");
    System.out.println(s2.toString());

    s2.insert(5, " ");
    System.out.println(s2.toString());
    s2.delete(0, 6); // Will remove 0 to 5 (Before the 6)
    System.out.println(s2.toString());
    s2.setCharAt(0, '1'); //Will replace the char
    System.out.println(s2.toString());
    
  }
}
