

public class Primitives {
  public static void main(String[] args) {
    long l1 = 10; // -> int 10


    //Overflow, Precision Loss in downcasting
    short s1 = 32767;
    System.out.println(s1+=10); // -32759

    short s2 = (short) 32767;
    System.out.println(s2);

    byte b1 = (byte) 130; //M<- need (byte) to indicate the variable
    System.out.println(b1); // overflow

    int x = 10;
    System.out.println(x += 5.3); // result is 15. Precision loes
    
    
// -32759

    
    System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
    System.out.println(Double.MIN_VALUE); // 4.9E-324

    System.out.println(Float.MAX_VALUE); //3.4028235E38
    System.out.println(Float.MIN_VALUE); //1.4E-45

    double d1 = 10.345d;
    double d2 = 1.789;
    float f1 = 3;
  }
  
}
