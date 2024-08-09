import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayException {

  public static void main(String[] args) {
    
  
  int[] arr = new int[5];
  arr[0] = 1;
  arr[1] = 2;
  arr[2] = 3;
  arr[3] = 4;
  arr[4] = 5;
  // arr[5] = 6; //java.lang.ArrayIndexOutOfBoundsException

  int idx = 0;
  if (idx >= 0 && idx < arr.length){
    arr[idx] = 10;
  }
  
  try {
    arr[5] = 1;
  } catch (ArrayIndexOutOfBoundsException e){
    // send email to someone
  }

    String str = "Hello";
    str.charAt(1); 
    // str.charAt(str.length()); //java.lang.StringIndexOutOfBoundsException
    str.substring(0, str.length());
    System.out.println("h");

  int result = Integer.parseInt("1");
  System.out.println(result); // 1

  // int result2 = Integer.parseInt("Hello"); //java.lang.NumberFormatException
  // System.out.println(result2); 
    //fix
  int result3;
  try {
    result3 = Integer.parseInt("Hello");
  } catch (NumberFormatException e){
    result3 = -1;
    System.out.println("Number Firnat Exception: " + e.getMessage());
  }
  System.out.println(getDescription(4));

  int age = -1;
  try {
    getDescription(age);
  } catch (IllegalArgumentException e){
    System.out.println(e.getMessage());
  }

  List<String> strings = new ArrayList<>();
  // strings.get(0); // java.lang.IndexOutOfBoundsException

  List<String> strings2 = new LinkedList<>();
  // strings2.get(0); //java.lang.IndexOutOfBoundsException -> the firs node is empty
}

public static String getDescription(int age){
  if (age < 0)
  throw new IllegalArgumentException("Age should not be netgative"); 
  if (age >= 66)
    return "Elder";
  if (age >= 18)
    return "Adult";
  return "Childen";
  
  }
}
