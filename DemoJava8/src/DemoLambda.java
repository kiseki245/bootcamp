import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.jar.Attributes.Name;

import javax.naming.LinkException;

public class DemoLambda {
  public static void main(String[] args) {
    Swimable s = new Swimable() {
      @Override
      public void swim(){
        System.out.println("I am swiming");
      }
    };
    s.swim();
    //Lambda expression
    // The reason that we can use "() -> implemention" is that interface contains one abstract only
    Swimable person = () -> System.out.println("(L)I am swiming");
    System.out.println(person.toString()); //DemoLambda$$Lambda$1/0x00000285c8000400@f6f4d33
    person.swim();
      //Another object
    person = () -> System.out.println("I am swiming !!!");
    System.out.println(person.toString()); //DemoLambda$$Lambda$2/0x00000285c8001800@3f99bd52

    person.swim();


    //Calculator
    Calculator sumcalculator = (a, b) -> a + b;
    System.out.println(sumcalculator.calculate(5, 100));
    Calculator substractcCalculator = (a, b) -> a - b;
    System.out.println(substractcCalculator.calculate(5, 100));
    Calculator muitlipycalculator = (a, b) -> a * b;
    System.out.println(muitlipycalculator.calculate(5, 100));

    // More than one line of implementations
    // Then you have to use "return" keyword within the implemention block


    Drivable father = x -> {
      if (x == 3) {
        return false;
      }
      return true;
    };
  System.out.println(father.drive(3));
  System.out.println(father.drive(4));

  // for

  List<String> strings = new LinkedList<>();

  strings.add("abc");
  strings.add("def");

  for (String str : strings) {
    System.out.println(str);
  }
  //Lambda expression

  strings.forEach(str -> System.out.println(str));
  strings.forEach(str -> {
    
    if (str.length() == 3){
      
      System.out.println("Huh");
      System.out.println(str);
    } else {
      System.out.println("Hello");
    }
  });
  //Function.class
  // public interface Function<T, R>
  Function<String, Integer> stringLength = str -> 3;
  Function<String, Integer> strLen = str -> str.length(); // Formula
  System.out.println(strLen.apply("Hello"));
  System.out.println(strLen.apply("T"));

  Function<String, Integer> strLen2 = new StringLength();
  System.out.println(strLen2.apply("Test"));

  Function<Customer, Integer> namelength = customer -> customer.getName().length();
  Function<Customer, String> greetlingMessage = customer ->{
    String message = "Hello!".concat(customer.getName());
    return message;
  };
  String message = greetlingMessage.apply(new Customer("John"));  
  System.out.println(message);
  
  BiFunction<String, String, Integer> nameLength2 = (name1, name2) -> name1.length() + name2.length();

  nameLength2.apply("Vincent", "Lau");
  System.out.println(nameLength2.apply("Vincent", "Lau")); //10

  System.out.println(DemoLambda.getNameLength("message", "message"));

  //Consummer
  // public interface Consumer<T> 
  // void accept(T t);

  Consumer<Customer> printCustomerName = customer -> System.out.print(customer.getName());
  printCustomerName.accept(new Customer("Jenny"));
  printCustomerName.accept(new Customer("a"));
  //BiCustomer
  // void accept(T t, U u);
  int range = 0;
  BiConsumer<Customer, Integer> LuckyDraw = (customer, Number) -> System.out.println(customer.getName() + " LuckyDraw is :" + Number);
  LuckyDraw.accept(new Customer("Eddie"), 2);
  LuckyDraw.accept(new Customer("Edy"), 1);

  //Supply
  // public interface Supplier<T> {
  // T get();
  Math.random();
  Supplier<Integer> randomNumber = () -> new Random().nextInt(10);  
 System.out.println(randomNumber.get());
  int ball = -1;
 List<Integer> marksix = new LinkedList<>();
  while(marksix.size() < 6){
    ball = randomNumber.get();
    if (marksix.contains(ball)){
      continue;
    } else {
      marksix.add(ball);
    }
  }
  System.out.println(marksix);

  //Predicate
  //test
  Predicate<Customer> isNameTooLong = customer -> customer.getName().length() > 4;
  System.out.println(isNameTooLong.test(new Customer("Hi")));
  System.out.println(isNameTooLong.test(new Customer("Tester")));

  BiPredicate<String, String> isTooLong = (firstName, lastName) -> firstName.length() + lastName.length() > 9;
  System.out.println(isTooLong.test("First", "Last"));



  //Unary
  //UnaryOperator<String> = Function<String, String>
    UnaryOperator<String> nameFormula = str -> str + "!!!";
    System.out.println(nameFormula.apply("Test"));
  //BinaryOperator<String>
  BinaryOperator<String> nameFormula2 = (s1, s2) -> s1 + s2;
  System.out.println(nameFormula2.apply("Hello ", "New World!"));


  } 

// /nameLength
public static int getNameLength(String firstname, String lastname){
  return firstname.length() + lastname.length();
}
}
