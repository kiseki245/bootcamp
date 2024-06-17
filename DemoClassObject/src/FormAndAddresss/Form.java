package FormAndAddresss;

public class Form {
  private String firstname;
  private String lastname;
  private Address address;
  
  // constructor, getter, setter
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
  public Address getAddress(){
    return this.address;
  }
  public Address address(){
    return this.address;
  }
  public String toString(){
    return "Form" + //
    " First Name: " + this.firstname +//
    " Last Name: " + this.lastname + //
    " Address: " + this.address;
  }
}
