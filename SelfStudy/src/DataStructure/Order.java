import java.time.LocalDate;
import java.util.*;

public class Order {
    private int orderNumber;
    private static int orderNumberAdd = 0;
    private Toy toy;
    private LocalDate deliveryDate;
    public Order(Toy toy, LocalDate deliveryDate){
        this.orderNumber = ++orderNumberAdd;
        this.toy = toy;
        this.deliveryDate = deliveryDate;
    }

    public int getOrderNumber(){
        return this.orderNumber;
    }
    public Toy getToy(){
        return this.toy;
    }
    @Override
    public String toString(){
        return "Order Number: " + this.orderNumber + "\n"
                + "Item: " + this.toy  + "\n"
                + "Delivery Date: " + this.deliveryDate  + "\n";
    }
    public static void main(String[] args) {
        List<Toy> toylist = new LinkedList<>();

        Toy toy1 = new Toy("HG Gundam", 123);
        Toy toy2 = new Toy("RG Gundam", 223);
        Toy toy3 = new Toy("MG Gundam", 379);

        Order o1 = new Order(toy1, LocalDate.of(2024, 8,24));
        Order o2 = new Order(toy2, LocalDate.of(2024, 8,24));
        Order o3 = new Order(toy3, LocalDate.of(2024, 8,24));

        Queue<Order> orderList = new LinkedList<>();
        orderList.add(o1);
        orderList.add(o2);
        orderList.add(o3);

        System.out.println(orderList.toString());

        Order DeliveredOrder = orderList.poll();
        System.out.println("After pool(): ");
        System.out.println(orderList.toString());
        System.out.println("Delivered order:" + DeliveredOrder.toString());

        System.out.println(orderList.size());
        Deque<Order> orderDeque = new ArrayDeque<>();

        Order o4 = new Order(toy3, LocalDate.of(2024, 2,24));
        Order o5 = new Order(toy1, LocalDate.of(2024, 8,24));
        Order o6 = new Order(toy2, LocalDate.of(2024, 8,24));

        orderDeque.addAll(orderList);

        orderDeque.add(o4);
        System.out.println(orderDeque.toString());
        orderDeque.addFirst(o5);
        orderDeque.addLast(o6);
        System.out.println(orderDeque.toString());

        for (Order orders : orderDeque){
            if (orders.getToy().equals(toy2)){
                System.out.println(orders.getOrderNumber());
            }
        }
//        Summary Data Structure
        //- [ ]  List → ArrayList
        Order order1 = new Order(toy1, LocalDate.of(2024, 2, 24));
        Order order2 = new Order(toy2, LocalDate.of(2024,2,14));
        Order order3 = new Order(toy3, LocalDate.of(2024, 3,3));
        Order order4 = new Order(toy2, LocalDate.of(2024, 3,3));

        List<Order> list1 = new ArrayList<>();
        list1.add(order1);
        list1.add(order2);
        list1.add(order3);
        list1.add(order2);
        list1.add(order4);
        System.out.println(list1.get(2));
        System.out.println(list1.lastIndexOf(toy2)); //-1
        System.out.println(list1.lastIndexOf(order2)); //3

        //- [ ]  List → LinkedList
        List<Order> list2 = new LinkedList<>();
        list2.addAll(list1);
        System.out.println("list with LinkedList<> : " + list2.size());
        System.out.println("list with LinkedList<>  head before poll" + "\n" + list2.get(0));
//        Order pollorder = linklist.poll(); - Can use the method that inherited from List interface, so pollfirst is not allowed
        LinkedList<Order> linklist = new LinkedList<>();
        linklist.addAll(list2);
        System.out.println("LinkedList: " + linklist.size());
        System.out.println("LinkedList head before poll" + "\n" + linklist.get(0));
        Order removedorder1 = linklist.poll();
        System.out.println("Removed by poll(): " + "\n" + removedorder1);
        System.out.println("Now show the first index: " + linklist.get(1));
        //- [ ]  Queue → (First-in First-Out) → LinkedList
        //- [ ]  Deque → (Tow-way in out) → LinkedList
        //- [ ]  Queue → ArrayDeque
        //- [ ]  Deque → ArrayDeque
        //- [ ]  Map → HashMap
        //- [ ]  Set → HashSet
        //- [ ]  Convert from List to Queue
        //- [ ]  Convert from Deque to Set
        //- [ ]  Convert from Map to List
    }
}
