public class DemoPrimitives {
  public static void main(String[] args){
    // Numbers / String (Text)
    // number(Intergers / decimal)
    int x = 3; //int is a data type that declaring the type of value of x can be stored.
    // int cannot == decimal e.g: 1.6 , 3.14 etc.
    int z = -9; 
    int total = x + z; 
    System.out.println(total);

    int a = 7;
    int b = 2;
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b); //get the remainder

    System.out.println(a+b-(a*b)); // -5
    System.out.println(a+b-a*b);  // -5, () is same result

    int remainder = 10 % 3; //1
    int divide = 10 / 3; //3
    
  }
}
