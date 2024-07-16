package Interface;

public class GameCharactor extends Charactor{

  private int ID = 0;
  private String name;
  private static int IDcount = 0;

  public GameCharactor(String name){
    this.ID = ++IDcount;
    this.name = name;
    
  }

  

  public static void main(String[] args) {
    
  }
}
