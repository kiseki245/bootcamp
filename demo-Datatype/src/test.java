public class test {
  public static void main(String[] args) {
    int x = 3;
    System.out.println("x++ = " + x++); //4

    int y = 3;
    int y2 = y++;
    int y3 = y++;
    int y4 = y++;
    System.out.println("y2 = " + y2); //3 (?)
    System.out.println("y3 = " + y3); //4
    System.out.println("y4 = " + y4); //5
    

    long l1 = 91234121123123L;
    long l2 = l1; // l1 has declared as Long and hence l2 no need declare again
    System.out.println("l2 is " + l1);

    //---------------------------------------------
    boolean b1;
    int a = 32;
    int b = 45;
    if (a < b){
      b1 = true;
      System.out.println(b1);
    } else {
      b1 = false;
      System.out.println(b1);
    }    
  }
}
