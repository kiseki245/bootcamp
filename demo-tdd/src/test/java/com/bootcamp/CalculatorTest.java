package com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
  
  // private Calculator calculator;

  @Test
  void testSum(){
   assertEquals(15, new Calculator(Arrays.asList(3, 10, 2)).sum());
  }
}
