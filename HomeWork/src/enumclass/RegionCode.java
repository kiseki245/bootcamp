package enumclass;

import javax.swing.plaf.synth.Region;

public enum RegionCode { 
  HK("852", "Hong Kong"),
  MO("853", "Macau"),
  UK("44", "Unite Kingdom"),
  JP("81", "Japan");
  private final String countryCode; //MCC
  private final String fullname;

  private RegionCode(String countryCode, String fullname){
    this.countryCode = countryCode;
    this.fullname = fullname;
  }
  public String getMCC(){
    return this.countryCode;
  }

  public String getName(){
    return this.fullname;
  }
  @Override
  public String toString(){
    return "Region: " + this.fullname + ", its mobile country code is: " + this.countryCode;
  }

  public static String checkMCC(RegionCode regionCode){
    switch (regionCode) {
      case HK:
        return "Hong Kong's MCC is 852";
      case MO:
        return "Macau's MCC is 853";
      case UK:
        return "Unite Kingdom's MCC is 44";
      case JP:
        return "Japan's MCC is 81";
      default:
        return null;
    }
  }

  public static String checkISO(String countryCode){
    switch (countryCode) {
      case "852":
        return "852 is MCC of Hong Kong";
      case "853":
        return "853 is MCC of Macau";
      case "44":
        return "44 is MCC of Unite Kingdom";
      case "81":
        return "81 is MCC of Japan";
      default:
        return null;
    }
  }
  public static void main(String[] args) {
    for (RegionCode region : RegionCode.values()) {
      System.out.println("Region: " + region.getName() + "\n" + "Mobile Country Code: " + region.getMCC());
    }
    System.out.println("-----------------------------------");
    RegionCode regioncode1 = RegionCode.HK;
    RegionCode regioncode2 = RegionCode.MO;

    //Check countryCode 
    System.out.println(checkMCC(regioncode1));
    System.out.println(checkMCC(regioncode2));

    //Check
    System.out.println(checkISO(HK.countryCode));
    System.out.println(checkISO(MO.countryCode));

    //valueOf()


  }
}
