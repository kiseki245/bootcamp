import java.util.ArrayList;
import java.util.Arrays;

import DtaStructure.Toy;

public class Customer {
  
  private int age;
  private String name;

  public Customer(int age, String name){
    this.age = age;
    this.name = name;
  }
  public int getAge(){
    return this.age;
  }
  public String getName(){
    return this.name;
  }

  public void setAge(int age){
    this.age = age;
  }
  public void setName(String name){
    this.name = name;
  }
  public String toString(){
    return "[" + this.getName() + "," + this.getAge() + "]";
   }
  public static void main(String[] args) {
    //Question 2: Customer[], retrieve all customer with age > 30 or name startwith "J"
    Customer[] customers = new Customer[] {new Customer(40, "Mary")
  , new Customer(31, "John")
  , new Customer(29, "Jason")
  , new Customer(22, "Grace")};

  ArrayList<Customer> result = new ArrayList<>();

  for (Customer cus : customers) {
    if (cus.getAge() >= 30 || cus.getName().startsWith("J"))
      result.add(cus);
  }

  System.out.println(result.toString());

  }
}
