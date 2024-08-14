package BuilderPatten;

import java.lang.module.ModuleDescriptor.Builder;

public class Toy {
  private String name;
  private double price;
  private int eanCode;
  private boolean limitedSale;
  private static int eanCodeCount = 1;

  public Toy(Builder builder){
    this.name = builder.name;
    this.price = builder.price;
    this.eanCode = eanCodeCount++;
    this.limitedSale = limitedSale;
  }
  public String getName(){
    return this.name;
  }
  public int getEanCode(){
    return this.eanCode;
  }
  public boolean isLimitedSale(){
    return this.limitedSale;
  }
  public double price(){
    return this.price;
  }
  public static Builder builder(){
    return new Toy.Builder();
  }
  public static class Builder {
    private String name;
    private double price;
    private boolean limitedSale;
    private static int eanCodeCount = 1;
    private int eanCode;

    public Builder name(String name){
      this.name = name;
      return this;
    }

    public Builder price(double price){
      this.price = price;
      return this;
    }

    public Builder limitedSale(boolean limitedSale){
      this.limitedSale = limitedSale;
      return this;
    }
    public Builder eanCode(){
      this.eanCode = eanCodeCount++;
      return this;
    }

    public Toy build() {
      return new Toy(this);
    }
  }

  public String toString(){
    return "Name: " + this.name + "\n" +
    "Price: " + this.price + "\n" +
    "Is limited sale?: " + this.limitedSale + "\n" +
    "Ean Code: " + this.eanCode;
  }
  public static void main(String[] args) {
  Toy toy1 = Toy.builder().name("Robot").price(123.5).limitedSale(false).build();
  System.out.println(toy1);
  Toy toy2 = Toy.builder().name("Robot").price(123.5).limitedSale(false).build();
  System.out.println(toy2);
  }



}
