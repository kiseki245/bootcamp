import java.math.BigDecimal;

public class DemoBreakDecimal {
  public static void main(String[] args) {
    double x = 0.2;
    double y = 0.1;
    System.out.println(x * y); //0.020000000000000004

    BigDecimal b1 = new BigDecimal("0.2");//Need ""
    BigDecimal b2 = new BigDecimal("0.1");
    BigDecimal b3 = b1.multiply(b2);
    
    System.out.println(b3.doubleValue());
  
    System.out.println(sum(0.2, 0.1));
    System.out.println(divide(0.2, 0.1)); //2.0
    // subtrac().multiply()

    System.out.println(BigDecimal.valueOf(3.3).subtract(BigDecimal.valueOf(1.1)).add(BigDecimal.valueOf(4.4)));
    
  }
  

  public static double sum(double d1, double d2){
    BigDecimal b1 = BigDecimal.valueOf(d1);
    BigDecimal b2 = BigDecimal.valueOf(d2);

    return b1.add(b2).doubleValue();
  }

  public static double divide(double d1, double d2){
    // BigDecimal b1 = BigDecimal.valueOf(d1);
    // BigDecimal b2 = BigDecimal.valueOf(d2);

    // return b1.divide(b2).doubleValue(); 
    return BigDecimal.valueOf(d1).divide(BigDecimal.valueOf(d2)).doubleValue();//roundingUP
    
  }
}
