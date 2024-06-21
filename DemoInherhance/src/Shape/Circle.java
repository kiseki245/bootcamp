package Shape;

import java.math.BigDecimal;

//Shape is class containing areea() abstract method
// Circle is a class inherit Shape class
public class Circle extends Shape{
  private double redius;

  //Abstract method is not allowed in normal class
  // public abstract int ar(){};
  public Circle(double redius){
    this.redius = redius;
  }

  //1. the parent class has the same method
  //2. compile would check if the parent class really has the same method
  @Override
  public final double area(){ //"Final" method cannot be overrided by the child class
    // return this.redius * this.redius * Math.PI;
    return BigDecimal.valueOf(this.redius).multiply
    (BigDecimal.valueOf(this.redius).multiply
    (BigDecimal.valueOf(Math.PI))).doubleValue();
  }
  public double getRedius(){
    return redius;
  }
  //Circle.class may have its own method.
  // @Override You cannot override this method, because the parent class (Shape.class) no this method
  public void sleep(){
    System.out.println("Circle is sleeping ... ");
  }

  public static double circleAera(double redius){
    return redius * redius * Math.PI;
  }
  public static void main(String[] args) {
    Circle c = new Circle(3.0);
    System.out.println(c.area());
    
  }
}
