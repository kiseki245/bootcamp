
import java.math.BigDecimal;
import java.time.LocalDate;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BakeryBread {
  private String breadName;
  private LocalDate expireDate;
  private boolean containMeetOrCream;
  private double price;
  private double discount;

  public BakeryBread(){

  }

  public BakeryBread(String breadName, LocalDate expireDate, boolean containMeetOrCream, double price, double discount){
    this.breadName =breadName;
    this.expireDate = expireDate;
    this.containMeetOrCream = containMeetOrCream;
    this.price = price;
    this.discount = discount;
  }

  public BakeryBread(String breadName, LocalDate expireDate, boolean containMeetOrCream, double price){
    this.breadName =breadName;
    this.expireDate = expireDate;
    this.containMeetOrCream = containMeetOrCream;
    this.price = price;
  }
  public void setBreadName(String breadName){
    this.breadName = breadName;
  }
  public String getBreadName(){
    return this.breadName;
  }
  public void setExpireDate(LocalDate expireDate){
    this.expireDate = expireDate;
  }
  public LocalDate getExpireDate(){
    return this.expireDate;
  }
  public void setContainMeetOrCream(boolean containMeetOrCream){
    this.containMeetOrCream = containMeetOrCream;
  }
  public boolean getContainMeetOrCream(){
    return this.containMeetOrCream;
  }
  public void setPrice(double price){
    double discountPrecentage = BigDecimal.valueOf(this.getDiscount() / 100).setScale(1).doubleValue(); 
    BigDecimal latestPrice = new BigDecimal(this.price); 
    if (this.getDiscount() > 0){
      latestPrice = latestPrice.multiply(BigDecimal.valueOf(discountPrecentage));
      this.price = latestPrice.doubleValue();

    } else {
    this.price = price;
    }
  }
  public double getPrice(){
    return this.price;
  }
  public void setDiscount(double discount){
    this.discount = discount;
  }
  public double getDiscount(){
    return this.discount;
  }
  public String toString(){
    return "Bread name: " + this.breadName + "\n" +
    "Exprie date: " + this.expireDate + "\n" +
    "Contains Meet or Cream? " + this.containMeetOrCream + "\n" +
    "Price: " + this.price + "\n" +
    "Discount: " + this.discount;
  }

  public static void main(String[] args) {
    BakeryBread b1 = new BakeryBread("Sandwich", LocalDate.of(2024, 6, 10), true, 16.8, 0.0);
    System.out.println(b1.toString());
    
    BakeryBread b2 = new BakeryBread();
    
    b2.setBreadName("Normal bread");
    b2.setContainMeetOrCream(true);

    // 1. Input the namew for the bread
    // 2. Enter Y if the bread contains meet or cream, if else please enter N
    // 3. If the bread contains meet / cream, expire date is Today + 2. If else, expire date is T + 10
    BakeryBread newBread = new BakeryBread();
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the new bread name: ");
    String breadname = scan.nextLine();
    newBread.setBreadName(breadname);
    System.out.println("The bread contains meet or cream? (Y/N)");
    String CreamOrMeet = scan.nextLine();
    
    switch (CreamOrMeet.toUpperCase()) {
      case "Y":
        newBread.setContainMeetOrCream(true);
        newBread.setExpireDate(LocalDate.now().plusDays(2));
        break;
        case "N":
        newBread.setContainMeetOrCream(false);
        newBread.setExpireDate(LocalDate.now().plusDays(10));
      default:
        System.out.println("Abnormal input");
        break;
    }
    System.out.println("Enter the price: ");
    double price = scan.nextDouble();
    newBread.setPrice(price);
    System.out.println("New bread created. Thanks!" + "\n" + newBread.toString());


    //Discount method test
    BakeryBread b4 = new BakeryBread("Bread", LocalDate.of(2024, 6, 10), true, 100);
    b4.setDiscount(80);
    System.out.println(b4.toString());


  }

    

  
}
