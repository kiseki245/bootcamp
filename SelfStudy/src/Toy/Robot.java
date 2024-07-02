package Toy;

import java.util.Objects;

public class Robot extends Toy{
  private static int genNewID = 0;
  private int ID;
  private String grade;

  public Robot(String name, double price){
    super(name, price);
    this.ID = ++genNewID;
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.ID, super.getName(), super.getPrice())
  }
  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Robot))
    return false;

    Robot check = (Robot) obj;
    if (super.getName().equals(this.getName()) && super.getPrice() == this.getPrice()){
      return true;
    }  
    return false;
  }

  public String toString(){
    return "ID: " + this.ID + "\n" + 
    "Name: " + super.getName() + "\n" +
    "Price: " + super.getPrice();
  }
public static void main(String[] args) {
  Robot HG = new Robot("Test", 179);
  Robot HG2 = new Robot("Test", 123);

  System.out.println(HG.toString());


  
}

}

