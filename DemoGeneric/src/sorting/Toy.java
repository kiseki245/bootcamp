package sorting;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Toy {
  private String name;
  private double price;
  private int ID;
  private static int count = 1;
  public Toy(){

  };
  public Toy(String name, double price){
    this.ID = count++;
      this.name = name;
      this.price = price;
  }

  public String getBName(){
      return this.name;
  }
  public double getPrice(){
      return this.price;
  }
  @Override
  public String toString(){
      return "Name: " + this.name + " " + "Price: " + this.price;
  }

  public static void main(String[] args) {
    
    PriorityQueue<Toy> toyQueue = new PriorityQueue<>(new SortByPrice());
    toyQueue.add(new Toy("t1", 5.1));
    toyQueue.add(new Toy("t2", 15.4));
    toyQueue.add(new Toy("t23", 5.3));
    toyQueue.add(new Toy("t", 5.2));

    System.out.println(toyQueue);
  }
}
