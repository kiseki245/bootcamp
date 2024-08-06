import java.util.List;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Toy> toyStack = new Stack<>();

        toyStack.add(new Toy("ToyA", 123));

        toyStack.add(new Toy("Toy2", 122));
        toyStack.add(new Toy("Toy3", 111));

        System.out.println(toyStack.pop());
        System.out.println(toyStack.push(new Toy("Toy4", 222)));

        System.out.println(toyStack);
        List<Toy> toyList = new Stack<>();
        toyList.add(new Toy("ToyA", 123));

        toyList.add(new Toy("Toy2", 122));
        toyList.add(new Toy("Toy3", 111));

        System.out.println(toyList);
        toyList.remove(1);
        System.out.println(toyList);

    }
}
