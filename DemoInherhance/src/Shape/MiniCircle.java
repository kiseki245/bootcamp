package Shape;

public class MiniCircle extends Circle{
  private String color;
  
  public MiniCircle(double redius, String color){
   super(redius);
   this.color = color;
  }
  // @Override
  // public double area(){

  // }
  public static void main(String[] args) {
    MiniCircle mc = new MiniCircle(3.0d, "Red");
    System.out.println(mc.getRedius());
    System.out.println(mc.area());
  }
}
