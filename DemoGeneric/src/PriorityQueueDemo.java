import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
  public static void main(String[] args) {
    Queue<String> pq = new PriorityQueue<>();
    pq.add("def"); //sorting [def]
    pq.add("abc"); //sorting [def, abc] -> [abc, def]
    pq.add("bbb"); //sorting [abc, def] -> [abc, bbb, def]
    pq.add("aav");
    System.out.println(pq); //[abc, def, bbb] so add() method does not perform sorting....

    
    while (!pq.isEmpty()) {
      System.out.println(pq.poll()); // abc, bbb, def <- complete sorting whe you call poll method
    }
    
    // PriorityQueue.class add() & poll differs to LinkedList.class (implemention)
    List<String> pq2 = new LinkedList<>();
    pq2.add("def"); //sorting [def]
    pq2.add("abc"); 
    pq2.add("bbb"); 
    pq2.add("aav");
    System.out.println(pq2); // [def, abc, bbb, aav] 
    Collections.sort(pq2); 
    System.out.println(pq2); // [aav, abc, bbb, def]
    // List only conduct once sorting by Collections.sort(pq2) but PriorityQueue conduct the sorting every times
    // 1. Java 8 -> Stream (List)
    // 2. Convert to Array-> ArrayList. Array
    


    Queue<Integer> pq3 = new PriorityQueue<>();

    // poll() -> ordering
    pq3.add(-3);
    pq3.add(10000);
    pq3.add(10);
    pq3.add(-200);
    System.out.println(pq3);
    // poll() -> ordering
    System.out.println(pq3.poll()); // -200
    System.out.println(pq3.poll()); // -3
    pq3.add(-400);
    System.out.println(pq3.poll());  //-400
    System.out.println(pq3.poll()); //10
    
    

  }
}
