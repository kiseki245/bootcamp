package shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cricle implements Shape{

  private double redius;
  
  public Cricle(double redius){
    this.redius = redius;
  }
  @Override
  public double area(){
    
    return BigDecimal.valueOf(redius).multiply(BigDecimal.valueOf(redius)).
    multiply(BigDecimal.valueOf(Math.PI)).setScale(2, RoundingMode.UP).doubleValue();
  }

  public static void main(String[] args) {
    Cricle c = new Cricle(5.2);
    
    System.out.println(c.area());
  }
  
}
