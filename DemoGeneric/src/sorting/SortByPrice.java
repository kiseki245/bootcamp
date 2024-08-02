package sorting;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortByPrice implements Comparator<Toy>{
  @Override
  public int compare(Toy t1, Toy t2){
    
    return t1.getPrice() < t2.getPrice() ? -1 : 1;
    
  
  }

}
