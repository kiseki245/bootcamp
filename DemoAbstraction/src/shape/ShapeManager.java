package shape;

public class ShapeManager {
  private Shape shape; // attribute can be an interface


  //Disgn implication:
  // You should put an object which implemented the contract (interface)
  // so that the parameter object MUST contain area() method
  public ShapeManager(Shape shape){
    this.shape = shape;
  }

  public boolean isTooBig(){
    return shape.area() > 20.0;
  }
  public static void main(String[] args) {
    Shape cricle = new Cricle(3.0);
    ShapeManager shapeManager = new ShapeManager(new Cricle(3.0));

    System.out.println(shapeManager.isTooBig());
    };
  }

