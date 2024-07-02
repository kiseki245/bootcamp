package Animals;
public class DemoOverriding { // dynamic polymerphism (run-class)

  public static void main(String[] args){
    //Example 1
    Animals animals = new Cat(); // Cat() object but pointing to Class Animals()
    animals.walk(); //Complie time checks the scope of the object, but not the implemention
    // animals.run(); // complie error, because Animanls class have walk() ONLY
  // During runtimes, the new cat object is created in heap memory,
  // then object ref "animal" will point cat object and execute walk() method.
  
    //Example 2
    Animals animals2 = new Animals();
    animals2.walk();

    //Example 3
    animals = new Dog();
    // animals.sleep(); Complie-error, because the object reference type determind the scope of the object
    // object animals still pointing to Animals class

    animals.walk(); // Animal is walking
    // because Dog.class does not override the walk() method

    System.out.println(animals.getClass());
  }
  
}
