package Toy;


public class Robot extends Toy{
  private static int genNewID = 0;
  private int ID;
  private String grade;

  public Robot(String name, double price){
    super(name, price);
    this.ID = ++genNewID;
  }

  public int getID(){
    return this.ID;
  }

  public static void discount(double price, double discount){

  }
public static void main(String[] args) {
  Robot HG = new Robot("Test", 179);
  Robot HG2 = new Robot("Test", 123);

  System.out.println(HG.getID());
  System.out.println(HG2.getID());

  
}

}

