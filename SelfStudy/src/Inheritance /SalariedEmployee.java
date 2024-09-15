import java.time.LocalDate;

public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, LocalDate birthDate, LocalDate hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    public void retire(){
        this.terminate(LocalDate.now());
        this.isRetired = true;
        System.out.println("This salaried employee retired? " + this.isRetired);
    }
    @Override
    public double colectPay(){
       double paycheck = annualSalary / 26;
       double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
       return (int) adjustedPay;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Eddie", LocalDate.of(1994,12,13), LocalDate.of(2022,06, 16));
        System.out.println(e1.getAge());
        SalariedEmployee s1 = new SalariedEmployee("Eddie", LocalDate.of(1995,12,13), LocalDate.of(2022,06, 16), 500000);
        System.out.println(s1.getAge()); // Can use the Work method
//        e1.retire(); <- this is not allowed
        System.out.println(s1.colectPay());
        s1.retire();
        System.out.println(s1.colectPay());
    }

}
