public class Cat { // Class Name -> Name Convention -> describe the physical object
  // State
  // attributes
  private String name;
  private int age;
  

  //behavior / instance method


  // setAge() is a method that can be called by object only
  //
  //c1.setAge(13);
  //"this" -> the object pointed by c1 (object reference)
  public void setAge(int x){ // The x can state as age
    this.age = x;

  }

  public void setName(String name){
    this.name = name;
  }

  public int getAge(){
   
    return this.age;
  }

  public String getName(){
    return this.name;
  }
  
  // instance method
  public String desc(){
    return "The age of this cat is" + this.age + " and its name is " + this.name;
  }
  }

  

