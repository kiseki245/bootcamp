@FunctionalInterface
public interface Driveble {
  boolean drive(int x);

  // int sum(int x); <- In there are more than one method in the interface,
  // Lamda expression is no longer allowed
  public static void main(String[] args) {
    Driveble drive = x -> x > 5;
  }
}
