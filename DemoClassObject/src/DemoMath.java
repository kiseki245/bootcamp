public class DemoMath {
    public static void main(String[] args) throws Exception {
        

        //abs()
        int x = 3;
        int y = 8;
        int result = Math.abs(x * y); //int * int
        
        System.out.println(result);
        
        double d = 3.3d;
        double result2 = Math.abs(d * x); // double * int -> double
        System.out.println(result2);


        long l = 9L;
        long result3 = Math.abs(l * x);
        System.out.println(result3);

        //max()
        System.out.println(Math.max(10, 9)); // 10
        System.out.println(Math.min(10, 9)); // 9


        int[] arr = new int[] {4, -3, 11, 2};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);// 11

        //min()

        //round()
        double d1 = 3.69d;
        System.out.println(Math.round(d1)); // 4
        System.out.println(Math.round(3.4)); //3
        System.out.println(Math.round(5.5)); //6
        System.out.println(Math.round(3.432)); //3


        //pow()
        double r4 = Math.pow(2,3);
        System.out.println(r4); //8.0
        System.out.println(Math.pow(2.2, 3)); //10.648000000000003

        System.out.println(Math.sqrt(25)); //5.0
        System.out.println(Math.sqrt(24)); // 4.898979485566356
        System.out.println(Math.sqrt(-1)); // NaN


        // random() -> between 0.0 and 1.0
        System.out.println(Math.random()); // 0.8862628325898996
        System.out.println(Math.round(Math.random() * 10)); //9

        

    }
}
