public class WrapperClass {
  public static void main(String[] args) {
    Integer num1 = Integer.valueOf(128);
    
    int i1 = 1277;
    Integer num2 = i1; // autobox - primitive to wrapper
    System.out.println(num2);


    Integer num3 = Integer.valueOf(num1); //Wrapper to Wrapper


    //String to Integer

    String str = "42";
    String strnum = "Eddy 42";
    Integer strnumclass;
    System.out.println(strnumclass = Integer.valueOf(str));
    // System.out.println(strnumclass = Integer.valueOf(strnum)); //Error will thrown

    Integer num4 = 1;
    Integer num5 = 2;
    int num6 = 1;
    System.out.println(num4.compareTo(num5)); //Checking is num4 > num5, result is -1
    System.out.println(num5.compareTo(num4)); //checking is num5 > num4, result is 1
    System.out.println(num4.compareTo(num6)); //Checking is num4 > num1, result is 0

    Float f1 = 10.0f; // 10.0f is float value > autobox > Float value
  }
}
