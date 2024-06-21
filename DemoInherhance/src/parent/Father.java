package parent;

public class Father {
 

  private String name;
 //When there is a non-empty constructor, the class will remove the empty constructor
  public Father(){}
 
  public Father(String name){
    this.name = name;
  }
}
