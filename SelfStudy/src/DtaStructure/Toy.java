package DtaStructure;

import java.util.HashMap;
import java.util.Objects;

public class Toy {
  private String name;
  private int price;
  
  public Toy(String name, int price){
    this.name = name;
    this.price = price;
  }

  public String getName(){
    return this.name;
  }


  public int getPrice(){
    return this.price;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setPrice(int price){
    this.price = price;
  }

  public String toString(){
    return 
    "Name: " + this.name + " Price: " + this.price;
  }
  @Override
  public boolean equals(Object obj){

    if (this == obj)
    return true;
    if (!(obj instanceof Toy))
    return false;
    Toy toy = (Toy) obj;
    return Objects.equals(this.getName(), toy.getName()) && Objects.equals(this.getPrice(),this.getPrice());
  }
  @Override
  public int hashCode(){
    return Objects.hash(this.name);
  }
  public static void main(String[] args) {
    Toy toy1 = new Toy("Robot", 123);
    Toy toy2 = new Toy("Robot", 123);
    Toy toy3 = new Toy("Robot2", 123);

    HashMap<String, Integer> ToyMap = new HashMap<>();
    ToyMap.put(toy1.getName(), toy1.getPrice());
    System.out.println(ToyMap);
    System.out.println(toy1.equals(toy2));
    System.out.println(toy2.equals(toy3));
  }
}
