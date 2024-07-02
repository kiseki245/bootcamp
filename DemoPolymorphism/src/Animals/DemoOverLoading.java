package Animals;
import java.util.Arrays;

import Dog;

public class DemoOverLoading {
    private int a;
    private int b;
    
    public DemoOverLoading(int a, int b){
        this.a = a;
        this.b = b;
    }

    public DemoOverLoading(int a){
        // this.a = a;
        // this.b = 100;
        this(a, 100);
    }
    public DemoOverLoading(double a, double b){
        this.a = (int) a;
        this.b = (int) b;
    }
    //Method Signature = method name + parameter(s);
    
    public static int sum(int x, int y){
        return x + x;
    }

    // public static int sum(int x, int y){ // Duplicate method, even if different return type
    //     return x + y;
    // }

    public static double sum(double x, double y){
        return x + y;
    }

    public static void sum(Object x, Object y){
        System.out.println("Calling void sum (Object x, Object y)");
    }

    public static void sum(Animals x, Animals y){
        System.out.println("Calling void sum (Animanls x, Animalx y)");
    }

    public static long sum(long x, int y){
        return x + y;
    }

    public static long sum(int x, long y){
        return x + y;
    }
    public static void main(String[] args) throws Exception {
        //Purpose of Overloading
        //The design of overloading for method is to let user (method user) easier to use.
        
        
        //Example 1
        String a = String.valueOf(true);
        String b = String.valueOf(2.0);
        String[] arr = new String[] {"abc", "def", "HiHi"};
        String c = String.valueOf(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.valueOf(arr[i]));
        }
        System.out.println();
        //Example 2:
        System.out.println(sum(1, 2));
        System.out.println(sum(2.0, 2.1));
        System.out.println(sum(2.2, 2L)); //double + double (Upcasting)

        System.out.println(sum((byte) 3, (short) 9)); //12 or 12.0, calling the int sum() instead of double sum()
        
        sum(arr, c); // Calling void sum(Objecy Object)

        System.out.println(sum(10L, 12L)); // 22.0 long -> double

        sum(new Dog(), new Dog());// Calling void sum

        //What if the method parameter are the type of Wrapper Class
        }
}
