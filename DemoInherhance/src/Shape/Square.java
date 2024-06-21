package Shape;

public class Square extends Shape{
  private double height;
  private double width;

  public Square(double height, double width){
    this.height = height;
    this.width = width;
  }
@Override
  public double area(){
    return this.height * this.width;
  }
public static void main(String[] args) {
  Square s = new Square(5.3, 4.2);

  System.out.println(s.area());
}
  
}
