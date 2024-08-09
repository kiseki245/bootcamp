public class Person {

  private String name;
  private int age;
  
  public Person(){

  }
  
  private Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  public static Builder builder(){
    return new Person.Builder();
  }
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public int getAge(){
    return this.age;
  }
  public String getName(){
    return this.name;
  }

  public static class Builder {
    private String name;
    private int age;
    
    public Builder age(int age){ // setAge
     this.age = age; 
     return this;
    }
    public Builder name(String name){
      this.name = name;
      return this;
    }
    public Person build() {
      return new Person(this.name, this.age);
    }

  }

  public static void main(String[] args) {
    Person person = new Person ();
    person.setAge(13);
    person.setName("John");


    Person person2 = Person.builder() // create Builder object
    .name("John") // 
    .age(18) //
    .build();

    System.out.println(person2.getAge());
    System.out.println(person2.getName());

  }
  
}
