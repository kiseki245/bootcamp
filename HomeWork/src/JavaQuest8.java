/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;
    // code here ...
    secondMax = Integer.MIN_VALUE;

    int maxnum;
    maxnum = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++){
      
          // if (nums[i] < minnum){
          //   minnum = nums[i];
          //   System.out.println("Min = " + minnum);
          // } 

          if (nums[i] > maxnum){
            maxnum = nums[i];
            System.out.println("Max = " + maxnum);
          }
            for (int j = 0; j < nums.length; j++) {
              if (nums[i] < maxnum && nums[i] != maxnum && nums[i] > secondMax){
                secondMax = nums[i];
                System.out.println(secondMax);
          }
          }


    }   
    System.out.println("Second Max = " + secondMax);
   
  }
}