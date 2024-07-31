package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Shape {

  abstract double area();

  
  //approach 1
  public static double area(List<Shape> shape){
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shapelist : shape) {
      bd = bd.add(BigDecimal.valueOf(shapelist.area()));
    }
    return bd.doubleValue();
  }
  // approach 2 : generics
  //<T extends Shape> is to describe the parent relationship
  public static <T extends Shape> double area2(List<T> shape){
  BigDecimal bd = BigDecimal.valueOf(0.0);
  for (Shape shapelist : shape) {
    bd = bd.add(BigDecimal.valueOf(shapelist.area()));
  }
  return bd.doubleValue();
}

public static double area3(List<? extends Shape> shapes){
  return -1.0;
}
//List<Object> vs List<T> different
  public static void main(String[] args) {
    //Circle vs Shape -> Parent
    //List<Shape vs List<Circle> -> NOT parent
    // List<Shape> shape = new LinkedList<Circle>(); <- So this is not allowed

    List<Shape> shape = new LinkedList<Shape>();
    shape.add(new Circle(5.0));
    shape.add(new Circle(4.9));
    shape.add(new Square(2));
    System.out.println(Shape.area(shape));

    System.out.println(Shape.area2(shape));
  

    // ArrayList<Square> object
    // ArrayList<Circle> 
    // List<? extends Shape> shape2 = new ArrayList<Object>(); 
    // The above case, the list not yet deteminding the type of list
    List<? extends Shape> shape2 = new ArrayList<Circle>(); // this super keyword different to the previous
    shape2 = new ArrayList<Square>();
    shape2.add(new Circle(3.4));
    shape2.add(new Square(4)); //NOT OK, during compile-time, we do not know the actual type of object reference by shape2
    //shape2.add(new Object());


    List<? super Shape> shape3 = new ArrayList<Object>();
    shape3.add(new Circle(3.4));
    shape3.add(new Square(3.4));
    shape3.add(new Bird());
    // during compile-time, we DO not know actual type of shape3

    List<Object> objects = new ArrayList<Circle>(); // NOT OK (Paramt)
    Object object = new Circle(2.4); // OK (Paramt)
  }
}
