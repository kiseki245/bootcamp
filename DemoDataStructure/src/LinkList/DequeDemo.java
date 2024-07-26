package LinkList;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DequeDemo {
  public static void main(String[] args) {
    Deque<String> strings = new LinkedList<>();
    strings.add("abc");
    strings.add("def");
    strings.addFirst("Hello");
    strings.addLast("World");
    System.out.println(strings);
    System.out.println("Peek is " +  strings.peek());
    System.out.println("PeekFirst is " + strings.peekFirst());
    System.out.println("PeekLast is " + strings.peekLast());

    strings.remove(); //remove the first element "abc"
    strings.removeFirst();
    strings.removeLast();
    System.out.println(strings);


      //quene only can add the element to the head
      // Deque interface extends Quene interface
      // So ot support add(), remove(), size(), etc


      //ArrayQueue.class
      Deque<String> strings2 = new ArrayDeque<>(); //underlying DS -> array -> fixed length
      strings2.add("abc"); //create new array object and then put string obect intothe array
      strings2.add("def");
      strings2.addFirst("xyz");
      strings2.addLast("xyx");
      System.out.println(strings2);
      System.out.println();

      Queue<String> strings3 = new ArrayDeque<>(); //Deque is extends from Quene
      strings3.add("Apple");
      strings3.add("Banana");
      strings3.remove();
      System.out.println(strings3);

    List<String> strings5 = new LinkedList<>();
    strings5.add("Apple");
    strings5.add(0, "benana");
    System.out.println(strings5);
    
    // Insertion - ArrayList or LinkedList faster?
    // Best / worse case
  
  }
}
