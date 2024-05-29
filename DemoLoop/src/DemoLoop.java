public class DemoLoop {
    public static void main(String[] args) throws Exception {
        int x = 3;

        //for loop

        //Step 1: Int i = 0
        //Step 2: Check if i < 4 ? Yes
        //Step 3: print Helo
        //Step 4: i++ become 1
        //Step 5; 
        for (int i =0; i < 5; i++){
            System.out.println(i);
        }
        int y =3;
        for (int i2 = 0; i2 < 3; i2++){
            y *= 3;
        }
        System.out.println("y= " + y);


        for (int i = 0; i < 7; i++){
            if (i % 2 == 0 && i != 0){
                System.out.println("i = " + i);
            }
        }
        int sum = 0;
        for (int i = 0; i < 11; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
        
        System.out.println("Mixed");
        int sum2 = 0;
        for (int i = 0; i < 9; i++){
            if (i % 2 == 0 && i != 0){
                System.out.println("i = " + i);
                sum2 += i;
            }
        }
        System.out.println("sum2 = " + sum2);


        for (int i = 9; i != 0; i--){
            if (i % 2 == 0 && i != 0){
                System.out.println(i);
            }
        }
        //break
        System.out.println("//break");
        for (int i = 0; i < 10; i++){
            if (i > 7){
                break;
            }
            System.out.println(i);
        }
        //continue
        int total = 0;
        for (int i = 0; i < 5; i++){
            if (i > 3){ // When i = 4, skip "total +=1", goes to "i++"
                continue;
            }
            total += 1;
        }
        System.out.println("total = " + total);

        for (int i = 0; i < 5; i++) { // ROW
            for (int j = 0; j < 5; j++) { // Column
                System.out.print("*");
                // if (j == 4 ){ // 0, 1, 2, 3, 4 counted 5 times
                //     System.out.println();
                }
                System.out.println();
            }
        
        System.out.println("----------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        //* 
        //** 
        //*** 
        //**** 
        //***
        
        
        
        
        }

        
    }

