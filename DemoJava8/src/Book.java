public record Book(double price, String aurthor) {
  // with
  // 1. getter -> price(), aurthod()
  // 2. One constructor only
  // 3. Attributes are private
  // 4. equals(), hashCode(), toString
  // 5, The class is final, cannot be extended
  // 6. Support custom instance method
  // 7. Support static method
  // 8. Support static, staticfinal, final
  // 9. Do NOT support final instatnce varable 
  // public final double s = 0.0;
  // 10. Setting is not allowed
  // public void setPrice(double price){
  //   this.price = price;
  // }
 // 11. Do not support customs constructor, empty constructor also
  //Constant
  public static final double MIN_PRICE = 10.0;

  public boolean isTooExpensive(){
    return this.price > 100;
  }

  public static double calculateDiscount(double price){
    return price * (1 - 0.2);
  }

  public static void main(String[] args) {
    Book b = new Book(99.9, "John");
    Book b2 = new Book(99.9, "Tester");
    Book b3 = b;
    System.out.println(b.price); // equals to getPrice
    System.out.println(b.aurthor); // getter
    
    System.out.println(b.toString());
    //equals
    System.out.println(b.equals(b2)); //false
    System.out.println(b3.equals(b2)); //false
    System.out.println(b.equals(b3)); //true
    //hashcode
    System.out.println(b.hashCode() == b2.hashCode()); // false
    System.out.println(b3.hashCode() == b.hashCode());// true
  
   }
}
