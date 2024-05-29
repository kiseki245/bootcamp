public class DemoWhileLoop {
  public static void main(String[] args) {
    System.out.println("This is For Loop:");
    for (int i = 0; i < 5; i++) {
      System.out.print(i);
      
    }
    System.out.println();
    System.out.println("This is While Loop:");
    
    int i = 0;
    while(i < 5){
      System.out.print(i);
      i++;
    }
    System.out.println();

    int[] arr = new int[] {10, -100, 9, 7};
    int count = arr.length;
    int sum = 0;
    while (count != 0) {
      sum += arr[count-1];// length is 4, -1 = 3 [7]
      count--;
    }
    System.out.println(sum);
    //Tutor answer
    sum = 0;
    count = 0;
    while (count < arr.length){
      sum += arr[count];
      count++;
      
    }
    System.out.println(sum);


    // 123 -. 1 + 2 + 3 = 6
    // 4563 -> 4 + 5 + 6 + 3 = 18
    int ans = 4563;
    count = 0;
    // System.out.println(ans % 10); -> 3 / 10 = 12
    sum = 0;
    while (ans > 0) {
      count = ans % 10;
      sum += count;
      System.out.print(count);
      ans = ans / 10;
      
    }
    System.out.println();
    System.out.println("sum of ans is " + sum);
  }


  //Reverse
  //54321 -> 12345
  
}
