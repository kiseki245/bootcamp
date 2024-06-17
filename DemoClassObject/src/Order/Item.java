package Order;

public class Item {
  private double price;
  private int qty;

  public Item(double price, int qty){
    this.price = price;
    this.qty = qty;
  }

  public double getPrice(){
    return this.price;
  }

  public double getQty(){
    return this.qty;
  }

  public double subtotal(){
    return this.price * this.qty; // double * int -> double * double -> 3.33333 * 2.0
  }

}
