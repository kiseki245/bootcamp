package ClassExercise;
import java.time.LocalDate;
public class Toy {
  private String name;
  private String originCountry;
  private double price;
  private LocalDate releaseDate;
  private boolean soldout;
  
  public Toy(){

  }
  public Toy(String name, String originCountry, double price, LocalDate releaseDate, boolean soldout){
    this.name = name;
    this.originCountry = originCountry;
    this.price = price;
    this.releaseDate = releaseDate;
    this.soldout = soldout;
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
    this.price = price;
  }
  public void setSold(boolean soldout){
    this.soldout = soldout;
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
  public boolean getSoldout(){
    return this.soldout;
  }
  public String toString(){
    return "Name of Toy: " + this.name + "\n" +
    "Origin: " + this.originCountry + "\n" +
    "Price: " + this.price + "\n" +
    "Release date: " + this.releaseDate  + "\n" +
    "Out of stock? " + this.soldout;
  }
  public static void main(String[] args) {
    Toy t1 = new Toy("Robot", "Japan", 123, LocalDate.of(2024,6,2), false);
    System.out.println(t1.toString());

    t1.setSold(true);
    t1.setName(t1.getName().concat("(Sold out)"));
    System.out.println(t1.toString());

  }
}
