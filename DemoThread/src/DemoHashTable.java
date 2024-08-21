import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoHashTable {
  public static void main(String[] args) {

  Hashtable<Integer, String> table = new Hashtable<>();

  Runnable putToHashTable = () ->{
    for (int i = 0; i < 1_000_000; i++) {
      table.put(i, "World");
      
    }
  };

  Thread thread1 = new Thread(putToHashTable);
  Thread thread2 = new Thread(putToHashTable);
  
  thread1.start();
  thread2.start();

  try {
    thread1.join();
    thread2.join();
    System.out.println("Hash Table size: " + table.size());
  } catch (InterruptedException e) {
    // TODO: handle exception
  }
 
  // HashMap
  HashMap<Integer, String> hashmap = new HashMap<>();
  Runnable putToMap = () ->{
    for (int i = 0; i < 1_000_000; i++) {
      hashmap.put(i, "World");
      
    }
  };

  Thread thread3 = new Thread(putToMap);
  Thread thread4 = new Thread(putToMap);
  
  thread3.start();
  thread4.start();

  try {
    thread3.join();
    thread4.join();
    System.out.println("Hash Table size: " + hashmap.size());
  } catch (InterruptedException e) {
    // TODO: handle exception
  }

  // null key
  HashMap<Integer, String> map2 = new HashMap<>();
  map2.put(null, "abc");
  map2.put(3, null);

  System.out.println(map2.size()); //2

  Hashtable<Integer, String> table2 = new Hashtable<>();
  // table2.put(null, "abc"); In hashtable, key cannot be null, NPE will be occured
  // table2.put(2, null); In hashtale, value also cannot be null
  table2.put(1, "ABC");
  table2.put(1, "def");
  System.out.println(table2.size()); 

  
}
  
}
