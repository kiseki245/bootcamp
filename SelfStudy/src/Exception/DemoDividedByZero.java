package Exception;

public class DemoDividedByZero {
  
  public static int divide(int x, int y){
    return x / y;
  }
  // Approach 1



  public static int getEmployeeCount() {
    return 0;
  }

  public static int getDepartmentExpense(){
    return 140000;
  }
  public static int CalculateExpensePerEmpolyee2() {
    return getDepartmentExpense() / getEmployeeCount();
  }

  public static void main(String[] args) {
    int amount = 0;
    System.out.println(10 / 3);

    //Approach 2: Handle Exception
    // Unchecked Exception (Runtime Exception) - Implicitly
    try {
      divide(10, 2);
      String s = "Hello";
      System.out.println(s.charAt(6));
    } catch (ArithmeticException e){
      System.out.println("Hello! Divided by Zero:" + 10 + " / " + amount);
    } catch (NullPointerException e){
      System.out.println("null found!");
    } catch (StringIndexOutOfBoundsException e){
       System.out.println("String index out of bound"); 
    }
    
    try {
      double averageExpense = CalculateExpensePerEmpolyee2();

    } catch (ArithmeticException e){
      System.out.println("Error for CalculateExpensePerEmpolyee2");
    }
  }
}
