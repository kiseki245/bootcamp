package ExampleORStudy;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Book {
  private String type;
  private int number;
  private boolean sold; // just for fun :P
  private LocalDate publishdate;
  private String aurthor;


  public void setType(String type){
  this.type = type;
  }

  public String getType(){
    return this.type;
  }

  public void setNumber(int number){
    this.number = number;

  }

  public int getNumber(){
    return this.number;
  }

  public void setSold(boolean r){
    this.sold = r;
  }

  public boolean getSold(){
    String name = this.type;
    if (name.contains("(Sold)")){
      return true;
    } else {
      return false;
    }
  }
    public void setpublishdate(LocalDate publishdate){
      this.publishdate = publishdate;
    }
    public String getAurthor(){
      return this.aurthor;
    }
    public void setAurthor(String aurthor){
      this.aurthor = aurthor;
    }


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
  

