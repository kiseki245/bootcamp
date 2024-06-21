package Order;
import java.math.BigDecimal;
import java.util.Arrays;

public class Order {
  private static int count = 0;
  private int id;
  private Item[] items; //Object ref
  private String coupon;
 
  public Order(String coupon){
    this.id = ++count;
    this.items = new Item[0];
  }

  public int getId(){
    return this.id;
  }

  public Item[] getItem(){
    return this.items;
  }

  public String getCoupon(){
    return this.coupon;
  }
  public double getDiscount(){
    if (isCouponValid()){
      return 0.2d;
      
    } else {
      return 0.0d;
    }
  }
  public boolean isCouponValid(){
    return true;
  }
  public void addItem(Item newItem){
    Item[] itemList = new Item[this.items.length + 1];
    for(int i = 0; i < this.items.length; i++){
      itemList[i] = this.items[i];
        }
        itemList[itemList.length-1] = newItem;
        this.items = itemList;
  }

  
  public double total(){
    //BigDeicmal add, subtract, mltiply, divide methods return itself
    BigDecimal amount = BigDecimal.valueOf(0L);
    //add subtract, mutiply, divide methods return new Object

    for (int i = 0; i < this.items.length; i++) {
      //return new BigDecimal()
      amount = amount.add(BigDecimal.valueOf(this.items[i].subtotal()));
    }
    amount = amount.multiply(BigDecimal.valueOf(1.0 - getDiscount()));
    // convert from BigDecimal Object to double primitive value
    return amount.doubleValue();
  }
  public static void main(String[] args) {
    Order order = new Order("ABC");
    Item item = new Item(96.0d, 2);
    
    System.out.println(item.subtotal());
    order.addItem(item);
    
    Item item2 = new Item(10.0d, 3);

    order.addItem(item2);
    System.out.println(order.total());

    Item[] CheckItems = order.getItem();

  }
}
