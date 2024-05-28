import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) throws Exception {
        int x1 = 10;
        int x2 = 20;
        int x3 = 30;
        
        int[] arr = new int[3]; //store int value only, and the length = 3
        //When you create an array object, you have to define the length of it
        
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        //arr[0] = "String"; //Compile-time exception
        System.out.println(arr[0] + arr[1] + arr[2]); //60
        System.out.println(arr[1]);
        
        arr[1] = 100;;
        System.out.println(arr[1]);
        
        // Run-time execption
       // arr[3] = 200; // index 3 is out of bouns for length 3
    
        int[] arr2 = new int[] {10, 20, -3};
        System.out.println(arr2[1]);

        String[] sarr = new String[] {"Hello", "world", "!"};
        System.out.println(sarr[0] + " " + sarr[1] + sarr[2]);

        //Arrays. <- method
        System.out.println(Arrays.toString(sarr)); // [Hello, world, !]
        System.out.println(Arrays.toString(arr)); // [10, 100, 30]


        int[] arr3 = new int[] {9, -3, -100, 90, 66, 4};
        for (int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + " "); // 9 -3 -100 90 66 4
        }
        System.out.println(" ");

        System.out.println("Find max");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr3.length; i++){

            if (arr3[i] > max){
                max = arr3[i];
            }
      }
        System.out.println("Max = " + max);  

        System.out.println("Find min");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr3.length; i++){

          if (arr3[i] < min){
              min = arr3[i];
          }
        }
        System.out.println("Min = " + min);  


        char[] charr = new char[] {'l', 'e', 'e', 'r', 'q'};
        //1. Count the number of 'e'
        int count = 0;
        for (int i = 0; i < charr.length; i++){
            
            if (charr[i] == 'e'){
                count ++;
            }
        }
        System.out.println("charr array have " + count + " 'e'");
    

        //2. boolean result to stars if 'r' exists
        boolean arrcheck = false;
        for (int i = 0; i < charr.length; i++){
            
            if (charr[i] == 'r'){
            arrcheck = true;
            System.out.println("R is exist");
            break;
        }  else{
            continue;
        }
        }
        System.out.println("Does R exis? " + arrcheck);
        String s = "";
        //3. String result to store "great"
        for (int i = charr.length - 1; i >= 0; i--) {
            s += charr[i];
        }
        System.out.println("Reversed char[] = " + s);
        //4. Given two charr[], result -> append all charactors to a String value

        char[] c1 = new char[] {'o', 'a', 'k', 'p'};
        char[] c2 = new char[] {'a', 'b', 'f', 't'};

            // 4a. result -> "oakpabft". append all characters to a String value
        String r1 = "";
        for(int i = 0; i < c1.length; i++){
            r1 += c1[i];
        }
        for (int i = 0; i < c2.length; i++) {
            r1 += c2[i];
        }
        System.out.println(r1);

// 4b. result -> "obkt". when even index, get the value from c1. when odd index, get the value from c2
       String r2 = "";
       int length = c1.length > c2.length ? c1.length : c2.length; // if c1 > c2 return left side value (c1.length), else return right side value (cs.length)
        for(int i = 0; i < length; i++){
            if (i % 2 == 0){
                    System.out.print(c1[i]);
                    r2 += c1[i];
            }else if (i % 2 != 0){
                    System.out.print(c2[i]);
                    r2 += c2[i];
                }
            
        }
        System.out.println(r2);
            //tutor ansowe
            //4a:


            
            char[] c3 = new char[] {'o', 'a', 'k', 'p', 'a', 'b'};
            char[] c4 = new char[] {'a', 'b', 'f', 't'};
            String r3 = "";
            int length2 = c3.length > c4.length ? c3.length : c4.length; // if c1 > c2 return left side value (c1.length), else return right side value (cs.length)
             for(int i = 0; i < length; i++){
                // if (i > c3.length || i > c4.length){
                //     break;
                // }
                 if (i % 2 == 0 && i < c3.length){
                         r3 += c3[i];
                 }else if (i % 2 == 1 && i < c4.length){
                         r3 += c4[i];
                     }
                 
             }
             System.out.println("r3 is " + r3); //obkta

             //average
             

             //swaping in array
             int[] arr6 = new int[] {6, 10, -4, 13};
            //swap -4 and 6 -> [-1, 10, 6, 13]
            // int save = arr6[2];
            // arr6[2] = arr6[0];
            // arr6[0] = save; 
            //  System.out.println(Arrays.toString(arr6));
            
             int t = 0;
             // Level 1:
             //move -4 to the tail of the array
             for (int i = 0; i < arr6.length - 1; i++) {
                t = arr6[i];
                arr6[i] = arr6[i+1];
                arr6[i+1] = t;                
             }
             System.out.println(Arrays.toString(arr6));
            //Level 2
             //Move the max element to the tail
             // New:[10, -4, 13, 6]
             // Result [10, 6, -4, 13]
             
            for (int i = 0; i < arr6.length-1; i++) {
             
                if (arr6[i] > arr6[i+1]){
                    t = arr6[i];
                    arr6[i] = arr6[i+1];
                    arr6[i+1] = t;
                }

            }
            System.out.println(Arrays.toString(arr6));

             //Sorting -> {-4, 6, 10, 13}
            //Now [10, 6, -4, 13]
            int save = 0;
             int maxnum = Integer.MIN_VALUE;
             for (int i = 0; i < arr6.length-1; i++) {
                
                for (int j = 0; j < arr6.length-1; j++) {
                    if (arr6[j] < arr6[i]){
                        save = arr6[j];
                        arr6[j] = arr6[j+1];
                        arr6[j+1] = save;
                    }
                }
             }
             System.out.println(Arrays.toString(arr6));

             String str = "hello"; // Result -> holle
             //convert to char[]
             char[] newstr = new char[str.length()];
             for (int i = 0; i < str.length(); i++) {
                newstr[i] = str.charAt(i);
             } // newstr = str.toCharArray();
             // char[] strarry = str.toCharArray();
             System.out.println(Arrays.toString(newstr));
             char w = newstr[4];
             newstr[4] = newstr[1];
             newstr[1] = w;
             str = String.valueOf(newstr);
             System.out.println(str); // hole

    }
}
