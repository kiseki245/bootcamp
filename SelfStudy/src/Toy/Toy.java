package Toy;

public abstract class Toy {
  private String name;
  private double price;

  public Toy(String name, double price){
    this.name = name;
    this.price = price;
  }

  public String getName(){
    return this.name;
  }

  public double getPrice(){
    return this.price;
  }

  public String toString(){
    return "Name: " + this.name + "\n" +
    "Price: " + this.price;
  }

  public static void main(String[] args) {
    Toy t1 = new Robot("Test", 179);
    
  }
}
