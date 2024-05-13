public class DemoPrimitives {
  public static void main(String[] args){
    // Numbers / String (Text)
    // number(Intergers / decimal)
    int x = 3; //int is a data type that declaring the type of value of x can be stored.
    // int cannot == decimal e.g: 1.6 , 3.14 etc.
    int z = -9; 
    int total = x + z; 
    System.out.println(total);

    int a = 7;
    int b = 2;
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b); //get the remainder

    System.out.println(a+b-(a*b)); // -5
    System.out.println(a+b-a*b);  // -5, () is same result

    int remainder = 10 % 3; //1
    int divide = 10 / 3; //3
    
    //2024.05.10
    System.out.println("2024.05.10");
    double d1 = 10.2;
    double d2 = 10.34567;
    double d3 = -110.999;

    double result = d1 + d2 - d3;
    System.out.println("Result = " + result);
    double result2 = 0.1 + 0.2; //double > +,-*/ will have issue in some scaniro
    System.out.println("Result 2 = " + result2);
    double result3 = 2 + 4 * 0.25 * 3 / 2 - 10;
    System.out.println("Result 3 = " + result3);

    int f1 = 7;
    double f2 = 0.8;
    // int f3 = f1 + f2 will have error, because int + double -> double + double =-> double (15.8)
    // so double value can be stored in an int variable
    //先睇加手邊value 所以f2 double f1 都會變double 
    int g = 10 / 3; // int / int -> int -> 3, so 3 can be assigned to variable g
    //Primitives char
    char c1 = 'i'; // single quote
    char c2 = ' '; 
    //char c3 = ''; char variable must contain a single charactor
    //char c4 = 'aa'; Single charactor only, double charactor is not allowed

    // Primitive: boolean -> true / false
    boolean b2 = true;
    boolean b3 = false;
    //boolean b4 = 1; boolean cannot assign a string value or numbers
    
    // Primittives for Integer
    // int, long , bute, short
    byte b1 = 1;
    // bute can only store the integer with range of the value between -120 and 127
    byte b2 = -128;
    byte b3 = 127;
    //byte y4 = 128; compile error (Java can identify the syntax error)
    short s1 = -32768; // -32760 to -32767

    long l1 = 91234128734L; //i follow the value means specify this value is a long value

    // Premitives for decimal number
    // 1. 10.2 is double value
    // 2. You cannot assign a double value to float variable, because float is with lower lever of data type
    // 3. In conclude, you cannot assign higher lever of data value to a lower lever data type
    double d10 = 10.2;
    float f10 = 10.2f; // input a "f" follow the value to specify the variable to float

    // float f11 = 10.5f + 10.5; //float + double = double, cannot assign double to float.
    double d11 = 99.999d; // same as double d12 = 99.99
    //local Variable (within the main program, you can only declare the same variable once)
    double d12; // variable declaration
    d12 = 99.99; //value assignment
    
    double d13 = 14.3;
    d13 = 15.0; //re-assignment

    
    long l1 = 91234121123123L;
    long l2 = l1; // l1 has declared as Long and hence l2 no need declare again
    System.out.println("l2 is " + l1);

    //---------------------------------------------
    boolean b1;
    int a = 32;
    int b = 45;
    if (a < b){
      b1 = true;
      System.out.println(b1);
    } else {
      b1 = false;
      System.out.println(b1);
    }    

  }
}
