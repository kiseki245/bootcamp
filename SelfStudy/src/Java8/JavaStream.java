package Java8;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {
  

  public static void main(String[] args) {


    System.out.println("Hello");

    List<Toy> toys = new LinkedList<>();
    toys.add(new Toy("Gundam", 128));
    toys.add(new Toy("TR1", 224));
    toys.add(new Toy("Megaman", 559));
    toys.add(new Toy("MetalBuild", 2000));
    toys.add(new Toy("Chiikawa", 128));
    Toy toy1 = new Toy("Usagi", 234);
    toys.add(toy1);
    toys.add(toy1);

    System.out.println("filter1:");
    List<Toy> filterToys = toys.stream()
    .filter(toy -> toy.getPrice() > 500)
    .collect(Collectors.toList());
    for (Toy toy2 : filterToys) {
      System.out.println(toy2.toString());
    }

    System.out.println("filter2 + map:");
    toys.stream()
    .filter(toy -> toy.getPrice() > 500)
    .map(toy -> toy.getName()) // -> String insteand of toy now
    .forEach(toyname -> {
    System.out.println(toyname.toString());
    });

    System.out.println("Distinct()");
    toys.stream()
    .distinct()
    .forEach(toy -> {
    System.out.println(toy.toString());
    });

    System.out.println("Comparator sort:");
    Comparator<Toy> toySortByPrice = (t1, t2) -> t1.getPrice() > t2.getPrice() ? -1 : 1;
    
    List<Toy> toylistbyprice = toys.stream()
    .sorted(toySortByPrice)
    .collect(Collectors.toList());
    toylistbyprice.forEach(toy -> {
      System.out.println(toy.toString());
    });

    
  }
}
  

      
      


