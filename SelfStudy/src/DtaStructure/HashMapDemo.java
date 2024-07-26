package DtaStructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {
    
  
  // Key and value
    //key is no.
    HashMap<Integer, String> pairMap = new HashMap<>();

    pairMap.put(57149304, "Jelly");
    pairMap.put(62341189, "Hestar");
    pairMap.put(66928312, "Jason");
    pairMap.put(55231562, "Esther");

    System.out.println(pairMap); // Same as hashSet, no ordering 

    // Key + Value -> Entry
    // A map consists of many entries

    for (Map.Entry<Integer, String> entry : pairMap.entrySet()){
      System.out.println("Key = " + entry.getKey()      
      + " Value = " + entry.getValue());
    }

    //Remove the value that not start with "J"
    for (Map.Entry<Integer, String> entry : pairMap.entrySet()){
      if (entry.getValue().charAt(0) != 'J'){
        System.out.println(entry + " removed");
        pairMap.remove(entry);
      }
    }
    System.out.println(pairMap);
  }
}
