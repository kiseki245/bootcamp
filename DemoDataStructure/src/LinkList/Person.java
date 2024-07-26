package LinkList;

import java.util.ArrayList;
import java.util.List;

public class Person {
  private String name;


  public static void main(String[] args) {
    List<Person> persons = new ArrayList<>();
    long before = System.currentTimeMillis();

    for (int i = 0; i < 1_000_000; i++) {
      persons.add(new Person());
    }

    long after = System.currentTimeMillis();
    System.out.println(after - before); // time

    
  }
}
