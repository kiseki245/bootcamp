package com.bootcamp.demo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.bootcamp.demo.Calculator.Calculator;

public class IntegerPocket {
  private List<Integer> integers;
  private IntegerOperation operation;
  private Calculator calculator;

  public IntegerPocket(IntegerOperation operation) {
    this.integers = new ArrayList<>();
    this.operation = operation;
  } 
  public IntegerPocket(Calculator calculator) {
    this.calculator = calculator;
  } 
  public void add(int integer){
    this.integers.add(integer);
    this.operation = new IntegerOperation();
  }
  public int sum(){
    return this.operation.sum();
  }

  //Spy - for Calculator
  public int compute(int x, int y){
    return this.calculator.sum(x, y) + this.calculator.subtract(x, y);
  }
  public static void main(String[] args) {

  }
}
