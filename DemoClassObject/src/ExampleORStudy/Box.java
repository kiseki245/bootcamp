package ExampleORStudy;

import java.util.Arrays;

public class Box {

  private static String prefix = "apple"; // static variable (Belongs to class)
  private String name;

  private String[] strings; //Instance variable
  
  public Box(){
    this.strings = new String[0];
  }
  public void setName(String name){
    this.name = Box.prefix + name;
  }
  public String[] geStrings(){
    return this.strings;
  }
  public void setString(int index, String s){
    this.strings[index] =s;
  }


  public void addString(String s){
    
    String[] arr = new String[this.strings.length + 1];
    for (int i = 0; i < this.strings.length; i++){
      arr[i] = this.strings[i];
    }
    arr[arr.length - 1] = s;
    this.strings = arr;

  }

  public void deleteString(String s) {
    // revise the arr length
    // remove corresponding Strings
    String[] arr = new String[this.strings.length-1];

    int add2 = 0;
    for (int i = 0; i < this.strings.length; i++) {
        if (s.equals(this.strings[i])){
            continue;

        } else {
            arr[add2] = this.strings[i];
            add2 += 1;
        }
    }
    this.strings = arr;
    }

  public void getName(){

  }
  public String toString(){
    return "Box" + Arrays.toString(strings);
  }
  public static void main(String[] args) {
    // Box box = new Box(new String[] {"Hello", "abc"});
    Box box = new Box();
    
    box.addString("Hello");
    box.addString("World");

    box.setString(1, "World");
    box.addString("test");
    System.out.println(Arrays.toString(box.geStrings()));
    System.out.println(Arrays.toString(box.geStrings()));
    
    //static variable
    Box box2 = new Box();
    System.out.println(box2.prefix);
  }
  
}
