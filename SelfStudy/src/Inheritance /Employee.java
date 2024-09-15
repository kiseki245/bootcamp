import java.time.LocalDate;

public class Employee extends Worker{
    private long employeeID;
    private LocalDate hireDate;
    private static long count = 0;
    public Employee(String name, LocalDate birthDate, LocalDate hireDate){
        super(name, birthDate);
        this.employeeID = ++count;
        this.hireDate = hireDate;
    }
    public Employee(){};


    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate=" + hireDate +
                '}';
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Eddie", LocalDate.of(1994,12,13), LocalDate.of(2022,06, 16));
        System.out.println(e1.getAge());
    }
}
