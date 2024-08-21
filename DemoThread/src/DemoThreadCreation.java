public class DemoThreadCreation {
  public static void main(String[] args) {
    // Simple Thread
    Integer x = 1; //x is obj ref -: Integer Object 

    x++; // 2
    System.out.println(x);
    ++x; // 3
    System.out.println(x);

    Task tasks = new Task();
    Thread thread1 = new Thread(tasks); //main thread
    thread1.start(); //run()
    // By default, main thread would proceed without waiting for thread
    // but you can use join(), then both main thread and thread1 will wait each other
    try{
    thread1.join(); // Will process the thread1 first, then sysout the "Program ends..."
    } catch (InterruptedException e){
    
    }
    System.out.println("Program ends...");
    
  }
}
