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

    // isEmpty()
    // Empty String value -> ""
    String x7 = " "; // This is not are empty string, space not count as empty
    System.out.println(x7.isEmpty()); // flase
    System.out.println(x7.length() == 0); // flase
    String x8 = "";
    System.out.println(x8.isEmpty()); // true
    
    // isBlank()
    String x9 = "";
    System.out.println(x9.isBlank()); // true
    x9 = " ";
    System.out.println(x9.isBlank()); // true
    System.out.println(x9.isEmpty()); // false
    // isEmpty() is check the length of the variable
    // isBlank() check the value of the variable

    //subString(0, 3)
    //subString(0)
    String s10 = "Hello";
    System.out.println(s10.substring(0)); // "Hello", from index 0 to the end
    System.out.println(s10.substring(0, 3)); //"Hel", from index 0 to the index 2 (3-1)

    //hello -> HELLO
    System.out.println(s10.toUpperCase()); // HELLO
    System.out.println(s10.toLowerCase()); // hello
    System.out.println(s10.replace('l', 'x')); //HeXXo
    System.out.println(s10.replace("ll", "HiHI")); // HeHiHio
    System.out.println(s10.replace("lll", "s")); // Hello, no match result


    System.out.println(s10.contains("ell")); //true
    System.out.println(s10.contains("s")); //false

    //startsWith() -> check prefix

    System.out.println(s10.startsWith("he")); // false
    System.out.println(s10.startsWith("He")); // true
    //endwith -> check surfix
    System.out.println(s10.endsWith("lo")); //true

    //trim() <- removing the space charactors at the head/tail of the String
    String s12 = "    Hello,  Bootcamp     ";
      System.out.println(s12.trim()); //Hello,  Bootcamp


      String[] strings = new String[] {"Hello", "abcijk", "vincent", "HeLLo", "  HELLO  "};
      // how many string contains "ELL", but ignore case
      // "eLL", "ell", "ELL"....
      String p = "";
      for (int i = 0; i < strings.length; i++) {
        p = strings[i];
        p.toUpperCase();
        if (p.contains("ELL")){
            System.out.println(strings[i]);
        }
      }
  }
}
