package ClassObject;

public class StaticFinal { //Game Charator 
  private String name; ; // Instance variable
  private int ID;
  private static int IDCount = 0; // ID for idenity to
  private int HP = 10000;
  private int MP = 8000;
  private static String status;
  private static final int ATK = 10;

  static{
    status = "Normal";
  }

  public StaticFinal(String name){
    this.ID = ++IDCount;
    this.name = name;
  }

  public void AddHP(){
    this.HP = this.HP + 1000;
  }
  public String toString(){
    return 
    "ID: " + this.ID + "\n" +
    "Name: " + this.name + "\n" +
    "HP: " + this.HP + "\n" +
    "MP: " + this.MP + "\n" +
    "Status: " + this.status + "\n" +
    "ATK is " + this.ATK;
  }
  public static void main(String[] args) {
    StaticFinal edy = new StaticFinal("Edy");
    StaticFinal edy2 = new StaticFinal("Edy2");
    edy.AddHP();
    System.out.println(edy.toString());
    System.out.println(edy2.toString());

  }
}
