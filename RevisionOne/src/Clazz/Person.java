package Clazz;

public class Person {
  private String name; //If you use pubic here, it implies the value can be read and replaced by others
  
//Constant
public static final double PI = Math.PI;

  public String getName(){
    return this.name;
  }

  //By defaule a class implicitly contain empty constructor 

  public Person(){
    
  }
  public void eat(){
    System.out.println("Eatting");
  }
  public Person(String name){
    this.name = name;
  }
public static void main(String[] args) {
  
}
  
}
