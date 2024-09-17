package Java8;

import java.util.LinkedList;
import java.util.List;

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
  
    
  }
}
