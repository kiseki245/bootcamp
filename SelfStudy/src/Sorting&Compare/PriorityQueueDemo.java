import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        Queue<Toy> tq1 = new PriorityQueue<>(SortByPrice.of());
        tq1.add(new Toy("Toy1", 112));
        tq1.add(new Toy("Toy2", 122));
        tq1.add(new Toy("Toy3", 222));
        tq1.add(new Toy("Toy4", 333));
        System.out.println("tq1 list: " + tq1);
        System.out.println(tq1.poll());
    }

}
