package Exception;

public class DemoDividedByZero {
  
  public static int divide(int x, int y){
    return x / y;
  }

  public static int getEmployeeCount() {
    return 0;
  }

  public static int getDepartmentExpense(){
    return 140000;
  }
  //Approach 1
  public static int CalculateExpensePerEmpolyee(){
    try {
      System.out.println("Approach 1 method triggered");
      return getDepartmentExpense() / getEmployeeCount();
    } catch (ArithmeticException e){
      System.out.println("Error catched by Approached 1");
      return getDepartmentExpense();
    }
  }
  //Approach 2
  public static int CalculateExpensePerEmpolyee2() {
    return getDepartmentExpense() / getEmployeeCount();
  }

  public static int CalculateExpensePerEmpolyee3(){
    try {
      return getDepartmentExpense() / getEmployeeCount();
    } catch (ArithmeticException e){
      throw new EmployeeCountZeroException("Apprach 3 trrigered");
      }
    }

  public static void main(String[] args) {
    int amount = 0;
    System.out.println(10 / 3);

    //Approach 2: Handle Exception
    // Unchecked Exception (Runtime Exception) - Implicitly
    try {
      divide(10, 0);
      String s = "Hello";
      System.out.println(s.charAt(6));
    } catch (ArithmeticException e){
      System.out.println("Hello! Divided by Zero:" + 10 + " / " + amount);
    } catch (NullPointerException e){
      System.out.println("null found!");
    } catch (StringIndexOutOfBoundsException e){
       System.out.println("String index out of bound"); 
    }
    System.out.println("Approach 1");
    System.out.println(CalculateExpensePerEmpolyee());

    System.out.println("Approach 2:");
    try {
      double averageExpense = CalculateExpensePerEmpolyee2();

    } catch (ArithmeticException e){
      System.out.println("Error for CalculateExpensePerEmpolyee2");
    }
    System.out.println("Approach 3");
    System.out.println(CalculateExpensePerEmpolyee3());

  
  }
}
