package com.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
  private List<Integer> integers;
  

  public Calculator(){
    this.integers = new ArrayList<>();
  }

  public Calculator(List<Integer> integers){
    this.integers = integers;

  }
  public int sum(){
    // mapToInt() -> InStream -> sum()

    return this.integers.stream().mapToInt(e -> e.intValue()).sum();

  }
}
