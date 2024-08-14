public class Staff {
  private String departmentName;
  private String name;
  private int salary;


  public Staff(String departmentName, String name){
    this.departmentName = departmentName;
    this.name = name;
  }
  public Staff(String departmentName, String name, int salary){
    this.departmentName = departmentName;
    this.name = name;
    this.salary = salary;
  }
  public String getDepartmentName(){
    return this.departmentName;
  }

  public String getName(){
    return this.name;
  }
  public int getSalary(){
    return this.salary;
  }
    public String toString(){
      return "Name: " + this.name + " - " + this.departmentName;
    }
  }

