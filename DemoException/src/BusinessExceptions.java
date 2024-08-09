public class BusinessExceptions extends Exception { // implies this is checked exception
  private int code;
  
  public int getCode(){
    return this.code;
  }
  // public BusinessExceptions(int errorCode, String message){
  //   super(message);
  //   this.errorCode = errorCode;
  // }

  public BusinessExceptions(ErrorCode errorCode){
    super(errorCode.getMessage());
    this.code = this.getCode();
  }

  public String codeWithMesage(){
    return "Error: " + this.code + " - " + this.getMessage();
  }

  
}
