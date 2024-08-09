import java.util.LinkedList;
import java.util.List;

public class Box {
  private List<Ball> balls;
  private int capacity;
  public Box(){
    balls = new LinkedList<>();
  }
  public void add(Ball ball){
    balls.add(ball);
  }

  public List<Ball> getBall(){
    return this.balls;
  }

  public class Ball{
      public int getCapacity(){
        return capacity;
      }
  }
}
