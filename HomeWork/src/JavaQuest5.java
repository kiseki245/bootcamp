public class JavaQuest5 {
  /**
   * 
   * When target = 'c', the expected output:
   * We found 3 character c in the String.
   * 
   * When target = 'z', the expected output:
   * Not Found.
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    // Use a loop to count the target of character in a String.
    // code here ...
    for (int i = 0; i < str.length(); i++){

    // if found, print "We found 3 character c in the String."
    // if not found, print "Not Found."
    // code here ...
      if (str.charAt(i) == target){
        System.out.println("We found " + i + " charactor " + target + " in the output");
        break;
     } else {
      System.out.println("Not Found");
     }

    }
  }
}