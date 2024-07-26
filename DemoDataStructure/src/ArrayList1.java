
public class ArrayList1 {
  private Integer[] integers;

  public ArrayList1(){
    this.integers = new Integer[0];
  }
  public void add(Integer i){
    Integer[] arr = new Integer[this.integers.length + 1];
    int idx = 0;
    for (Integer x : this.integers) {
      arr[idx++] = x;
    }
      arr[idx] = i;
      this.integers = arr;
    }
  public Integer[] getInteger(){
    return this.integers;
  }
  public void remove(int idex){
    Integer[] arr = new Integer[this.integers.length - 1];
    int idx = 0;
    for (Integer x : this.integers) {
      if (integers[idex] == x)
      continue;
      
    }
    this.integers = arr;
  }
  public static void main(String[] args) {
    ArrayList1 integers = new ArrayList1();
    integers.add(10);
    integers.add(2);
    integers.add(-4);

    for (Integer x : integers.getInteger()){
      System.out.println(x);
    }

    integers.add(100);
    for (Integer x : integers.getInteger()){
      System.out.println(x);
    }
  integers.remove(1);
  for (Integer x : integers.getInteger()){
    System.out.println(x);
  }

  }
}
