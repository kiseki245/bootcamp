package Java8;

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
}
