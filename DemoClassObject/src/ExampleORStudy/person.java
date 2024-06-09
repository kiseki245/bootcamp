package ExampleORStudy;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class person {
  private String firstname;
  private String lastname;
  private double weight;
  private double height;

  public person(){ //Empty constructor

  } // If no constructors in 
  public person(String firstname, String lastname, double weight, double height){ //All Argument constructor
    this.firstname = firstname;
    this.lastname = lastname;
    this.weight = weight;
    this.height = height;
  }
  public String fullName(){ //Instance method
    return this.firstname + " " + this.lastname;
  }
  public double calBMI(){ //Instance method
    return BigDecimal.valueOf(this.weight) // need a object so keyword "this" will be used
    .divide(BigDecimal.valueOf(Math.pow(this.height, 2)), RoundingMode.UP).doubleValue();
  } 
  public static double calBMI(double weight, double height){ // Static method. Just a tools, no need related to a object
    return BigDecimal.valueOf(weight)
    .divide(BigDecimal.valueOf(Math.pow(height, 2)), RoundingMode.UP).doubleValue();
  }
  public void setFirstname(String firstname){
    this.firstname = firstname;
  }

  public String toString(){
    return "Hello, " + this.fullName() + " your weight is " + this.getWeight() + 
    " and your height is " + this.getHeight() + ". Calculated BMI is " + this.calBMI();
  }

  public void setLastname(String lastname){
    this.lastname = lastname;
  }
  public void setWeight(double weight){
    this.weight = weight;
  }
  public void setHeight(double height){
    this.height = height;
  }
  public String getFirstname(){
    return this.firstname;
  }

  public String getLastname(){
    return this.lastname;
  }

  public double getWeight(){
    return this.weight;
  }

  public double getHeight(){
    return this.height;
  }

  
  public static void main(String[] args) {
    person p1 = new person();
    p1.setFirstname("Eddie");
    p1.setLastname("Chung");
    p1.setWeight(65);
    p1.setHeight(180);
    System.out.println(p1.fullName());
    System.out.println("BMI is " + p1.calBMI());
    System.out.println(p1.toString());


    //Start to constructor
    // Create a person object with given attribute values
    person p2 = new person("Edy", "C", 70, 168);
    System.out.println(p2.fullName());
    System.out.println(p2.calBMI());
    System.out.println(p2.toString());
  
    person p3 = p1;
    System.out.println(p3.toString());
  } 
  
}
