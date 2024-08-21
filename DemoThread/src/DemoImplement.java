import java.util.concurrent.atomic.AtomicInteger;

public class DemoImplement {
  private int x;
  private int k;
  private AtomicInteger y = new AtomicInteger(0);
  private final Object lock = new Object();
  // Solution 1 - synchronized method
  // instance method
  public synchronized void increment(){
    // 1000 lines of code
    this.x++;
  }

  public void increment2(){
    this.k++; // mulit-thread may access variable k for read/write
    //solution 3
    synchronized (lock){ // locked a code block
    this.x++;
    }
  }
  public static void main(String[] args) {
    DemoImplement ball = new DemoImplement();
    Runnable task = () -> {
      
      Thread threadInfo = Thread.currentThread(); // call current thread
      System.out.println(threadInfo.getId()); // 26 27
      System.out.println(threadInfo.getName()); // -1 -0


      for (int i =0; i < 1000000; i++){
        ball.x++;
      }
    };
    
    Thread thread1 = new Thread(task);
    Thread thread2 = new Thread(task);
    thread1.start();
    thread2.start();

    try {
    thread1.join();
    thread2.join();
    } catch (InterruptedException e){}

    System.out.println("x = " + ball.x);

    ball.x = 0;
    Runnable task2 = () ->{    
      for (int i =0; i < 1000000; i++){
        ball.increment();;
      }
    };
    
    Thread thread3 = new Thread(task2);
    Thread thread4 = new Thread(task2);
    thread3.start();
    thread4.start();

    try {
    thread3.join();
    thread4.join();
    } catch (InterruptedException e){}
    System.out.println("x = " + ball.x);

    ball.x = 0;
    Runnable task3 = () ->{    
      for (int i =0; i < 1000000; i++){
        ball.y.incrementAndGet();
      }
    };
    
    Thread thread5 = new Thread(task3);
    Thread thread6 = new Thread(task3);
    thread5.start();
    thread6.start();

    try {
    thread5.join();
    thread6.join();
    } catch (InterruptedException e){}
    System.out.println("x = " + ball.y);



    ball.x = 0;
    Runnable task4 = () ->{    
      for (int i =0; i < 1000000; i++){
        ball.increment2();
        ball.increment2();
      }
    };
    
    Thread thread7 = new Thread(task4);
    Thread thread8 = new Thread(task4);
    thread7.start();
    thread8.start();

    try {
    thread7.join();
    thread8.join();
    } catch (InterruptedException e){}
    System.out.println("x = " + ball.y);
    System.out.println("K = " + ball.k);
    System.out.println("Program ends...");

    
  }
}
