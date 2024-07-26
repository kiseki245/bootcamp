import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
  

  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("Hello");
    strings.add("abc");
    strings.add("def");
    
    System.out.println(strings); // [abc, Hello, def] Order is not determind by insertionorder

    ArrayList<String> arrstrings = new ArrayList<>();
    arrstrings.add("Hello");
    arrstrings.add("abc");
    arrstrings.add("def");
    System.out.println(arrstrings); //Compare to HashSet: the order is following insertion order [Hello, abc, def]

    boolean hsResult = strings.add("Hello"); //Hashset - not adding duplicated value
    boolean hsResult2 = arrstrings.add("Hello");

    System.out.println(hsResult); //false
    System.out.println(hsResult2); //true

    System.out.println(strings); //[abc, Hello, def] 
    System.out.println(arrstrings); //[Hello, abc, def, Hello]
    


    System.out.println(strings.size()); //3
    System.out.println(strings.remove("abc")); //true
    System.out.println(strings.contains("Hello"));

    //isEmpty();
    //addAll();
    
  

    //
    String[] arr = new String[] {"abc", "def", "xyz", "def"};
    HashSet<String> result = new HashSet<>();

    //loop
    // for (int i = 0; i < arr.length-1; i++) {
    //   if (!(result.contains(arr[i])))
    //     result.add(arr[i]);
    //     }

    for (String s : arr){
      result.add(s);
    }
    System.out.println(result); //[abc, def, xyz]
        //Q2: Fond all duplicated
    result.clear();
    ArrayList<String> arrlist = new ArrayList<>();
    for (String s : arr) {
      if (!result.add(s))
      arrlist.add(s);
    }
    System.out.println(arrlist); //def
    
  }
}
