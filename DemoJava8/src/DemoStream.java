import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
  
  public static void main(String[] args) {
    List<String> strings = new LinkedList<>();
    strings.add("John");
    strings.add("Jenny");
    strings.add("Sam");
  
    //lambda for-each

    strings.forEach(s -> System.out.println(s));


    for (int i = 0; i < strings.size(); i++){
        strings.set(i, strings.get(i).toLowerCase());
    }
    System.out.println(strings);

    List<String> capNames = strings.stream()//List<String> -> Stream<String> 
    .map(s -> s.toUpperCase()) // Stream<String>
    .collect(Collectors.toList()); // List<String>

    System.out.println(strings); //[john, jenny, sam]
    System.out.println(capNames); //[JOHN, JENNY, SAM]
    capNames.add("sam");
    Set<String> capNames2 = capNames.stream()
    .map(s -> {
      String newStr = s.toLowerCase() + s.toUpperCase();
      return newStr + "!!!";
    }).collect(Collectors.toSet());
    System.out.println(capNames2);
    

    // Another Example

    List<Customer> customers = new LinkedList<>();
    customers.add(new Customer("John", 20));
    customers.add(new Customer("Jenny", 35));
    customers.add(new Customer("Kit", 43));

    //Filter 25 or above
    List<Customer> customersAfterFilter = customers.stream() // 
    .filter(customer -> customer.getAge() >= 25)
    .collect(Collectors.toList());

  System.out.println(customersAfterFilter);
  
  List<String> names = customers.stream()
  .filter(c -> c.getName().length() >= 4) // Stream<Customer>
  .map(c -> c.getName()) // Stream<String>
  .collect(Collectors.toList());
  
    System.out.println(names);
    List<Customer> Test = new LinkedList<>();
    for (Customer c : customers) {
      if (c.getName().length() >= 4 && c.getAge() >= 25){
        Test.add(c);
      }
      
    }
    System.out.println("Test" + Test);

    // filter() map()
    //we can map() and then filter()
    customers.stream()
    .map(c -> c.getName()) // Stream<String>
    .filter(str -> str.length() >= 4) // Stream<Customer>
    .collect(Collectors.toList());


    customers.stream()
    .filter(c -> c.getName().length() >= 4) 
    .map(c -> c.getName()) 
    .forEach(name -> System.out.println(name));

    customers.stream()
      .filter(c -> c.getAge() < 40)
      .count(); // long 2
    
    customers.add(new Customer("Jenny", 30));
    
    // distinct -> remove duplicated (by equals() and hashCode())
    List<Customer> customersAfterDistinct = customers.stream()
      .distinct() //Stream<Customer>
      .collect(Collectors.toList());

      System.out.println(customersAfterDistinct); //Add the hashCode() to Customer class
      //Sort

      // Lambda Expression (Skip class implementing interface Comparator)
      Comparator<Customer> sortByAge = (c1, c2) -> c1.getAge() < c2.getAge() ? -1 : 1;

      List<String> customersAfterSorted = customers.stream()
      .filter(c -> c.getAge() < 40)
      .sorted((c1, c2) -> c1.getAge() < c2.getAge() ? -1 : 1)
      .map(c -> c.getName() + " " + c.getAge())
      .collect(Collectors.toList());
    // int compare(T a1, T a2);      
  
      System.out.println(customersAfterSorted);

      //Terminal Operation (collect(), count()) -> return non-Stream e.g: String, Long 
      //Interainate Operation (filter(), map(), sorted(), distinct()) -> return Stream

      Stream<Customer> customersList = customers.stream()
      .filter(c -> !"John".equals(c.getName()));

      System.out.println(customersList.count()); //3
      // System.out.println(customersList.collect(Collectors.toList()));
      // stream has already been operated upon or closed
      // We cannot perform 2 x Terminal Operation on a stream object


      // Map -> keys: name, value: new length
      List<String> animals = Arrays.asList("Lion", "Tiger", "Bear");
      // From List to Stream to Map
      Map<String, Integer> animalMap = animals.stream()
      .collect(Collectors.toMap(s -> s, s -> s.length()));
    System.out.println(animalMap);
    System.out.println(animalMap.get("Lion"));

    // groupBy


    List<Staff> staffs = Arrays.asList(new Staff("HR", "John"),
    new Staff("MKT", "Sally"),
    new Staff("IT", "Vincent"),
    new Staff("IT" , "John"));

    Map<String, List<Staff>> staffMap = staffs.stream()
    .collect(Collectors.groupingBy(staff -> staff.getDepartmentName()));
    
    System.out.println(staffMap.get("IT"));

    // ! contains -> new ArrayList() -> add*( -> get
    

      List<Staff> staffList = Arrays.asList(new Staff("HR", "John", 30000),
    new Staff("MKT", "Sally", 25000),
    new Staff("IT", "Vincent", 30000),
    new Staff("IT" , "John", 30000));

    Map<String, Integer> deptMap = staffList.stream()
    .collect(Collectors.groupingBy(s -> s.getDepartmentName(),
     Collectors.summingInt(s -> s.getSalary())));
    System.out.println(deptMap.get("IT"));
    System.out.println(deptMap.get("MKT"));


    //Construct Stream object by inital values 
    Stream<Integer> integers = Stream.of(1, 2, 3);
    Stream<Staff> staff = Stream.empty();
    // Stream
    // filter -> reduce element
    // map -> revise the object defintion, no change on element count 
    // distinct -> reduce element
    //count -> summarise operation
    // grouping -> summarise operation

    //Special case:
    List<Integer> integers2 = Stream.of(2, 3, 4).map(i -> i + 1)
    .collect(Collectors.toList());
    System.out.println(integers2);
    Stream<Integer> integers3 = Stream.of(2, 3, 4).map(i -> {
      System.out.println(i);
      return i + 1;
    });
    System.out.println(integers3); //java.util.stream.ReferencePipeline$3@79fc0f2f
    //Sysout not working, because did not perform terminal operation
    
    // terminal operation observe intermiute operations
    // so finally map() won't execute, because it will not affect the result count();
    System.out.println(integers.count());
  }
}
