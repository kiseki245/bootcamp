package ClassExercise;
import java.math.BigDecimal;
import java.time.LocalDate;
public class Toy {
  private String name;
  private String originCountry;
  private double price;
  private LocalDate releaseDate;
  
  public Toy(){

  }
  public Toy(String name, String originCountry, double price, LocalDate releaseDate){
    this.name = name;
    this.originCountry = originCountry;
    this.price = price;
    this.releaseDate = releaseDate;
  }

  public void setName(String name){
    this.name = name;
  }
  
  public void setOrigin(String originCountry){
    this.originCountry = originCountry;
  }
  public void setReleaseDate(LocalDate releaseDate){
    this.releaseDate = releaseDate;
  }
  public void setPrice(double price){
    BigDecimal priceObj = new BigDecimal(this.price);
    this.price = priceObj.doubleValue();
  }

  public String getName(){
    return this.name;
  }

  public LocalDate gLocalDate(){
    return this.releaseDate;
  }
  public String getOrigin(){
    return this.originCountry;
  }

  public String toString(){
    return "Name of Toy: " + this.name + "\n" +
    "Origin: " + this.originCountry + "\n" +
    "Price: " + this.price + "\n" +
    "Release date: " + this.releaseDate;
  }
  public static void main(String[] args) {
    Toy t1 = new Toy("Robot", "Japan", 123.4, LocalDate.of(2024,6,2));
    System.out.println(t1.toString());


  }
}
