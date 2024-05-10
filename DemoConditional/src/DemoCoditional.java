public class DemoCoditional{
  public static void main(String[] args){

    //if
    int x =3;
    if (x == 3){
      System.out.println("x = 3");
    }
    //print either one
    int y = 12;
    if (y >= 11){
      System.out.println("y > " + y);
    } else {
      System.out.println("y < " + y);
    }

    int a = 10;
    int b = 7;
    
    if (a > b){
      System.out.println("Max is " + a);
    } else {
      System.out.println("Max is " + b);
    }
  }
}