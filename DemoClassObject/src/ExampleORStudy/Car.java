package ExampleORStudy;

public class Car {
  private static int count = 0;
  private int id;
  private String color;

  public Car(String color){
    this.id = ++count;
    this.color = color;
  }

  
public static void main(String[] args) {
  Car c1 = new Car("Red");
  Car c2 = new Car("Blue");
  Car c3 = new Car("White");

  System.out.println(c1.id);
  System.out.println(c2.id);
  System.out.println(c3.id);

}


}
