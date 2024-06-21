package ExampleORStudy;

public class DemoBlock {

  private static int number;
  private String name;

  static {
    // static block
    // 1. Triggered once only, no matter the number of static variable(s)
    // 2. 
    System.out.println("Start Black");
    number = 3;
    System.out.println("End Block");
  }

  { //Instance block // It is triggered when there is new object created
    // It is called before constructor
    //Usage comon logic between contructors
    System.out.println("Start instance block");
    this.name = "John";
    System.out.println("End instance block");
    number = 10;
  }

  
  public DemoBlock(){
    System.out.println("Calling empty constructor.");
  }
  public DemoBlock(String name){
    System.out.println("Calling all args constructor");
    this.name = name;
  }
  public static void main(String[] args) {
    System.out.println("Start");
    System.out.println(DemoBlock.number); // Calling the static method
    
    // DemoBlock db = new DemoBlock(); <- If no object, instance block will not be called
    DemoBlock db1 = new DemoBlock();
    DemoBlock db2 = new DemoBlock("Hi");
    DemoBlock db3 = new DemoBlock();
    System.out.println(DemoBlock.number); //10
    System.out.println(db2.name);
    System.out.println("End");


    
  }
}
