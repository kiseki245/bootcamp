public class DemoDividedByZero {
    public static void main(String[] args) throws Exception {
        int amount = 0;

        System.out.println(divide(10, 3));
        
        // System.out.println(divide(10, amount));
        //java.lang.ArithmeticException: / by zero

        // Approach 1L Handle Exception
        if (amount != 0){
            System.out.println(divide(10, amount));
        } else {
            System.out.println(0);
        }
        //Approach 2:
        // Unchecked Exception (Runtime Exception)
        try {
            divide(10, 2);
            //.......
                String s = "Hello";
                s = null;
                System.out.println(s.charAt(2)); //nullPointerException
        
        } catch (ArithmeticException e){
            // send email to temate
            // insert to database
            System.out.println("Alert!! " + 10 + "/" + amount);
        } catch (NullPointerException e){
            System.out.println("NPE!");
        }

        double expense = CalculateExpensePerEmpolyee();
        System.out.println("Expense = " + expense);
        // main -> CalculateExpensePerEmpolyee() -> getDepartmentExpense() && getEmployeeCount()
    }


    // return int
    //throw ArithmeticException (Implicitly)
    public static double divide(int x, int y){
        return x / y;
    }
    //Approach 1
    public static int CalculateExpensePerEmpolyee(){
    try{
        return getDepartmentExpense() / getEmployeeCount(); //bug
    } catch (ArithmeticException e){
        return getEmployeeCount();
    }
}
//When a method throw unchected exception without handling, the exception will be thrown back to caller 
public static int CalculateExpensePerEmpolyee2(){
        return getDepartmentExpense() / getEmployeeCount();
}
//Approach 3
public static int CalculateExpensePerEmpolyee3(){
    try {
    return getDepartmentExpense() / getEmployeeCount();
    } catch (ArithmeticException e){
        throw new EmployeeCountZeroException();
    }
}
    public static int getEmployeeCount(){
        return 0;
    }

    public static int getDepartmentExpense(){
        return 14000;
    }
}
