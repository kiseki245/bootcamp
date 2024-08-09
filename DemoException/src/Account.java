public class Account {
  private double balance;
  public Account(){
    this.balance = 0.0;

  }

  public double getBalance(){
    return this.balance;
  }

  public void setBalance(double balance){
    this.balance = balance;
  }

  public void credit(double amount){
    this.balance += amount;
  }

  public void debit(double amount) throws BusinessExceptions{ 
    if (this.balance < amount)
    // check exception
      // throw new IllegalArgumentException();
      throw new BusinessExceptions(ErrorCode.INSUFF_BAL);

      this.balance -= amount;
  }
  
  public static void main(String[] args) {
  System.out.println("Start");
    Account ac =  new Account();
  ac.credit(100);
  try{
  ac.debit(80);
  ac.debit(30);
  } catch (BusinessExceptions e){
    // System.out.println("Message:" + e.getErrorCode() + e.getMessage());
    System.out.println(e.codeWithMesage());
  }
  System.out.println(ac.getBalance());
    }
  }
