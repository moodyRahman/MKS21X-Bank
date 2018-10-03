public class BankAccount{

  //field variables
  private double balance;
  private int accountID;
  private String password;

  //constructor
  public BankAccount(long balanceInp, int accountIDInp, String passwordINP){
    balance = balanceInp;
    accountID = accountIDInp;
    password = passwordINP;
    if(password.length() < 5){
      System.out.println("your password is too short!");
    }
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
      System.out.println("deposit successful!");
      return true;
    }
    System.out.println("deposit error: positive number needed");
    return false;
  }

  public boolean withdraw(double inp){
    if(inp < balance){
      balance = balance - inp;
      System.out.println("withdrawal successful!");
      return true;
    }
    System.out.println("balance too low");
    return false;

  }

  public String toString(){
    return "id: " + accountID + "\t" + "balance: " + balance;
  }

}
