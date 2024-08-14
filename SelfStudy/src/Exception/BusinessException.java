package Exception;

public class BusinessException extends Exception{
  private int code;

  public int getCode(){
    return this.code;
  }

  public BusinessException(ErrorCode errorcode){
    super(errorcode.getMessage());
    this.code = errorcode.getCode();
  }

  public String codeWithMessage(){
    return "Error: " + this.code + " - " + this.getMessage();
  }
}
