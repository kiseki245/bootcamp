package Exception;

public class Account {
  private double balance;

  public Account() {
    this.balance = 0.0d;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
  public void credit(double amount){
    this.balance += amount;
  }
  public void debit(double amount) throws BusinessException{
    if (this.balance < amount)
    // throw new IllegalArgumentException();
  
    this.balance -= amount;
  }

  public static void main(String[] args) {
    Account ac = new Account();
    ac.credit(100);

    try{
      ac.debit(110);
    } catch (BusinessException e){
        System.out.println(e.codeWithMessage());
    }
  }
}
