import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class Worker {

    private String name;
    private LocalDate birthDate;
    private LocalDate endDate;
    public Worker(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }
    public Worker(){};
    public int getAge(){
        LocalDate currentYear = LocalDate.now();
        LocalDate userBirthDay =  this.birthDate;

        return currentYear.getYear() - userBirthDay.getYear();
    }

    public double colectPay(){
        return 0.0;
    }

    public void terminate(LocalDate endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
