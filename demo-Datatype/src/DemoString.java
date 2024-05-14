public class DemoString {
  public static void main(String[] args){
    // String store text
    String x = "Hello";
    String y = "World";
    String dollar = "HKD";
    System.out.println(x + " " + y);
    System.out.println(dollar);

    //2024.05.14
    char a = 'A';
    String message = "The name is::" + a; //char -> String

    //String Method (Tool) lenth()
    String t = "Hello";
    System.out.println("The length of t = " + t.length()); // 

    if (t.length() >= 4){
      System.out.println("Yes! t >= 4");
    } else {
      System.out.println("NO! t <= 4");
    }

    //Method 2: equals()

    String s1 = "Hello";
    String s2 = "Hi";

    if (s1.equals(s2)){
      System.out.println("S1 = S2");
    } else if (!s1.equals(s2)){ // ! means not
      System.out.println("s1 != s2");
    }



    if(s1 != s2){
      System.out.println("Check if they are same obj"); // <-- Not suggested to use
    } 

    //check if s1 length >= 6 or s1 equals s2

    if (s1.length() > 6 || s1.equals(s2)){
      System.out.println("S1 length > 6 or equals s2");
    } else {
      System.out.println("S1 not reached any critera");
    }
    
    if (s1.length() > 6){
      System.out.println("S1 length > 6 or equals s2");
    } else if (s1.equals(s2)){
      System.out.println("S1 not reached any critera");
    }

    //if contain are and = use the &&

    // Method 3: charAt(int index), e.g: charAt(0)
    String s3 = "Hello World";
    System.out.println("The 1st charactor of s3 is " + s3.charAt(0));
    // 0 = w
    // 1 = o
    // 2 = r
    // 3 = l
    // 4 = d
    // charAt(-1); <- - is not allowed
    System.out.println(s3.charAt(s3.length() - 1));
    // check if the last charactor is d and length > 5
    if (s3.charAt(s3.length() - 1) == 'd' && s3.length() > 5 ){
      System.out.println("Yes");
    } else {
      System.out.println("No!");
    }
    
    //Method 4 subString(int beginIndex, int endIndex)
    String result = s3.substring(0, 2); // 0 will take "h" but 2 will take endindex - 1 "e"
    String result2 = s3.substring(3, 5); // 0 will take "h" but 2 will take endindex - 1 "e"

    System.out.println(result); //he 
    System.out.println(result2); // Helloe 
    System.out.println(s3.substring(0, 0));
    System.out.println(s3.substring(0, 9));
    //System.out.println(s3.substring(5, 3)); < Not allowed

    //check first 3 charactor is "wel" if yes, print yes
    String x3 = "Welcome";
    if (x3.substring(0, 3).equals("Wel")){
    System.out.println("Yes");
  } else {
    System.out.println("No!");
  }

  System.out.println(x3.substring(0, 3).length()); //3
  System.out.println(x3.substring(0, 3).charAt(1)); //e

  String x4 = x3.substring(0, 3);
  int l1 = x4.length();
  System.out.println(l1); // 3, same as line 86 - 89 but not a good choice


  }
}
