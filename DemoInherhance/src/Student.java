import ExampleORStudy.person;
//Person.class is parent, while Student.class is child
public class Student extends Person{

  private int studentID;
  
  //Constructor -> the process of constructing students object
  public Student(int studentID, String name, int age){
    super(name, age); // Calling Parent class consturctor
    this.studentID = studentID;
  }

  public int getStudentID(){
    return this.studentID;
  }
  
  public void setAge(int age){
    // 2. call parent object setAge() metgod
    super.setAge(age);
  }


  public static void main(String[] args) {
    Student s = new Student(1, "Eddy", 28);

    System.out.println(s.getAge());
    System.out.println(s.getName());
    System.out.println(s.getStudentID());

    // Person p1 = new Person("tes", 1); Cannot create is due to the "abstract class"
  }
}
