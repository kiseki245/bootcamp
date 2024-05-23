public class DemoPrimitives2 {
  public static void main(String[] args) {
    long l1 = 10; // 10 -> int value

    long l2 = 10L; // 10L -> long value, avoid to use small charactor 
  
  // Java: int -> long 
  long l4 = 64; // assign int value to long variable l4 (int -> long value, promotion logic)

  //int i1 = 4L; <- You cannot assign long value to int variable because long is a higher data type than int

    //byte -> short -> int -> long -> float -> double
    //char -> int (ascii) 
    double d1 = 1.0;
    double d2 = 11.0f;
    double d3 = 10L; 
    
    //byte b1 = 10; //OKm why? 10 int value -> bute, It should be exception
    // You can only explicitly assign a value that with a type higher than the data type
    // float f3 = 1.9d; < Not allowed but downgrade is ok for below statment
    float f3 = (float) 1.9d; // downcast (Overflow/ precision lost)

    short s1 = 128;
    byte b1 = (byte) s1; // Java dosen't know s1 is 120 during complie time
    System.out.println("b1 " + b1); //result is -128 -> overflow
    //overflow means 127 -> next number is -128 so if s1 = 129 than b1 = -127, s1 = 130 b1 = -126

    byte b3 = 127;
    short s2 = b3; // no risk

    double d4 = 10.9d;
    int i2 =  (int) d4;
    System.out.println(i2); // 10 -> precision loss
    
    char c1 = 'a'; // 97
    char c2 = 'A'; // 65
    if (c1 == c2) { // false, 97 != 65
      
    } 
    if (c1 > c2){ // true, 97 > 65
      System.out.println("c1 > c2 " + c2); //A String + char -> String
    }
      System.out.println("c1 > c2 " + (int) c2); //String + int -> String
    
    int c1IntValue = c1; // OK, char -> int (upcast, promotion)
    int charValue = 97;



    char c3 = (char) charValue; // (char) -> conversion
    System.out.println("c3 is " + c3);

  char c4 = '你';
  int i4 = c4;
  System.out.println((int) c4);
  System.out.println(i4);

  char charactor = 'a' + 1;
  System.out.println(charactor); //b
  
    char zero = '0';
    int asciiCode = zero;
    System.out.println(asciiCode); // 48

    //228
    int ic = 228;
    System.out.println((char)ic);
    char ci = 228;
    System.out.println(ci);
    System.out.println((char)228);

    short a = (byte) 128; // int -> byte -> short

    int x2 = 128;
    byte b5 = (byte) x2;
    short s3 = 128;

  }
}
  

