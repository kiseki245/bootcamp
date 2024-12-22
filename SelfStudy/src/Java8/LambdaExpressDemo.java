package Java8;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaExpressDemo {
  public static void main(String[] args) {
  System.out.println("Hello");
    
  TwoNumber sumNumber = (x, y) -> x + y;
    System.out.println(sumNumber.combine(5, 10));

    TwoNumber mutiplyNumber = (x, y) -> x * y;
    System.out.println(mutiplyNumber.combine(2, 3));
    
    List<Toy> toylist = new LinkedList<>();
    toylist.add(new Toy("Gundam", 128));
    toylist.add(new Toy("TR1", 224));
    toylist.add(new Toy("Megaman", 559));
  
    Function<String, Integer> lengthOfName = name -> name.length();

    System.out.println("Function");
    for (Toy toyname : toylist) {
      System.out.println("Toy name: " + toyname.getName()+ "\nLength of Name: " + lengthOfName.apply(toyname.getName()));
    };
    
    BiFunction<Double, Double, Double> bisumNum = (x, y) -> x + y;
    Toy bitoy1 = new Toy("Doll", 159);
    // System.out.println(Double.valueOf(bitoy1));
    Double discount = 0.8;
    Double finalPrice = bisumNum.apply(Double.valueOf(bitoy1.getPrice()), discount);
    System.out.println("Final price" + finalPrice);
    System.out.println("Final price 2:" + bisumNum.apply(Double.valueOf(bitoy1.getPrice()), discount));

    BiFunction<String, Integer, Toy> createToy = Toy::new;
    Toy myToy = createToy.apply("TR2", Integer.valueOf(1599));
    System.out.println(myToy);

    // Consummer
        // public interface Consumer<T> {
    // void accept(T t);

    Consumer<Toy> printToyName = t -> System.out.println(t.getName());
    printToyName.accept(bitoy1);

    BiConsumer<Integer, Integer> calculate = null;
    MathOperation op = MathOperation.SUBTRACT;
    
    switch (op) {
      case SUM:
        calculate = (num1, num2) -> System.out.println(num1 + num2);
        break;
      case SUBTRACT:
      calculate = (num1, num2) -> System.out.println(num1 - num2);
        break;
    }
    calculate.accept(10, 5);
    List<Toy> toylist2 = new LinkedList<>();
    toylist2.add(new Toy("MetalBuild", 2500));
    toylist2.add(new Toy("HG", 224));
    toylist2.add(new Toy("MGEX", 1599));
    toylist2.add(new Toy("SHF", 599));
    Predicate<Toy> isExpensive = t -> t.getPrice() > 1000;
    for (Toy toyprice : toylist2) {
     System.out.println(isExpensive.test(toyprice));
    }

    BiPredicate<String, Integer> isLengthEquals = (name, number) ->
    name.length() == number;

    System.out.println(isLengthEquals.test("Eddie", 5)); //true
    System.out.println(isLengthEquals.test("Eddie", 6)); //false

    // Supplier
    
  }
}
