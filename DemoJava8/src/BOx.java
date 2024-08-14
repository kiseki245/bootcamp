public class BOx<T> {

  T data;

  public BOx(T date){
    this.data = data;
  }
  public static void main(String[] args) {
    BOx<String> box = null; // NPE
    BOx<String> box2 = new BOx<>(null);
  }
}
