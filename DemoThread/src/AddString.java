import java.util.ArrayList;

public class AddString extends Thread{
  private ArrayList<String> strings = new ArrayList();
  @Override
  public void run(){
    for (int i = 0; i < 1_000_000; i++) {
      this.strings.add("abc");
    }
  }
}
