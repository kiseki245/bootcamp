package Java8;

import java.util.Optional;

public class JavaOptional {
  public static void main(String[] args) {
    
  
  Integer i1 = null;
  Integer i2 = 20;
  Optional<Integer> a = Optional.ofNullable(i1);
  Optional<Integer> b = Optional.ofNullable(i2);

    // ifNullable means that allow the value be null
  System.out.println("Is a exist: " + a.isPresent()); // false
  System.out.println("Is b exist" + b.isPresent()); // true since i1 is not null
  Integer c = i1;
  Integer d = i2;
  try {
    Integer sum = c+ d;
  } catch (NullPointerException e) {
    System.out.println("NPE!");
  }
  Optional<Integer> e = Optional.of(20);
  Optional<Integer> f = Optional.ofNullable(i1);
  int sum2 = e.orElse(1) + f.orElse(1);
  System.out.println("Sum2 = " + sum2); // Somce e = 20, f = i1 (null), e orElse = 20, f orElse = 1

  String str1 = null;
  String str2 = "World";
  // Optional<String> ostr1 = Optional.of(str1); .of means value should not be null but will trigger npe also
  Optional<String> ostr1 = Optional.ofNullable(str1);
  Optional<String> ostr2 = Optional.ofNullable(str2);

  System.out.println(ostr1.orElse("Hello ") + str2);
  }
}
