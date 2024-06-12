public class DemoInteger { //Tutor class name: DemoIntenalCache
  public static void main(String[] args) {
    
    Integer i1 = Integer.valueOf(3);
    Integer i2 =3; // 3 int value -> autobox -> Integer object (heap memory)

    i1 = 127; // i1 (Object reference), 127 -> (12t) create Integer Object
    i2 = 127; // i2 (Object reference), 127 -> (2nd) reuse the original Integer Object
    //Rule: from -128 to 127 -> reuse the original object
    System.out.println(i1 == i2); //true (are they same object)

    Integer i3 = 128; //128 -> 1st create Integer Object
    Integer i4 = 128; //128 -> 2nd create Integer Object
    // Over 127, 2nd object didn't reuse the 1st one
    System.out.println(i3 == i4); //false (Are that same object)

    //Important !!!!
    //For Class, you should always compare their object value by METHOD

    System.out.println(i3.compareTo(i4)); // 0

    //Useless to use the >= for the object

    Float f1 = 10.12345f; //autobox: float value -> Float Object
    Float f2 = 10.12345f;

    System.out.println(f1 == f2); //false

    Double d1 = 128.12345d; // same as last case, autobox is perfored 
    Double d2 = 128.12345d;
    System.out.println(d1 == d2); //false
    //Boolean support Internal cahe (-128 to 127)
    Boolean b1 = true;
    Boolean b2 = true;

    System.out.println(b1 == b2); // true
    //Charactor support Internal cache (-128 to 127)
    Character c1 = 'c'; // autobox char value -> Charactor Object
    Character c2 = 'c';

    System.out.println(c1 == c2); //true

    Character c3 = '我';
    Character c4 = '我'; 
    System.out.println(c3 == c4); //false
    

  } 
}
