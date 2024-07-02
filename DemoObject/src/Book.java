import java.time.LocalDate;
import java.util.Objects;
//public cass Book extends Object {}
public class Book { //Implicity inherit Object.class
  private String aurthor;
  private LocalDate publishDate;
  
  public Book(String aurthor, LocalDate publishDate){
    this.aurthor = aurthor;
    this.publishDate = publishDate;
  }

  public String getAurthor(){
    return this.aurthor;
  }
  public LocalDate getPubLocalDate(){
    return this.publishDate;
  }

  //If you
  @Override
  public int hashCode(){
    return Objects.hash(this.aurthor, this.publishDate);
  }
 
  //If you override it, the purpose is to make it become ture even if they are 2 different objects in heap memory
@Override
public boolean equals(Object obj){
  if (this == obj){ //this = b1, obj = b2
    System.out.println("Same object");
    return true;
  } 
  //"Instanceof" is checking if the object pointing by reference is an object
  // produced by Book.class
  if (!(obj instanceof Book)){
    return false;
  }
  Book book = (Book) obj;
  return Objects.equals(this.aurthor, book.getAurthor()) 
    && Objects.equals(this.getPubLocalDate(), book.getPubLocalDate());

  // Book book = (Book) obj;
  // if (book.getAurthor().equals(this.aurthor) && book.getPubLocalDate().compareTo(this.publishDate) == 0){
  //   return true;
  // }
  // return false;
}



  public static void main(String[] args) {
    Book b1 = new Book("John", LocalDate.of(2000, 12, 12));
    Book b2 = new Book("John", LocalDate.of(2000, 12, 12));

    System.out.println(b1.hashCode()); // 75848450
    System.out.println(b2.hashCode()); // 75848450

    Book b3 = new Book("John", LocalDate.of(2000, 12, 13));

    System.out.println(b3.hashCode()); // 75848451

    System.out.println(b1 == b2); //false, this is checking the object reference

    System.out.println(System.identityHashCode(b1));
    System.out.println(System.identityHashCode(b2)); //b1 b2 is different object
    //But their hashcode are same by hashCode()

    System.out.println(b1.equals(b2)); // Object.class has equals() method 
    //If you didn't override, equals() iby default checking object address
  
  
    System.out.println(b1.equals(new Cat())); //If both objects are located in different address.
    System.out.println(b1.equals(b2)); // true, after override
    System.out.println(b1.equals(b3)); // false, after override

    String str = "abc";
    System.out.println(str.hashCode()); // 96354


    //Implication
    // There will be another string value with same hash code
    // 2 different string protentaily can be with same hash code.

    String st2 = "abcdefghijkl";
    System.out.println(st2.hashCode());

    Integer i3 = 365;
    System.out.println(i3.hashCode()); // hashcode is same as the value

    //"Compile time" determine if s1 is able to call equal()
    //"Run time" determine the implementiation (method content) of eual() method
    Object s1 = new String("abcd");
    Object s2 = new String("abcd");
    //s1 pointing to Object.class method
    System.out.println(s1.equals(s2)); // True (Runtime: String.equals())
    

    Object s3 = new Object();
    Object s4 = new Object();
    System.out.println(s3.equals(s4)); // false (Runtime Object.equals)
  }
}
