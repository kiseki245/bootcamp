public enum Currency {
  HKD ("Hong Kong Dollar", 1), // Simlur to new Currency("")
  USD ("US Dollor", 2),
  JPY ("Japan Yen", 3),
  ;

  // Instance variable
  private final String desc;
  private final int DBvalue;
  //Constructor
  private Currency(String desc, int DBvalue){
    this.desc = desc;
    this.DBvalue = DBvalue;
  }
  public String getDesc(){
    return this.desc;
  }
  public int getDBvalue(){
    return this.DBvalue;
  }
  @Override
  public String toString(){
    return "Currency:" + this.desc + " value is $" + this.DBvalue;
  }
  // 2 - USD, 3 - JPY
  public static Currency get(int DBvalue){
    String result = "";
    for (Currency c: Currency.values()){
      if (DBvalue == c.getDBvalue()){
        return c;
        } 
      }
      return null;
    }
    
  public static int get(Currency currency){
    return currency.getDBvalue();
    }
  
  // public static String fullDesc(Currency currency){
  //   if (currency == Currency.HKD){
  //     return "It is Hong Knog Dollar.";
  //   } else if (currency == Currency.USD){
  //     return "It is US Dollar";
  //   } else {
  //     return "It is Japan Yen";
  //   }
    
  // }
    //Alternative: switch (before java 14) + enum (perfect match)

    public static String fullDesc(Currency currency){
      switch (currency) {
        case HKD:
          return "It is Hong Kong Dollar";
        case USD:
          return "It is US dollar";
        case JPY:
          return "It is Japan Yen";
          default:
          return null;
      }
    }
  public static void main(String[] args){
    // Currency currency = "HKD";
    //Currency currency = Weekday.MONDAY;
    Currency currency = Currency.HKD;
    if (currency == Currency.USD){ // Here is still checking the object reference
      System.out.println("It is " + currency.getDesc());

    } else if (currency == Currency.HKD){
      System.out.println("It is " + currency.getDesc());

    } else if (currency == Currency.JPY){
      System.out.println("It is " + currency.getDesc());
    }

    System.out.println(currency); //"HKD"
    System.out.println(currency.toString()); //"HKD" -> ENUM already override Object.toString()
    // 1. name()
    System.out.println(currency.name()); // defauls instance methods provided by ENUM.class

    // 2. values()
    for (Currency c: Currency.values()){
      System.out.println(c.getDesc() + " $" + c.getDBvalue());
    }

    System.out.println(currency.values().length); // Proved it is array[]

    System.out.println(currency.hashCode()); //868693306
    System.out.println(Currency.HKD.hashCode()); //868693306
    System.out.println(Currency.USD.hashCode()); //1746572565
    System.out.println(Currency.JPY.hashCode()); //989110044

    System.out.println(Currency.JPY.equals(currency)); //false
    System.out.println(Currency.HKD.equals(currency)); // true
    //Avoid use the variable to equals the object
    //e.g: currency.equals(Currency.HKD); <- Not a good coding style

    String x = "abc";
    //NOT OK
    if (x.equals("abc")){ // Potentialy null pointer exception 

    }
    //OK
    if ("abc".equals(x)){

    }
    System.out.println(Currency.get(2));


    // 3. valueOf -> static method

    System.out.println(Currency.valueOf("HKD").name()); //HKD, HKD -> Currency enum -> name() -> "HKD"
    // System.out.println(Currency.valueOf("2").name());

    System.out.println(Currency.fullDesc(currency));
    Currency ccc = Currency.JPY;

    System.out.println("-----------------------------------------------------------");
    int money = 0;
    money = Currency.JPY.DBvalue * 2;
    System.out.println(Currency.JPY.getDBvalue() * 2);
    System.out.println("Money is $" + money);
    money = Currency.JPY.getDBvalue() * 2;
    System.out.println(money);

  
  }
}