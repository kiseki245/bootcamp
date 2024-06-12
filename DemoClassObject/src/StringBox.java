public class StringBox {
  
  private String str;

  public StringBox(String str){
    this.str = str;
  }

  public String toString(){
    return this.str;
  }
  public StringBox append(String s){
    this.str += s;
    return this;
  }
  public String substring(int startIdx, int endIdx){
    String s = "";
    for (int i = 0; i < str.length(); i++) {
      if (i >= startIdx && i <= endIdx){
        s += this.str.charAt(i);
      }
    }
    return s;
  }

  public static void main(String[] args) {
    StringBox sh = new StringBox("Hello");
    sh.append("World");
    System.out.println(sh.toString());
    System.out.println(sh.substring(2, 5));

    
  }
}
