public class DemoLiteralPool {
  public static void main(String[] args) {
    
    // Literal Pool (String)

    String s1 = "Hello";
    String s2 = "Hello";
    System.out.println(s1 == s2);// true (== is check the object)

    String s3 = "Hello";
    String s4 = new String ("Hello");
    System.out.println(s3 == s4); // false
    System.out.println(s3 == s1 && s3 == s2); // true

    s3 = s4; // s3 point to s4 obj value in heap memory
    System.out.println(s3 == s4); //true, they are pointing to the same object

    String s5 = "He";
    String s6 = "llo";
    s5 = s5 + s6; // Hello

    System.out.println("s1 " + s1); //Hello
    System.out.println("s5 " + s5); //Hello

    System.out.println(s5 == s1); //false

    //mmutable 
    String s7 = "hello";
    System.out.println(System.identityHashCode(s7));
    s7 += " world";
    System.out.println(System.identityHashCode(s7));

    String s8 = "hello";
    System.out.println(System.identityHashCode(s8)); 
    s8.replace("e", "a"); //new
    System.out.println(System.identityHashCode(s8)); 
    //Same ideo aply most of the String method;
    //Try different String method like concan(), subString, touppercase()

    String s9 = "hi";
    System.out.println(System.identityHashCode(s9)); 
    s9 = s9.toUpperCase();
    System.out.println(System.identityHashCode(s9)); 

  }
}
