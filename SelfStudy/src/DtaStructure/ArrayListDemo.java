package DtaStructure;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    
  BigDecimal[] bd = new BigDecimal[] {new BigDecimal(1.3), 
  new BigDecimal(3.4),
  new BigDecimal(-1.0)};

  BigDecimal bdsum = BigDecimal.ZERO;
  for (BigDecimal b : bd) {
    bdsum = bdsum.add(b);
  }

  System.out.println(bdsum.setScale(1, 1));

  //ArrayList

  ArrayList<BigDecimal> bd2 = new ArrayList<>(); 
  bd2.add(BigDecimal.valueOf(1.3));
  bd2.add(BigDecimal.valueOf(3.4));
  bd2.add(BigDecimal.valueOf(-1.0));
  
  System.out.println(bd2.size());
  System.out.println(bd2.indexOf(BigDecimal.valueOf(3.4)));

  System.out.println(bd2); //[1.3, 3.4, -1.0]
  bd2.add(2, BigDecimal.valueOf(3.6)); // Insert at idx[2]
  System.out.println(bd2); //[1.3, 3.4, 3.6, -1.0]

  bd2.set(2, BigDecimal.valueOf(100));
  System.out.println(bd2); //[1.3, 3.4, 3.6, -1.0], 3.6 became 10

  ArrayList<BigDecimal> bd3 = new ArrayList<>();
  bd3.addAll(bd2);
  System.out.println("bd3 is " + bd3);

    // Question 1: Given String[], only list out those string with length <= 3
    
    String[] stringArray = new String[] {"anc", "a", "", null, "aaaa"};
  ArrayList<String> result = new ArrayList<>();
    for (String s : stringArray){
  if (s != null && s.length() < 3)
    result.add(s);
}

Toy[] toy = new Toy[] {new Toy("HG Gundam", 128), new Toy("MG Gundam", 128)
, new Toy("Robot", 122), new Toy("Doll", 33)};

  ArrayList<Toy> toylist = new ArrayList<>();
  for (Toy toys : toy) {
    toylist.add(toys);
  }  
  System.out.println(toylist);
  } 
}
