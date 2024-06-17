package FormAndAddresss;

public class Address {
  private String line1;
  private String line2;
  private String line3;

  
  public Address(String line1, String line2, String line3){
    this.line1 = line1;
    this.line2 = line2;
    this.line3 = line3;
  }
  public void setLine1(String line1){
    this.line1 = line1;
  }

  public void setLine2(String line2){
    this.line2 = line2;
  }
  public void setLine3(String line3){
    this.line3 = line3;
  }

  public String getLine1(){
    return this.line1;
  }
  public String getLine2(){
    return this.line2;
  }  
  public String getLine3(){
    return this.line3;
  }

  public String toString(){
    return this.line1 + this.line2 + this.line3;
  }
  public static void main(String[] args) {
    
    // Create a Form Object, with Address object
    Address address = new Address("abc", "ijk", "test");
    Form f1 = new Form("Vincent", "Lau", address);
    System.out.println(address.toString());
    System.out.println(f1);


    System.out.println(f1.getAddress().getLine1());

    Form f2 = new Form("Jh", "Wong", address);
    System.out.println(f2.toString());

    //if f1 address need changes
    f1.getAddress().setLine2("ttt");
    System.out.println(f1.getAddress().getLine2()); //ttt
    System.out.println(f2.getAddress().getLine2()); // Also ttt
    // So different address should be created (new Address())

    Address addtest = new Address("TestLine 1 ", "TestLine 2 ", "TestLine 3 ");
    
    
    Form f3 = new Form("Eddie", "C", addtest);
    System.out.println(f3.toString());
    f3.getAddress().setLine2("s");
    System.out.println(f3.toString());
  }
}
