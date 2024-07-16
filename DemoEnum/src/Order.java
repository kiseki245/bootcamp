public class Order {
  private OrderStatus orderStatus;
  private int paidAmount;
  private int orderAmount;

  public Order(OrderStatus orderStatus, int orderAmount){
    this.orderStatus = OrderStatus.ORDER;
    this.orderAmount = orderAmount;
    
  }

  public void credit(int amount){
    this.paidAmount += amount;
    if(this.isPaid() && this.orderStatus == OrderStatus.ORDER){
    this.setStatus(this.orderStatus.next());
    System.out.println("Status updated: " + this.getOrderStatus());
    } else {
      System.out.println("Not enough");
    }
    //this,setOrderStatus(this.OrderStatus.next());
    //this.setOrderStatus(OrderStatusPAID);
    
  }

  public OrderStatus getOrderStatus(){
    return this.orderStatus;
  }
  public OrderStatus getNex(){
    return this.orderStatus.next();
  }
  public boolean isPaid(){
    return this.paidAmount == this.orderAmount;
  }
  public void setStatus(OrderStatus status){
    this.orderStatus = status;
  }

  public static void main(String[] args) {
    Order order1 = new Order(OrderStatus.ORDER, 123); //OrderAmount

    order1.credit(50);

    System.out.println(order1.isPaid());
    order1.credit(73);
    System.out.println(order1.isPaid());
    //Compare the amount
    System.out.println(order1.getOrderStatus()); //PAID now
    ;

  }
}
