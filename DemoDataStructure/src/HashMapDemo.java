import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {
    //Key & Value pair
    HashMap<Integer, String> nameMap = new HashMap<>(); // key -> Integer, value -> String
    nameMap.put(100, "Vincent");
    // nameMap.put("Vincent", 100); NOT OK violate the hashmap definiting 

    //We can get value by key
    System.out.println(nameMap.get(100)); //get by key 
    System.out.println(nameMap.get("Vincent")); // null, because you can only get the "Key", 
    nameMap.put(1010, "Cindy");
    nameMap.put(-45, "Sally");
    System.out.println(nameMap.get(-45)); //Sally

    //Key + Value -> Entry
    // A map conists of many entries
    
    //For LOOP -> HashMap.Class
    // Loop for entries
    for (Map.Entry<Integer, String> entry : nameMap.entrySet()){
      System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
      
    }

    //Handle duplicated key -> overwrite the value if the key exists
    nameMap.put(1010, "Peter");
    System.out.println(nameMap);
    nameMap.put(null, "Oscar");
    System.out.println(nameMap); // Cindy replaced
    nameMap.put(-45, null);
    System.out.println(nameMap); // Sally replaced


    //
    String removedName = nameMap.remove(1010);
    System.out.println(nameMap); // Peter removed
    System.out.println(removedName);// Peter

    
    System.out.println(nameMap.containsKey(1010)); //false
    System.out.println(nameMap.containsKey(-45)); //true
    

    //Loop keyset()
    for (Integer x : nameMap.keySet()) {
      System.out.println(x);
    }

    for (String ss : nameMap.values()) {
      System.out.println(ss);
    }
    System.out.println(nameMap.containsValue("Peter")); //false
    System.out.println(nameMap.containsValue("Oscar")); //true

    System.out.println(nameMap.get(-45)); //null

  }  
}
