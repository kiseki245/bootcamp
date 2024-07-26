package LinkList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.xml.namespace.QName;

public class LinkedListDemo {
  public static void main(String[] args) {
    
    // Array vs ArrayList -> 1. Undelying structor of ArrayList is array
    // 2. array -> fixed length -> continus memory location (Memory [1, 2, 3, 4, 5])
    
    
    Cat cat =  new Cat(Color.BLACK);
    // Heap
    // Step 1: Cat Object
    // Step 2: Eye Array Object
    // STep 3: Two Eye objects
    // Step 4: 3 Color object

    cat.getEyes();
    cat.getLeftEye();

    Eye[] eyes = cat.getEyes(); // backup the array object memory location
    Eye rightEye = eyes[1];


    // What is the relationship between the memory location of cat, eyes, righteye

    //1. Eye[] (array)
    //2. Cat object vs Eye[] object
    //3. Cat object vs eye object

    String[] strings = new String[5];


    List<String> strings2 = new LinkedList<>();
    //LinkedList will not loop the action of Create array -> Remove array .etc
    strings2.add("A");
    strings2.add("B");
    strings2.add("C");
    strings2.remove("B");
    strings2.remove(0);
    for (String s : strings2){
      System.out.println(s);
    }
    strings2.get(0);


    System.out.println(strings2.isEmpty()); //false
    // LinkedList vs ArrayList
    // 1. Underlying DS
    // 2. Methods Differencs (i.e. LinkedList -> addLast(), addFirst(), RemoveLast())

    LinkedList<String> ll = new LinkedList<>();
    ll.add("Hello");
    ll.addFirst("Abc"); 
    ll.add("def");
    System.out.println(ll);
    ll.add(1, "This is 2");
    System.out.println(ll);
    
    //LinkedList cannot switch to ArrayList because they are not the parent and chil
    //List can swith to ArrayList
    ll.removeFirst();
    System.out.println(ll);

    System.out.println(ll.indexOf("This is 2"));
    ll.add("Hello");
    System.out.println(ll);
    System.out.println(ll.lastIndexOf("Hello"));

    // Quene.class

    Queue<String> emails = new LinkedList<String>(); //Quene method, but LinkedList object
    emails.add("abc@gmail.com");
    emails.add("peter@gmail.com");
    System.out.println(emails);
    System.out.println(emails.size());
    String head = emails.poll(); // remove and return the first element in quene 
    System.out.println("Head is " + head);
    emails.add("sally@hotmail.com");
    emails.add("dicky@gmail.com");
    // for each
    for (String s : emails){
      System.out.println(s);
    }

    // remove()
    emails.remove("dicky@gmail.com");
    //LinkedList.class remove(Object) -> LinkedList for loop
    emails.remove();
    System.out.println("After remove() " + emails);// the first element will be removed
    String lookup = emails.peek(); 
    System.out.println("lokup is " + lookup);
    //Convert Quene<String> to List<String>
    List<String> strings4 = new ArrayList<>();
    // for (String s : emails){
    //   strings4.add(emails.poll());
    //   System.out.println(s + "Added to list");
    // }
    
    while(!emails.isEmpty()){
      strings4.add(emails.poll());
    }
    System.out.println(strings4);
    System.out.println(emails); // empty now since all poll() 
    

    
    strings4.clear(); // Clear all the objects inside the arraylist objects
    strings4.add("abc");
    System.out.println(strings4);
    strings4 = null; // remove the ArrayList object
    System.out.println(strings4);
    // strings4.add("def"); NPE (null pointer exception)

    
    }
  }

