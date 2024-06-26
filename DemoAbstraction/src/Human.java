public class Human implements Walkble, readble{
  
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

    Human h1 = new Human();

    h1.walk();
    h1.run(); // I m running
    Walkble.swim();

    h1.read();
  }

}
