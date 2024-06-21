import java.util.Objects;

public class Minicat {
  
  private String name;
  private String color;
  public Minicat(String name, String color){
    this.name = name;
    this.color = color;
  }

  //hashCode is an int value to represent if this two cat are same cat
  @Override
  public int hashCode(){
    return Objects.hash(this.name, this.color);
  }
}
