package Human;
public interface Walkble {
  // Interface
  //1. Ho instance variable
  //2. all methods are abstract implicitly
  //3. You can still declare "public static final" implicitly
  //4. A class can implements more than 1 interface
  //public static final int AGE = 3;
  //Constant
  int AGE = 3;

  //abstract void walk();
  void walk();
  //can be override
 default void run(){
  System.out.println("I m running");
 };


 static void swim(){
  System.out.println("Static I m swiming");
 }
}
