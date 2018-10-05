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
    if(authenticate(password)){                                                 //if my input password matches the objact instance password
      if(this.withdraw(amount) && other.deposit(amount)){                       //short circuit boolean to test if the first account has enough money to trassfer
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
  public void changePassword(String password){
    this.password = password;
  }

  public boolean deposit(double deposit){
    if(deposit >= 0){
      this.balance = balance + deposit;
      return true;
    }
    return false;
  }

  public boolean withdraw(double withdraw){
    if(withdraw < balance){
      this.balance = balance - withdraw;
      return true;
    }
    return false;
  }

  public String toString(){
    return "id: " + accountID + "\t" + "balance: " + balance;
  }
}
