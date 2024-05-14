

public class DemoSwitch {
  public static void main(String[] args) {
    
    char grade = 'A';
    switch (grade) {
      case 'A':
      System.out.println("Grade is " + grade);
      break; // break the whole statement
      case 'B':
      System.out.println("Grade is" + grade);
      break;
      case 'C':
      System.out.println("Grade is " + grade);
      break;
      default:
      System.out.println("No Grade");
    }
    if (grade == 'A' || grade == 'B' || grade == 'C'){
      System.out.println("The grade is " + grade);
      
    } else {
      System.out.println("No grade");
    }

    int x = 0;
    switch (grade) {
      case 'A':
      System.out.println("Grade is " + grade);
      x += 10;
      System.out.println("Grade updated to " + x);
      case 'B':
      System.out.println("Grade is " + grade);
      x += 10;
      System.out.println("Grade updated to " + x);
      case 'C':
      System.out.println("Grade is " + grade);
      x += 10;
      System.out.println("Grade updated to " + x);
      default:
      System.out.println("No Grade");
    }
    System.out.println(x);

    Scanner input = new Scanner(System.in);
    int month = input.nextInt(); // line of input -> int
    
  }
}
