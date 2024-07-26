package Clazz;

import java.util.Objects;

public class Superman extends Person implements Flyable, Powerup{
  public Superman(){
    //super(); Implicitly calling Person()
  }
  public Superman(String name){
    super(name); //Call person class constractor

  }
  @Override
  public void fly(){
    System.out.println("Fly");
  }
  @Override
  public void PowerUp(){
    System.out.println("PowerUp");
  }
  public boolean equals(Object obj){
    if (this == obj){
      return true;
    }
    if (!(obj instanceof Superman)){
      return false;
    }
    Superman sm = (Superman) obj;
    return Objects.equals(super.getName(), sm.getName());
  }
  @Override
  public int hashCode(){
    return Objects.hash(super.getName());
  }
  public static void main(String[] args) {
    //Inheritance only for instance method, attribute
    // Do not inherit constractor
    Superman sm = new Superman(); // No name attribute in

    // Polymorphims

    Person p1 = new Superman("Vincent");
    // p1.fly; Since the p1 is declared by Personm which can call the instance method from Person class only
    p1.eat();
    sm.fly();

    Superman s1 = (Superman) p1; // Person -> Child (Downcast)
    // p1 can be an OBject created by other class and this class extending Person.class as well
    s1.fly();

    Superman s2;
    if (p1 instanceof Superman){
      s2 = (Superman) p1;
    }
    //equals
    Superman s3 = new Superman("Vincent");
    System.out.println(s1.equals(s3));
    
    Powerup superman = new Superman("Sally"); //What is the point to use interface as object reference
    superman.PowerUp();
    
  } 
}
