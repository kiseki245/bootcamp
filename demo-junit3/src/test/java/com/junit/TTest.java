package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TTest {
  
  @Test
  void testSum(){
    assertEquals(5, App.sum(3, 2));
  }
}
