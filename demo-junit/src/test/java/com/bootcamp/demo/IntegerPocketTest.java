package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bootcamp.demo.Calculator.Calculator;

@ExtendWith(MockitoExtension.class)
public class IntegerPocketTest {
  // !!! Inject a fake object (All instance without actual implomentaion)
  @Mock
  private IntegerOperation operation;
  private IntegerPocket integerPocket;
  // !!! Why do we need @Mock
  @Test
  void testSum(){
    // Assumption
    Mockito.when(this.operation.sum()).thenReturn(-1);
    // Test IntegerPocket sum()
    IntegerPocket integerPocket = new IntegerPocket(this.operation);
    integerPocket.add(3);
    integerPocket.add(10);
    integerPocket.add(2);
    int result = integerPocket.sum();
    assertEquals(2, result);
  }

  @Spy
  private Calculator calculator;
  
  @Test
  void testCalculator(){
    Mockito.when(this.calculator.sum(3, 2)).thenReturn(20);
    int result = this.integerPocket.compute(3, 2);
    assertEquals(24, result); 

  }

}
