public class BankAccount{

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(long balanceInp, int accountIDInp, String passwordINP){
    balance = balanceInp;
    accountID = accountIDInp;
    password = passwordINP;
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

  public boolean withdraw(inp){
    if(inp < balance){
      balance = balance - inp;
      return true;
    }
    return false;

  }

}
