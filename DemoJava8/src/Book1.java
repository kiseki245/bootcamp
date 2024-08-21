public class Book1 {

  private double price;
  private String aurthor;

  public Book1(double price, String aurthor){
    this.price = price;
    this.aurthor = aurthor;
  }
  
  // Type of instance aurthor;
  // getter, setter
  // presentation -> defintion 
  public boolean isTooExpensive() {
    return this.price > 100;
  }
  //transform (substring, replace)
  
  
}
