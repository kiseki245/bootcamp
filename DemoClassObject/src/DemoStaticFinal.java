

public class DemoStaticFinal {
  //camelcase
  private int age; //Instance variables
  private static String name; // static variable 
  private final double salary; //Finalized instance variable

  //Constant // snakecase
  //logsString // camelcase
  private static final String LOGO_STRING; //Static variable , finalized
  private static final double PI = Math.PI; // Meth.PI -> static final double PI
// final is a java keyword. Compiler would check all final variable has been initialzed

static {
  LOGO_STRING = "default"; // Can initialze at Static Block because it is triggered before main method
}
{
  salary = 1000;
}


public int getAge(){
  return this.age;
}

public double getSalary(){
  return this.salary;
}
public String test(){ // Instance method can access both instance and static variable
  return this.age + " " + name + " " + this.salary + " " + this.LOGO_STRING;
}
public static String getName(){
  return name;
}

public static String getLOGO(){
  return LOGO_STRING;
}

public static void main(String[] args) {
  // LOGO_STRING = "default" <- Cannot initialzed at here, is too late to assign the "constant" to the static final variable
  DemoStaticFinal dif = new DemoStaticFinal();
  dif.age = 10;
  DemoStaticFinal dif2 = new DemoStaticFinal();
  dif.age = 20;

  // dif.salary = 1000; <- Compile error, salary is a final variable
  System.out.println(dif.salary); // 0.0;
  
  System.out.println(DemoStaticFinal.LOGO_STRING); // detault
  // DemoStaticFinal.LOGO = "NAME"; <- not allowed

  DemoStaticFinal.name = "Edy";
  }
}
