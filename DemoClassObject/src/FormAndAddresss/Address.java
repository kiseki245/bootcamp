package FormAndAddresss;

public class Address {
  private String addressLine1;
  private String addressLine2;
  private String addressLine3;

  
  public Address(String addressLine1, String addressLine2, String addressLine3){
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine3;
    this.addressLine3 = addressLine3;
  }
  public void setLine1(String addressLine1){
    this.addressLine1 = addressLine1;
  }

  public void setLine2(String addressline2){
    this.addressLine2 = addressline2;
  }
  public void setLine3(String addressline3){
    this.addressLine3 = addressline3;
  }

  public String getLine1(){
    return this.addressLine1;
  }
  public String getLine2(){
    return this.addressLine2;
  }  
  public String getLine3(){
    return this.addressLine3;
  }

  
  public static void main(String[] args) {

    Form f1 = new Form();
    // Create a Form Object, with Address object
  }
}
