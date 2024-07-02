public class DemoEnum {
    //Constant (finite)
    //Weekday Mon to Fir
    
    public static final String MONDAY = "Monday";
    public static final String TUESDAY = "Tuesday";
    public static final String WEDNESDAY = "Wednesday";
    public static final String THURSDAY = "Thrusday";
    public static final String FRIDAY = "Friday";

    public static void main(String[] args){
    System.out.println(DemoEnum.MONDAY);
    
        // What happen in heap memory?
        // Answer: static variable world not point to object

    //During the main method being executed, it loads enum class
    // Before executing the main method, it loads enum class

    System.out.println(Weekdays.MONDAY);// sysout -> calling Weekday MONDAY toString()
//Enum overrided the toString() method so the sysout wil not print out the address of object reference

        System.out.println(Weekdays.TUESDAY);
        System.out.println(Weekdays.WEDNESDAY);
        System.out.println(Weekdays.THURSDAY);
        System.out.println(Weekdays.FRIDAY);
    
    }
}
