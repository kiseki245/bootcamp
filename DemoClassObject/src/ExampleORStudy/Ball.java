package ExampleORStudy;

public class Ball {

  private double weight;
  private String color;
  private int number;
  public Ball(){ //empty constructor
    this.color = "Black";
  }

  public Ball(double weight, String color){ //consturctor
    this.weight = weight;
    this.color = color;
  }

  public Ball(double weight, String color, int number){
    this(weight, color); // Call self constrictor
    this.number = number;
  }

  public String toString(){ //toString
    return this.weight + " " + this.color;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public void setColor(String color){
    this.color = color;
  }
  public double getWeight(){
    return this.weight;
  }

  public String getColor(){
    return this.color;
  }

  public static void main(String[] args) {
    Ball b1 = new Ball(12.3, "Red"); //all arugments constructor

    //After replacing the toString() method.
    System.out.println(b1.toString());

    Ball b2 = new Ball(); // empty constructors
    System.out.println(b2.toString()); // Result: 0.0 Black (By the empth constructor)
    
    //chart, stack heap memory, overloading (Check calculator), what is obj refernce
  }
}


