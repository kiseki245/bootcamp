import java.util.List;
import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> ss = new Stack<>();
  
    ss.add("Hello");
    ss.add("World");
    ss.add("abc");
    System.out.println(ss); // [Hello, World, abc]
    System.out.println(ss.pop()); //abc, remove and return the last element
    System.out.println(ss.pop());// World

    ss.push("bbb");

    System.out.println(ss); //[Hello, bbb]

    List<String> ss2 = new Stack<>();

    // ss2.push("abc"); List didn't contains the push() methd
    ss2.add("Hello");
    ss2.add("World");
    ss2.remove("World");
    System.out.println(ss2);

    
  }
}
