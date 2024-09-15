import java.util.*;
import java.util.stream.Collectors;

public class StreamAndOptional {
    public static void main(String[] args) {


        List<Toy> toyList = new LinkedList<>();

        toyList.add(new Toy("Gundam", 123, ToyType.ROBOT));
        toyList.add(new Toy("Doll", 134, ToyType.DOLL));
        toyList.add(new Toy("Error", 1345, ToyType.TABLETOP));
        toyList.add(new Toy("EVA", 1345.3, ToyType.ROBOT));
        toyList.add(new Toy("Gundam", 124, ToyType.ROBOT));
        toyList.add(new Toy("Doll2", 68, ToyType.DOLL));
        toyList.add(new Toy("Error2", 599, ToyType.TABLETOP));

        List<Toy> ExpensiveToy = toyList.stream()
                .filter(toy -> toy.getPrice() > 1000)
//                .filter(toy -> toy.getName().charAt(0) == 'R')
                .collect(Collectors.toList());
        System.out.println(ExpensiveToy);

        List<String> RobotList = toyList.stream()
                .filter(toy -> toy.getType() == ToyType.ROBOT)
                .map(toy -> toy.getName())
                .collect(Collectors.toList());
        System.out.println(RobotList);

        List<Double> testlist = toyList.stream()
                .map(toy -> toy.getPrice())
                .filter(toy -> Double.valueOf(toy) > 1000)
                .collect(Collectors.toList());
        System.out.println(testlist);

        // distinct
        List<Toy> removeDuplicate = toyList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(removeDuplicate);

        Comparator<Toy> sortByPrice =
                (t1, t2) -> t1.getPrice() < t2.getPrice() ? -1 : 1;
        List<String> toylistSortedByPrice = toyList.stream()
                .filter(toy -> toy.getName() == "Gundam")
                .distinct()
                .sorted(sortByPrice)
                .map(toy -> toy.getName())
                .collect(Collectors.toList());
        System.out.println("Distinct" + toylistSortedByPrice);
        List<Double> toListDataType = toyList.stream()
                .map(toy -> toy.getPrice())
                .filter(toy -> toy > 1345)
                .collect(Collectors.toList());
        System.out.println(toListDataType);


        // Map + Key

        Map<ToyType, List<Toy>> toyMap = toyList.stream()
                .collect(Collectors.groupingBy(toy -> toy.getType()));
        System.out.println(toyMap);

        Map<ToyType, Double> toyMap2 = toyList.stream()
                .collect(Collectors.groupingBy(toy -> toy.getType(),
                        Collectors.summingDouble(toy -> Double.valueOf(toy.getPrice()))));
        System.out.println(toyMap2); // Sum the price by the ToyType


        //Optional
        System.out.println("Optional");
        List<Toy> toyList2 = new LinkedList<>();
        toyList2.add(new Toy("Gundam", 123, ToyType.ROBOT));
        toyList2.add(new Toy("Doll", 134, ToyType.DOLL));
        toyList2.add(new Toy("Error", 1345, ToyType.TABLETOP));
        toyList2.add(new Toy(null, 1345.3, ToyType.ROBOT));
        toyList2.add(new Toy("Gundam", 124, ToyType.ROBOT));
        System.out.println(toyList2);
        Optional<Toy> optName = Optional.empty();

        Optional<Toy> optToy = toyList2.stream()
                .filter(customer -> customer.getPrice() > 1000)
                .findAny();

        optToy.ifPresent(toy -> System.out.println(toy.toString()));

        Toy toy1 = new Toy(null, 123, null);
        Optional<String> result = Optional.ofNullable(toy1.getName());
        checkName(toy1.getName()).ifPresent(string -> {
                toy1.setName("Test");
        System.out.println("Optional name check: " + toy1.toString());
        });
        //orElse
        Optional<Toy> optToy2 = Optional.of(new Toy("Gun", 123));
        Toy toy2 = optToy2.orElse(new Toy("Sword", 144));
        System.out.println(toy2.toString()); //Name: Gun Price: 123.0 Type: null

        Optional<Toy> optToy3 = Optional.of(new Toy());
        Toy toy3 = optToy3.orElse(new Toy("Sword", 144));
        System.out.println(toy3.toString()); //Name: Gun Price: 123.0 Type: null
    }

    public static Optional<String> checkName(String s) {
        if (s == null)
            return Optional.ofNullable(null);
        return Optional.of("TEST");
    }
}
