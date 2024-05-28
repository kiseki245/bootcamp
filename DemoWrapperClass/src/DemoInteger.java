public class DemoInteger {
    public static void main(String[] args) throws Exception {
    int x = 1;
    Integer x2 = 1;
    System.out.println(x);
    System.out.println(x2);

    x = x +3;
    x-= 10;

    x2 = x2 +3;
    x2 -= 10;
    System.out.println(x);

    //Integer is a wrapper class
    //Class has method
    short s = (short) 3;
    x2 += 60000;
    short s2 = x2.shortValue(); //overflow,  sunkuar to explicit conversion
    System.out.println(s2); //-5542

    double d1 = x2.doubleValue();
    System.out.println(d1); //59994.0

    //Comparsion
    Integer x3 = 4;
    Integer x4 = 8;
    Integer x5 = 8;
    boolean result = x4 > x3; // true (compare int value) Downgrade to int
    
    boolean result2 = x4.compareTo(x3) > 0; // compare Integer value
    //In wrapper class, use the method to compare the variable. The (> < >= != etc) is for int value
    //Wrapper class comparsion, compareTo()
    System.out.println(x4.compareTo(x3)); // 1
    System.out.println(x3.compareTo(x4)); // -1
    System.out.println(x4.compareTo(x5)); // 0 

    boolean result3 = x4.compareTo(x3) > 0; //true
    boolean result4 = x4.compareTo(x3) < 0; //false
    boolean result5 = x4.compareTo(x5) == 0; // true


    Float f1 = 10.0f; // 10.0f is a float value -> autobox -> Float value
    Float f2 = new Float(10.0f); // create Float object, storing a float valueno autobox
        long l2 = f2.longValue();
    }
}
