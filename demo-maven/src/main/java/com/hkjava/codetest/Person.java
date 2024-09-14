package com.hkjava.codetest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @Getter
// @Setter
// @AllArgsConstructor
// @NoArgsConstructor
// @ToString
// @EqualsAndHashCode
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
  private String name;
  private int age;

  public static void main(String[] args) {
    Person p1 = new Person(); // No arg constructor
    p1.setAge(100);
    p1.setName("John");
    System.out.println(p1.getAge());
    System.out.println(p1.getName());
    System.out.println(p1); // toString

    Person p2 = new Person("Peter", 10);
    p2.setAge(60);
    System.out.println(p2);
  }
}
