public class DemoMethod {
    public static void main(String[] args) throws Exception {
        //Method: you put something into the box, and then it return somethind to you
        System.out.println("Hello");
        
        
        //Call method sum
        int result = sum(10, 3);
        System.out.println("result is " + result); //1
        
        System.out.println(lastChar("Hlo")); // o 
        char[] arr = new char[] {'a', 'b', 'c'};
        System.out.println(arr);
        int[] arr2 = new int[] {1, 2, 10};
        System.out.println(max(arr2));

        //
        int age = 66;
        System.out.println(isElderly(age));

        System.out.println(isSubString("Hello", "He"));
        System.out.println(cricleArea(5));
        // double * double (problem)
        //BigDecimal
        System.out.println(0.2 * 0.1);
    }

    public static int sum(int x, int y){
        //if your method is with return type,
        //the mthod content should contain a keyword "return"
        
        return x + y; //10 , 3 from main int + int = int
    }

    public static char lastChar(String s){
        
        return s.charAt(s.length() - 1);
    
    }

    public static String toString(char[] arr){
        //Approach 1
        // String result = "";
        // for (int i = 0; i < arr.length; i++){
        //     result += arr[i];
        // }
        // return result;

        return String.valueOf(arr);
    }

    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            max = arr[i];
        }

        return max;
    }

    public static boolean isElderly(int age){
        // boolean iseld;
        // if (age > 65){
        //     iseld = true;
        // } else {
        //     iseld = false;
        // }


        // return iseld;
        
        //Approach 2
        return age > 65;
    }

    public static boolean isSubString(String str, String substr){
        //Approach 1:
        return str.contains(substr);

        //Approach 2:
        //indexOf() method returns an int index, which is index position substring
        // if it returns -1, means not exist.
        // return str.indexOf(substr) != -1;

        // Approach 3:

        //JAVA -> Pie
    
    }
        public static double cricleArea(int radios){
            // sum += value < 0 ? value * -1 : value;
            
            return radios * radios * Math.PI; // int * int * double -> double
        }
    }


