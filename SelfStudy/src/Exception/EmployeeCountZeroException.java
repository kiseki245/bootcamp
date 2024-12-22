package Exception;

public class EmployeeCountZeroException extends RuntimeException{
  
  public EmployeeCountZeroException(String message){
    super(message);
  }
}
