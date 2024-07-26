import java.util.HashMap;
import java.util.Objects;

public class HKID {

  private String value;
  
  public HKID(String value){
    this.value = value;
  }

  public String getValue(){
    return this.value;
  }
  @Override
  public String toString(){
    return this.getValue();
  }

  //If you don't override equals() and hashCode(),
  // it extends them from Object.class
  //so, we compare "hkid object 1" and "hkid object 2"  

  @Override
  
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof HKID))
    return false;
    HKID hkid = (HKID) obj;
    return Objects.equals(this.value, hkid.getValue());
  }
  @Override
  public int hashCode(){
    return Objects.hash(this.value);
  }
  public static void main(String[] args) {
    HashMap<HKID, Customer> customerMap = new HashMap<>();
    customerMap.put(new HKID("A1234567"), new Customer(34, "John"));
    customerMap.put(new HKID("H2345678"), new Customer(18, "Jenny"));

    System.out.println(customerMap.toString());

    // duplicated key "A1234567"
    // put one more customer with same key -> "A1234567", 34, "John"
    customerMap.put(new HKID("A1234567"), new Customer(34, "Oscar"));
    //put() logics compare existing keys and the new key
    System.out.println(customerMap);
  
    //put() -> use equals() and hashCode()
    //Ojectives of equals() and hashCode(): idenitify if they are same object
    //HashMap.class equals() is to idntity if they are same entry
    System.out.println(new HKID("1234").equals(new HKID("1234")));
    //true, just because you override equals() and hashCode()

    
    // Before override the equals() and hashCode(), the put() comparing the Object reference
    // After we override them, put() is comparing the "value"

    // put() program flow: hashmap.put(key, value) -> calls key.equals() & key.hashCode()


    //How about HashMap<String, String> ?
    // String.class is already done, you cannot change the implementation of equals() and hashCode()
    // So String.equals*() is compares the value itself to detemine if they are same object
 
    //How about HashMap<Integer, String> ?
    // Integer.class is already done, you cannot change the implementation of equals() and hashCode()
    // So Integer.equals*() is compares the value itself to detemine if they are same object
    System.out.println(new Integer(123).equals(new Integer(123)));
    System.out.println(new Integer(123) == (new Integer(123)));

  }
  
}
