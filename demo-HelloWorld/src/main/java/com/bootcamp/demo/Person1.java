package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Person1 {
  private String name;
  private int age;

  public static void main(String[] args) {
    Person1 p1 = new Person1(); // no arg constructor
    p1.setName("John");
    p1.setAge(24);
    System.out.println(p1.getAge());
    System.out.println(p1.getName());
    System.out.println(p1.toString());

    Person1 p2 = new Person1("Peter", 40);
    p2.setAge(60);
    System.out.println(p2.toString());
  }
}
