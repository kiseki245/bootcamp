package Quiz;

public class Password{

  public static void main(String[] args){
    StringBuilder s = new StringBuilder("abc");
    boolean bool = s.append("def").startsWith("def");
    System.out.println(bool);
  }

  
}
