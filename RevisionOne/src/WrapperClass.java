public class WrapperClass {
  public static void main(String[] args) {
    
  
  //The relationship between Object and Primitive
  int x = 10;
  Integer x2 = x; // Upcast
  int x3 = x2; // Downcast


  Character c = 'c'; // char value -> Charactor Object (Auto-box)
  // c -> object reference
  // 'c' autobox -> new Charactor Object

  Boolean b = null; 
  b = true; // autobox -> (primitive boolean -> Boolean Object)
  b = false;
  b = Boolean.valueOf(true);
  b = Boolean.valueOf(null);
  b = new Boolean(false);


  //Stack & Heap
  Integer i1 = 128;
  Integer i2 = 128;
  System.out.println(i1 == i2); // false

  Integer i3 = 127;
  Integer i4 = 127;
  System.out.println(i3 == i4); //true

  String s2 = "abc";
  String s3 = "abc";
  System.out.println(s2 == s3); //true
  String s5 = String.valueOf("abc");
  }

}
