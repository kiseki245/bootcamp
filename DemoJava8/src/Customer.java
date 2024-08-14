import java.util.Objects;

public class Customer {
  private String name;
  private int age;

  public Customer(String name){
    this.name = name;
  }
  public Customer(String name, int age){
    this.name = name;
    this.age = age;
  }
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
@Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
      if (!(obj instanceof Customer))
      return false;
      Customer cus = (Customer) obj;

      return Objects.equals(cus.getName(), this.name);
  }
  public String toString(){
    return this.name + " - " + this.age;
  }
}
