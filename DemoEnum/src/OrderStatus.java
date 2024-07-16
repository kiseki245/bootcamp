public enum OrderStatus {
  
  ORDER(0), PAID(1), READY_TO_SHIP(2), DELIVERED(3);
  private int value;
  private OrderStatus(int value){
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }

  public OrderStatus next(){
    for (OrderStatus next : OrderStatus.values()) {
      if (this.value == next.value-1){
        return next;
      }
    }
    return null;
  }
  public static OrderStatus next(OrderStatus os){
    for (OrderStatus next : OrderStatus.values()) {
      if (os.getValue() == next.getValue()-1){
        return next;
      }
    }
    return null;
  }
  public static void main(String[] args) {
    System.out.println(OrderStatus.READY_TO_SHIP.next());
    System.out.println(OrderStatus.next(PAID));
  }
}
