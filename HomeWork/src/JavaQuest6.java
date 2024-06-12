
public class JavaQuest6{
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence
    int last1 = 1;
    int last2 = 0;
    int sum;
    for (int i = 1; i <= 15; i++) {
      
        sum = last1 + last2;
        last2 = last1;
        last1 = sum;
      System.out.println(sum);
        
    }


    // for(int i = 1; i < 15; i++){

    }
  }

  
