package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;


// !!! This is "Per Class" testing enviroment
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SolutionPerClassTest {
    private int x;
  
  @BeforeAll // Before all test cases
  void initialCase(){
    System.out.println("Beofre all test case");
  }
  @AfterAll // Aftter all test casees
  void finallyCase(){
    System.out.println("After all test case");

  }
    @BeforeEach
  void beforeEach(){
    System.out.println("Before each");
  }
  @AfterEach
  void afterEach(){
    System.out.println("After each");
  }
  
  @Test
  @Order(1)
  void test(){
    this.x++;
    System.out.println("x++, Current x is " + x);
    assertEquals(1, this.x);
  }

  @Test
  @Order(2)
  void test2(){
    this.x++;
    System.out.println("x++, Current x is " + x);
    assertEquals(2, this.x);
  }
  @Test
  @Order(3)
  void test3(){
    this.x++;
    System.out.println("x++, Current x is " + x);
    assertEquals(3, this.x);
  }
  @Test
  @Order(4)
  void test4(){
    this.x--;
    System.out.println("x--, Current x is " + x);
    assertEquals(2, this.x);
  }
  // S
  // Shadow code, for reference only
  public static void main(String[] args) {
    SolutionPerMethodTest st1 = new SolutionPerMethodTest();
    // st1.initialClase();
    // st1.test();
    // st1.test2();
    // st1.finallyCase();
  }
}
