package com.hkjava.codetest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//!! Child Class should not use @Data 
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor

public class Employee extends Person{
  private int salary;

  public Employee (String name, int age, int salary){
    super(name, age);
    this.salary = salary;
  }
  
  public static void main(String[] args) {
    Employee e1 = new Employee(10000);
    Employee e2 = new Employee("Peter", 11, 20000);
    Employee e3 = new Employee("Peter", 11, 20000);

    System.out.println(e3);
    System.out.println(e2.equals(e3));
    System.out.println(e2.equals(e1));

    System.out.println("Hello");
  }
}
