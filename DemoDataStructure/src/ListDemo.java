import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDemo {
  public static void main(String[] args) {
    
    List<String> strings = new ArrayList<>();
    strings.add("Hello");
    strings.add("World");
    strings.remove("World");
    
    //ArrayList.class has ALL methods defined in List.class
    //ArrayList MAY implement more than one interface
    //ArrayList MAY have its own methods, which did not define in interfaces


    // Polymorphims
    // 1. scope of strings(obj obj)
    // 2. method Implementation - runtime


    ///Collection
    Collection<String> strings2 = new ArrayList<>();
    strings2.add("Hello");
  
    strings2 = new HashSet<>();

    System.out.println(strings2.size()); //0
    Set<String> strings3 = new HashSet<>();
    // strings3 = new ArrayList<>();
    // Because ArrayList() inplmenting different parent class / ArrayList.class did not implement Set interface.

    strings.add("Hello"); // ignore duplicate
    // so, the implemention of ArrayList.add() differ to the implementation of HashSet.add()
    

  }
}
