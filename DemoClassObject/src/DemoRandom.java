
import java.util.Random;
public class DemoRandom {

  private int baseSalary = 6000;
  public void raiseSalary(){
    this.baseSalary += 1000;
}
  public int getSalary(int bonus){
    return this.baseSalary + bonus;
  }
  
  public static void main(String[] args) {
    //JDK
    //random -> usually integer

    int random = new Random().nextInt(3); // 0-2
    System.out.println(random);
    int random2 = new Random().nextInt(3) + 1; // 1-3
    System.out.println(random2);
    int random3 = new Random().nextInt(3-1) + 1; //0-1 + 1 -> 1-2
    System.out.println(random3);

    //49 or 50

    int random4 = new Random().nextInt(50);
    System.out.println(random4);

    DemoRandom dr = new DemoRandom();
    System.out.println(dr.sum(2, 3));
    System.out.println(DemoRandom.sum(2, 3));

  }
  public int getSum (int a, int b){
    return a + b;
  }
  public static int sum (int x, int y){
    return x + y;
  }
}
