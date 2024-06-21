public abstract class Person { //abstract than student

  private String name;
  private int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }
  public void setAge(int age){
    this.age = age;
  }
  
  public static void main(String[] args) {
    
    // Person p = new Person("Vincent", 11); Abstract class's object cannot be created

    // Student.class is public
    // Student.class constructor is public
    Student s = new Student(1, "Eddy", 28);
  }
}
