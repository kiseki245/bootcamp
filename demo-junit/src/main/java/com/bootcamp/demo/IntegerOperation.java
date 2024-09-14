package com.bootcamp.demo;

import java.util.LinkedList;
import java.util.List;

public class IntegerOperation {
  private List<Integer> integers;

  
  public IntegerOperation(){
    this.integers = new LinkedList<>();
  }
  public void add(int value){
    this.integers.add(value);
  }
  
  public int sum(){
  int total = 0;

  for (Integer integer : this.integers){
    total += integer;
  }
  return total;
}
}
