package Shape;

import java.math.BigDecimal;

public abstract class Shape {


  //Abstract class can create instance method without inplemention
  // Method without implementation
  public abstract double area();

  public static double totalArea(Shape[] shape){
    BigDecimal bd = BigDecimal.valueOf(0.0d);
    for (Shape s : shape) {
      // s is obj ref, point to actual object (Circle/Square)
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  public static double circleAera(double redius){
    return redius * redius * Math.PI;
  }
  
  public static void main(String[] args) {
    
  }
}
