import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) throws Exception {
        
        Integer[] integers = new Integer[] {2, 10, -4};
        //foreach
        int sum = 0;
        for (Integer i : integers){
            sum += i;
        }
        System.out.println(sum); // 8

        //1. Remove 10
        integers[1] = null;
        //2. Remove 10, and re-create array -> [2, 4]
        Integer[] integerarr = new Integer[integers.length - 1];

        // ArrayList

        ArrayList<Integer> integers2 = new ArrayList<Integer>(); // call constructor of ArrayList.class
        integers2.add(2);
        integers2.add(10);
        integers2.add(-4);
        
        sum = 0;
        for (Integer i : integers2){
            sum+=i;
        }
        
        System.out.println(sum); //8, same to arry "integer"
        // Difference between Integer[] and ArrayList<Integer>
        // 1. Initialzation: Array (fixed length), ArrayList (variable length)
        // 2. Underlying structure: Array is a raw DS in Java, ArrayList is a class (array)
        
        System.out.println(integers2.size()); //3
        integers2.remove(1); // 10
        System.out.println(integers2);
        
        integers2.set(1, -100);
        System.out.println(integers2); // [2, -100]

        System.out.println(integers2.contains(2)); //true

        System.out.println(integers2.indexOf(-100)); //1
        System.out.println(integers2.indexOf(-1000)); //-1
        System.out.println(integers2.indexOf(2)); //0

        integers2.add(2);
        System.out.println(integers2.indexOf(2)); //0, will find the first result only
        System.out.println(integers2.lastIndexOf(2)); //2, will find the last result only


        System.out.println(integers2.subList(1, 2));
        System.out.println(integers2); // remains 2, -100, 2, like BigDecimal and String ArrayList will not modify itself

        ArrayList<Integer> integers3 = new ArrayList<Integer>();
        integers3.addAll(integers2);
        System.out.println("integers3 is " + integers3);

        System.out.println(integers3.isEmpty()); //false
        
        ArrayList<String> strings = new ArrayList<>(); //You can skip the type declaration 
        strings.add("Hello");
        strings.add("abc");
        strings.add("World");
        strings.remove(1);
        System.out.println(strings);
        strings.add("Hello");
        strings.remove("Hello");
        System.out.println(strings); //[world, hello] will remove the first equal item only


        //Question 1: Give String[], remove those string with length > 3

        String[] arr = new String[] {"abc", "a", "", null, "aaaa"};
        ArrayList<String> result = new ArrayList<>();
        for (String string : arr) {
            if (string == null)
                continue;
            if (string.length() > 3) 
                result.add(string);
        }
        
        System.out.println(result);


        // Question 2: -> Class customer


        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new String("abc"));
        objects.add(1);
        objects.add(LocalDate.of(2024, 5, 22));
        objects.add(new HKID("A1234567"));

        System.out.println(objects);
        //String, int (Autobox to Integer), LocalDate, HKID is the subclass of Object so it is able to add 
        
        for (Object obj : objects) {
            if (obj.equals(new String("abc"))){ //String object equals()
                System.out.println("Hello String");
            } else if(obj.equals(new HKID("A1234567"))){ //HKID object equals()
                System.out.println("hello HKID");
            } else if(obj.equals(new Integer(1))){ // Integer class object equals()
                System.out.println("hello Integer");
            } else if(obj.equals(LocalDate.of(2024, 5, 22))){ // LocalDate equals()
                System.out.println("Hello Date");
            };
        }
        // print
        // check ifthe object equals
        // Compare the di
    }
}
