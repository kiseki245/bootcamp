import java.time.LocalDate;
import java.time.Month;
public class DemoDate {
  public static void main(String[] args) {
    // 17 type,(8 primitives + 8 wrapper class + String)

    LocalDate ld = LocalDate.of(2022,12,3);
    System.out.println(ld); //2022-12-04

    LocalDate ld2 = LocalDate.of(2022,12,10);

    System.out.println(ld.plusDays(1L)); //2022-12-04 

    System.out.println(ld.plusYears(2).plusMonths(5).plusDays(17));

    System.out.println(ld.getMonth()); //DECEMBER
    System.out.println(ld.getMonthValue()); //12
    
    Month month = ld.getMonth();
    
    String monthString = month.toString();
    System.out.println(monthString); 

    //getYears()
    //getDayOfMonth()
    //getDayOfYear()
    //getDayOfWeek()
  }
  
}
