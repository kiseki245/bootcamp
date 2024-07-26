public class Box<T> { //<T> just like Unknown * any Type
  private T value;

  public Box(){

  }
  public Box(T value){
    this.value = value;
  }

  public T getValue(){
    return this.value;
  }

  public void setValue(T value){
    this.value = value;
  }


  public static void main(String[] args) {
    //Run time \
    // You have to define the type <T> during run-time
    Box<Integer> integerBox = new Box<>();
    integerBox.setValue(100); // int -> Integer
    Box<Customer> customerBox = new Box<>();
    customerBox.setValue(new Customer());


    //You cannot 
    // Box<T> box = new Box<>();
  }
}
