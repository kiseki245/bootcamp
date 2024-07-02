package Human;
public class Human extends SuperHuman implements Walkble, readble{
  // Class can only inherit instance methods, instance variable
  //Constructor CANNOT be inherited.
  public Human(){

  }
  public Human(double height){
    super(height);
  }
@Override
  public void walk(){
    System.out.println("Walking Now");
  }
@Override
  public void read(){
    System.out.println("Reading");
  }

  public static void main(String[] args) {
    System.out.println(Walkble.AGE);

    Human h1 = new Human(165);

    h1.walk();
    h1.run(); // I m running
    Walkble.swim();

    h1.read();
    System.out.println(h1.getHeight());
  }

}
