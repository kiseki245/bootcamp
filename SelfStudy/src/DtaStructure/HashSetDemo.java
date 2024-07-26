package DtaStructure;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

  public static void main(String[] args) {
    
  
  Set<String> str = new HashSet<>();
  str.add("Hello");
  str.add("Eddie");
  str.add("We");
  str.add("a here");

  System.out.println(str); // Order is not determind by insertion order
  
  // add duplicated string value
  String newstr = "New";
  boolean hs = str.add("We");
  boolean hs2 = str.add(newstr);

  System.out.println(hs);
  System.out.println(hs2);

  Set<String> str2 = new HashSet<>();
  str2.addAll(str);

  System.out.println(str2);

  
  }
}
