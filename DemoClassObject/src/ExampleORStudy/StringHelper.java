package ExampleORStudy;

public class StringHelper {
  private String str;

  // instance method
  public StringHelper setCharAt(int index, char ch){
    String s = new String("");

    for (int i = 0; i < this.str.length(); i++) {
      if (i == index){
        s += ch;
      } else {
        s += this.str.charAt(i);
      }
    }
    this.str = s;
    return this;
  }

  



public static void main(String[] args) {
  
}
}

