public class DemoNestedLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) { // 0,1,2,3
      for (int j = 0; j < 2; j++) { // 0,1
        System.out.println("Hello" + " i= " + i + " j= " + j);
      }
      //Hello i= 0 j= 0
      //Hello i= 0 j= 1
      //Hello i= 1 j= 0
      //Hello i= 1 j= 1
      //Hello i= 2 j= 0
      //Hello i= 2 j= 1
      //Hello i= 3 j= 0
      //Hello i= 3 j= 1
          
    }
    //Approach 1:
    for (int i = 0; i < 4; i++) { // 0,1,2,3
      for (int j = 0; j < 2; j++) { // 0,1
        if (i % 2 != 0 && j% 2 ==0){
          System.out.println("i= " + i + " j= " + j);
        }
      }
  }
  //i= 1 j= 0
  //i= 3 j= 0
//Approach 2:
  for (int i = 0; i < 4; i++) { // 0,1,2,3
    if (i % 2 == 0){
      continue;
    }
    for (int j = 0; j < 2; j++) { // 0,1
      if (j % 2 ==1){
        continue;
      }
      System.out.println("i" + i + "j" + j);
    }
}
//i1j0
//i3j0

//Eercise
// 1 - 20
// 1 3 5 7 9 
// 12 14 16 18 20


//searching
      String s = "Vincent Book Game Laptop";
      System.out.println(s.charAt(0));
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'a'){
          System.out.println(s.charAt(i));
          int idx = i;
          System.out.println("Found! a in " + i);
        break; // break exist loop only
        }
      }
l



  }
}
