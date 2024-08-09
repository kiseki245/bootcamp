import java.util.LinkedList;
import java.util.List;

public class Bank {
  public List<Account> accounts;
  private String address;
  public Bank(){
    this.accounts = new LinkedList<>();
  }

  public void add(Account account){
    accounts.add(account);
  }
  private static Account createAccount(double amount){
    return new Account();
  }
  public static class Account{
    private int accno;
    private static int num = 0;
    private double balance;

    public Account(){
      this.accno = ++num;
    }
    public int getAccno(){
      return this.accno;
    }
  
  public void credit(double amount){
    this.balance += amount;
  }

  public void print(){
    // this.address; // you cannot access the enter class instance variable is static 
  }
  }

  public static void main(String[] args) {
    Bank bank = new Bank();
    Bank.Account account = new Bank.Account(); // That is Account object
  }

}
