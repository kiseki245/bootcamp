import java.math.BigDecimal;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaExpressDemo {

    public static void main(String[] args) {
        TestInterface t = new TestInterface(){
            @Override
            public void tester(){
                System.out.println("Tester program...");
            }

        };

        t.tester();

        //Lambda expression
        TestInterface tester = () -> System.out.println("In testing"); //LambdaExpressDemo$$Lambda$14/0x0000000801003600@2f4d3709

        System.out.println(tester.toString());
        tester = () -> System.out.println("In testing now..."); //LambdaExpressDemo$$Lambda$15/0x0000000801003810@1d81eb93

        System.out.println(tester);

        Calnumber add = (a, b) -> a+b;
        System.out.println(add.calsomeing(1,3));
        Calnumber divide = (a, b) -> a / b;
        try {
            System.out.println(divide.calsomeing(5, 0));
        } catch (ArithmeticException e){
            System.out.println("Found the  0 in the formula");
        }

        //Function class
        // public interface Function<T, R>
        // R apply(T t);

        Function<String, Character> prefix = str -> 'C';
        Function<String, Character> checkPrefix = str -> str.charAt(0);
        System.out.println(checkPrefix.apply("Hello"));

        Function<String, Character> lastPrefix = str  -> str.charAt(str.length()-1);
        System.out.println(lastPrefix.apply("World"));

        Function<Toy, BigDecimal> getDiscount = Toy -> {
            BigDecimal discountPrice = BigDecimal.valueOf(Toy.getPrice()).multiply(BigDecimal.valueOf(0.8));
            return discountPrice;
        };
        System.out.println(getDiscount.apply(new Toy("Robot", 1345)));

        // Consumer
        // public interface Consumer<T> {
        // void accept(T t);

        Consumer<Toy> printToy = Toy -> System.out.println("Name: " + Toy.getName() + "\n" + "Price: " + Toy.getPrice());
        printToy.accept(new Toy("Robot", 133245));

        BiConsumer<String, String> createToy = null;
        String ttype = "Robot";
        switch (ttype.toUpperCase().charAt(0)){
            case 'R':
                createToy = (tname, message) -> System.out.println(new Toy(tname + message));

                break;
        }

        createToy.accept("Test ", "Message");
    }
}
