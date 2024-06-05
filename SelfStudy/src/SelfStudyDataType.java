public class SelfStudyDataType{
  public static void main(String[] args) {

  
    System.out.println("-----------Lark challenge-----------------");

    int x = 3;
    int y = (x++ + 3) * x++;
    
    //(4 + 3) * x++ <- x++ = 3 + 1
    //7 * 4 = 28
    
    System.out.println("y = " + y);
    // Actual result = 24
    // (x++ + 3) -> 3 didn't added 1
    // (3 + 3) * 4 <- Actual calculation
    // 
    System.out.println("-----------Online exercise-----------------");
    
    System.out.println("-----------Exercise 1-----------------");
    // https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-1.php
    double f = 212;
    double c = 212;
    double FtoC = (9*c+(32*5))/5;
    double CtoF = (5*(f-32))/9;
    System.out.println("F to C =" + FtoC);
    System.out.println("C to F =" + CtoF);
    
    System.out.println("-----------Exercise 2-----------------");
    //https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-2.php
    double inch = 2;
    double meter = 0.0254;
    double result;
    result = inch * meter;
    
    System.out.println(inch + " = " + result + " meter");
    
    System.out.println("-----------Exercise 3-----------------");
    //https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-4.php
    int minutes = 3456789;
    int hours = minutes / 60;
    //System.out.println(hours);
    int days = hours / 24;
    //System.out.println(days);
    int year = days / 365;
    //System.out.println(year);
    int remaindays = days - (year * 365);
    //System.out.println(remaindays);
    System.out.println(minutes + " = " + year + " year and " + remaindays + " days");
    


  }
}