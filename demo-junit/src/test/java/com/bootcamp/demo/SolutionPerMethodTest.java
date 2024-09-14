package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

// !!! In test code base, we define the test class based on "Testing Enviroment"
// This class "SolutionTest" is a testing enviroment
// x represents someing like enviroment. For example, success / fail counting, etc.
// !!! TestInstance "per method" by default
@TestInstance(TestInstance.Lifecycle.PER_METHOD) // That is default
public class SolutionPerMethodTest {
  private int x;
  
  @BeforeAll // Before all test cases
  static void initialCase(){
    System.out.println("Beofre all test case");
  }
  @AfterAll // Aftter all test casees
  static void finallyCase(){
    System.out.println("After all test case");
  }
  @BeforeEach
  void beforeEach(){
    System.out.println("Before each");
  }
  @AfterEach
  void AFterEach(){
    System.out.println("After each");
  }
  @Test
  void test(){
    this.x++;
    System.out.println("Instance test");
    assertEquals(1, this.x);
  }

  @Test
  void test2(){
    this.x++;
    System.out.println("Instance test 2");

    assertEquals(1, this.x);
  }

  // Junit Framework generate "Test code", something like below
  // !!! st1 is a Test Instance, while st2 is another Test Instance.
  // !!! So, it is a "Per method" Testing Enviroment
  public static void main(String[] args) {
    // SolutionPerClassTest.initialCase();
    SolutionPerMethodTest st1 = new SolutionPerMethodTest();
    st1.test();
    SolutionPerMethodTest st2 = new SolutionPerMethodTest();
    st2.test2();
    // SolutionPerClassTest.finallyCase();

  }
}
