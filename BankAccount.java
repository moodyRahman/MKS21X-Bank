public class BankAccount{

  //field variables
  private double balance;
  private int accountID;
  private String password;

  //constructor
  public BankAccount(double balance, int account, String password){
    this.balance = balance;
    this.accountID = account;
    this.password = password;
    }


  //password authentication
  private boolean authenticate(String passwordInp){
    if (passwordInp.equals(password)){
      return true;
    }
    return false;
  }


  //transferto
  public boolean transferTo(BankAccount other, double amount, String password){
    if(authenticate(password)){
      if(this.withdraw(amount) && other.deposit(amount)){
        return true;
      }
    }
    return false;
  }

  // accessor functions
  public double retBalance(){
    return balance;
  }
  public int retID(){
    return accountID;
  }


  //mutator functions
  public void changePassword(String inp){
    password = inp;
  }

  public boolean deposit(double inp){
    if(inp >= 0){
      balance = balance + inp;
      return true;
    }
    return false;
  }

  public boolean withdraw(double inp){
    if(inp < balance){
      balance = balance - inp;
      return true;
    }
    return false;

  }

  public String toString(){
    return "id: " + accountID + "\t" + "balance: " + balance;
  }

}
