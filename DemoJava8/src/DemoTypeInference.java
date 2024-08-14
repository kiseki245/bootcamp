import java.util.Arrays;
import java.util.List;

public class DemoTypeInference {

  public static void main(String[] args) {
    // declaration
    int x;

    //value assignment
    x = 3;
    var y= 3; // Compile time -> int y = 3; -> class file (Byte code)
    // y = "Hello" Not OK
    // y = 2.2; Not OK
    var z = "Hello";
    
    var k = new Customer("John");
    k = new Customer("Mary");
    System.out.println(k);

    List<Customer> customers = Arrays.asList(new Customer("Jenny"), 
    new Customer("Eddie"));
    for (var customer : customers){
      System.out.println(customer);
    }

    // NOT Support:
    var age; // compiler force the initialzation together with declarion



  }
  // Not support for the attribute
  public static class Example {
    private var name;
  }
  //NOT Support
  // Polymerphims -> method signature is determind during compile time
  public static int sum(var x, var y){ // Need define the tpye for the method
    return x + y;
  }

  public static var sum(int x , int y){
    return x + y;
  }
}
