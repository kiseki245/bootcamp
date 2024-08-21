

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoVecotr {
  public static void main(String[] args) {

    //ArrayList (non threadsaft) vs vector
    List<String> strings = new ArrayList<>(); // ArrayList

    Runnable addStringToArrayList = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        strings.add("Hello");
      }
    };

    long startTime = System.currentTimeMillis();
    Thread thread1 = new Thread(addStringToArrayList);
    Thread thread2 = new Thread(addStringToArrayList);
    thread1.start(); //run()
    thread2.start(); 

    try {
      thread1.join();
      thread2.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("Vector runtime: " + (afterTime - startTime)); //115
      System.out.println("ArrayList size = " + strings.size());
    } catch (InterruptedException e) {
      // TODO: handle exception
      System.out.println("InterruptedException");
    }
    System.out.println("Program End");

    //Step to resize the arraylist
    // Create new array (length + 1)
    // Copy of old array to new array
    // Resize the array and resize it
    // Add the new element at the array
    // Reassign the new object reference to the od object reference


    List<String> strings2 = new Vector<>(); // ArrayList

    Runnable addStringToVector = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        strings2.add("Hello");
      }
    };
    
    Thread thread3 = new Thread(addStringToVector);
    Thread thread4 = new Thread(addStringToVector);
    thread3.start(); //run()
    thread4.start(); 

    try {
      thread3.join();
      thread4.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("Vector runtime: " + (afterTime - startTime)); //115
      System.out.println("Vector size = " + strings2.size());
    } catch (InterruptedException e) {
      // TODO: handle exception
      System.out.println("InterruptedException");
    }
    System.out.println("Program End");
  }
}
