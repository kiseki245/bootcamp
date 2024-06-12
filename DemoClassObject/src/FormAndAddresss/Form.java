package FormAndAddresss;

public class Form {
  private String firstname;
  private String lastname;
  private Address address;
  

  public Form(String firstname, String lastname, Address address){
    this.firstname = firstname;
    this.lastname = lastname;
    this.address = address;
  }

  public void setFirstName(String firstname){
    this.firstname = firstname;
  }

  public void setLastname(String lastname){
    this.lastname = lastname;
  }

  public void setAddress(Address address){
    this.address = address;

  }

  public String getFirstname(){
    return this.firstname;
  }
  public String getLastname(){
    return this.lastname;
  }
  public Address address(){
    return this.address;
  }

  public static void main(String[] args) {
    
  }
}
