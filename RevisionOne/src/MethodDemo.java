import java.lang.reflect.Method;

public class MethodDemo {
private String firstName;

public MethodDemo(){

}
public MethodDemo(String firstName){
  this.firstName = firstName;
}

  public static void main(String[] args) {
    int x = sum(1, 2);
    Integer x2 = sum(1, 2); //sum() method return int value -> autobox -> Integer Object
    long l = sum(1, 2); // upcastm int value -> long value
    // Long l2 = sum(1, 2); int value -> long value -> Long Object (autobox)
    // Compiler world not do upcast and autobox at the same statement
    
    //Call static method
    MethodDemo.sum(2, 3); //5

    //No point to make sum2() because an instance method
    MethodDemo md = new MethodDemo();
    md.sum2(2,3); // return 5

    MethodDemo md2 = new MethodDemo("John");
    String john = md2.fullName("Wong");
    System.out.println(john);
    System.out.println(md2.fullName("Hi"));
  }
  

  public static int sum(int x, int y){
    return x + y;
  }
  //sum2 didn't use instance method to produce the return value 
  public int sum2(int x, int y){
    return x + y;
  }

  public String fullName(String lastname){
    return this.firstName + " " + lastname;
  }
}
