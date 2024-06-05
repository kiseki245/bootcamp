public class StringMethod {
  
  public static void main(String[] args) {
    

    String E1 = "Hello Eddie";
    System.out.println(E1.length()); // Not count as index

    //CharAt(int index)
    System.out.println(E1.charAt(1)); // e, H = 0 -> e = 1

    //isEmpty() isBlank();
    String S1 = "";
    String S2 = " ";

    System.out.println(S1.isBlank()); // true
    System.out.println(S1.isEmpty()); // true
    System.out.println(S2.isBlank()); // true
    System.out.println(S2.isEmpty()); // false
    System.out.println(E1.isBlank()); // false
    System.out.println(E1.isEmpty()); // false

    //subString(int startIndex, int endsIndex)
    //Only print out "Hello" of String value E1:
    System.out.println(E1.substring(0, 5) + "!"); // endstring - 1
    //Only print "Eddie" this time:
    System.out.println(E1.substring(6, 11) + "!");
    
    //Replace: Goodbye to Hello
    System.out.println(E1.replace("Hello", "Goodbye,")); //Goodbye, Eddie
    System.out.println(E1);

    System.out.println(E1.contains("Eddie")); // true
    System.out.println(E1.contains("Eddie")); // false

    System.out.println(E1.startsWith("H")); //true
    System.out.println(E1.startsWith("B")); //false

    //concat() -> append 
    String E3 = "Eddy";
    System.out.println(E3.concat(" is Kujila")); // Eddy is Kujila
    System.out.println(E3); // Eddy
    E3.concat(" is whale");
    System.out.println(E3); // Eddy

    //compareto vs equals
    
  }
}
