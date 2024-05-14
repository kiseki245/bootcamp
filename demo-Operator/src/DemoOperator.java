public class DemoOperator {
  public static void main(String[] args){
    int x =3;
    x = x + 1;
    System.out.println("x = " + x);

    int x2 = x++; // x++ is same variable + 1
    System.out.println(x2);
    x+=1; // same as x = x + 1
    x+=2; // same as x = x + 2
    ++x; // same as x= x + 1
    System.out.println("x = " + x);

    int y = 4;
    y = y - 1; // = 3
    System.out.println("y = y - 1 = " + y);
    y--; 
    System.out.println("y-- = " + y);
    --y;
    System.out.println("--y = " + y);
    y -= 2;
    System.out.println("y -= 2 = " + y);
    int z = 4;
    z = ++y;
    System.out.println(y);

    //*= 
    int p = 4;
    p = p * 2; // 8
    p *= 2; // 16 = 4 x 4   2個4
    p /= 4;
    System.out.println("p= " + p);


    int z2 = 10;
    z2 = z2 % 3; //1
    int j = 10;
    j %= 3; //1
    System.out.print("z = " + z + "j = " + j);

    String s = "Hello";
    s = s + " World";
    s += "!!!";
    System.out.println("s = " + s);


    // > < >= <=
    boolean r1 = 10 > 3; // true, asking is 10 > 3?
    boolean r2 = 4 > 10; // false
    boolean r3 = 10 >= 10; //true

    boolean r5 = 10 > 3 && 20 >=20; //true AND true = true
    boolean r6 = 10 > 3 && 4 < 4; // true AND false = fale
    boolean r7 = 10 > 3 || 20 >= 20; // true OR true = true
    boolean r8 = 10 > 3 || 20 < 18; // true OR flase = true
    boolean r9 = 3 > 10 || 10 > 20; // false OR flase = false
    
    char c10 = 'A';
    char c11 = 'B';
    boolean r10 = c10 == c11; // false,  Ask if a value is equals to another value =, we use "=="
    boolean r11 = 'C' != 'o'; // true

    boolean r12 = 10 / 2 >5 * 3;// false
    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);

    //challenge 
    int n = 3;
    int result = n++ * 3; // original n multiply 3 first, assigne 9 to result and then n = n + 3
    System.out.println(result); //9
    System.out.println(n); //4

    int m = 4;
    int result2 = ++m * 5; // m = m + 1 first, multiply 5, assign 25 to result2
    System.out.println(result2); //25
    System.out.println(m); //5

    int k = 4;
    int result3 = k++ * 7 * ++k;
    System.out.println(result3); // 168 = (4 * 7) * 6
    System.out.println(k);

  }
}
