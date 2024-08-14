import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
  

  public static void main(String[] args) {
    String s = "Hello";
    s = null;
    generate(s); // OK

    // generate(s).charAt(0); //method error
    
    // alternative
    Optional<String> result = generate2(s);
    if (result.isPresent()){ //not null
      result.get().charAt(0);
    } else { //null
    }
    
    //14/8

    // Way to create Optional Object
    // Optional<String> s2 = Optional.of(null); NPE
    System.out.println(Optional.of("Hello")); 
    // Optional.of(null); <- Not OK
    Optional<String> s2 = Optional.ofNullable(null); //Ok
    s2 = Optional.ofNullable("abc"); // Ok
    // Optional.of(null); <- Not ok
    // s is String already, but not Optional<String>
    char target;
    target = '*';
    int x = 0;
    generate2("abc").ifPresent(string -> {
      // target = string.charAt(0); Not OK for write
      System.out.println("Can read the target here:" + target); // OK for read
      System.out.println(x);
      string.charAt(0); //
    });
System.out.println("target" + target + "!");


//Stream -> findFirst(), findAny()

    List<Customer> customers = Arrays.asList(new Customer("John", 1), new Customer("Jenny", 0)
    , new Customer("Peter", 2));
  Optional<Customer> optCustomer = customers.stream()
  .filter(customer -> customer.getAge() > 20)
  .findFirst();

    optCustomer.ifPresent(c -> System.out.println(c.toString()));
    customers.stream()
    .filter(customer -> customer.getAge() > 20)
    .findFirst()
    .ifPresent(customer -> System.out.println(customer));
    // You should not findFirst and then get()
    // customers.stream()
    // .filter(customer -> customer.getAge() > 20)
    // .findFirst() //Optional<T>.ofNullable(null)
    // .get(); //java.util.NoSuchElementException: No value present



    //Way to take out the element from optional object
    // 1. isPresent()
    // 2. ifPresent()
    // 3. orElse()
Optional<Customer> optCus2 = Optional.of(new Customer("Mary", 23));
optCus2.orElse(new Customer("Suv", 29));
    System.out.println(optCus2);

    // 4. orElseThrow()
    Customer customer2 = optCus2.orElseThrow(() -> new RuntimeException());

    // 5. orElseGet()
    Customer customer3 = optCus2.orElseGet(() -> new Customer("Dummy", -99));


    Optional<String> optCustomer4 = null;
    // optCustomer4.orElse("Hello"); NPE


  }

  public static String generate(String s){
    if (s == null)
      return null;

    return s.replace('a', 's').toUpperCase();
  }
  // 1. Optional<String> != String
  public static Optional<String> generate2(String s) {
  if (s == null)
    return Optional.ofNullable(null);

    return Optional.of(s.replace('a', 'b').toUpperCase());
  }



}
