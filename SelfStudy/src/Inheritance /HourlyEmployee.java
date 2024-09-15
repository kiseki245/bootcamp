import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, LocalDate birthDate, LocalDate hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }
    public HourlyEmployee(){

    }
    public double getDoublePay(){
        return 2 * colectPay();
    }
    @Override
    public double colectPay(){
        return 40 * hourlyPayRate;
    }

    public static void main(String[] args) {
        HourlyEmployee h1 = new HourlyEmployee("Eddie", LocalDate.of(1995,12,13), LocalDate.of(2022,06, 16), 65);
        System.out.println(h1.getAge()); // Can use the Work method
    }
}
