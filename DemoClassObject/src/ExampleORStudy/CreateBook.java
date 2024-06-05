package ExampleORStudy;
public class CreateBook {
  public static void main(String[] args) {
    //the purpose of static method -> produce something by the input parameters
    Book b1 = new Book();
    b1.setNumber(123);
    b1.setType("Hello World");
    System.out.println(b1.getNumber());
    System.out.println(b1.getType());
    System.out.println(b1.getSold());

    Book b2 = new Book();
    b1.setNumber(1234);
    b1.setType("Hello World (Sold)");
    System.out.println(b1.getNumber());
    System.out.println(b1.getType());
    System.out.println(b1.getSold());
  }
  

}
