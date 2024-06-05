public class CreateCat {
  public static void main(String[] args) {
    //local variable
    
    String name = "M";

    Cat c1 = new Cat(); // "new Cat()" -> produce Cat Object in memory
    // memory address -> 0x123asdfj4jkasdf84123
    // c1 -> object reference, variable, able to find the cat object

    c1.setAge(24); //setter
    System.out.println(c1.getAge()); //getter

    Cat c2 = new Cat();
    c2.setAge(10);
    System.out.println(c2.getAge());

    // instance method is able to access (read & writs) the object attributes
    Cat c3 = new Cat();
    c3.setAge(13);
    c3.setName("Abc");
    System.out.println(c3.desc());
  }
  //static method belongs to class (static is a tool, describ the object)
  //instance method belongs to object
  //static method ability is limited
  // setLightlever, getToHuman
}
