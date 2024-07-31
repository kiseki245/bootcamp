import java.math.BigDecimal;

public class NumberBox<T extends Number> {
  private T number;

  public NumberBox(T number){
    this.number = number;

  }

  public static void main(String[] args) {
    NumberBox<Byte> byteBox = new NumberBox<>((byte) 1); //int -> byte -> byte
    //Long extends Number and Byte extends Number
    //NumberBox<Byte> has no relationship with NumberBox<Long>
    byteBox = new NumberBox<Long>();
    NumberBox<BigDecimal> bBox = new NumberBox<BigDecimal>(BigDecimal.valueOf(3.4)); //BigDecimal is extends the number

    
  }
}
