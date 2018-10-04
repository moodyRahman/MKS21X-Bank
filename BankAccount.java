public class BankAccount{

  //field variables
  private double balance;
  private int accountID;
  private String password;

  //constructor
  public BankAccount(double balanceInp, int accountIDInp, String passwordINP){
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
      System.out.println(inp);
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
