import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoMapLambda {
  public static void main(String[] args) {
    
    //Map -> Key Valie

    Map<String, Customer> customerMao = new HashMap<>();
    customerMao.put("C1234", new Customer("John"));
    customerMao.put("C1235", new Customer("Sam"));

    if (customerMao.containsKey("C1235")){
      System.out.println(customerMao.get("C1235").getName());
    }
    Function<String, Customer> defaultCustomer = s -> new Customer("Dummy");
    customerMao.computeIfAbsent("C1236", defaultCustomer);
    customerMao.computeIfAbsent("C1235", defaultCustomer);

  for (Map.Entry<String, Customer> entry : customerMao.entrySet()) {
    System.out.println(entry.getKey() + " " + entry.getValue());
  }

    // 2. marge
    Map<String, Integer> newCusMap = new HashMap<>();
    newCusMap.put("Peter", 10);
    newCusMap.put("Jenny", 2);
    newCusMap.put("Vincent", 4);
    newCusMap.put("John", 12);

    //All entry value +2
    BiFunction<Integer, Integer, Integer> addValue = (oldValue, newValue) -> oldValue + newValue;
    newCusMap.merge("Peter", 4, addValue);
    newCusMap.merge("Sue", 5, addValue);
    System.out.println(newCusMap.get("Peter")); //14
    System.out.println(newCusMap.get("Sue")); //5
    for (Map.Entry<String, Integer> entry : newCusMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}
