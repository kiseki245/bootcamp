import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {
  

      public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 7, -5, 10);
        // Lambda
        integers.stream().forEach(e -> System.out.println(e));

        //Method reference : input = method parameter
        integers.stream().forEach(System.out::println);
        
        // Lambda
        integers.stream().forEach(e -> System.out.println(e + 10));

        //Example 2
        String name = "Vincent";
        // Lambda
        Supplier<Integer> nameLength = () -> name.length();
        //Method reference
        Supplier<Integer> nameLength2 = name::length;


        // Example 3: instance method (2 parameters)
        // Lambda
        Comparator<Integer> sortByDsec = (i1, i2) -> i2.compareTo(i1);
        // Method reference
        Comparator<Integer> sortByDesc = Integer::compareTo;

        // Example 4:
        Function<String, String> stringConstructor = s-> new String(s);

        // Example 5:
        // Method Reference
        Function<String, String> stringConstructor2 = String::valueOf;

      }
}
