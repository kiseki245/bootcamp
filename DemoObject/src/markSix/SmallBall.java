package markSix;

import java.util.Objects;

public class SmallBall extends Ball{
  private String color;
  
  public SmallBall(int number, String color){
    super(number);
    this.color = color;
    
  }
  @Override
  public boolean equals(Object obj){
    if (this == obj){
      return true;
    }
    if (!(obj instanceof SmallBall)){
      return false;
    }
    SmallBall sb = (SmallBall) obj;
    return Objects.equals(this.color, sb.getColor())
    && Objects.equals(super.getNumber(), sb.getNumber());
  }

  public int hashCode(){
    return Objects.hash(this.color, super.getNumber());
  }
  public String getColor(){
    return this.color;
  }
  
  
  @Override
  public String toString(){
    return this.color + super.toString();
  }

  public static void main(String[] args) {
    SmallBall b1 = new SmallBall(1, "Green");
    System.out.println(b1.toString());
  }
}
